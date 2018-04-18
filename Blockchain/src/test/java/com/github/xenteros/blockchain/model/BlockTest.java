package com.github.xenteros.blockchain.model;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

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

    @Test
    public void shouldGenerateHashesWith5LeadingZeros() {
        Long start = System.currentTimeMillis();
        Block first = new Block("Hello World!", null);
        first.mine(5);
        System.out.println(System.currentTimeMillis() - start);
        start = System.currentTimeMillis();
        Block second = new Block("Hello Jon!", first.getHash());
        second.mine(5);
        System.out.println(System.currentTimeMillis() - start);
        Assertions.assertThat(first.getHash()).startsWith("00000");
    }

    @Test
    public void showHashCollectionsPerformance() {
        List<Integer> listOne = IntStream.range(1, 10000000)
                .boxed()
                .collect(toList());
        List<Integer> listTwo = IntStream.range(5000001, 15000000)
                .boxed()
                .collect(toList());

        long start = System.currentTimeMillis();
        List<Integer> dupes = new ArrayList<>();
//        for (Integer first : listOne) {
//            if (listTwo.contains(first)) {
//                dupes.add(first);
//            }
//        }
        long end = System.currentTimeMillis();
        System.out.println("Calculation took " + (end - start) + " without HashSet");

        dupes = new ArrayList<>();
        Set<Integer> set = new HashSet<>(listTwo);
        start = System.currentTimeMillis();
        for (Integer first : listOne) {
            if (set.contains(first)) {
                dupes.add(first);
            }
        }
        end = System.currentTimeMillis();
        System.out.println("Calculation took " + (end - start) + " with HashSet");

    }




}