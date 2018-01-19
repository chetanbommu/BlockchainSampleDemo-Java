package com.chetan.blockchain;

import java.util.Arrays;

public class BlockChainExample {

    public static void main(String[] args) {

        Transaction t1 = new Transaction("chetan","akhil",1000L);
        Transaction t2 = new Transaction("sharath","akhil",1010L);
        Transaction t3 = new Transaction("akhil","nikhil",100L);
        Transaction t4 = new Transaction("nikhil","pranay",1200L);
        Transaction t5 = new Transaction("pranay","sharath",1800L);

        Block blockOne = new Block(0, Arrays.asList(t1,t3));
        Block blockTwo = new Block(blockOne.hashCode(),Arrays.asList(t2));
        Block blockThree = new Block(blockTwo.hashCode(),Arrays.asList(t4,t5));

        System.out.println(blockOne.hashCode());
        System.out.println(blockTwo.hashCode());
        System.out.println(blockThree.hashCode());
    }

}
