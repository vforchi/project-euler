package me.vforchi.euler;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Problem5 extends Problem {
    @Override
    public Object solve() {
        var primeProduct = 2 * 3 * 5 * 7 * 11 * 13 * 17 * 19;
        return Stream.iterate(primeProduct, i -> i + primeProduct)
                .filter(n -> IntStream.rangeClosed(2, 20).allMatch(i -> n % i == 0))
                .findFirst()
                .orElseThrow();
    }
}
