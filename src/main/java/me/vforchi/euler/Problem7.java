package me.vforchi.euler;

import io.vavr.collection.Stream;

import java.util.ArrayDeque;
import java.util.Deque;

public class Problem7 extends Problem {

    private Deque<Long> primes = new ArrayDeque<>();

    @Override
    public Object solve() {
        primes.add(2L);
        Stream.range(1, 10001).forEach(this::nextPrime);
        return primes.getLast();
    }

    private void nextPrime(int idx) {
        long next = Stream.iterate(primes.getLast(), n -> n + 1)
                .find(this::isPrime)
                .getOrNull();
        primes.add(next);
    }

    private boolean isPrime(Long number) {
        return primes.stream().noneMatch(n -> number % n == 0);
    }

}
