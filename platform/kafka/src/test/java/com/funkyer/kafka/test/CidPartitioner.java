package com.funkyer.kafka.test;

import kafka.producer.Partitioner;
import kafka.utils.VerifiableProperties;

import java.util.Random;

/**
 * Created by liushi on 17/10/12.
 */
public class CidPartitioner implements Partitioner {
    private Random random = new Random(2);
    public CidPartitioner(VerifiableProperties props) {
        //注意 ： 构造函数的函数体没有东西，但是不能没有构造函数
    }
    @Override
    public int partition(Object o, int i)
    {
        System.out.println("parties="+i);
        int j = random.nextInt()%i;
        System.out.println("random="+j);
        return j;

    }
}
