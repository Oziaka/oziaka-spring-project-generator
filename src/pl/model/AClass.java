package pl.model;

import pl.validator.ClassNameValidator;
import pl.validator.ImportValidator;
import pl.validator.PackageValidator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class AClass {

    private Package aPackage;
    private List<String> imports;
    private String className;
    private List<Variable> variables;

    public static AClass build(File file) {
        return new ClassBuilder(file).build();
    }

    private static class ClassBuilder {

        private File file;

        public AClass build() {
            AClass aClass = new AClass();
            Scanner scanner = null;
            try {
                scanner = new Scanner(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            PackageValidator packageValidator = new PackageValidator();
            ImportValidator importValidator = new ImportValidator();
            ClassNameValidator classNameValidator = new ClassNameValidator();

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                if (packageValidator.valid(line)) {
                    aClass.aPackage = Package.build(line);
                    break;
                }
            }
            return aClass;
        }

        ClassBuilder(File file) {

        }

    }
}
