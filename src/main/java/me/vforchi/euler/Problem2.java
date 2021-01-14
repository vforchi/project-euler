package me.vforchi.euler;

import io.vavr.Tuple;
import io.vavr.Tuple2;

import java.util.stream.Stream;

public class Problem2 extends Problem {
    @Override
    public Object solve() {
        return Stream.iterate(Tuple.of(1, 2), t -> Tuple.of(t._2, t._1 + t._2))
                .mapToLong(Tuple2::_2)
                .filter(n -> n % 2 == 0)
                .takeWhile(n -> n < 4000000)
                .sum();
    }
}
