package me.vforchi.euler;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        var firstProblem = Long.parseLong(args[0]);
        var lastProblem = args.length == 2 ? Long.parseLong(args[1]) : firstProblem;

        var start = System.currentTimeMillis();
        Stream.iterate(firstProblem, i -> i + 1)
                .limit(lastProblem - firstProblem + 1)
                .forEach(Main::runProblem);
        System.out.printf("Total execution time: %1.3f[s]", 0.001 * (System.currentTimeMillis() - start));
    }

    private static void runProblem(long number) {
        try {
            var className = String.format("me.vforchi.euler.Problem%d", number);
            Problem problem = (Problem) Class.forName(className).getDeclaredConstructor().newInstance();
            var start = System.currentTimeMillis();

            var result = problem.solve().toString();
            var duration = System.currentTimeMillis() - start;
            System.out.printf("Problem %d: %s, %1.3f[s]%n", number, result, 0.001 * duration);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}