package me.vforchi.euler;

import io.vavr.collection.List;
import io.vavr.collection.Stream;
import org.apache.commons.lang3.StringUtils;

public class Problem4 extends Problem {
    @Override
    public Object solve() {
        return Stream.range(100, 1000).toList().combinations(2)
                .map(Problem4::product)
                .filter(Problem4::isPalindrome)
                .max()
                .get();
    }

    private static Integer product(List<Integer> integers) {
        return integers.get(0) * integers.get(1);
    }

    private static boolean isPalindrome(Integer integer) {
        var string = integer.toString();
        return string.equals(StringUtils.reverse(string));
    }
}
