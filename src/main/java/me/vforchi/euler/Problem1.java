package me.vforchi.euler;

import java.util.stream.IntStream;

public class Problem1 extends Problem {
    @Override
    public Object solve() {
        return IntStream.range(1, 1000)
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .sum();
    }
}
