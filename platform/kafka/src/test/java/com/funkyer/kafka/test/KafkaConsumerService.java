package com.funkyer.kafka.test;

import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;

import java.util.*;


/**
 * Created by liushi on 17/10/16.
 */
public class KafkaConsumerService
{
    Logger logger = Logger.getLogger(KafkaConsumerService.class);
    public void processMessage(Map<String, Map<Integer, KeyMessage>> msgs) {
        logger.info("===============processMessage===============");
        for (Map.Entry<String, Map<Integer, KeyMessage>> entry : msgs.entrySet()) {
            logger.info("============Topic:" + entry.getKey());
            LinkedHashMap<Integer, KeyMessage> messages = (LinkedHashMap<Integer, KeyMessage>) entry.getValue();
            Set<Integer> keys = messages.keySet();
            for (Integer i : keys)
                logger.debug("======Partition:" + i);
            Collection<KeyMessage> values = messages.values();
            for (Iterator<KeyMessage> iterator = values.iterator(); iterator.hasNext();) {
                KeyMessage message = iterator.next();

                logger.info("=====mmm:" + message.toString());
//                List<UserDto> userList = JSON.parseArray(message, UserDto.class);
//                logger.info("=====userList.size:" + userList.size());

            }

        }
    }
}
