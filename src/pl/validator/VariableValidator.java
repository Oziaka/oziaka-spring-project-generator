package pl.validator;

import static pl.validator.ValidatorConstant.*;

public class VariableValidator implements Validator {
    @Override
    public boolean valid(String line) {
        return line.matches(VARIABLE_PATTERN_FOR_CLASS)
                || line.matches(VARIABLE_PATTERN_FOR_LIST)
                || line.matches(VARIABLE_PATTERN_FOR_MAP)
                || line.matches(VARIABLE_PATTERN_FOR_CLASS_WITH_SETTING_ACCESS)
                || line.matches(VARIABLE_PATTERN_FOR_LIST_WITH_SETTING_ACCESS)
                || line.matches(VARIABLE_PATTERN_FOR_MAP_WITH_SETTING_ACCESS);
    }
}
