package org.example;

import java.util.*;

public class Randoms implements Iterable<Integer> {
    private int max;
    private int min;
    protected Random random;

    public Randoms(int min, int max) {
        this.max = max;
        this.min = min;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return new Random().ints(min, (max + 1)).iterator().nextInt();


            }
        };
    }
}

