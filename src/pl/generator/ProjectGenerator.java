package pl.generator;

import java.util.*;
import java.util.stream.Collectors;

public class ProjectGenerator {

    public static void main(String[] args) {
//        String projectPath = args[0];

        Deque<String> stack = new ArrayDeque<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println(stack.pop());
    }
}
