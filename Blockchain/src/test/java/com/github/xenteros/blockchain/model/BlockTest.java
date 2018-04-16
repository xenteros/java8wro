package com.github.xenteros.blockchain.model;

import org.junit.Test;

/**
 * Created by agurgul on 16.04.2018.
 */
public class BlockTest {

    @Test
    public void testHash() {
        Block first = new Block("Hello World!", null);
        System.out.println(first.getHash());
        System.out.println(first.getPreviousHash());

        Block second = new Block("Hello Jon!", first.getHash());
        System.out.println(second.getHash());
        System.out.println(second.getPreviousHash());

    }



}