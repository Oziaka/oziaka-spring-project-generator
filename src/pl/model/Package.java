package pl.model;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Stack;
import java.util.stream.Collectors;

public class Package {
    Stack<String> directories;

    public static Package build(String line) {
        return PackageBuilder.build(line);
    }

    private static class PackageBuilder {

        private static Package build(String line) {
            Package aPackage = new Package();
            aPackage.directories = Arrays.stream(line.split("\\.")).collect(Collectors.toCollection(Stack::new));
            return aPackage;
        }

    }
}
