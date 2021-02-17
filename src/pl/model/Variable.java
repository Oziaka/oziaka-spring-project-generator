package pl.model;

import java.io.File;
import java.util.List;

public class Variable {

    private String className;
    private Variable genericVariable;

    Variable(String className, boolean isClass) {
    }

    Variable(String genericClassName, Variable aClass) {

    }


    public static List<Variable> build(File file) {
        return null;
    }
}


