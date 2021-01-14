package me.vforchi.euler;

import java.util.stream.Stream;

public class Problem3 extends Problem {
    @Override
    public Object solve() {
        return solve(600851475143L);
    }

    public long solve(long number) {
        return Stream.iterate(2, n -> n + 1)
                .filter(n -> number % n == 0)
                .findFirst()
                .map(n -> checkAndSolve(number, n))
                .orElseThrow();
    }

    public long checkAndSolve(long number, long divisor) {
        if (divisor == number) {
            return divisor;
        } else {
            return solve(number / divisor);
        }
    }

}
