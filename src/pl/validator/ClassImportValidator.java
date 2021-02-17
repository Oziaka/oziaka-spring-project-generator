package pl.validator;

import static pl.validator.ValidatorConstant.CLASS_IMPORT_FINISH;
import static pl.validator.ValidatorConstant.CLASS_IMPORT_START;

public class ClassImportValidator implements Validator {
    @Override
    public boolean valid(String line) {
        return (line.startsWith(CLASS_IMPORT_START)) && line.endsWith(CLASS_IMPORT_FINISH);
    }
}
