package pl.model;

import pl.validator.ClassNameValidator;
import pl.validator.ValidatorConstant;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.List;
import java.util.Scanner;

public class AClass {

    private Package aPackage;
    private List<Import> imports;
    private String className;
    private List<Variable> variables;

    public static AClass build(File file) {
        return new ClassBuilder().build(file);
    }

    private static class ClassBuilder {

        public AClass build(File file) {
            AClass aClass = new AClass();
            aClass.aPackage = Package.build(file);
            aClass.imports = Import.build(file);
            aClass.className = AClass.buildClassName(file);
            aClass.variables = Variable.build(file);
            return aClass;
        }
    }

    private static String buildClassName(File file) {
        return ClassNameBuilder.build(file);
    }

    private static class ClassNameBuilder {
        private static String build(File file) {
            try {
                Scanner scanner = new Scanner(file);
                ClassNameValidator classNameValidator = new ClassNameValidator();
                while (scanner.hasNext()) {
                    String line = scanner.nextLine();
                    if (classNameValidator.valid(line)) {
                        return line.replace(ValidatorConstant.CLASS_NAME_START, "").replace(ValidatorConstant.CLASS_NAME_FINISH, "");
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
}
