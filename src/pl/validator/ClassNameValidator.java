package pl.validator;

import static pl.validator.ValidatorConstant.CLASS_NAME_FINISH;
import static pl.validator.ValidatorConstant.CLASS_NAME_START;

public class ClassNameValidator implements Validator {
    @Override
    public boolean valid(String line) {
        return line.startsWith(CLASS_NAME_START) && line.endsWith(CLASS_NAME_FINISH);
    }
}
