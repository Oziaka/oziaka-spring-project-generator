package pl.model;

import pl.validator.ClassImportValidator;
import pl.validator.StaticImportValidator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Import {

    Package aPackage;
    String className;
    ImportType importType;

    public static List<Import> build(File file) {
        return ImportBuilder.build(file);
    }

    private static class ImportBuilder {
        private static List<Import> build(File file) {
            try {
                ClassImportValidator classImportValidator = new ClassImportValidator();
                StaticImportValidator staticImportValidator = new StaticImportValidator();
                List<Import> imports = new ArrayList<>();
                Scanner scanner = new Scanner(file);
                while (scanner.hasNext()) {
                    String line = scanner.nextLine();
                    if(classImportValidator.valid(line)){
                        imports.add(new Import(ImportType.CLASS,))
                    }
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
}
