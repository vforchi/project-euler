package me.vforchi.euler;

import io.vavr.collection.Stream;

public class Problem6 extends Problem {
    @Override
    public Object solve() {
        var limit = 100;
        long sum = (long) (0.5 * limit * (limit + 1));
        long sum2 = Stream.rangeClosed(1, limit)
                .map(n -> n * n)
                .sum().longValue();
        return sum * sum - sum2;
    }
}
