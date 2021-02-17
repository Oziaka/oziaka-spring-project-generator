package pl.model;

import pl.validator.PackageValidator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class Package {
    Stack<String> directories;

    public static Package build(File file) {
        return PackageBuilder.build(file);
    }

    private static class PackageBuilder {

        private static Package build(File file) {
            try {
                Scanner scanner = new Scanner(file);
                PackageValidator packageValidator = new PackageValidator();
                while (scanner.hasNext()) {
                    String line = scanner.nextLine();
                    if (packageValidator.valid(line)) {
                        Package aPackage = new Package();
                        aPackage.directories = Arrays.stream(line.split("\\.")).collect(Collectors.toCollection(Stack::new));
                        return aPackage;
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            return null;

        }

    }
}
