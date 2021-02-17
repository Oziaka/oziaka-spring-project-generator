package pl.validator;

import static pl.validator.ValidatorConstant.*;

public class VariableValidator implements Validator {
    @Override
    public boolean valid(String line) {
        return line.matches(VARIABLE_PATTERN_FOR_CLASS) || line.matches(VARIABLE_PATTERN_FOR_LIST) || line.matches(VARIABLE_PATTERN_FOR_MAP);
    }
}
