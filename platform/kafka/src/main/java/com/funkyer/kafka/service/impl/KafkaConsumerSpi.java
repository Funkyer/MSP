package com.funkyer.kafka.service.impl;

import com.funkyer.kafka.KeyMessage;
import com.funkyer.kafka.service.SubscribeKafkaMessage;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by liushi on 17/10/18.
 */
public class KafkaConsumerSpi implements BeanFactoryPostProcessor
{
    private Map<String , Map<String , SubscribeKafkaMessage>> subscribeKafkaMessageMap = new HashMap<>();

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory factory)
            throws BeansException
    {
        Map<String, SubscribeKafkaMessage> map = factory.getBeansOfType(SubscribeKafkaMessage.class);

        if(null != map && map.values().size() > 0)
        {
            for(Map.Entry<String, SubscribeKafkaMessage> entry: map.entrySet())
            {
                SubscribeKafkaMessage subscribeKafkaMessage =  entry.getValue();

                String topic=subscribeKafkaMessage.subscribe();

                if(subscribeKafkaMessageMap.containsKey(topic))
                {
                    subscribeKafkaMessageMap.get(topic).put(entry.getKey(),entry.getValue());
                }
                else
                {
                    Map<String , SubscribeKafkaMessage> kafkaMessageMap = new HashMap<>();
                    kafkaMessageMap.put(entry.getKey(),entry.getValue());
                    subscribeKafkaMessageMap.put(topic,kafkaMessageMap);
                }
            }
        }

    }


    public void processMessage(Map<String, Map<Integer, KeyMessage>> msgs)
    {
        for (Map.Entry<String, Map<Integer, KeyMessage>> entry : msgs.entrySet())
        {
            String topic = entry.getKey();

            Map<String , SubscribeKafkaMessage> map = subscribeKafkaMessageMap.get(topic);

            if(null != map && map.values().size()>0)
            {
                for (SubscribeKafkaMessage subscribeKafkaMessage : map.values())
                {
                    Collection<KeyMessage> values = entry.getValue().values();

                    subscribeKafkaMessage.consumeMessage(values);
                }
            }
        }
    }
}
