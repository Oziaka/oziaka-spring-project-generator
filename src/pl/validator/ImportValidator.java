package pl.validator;

import static pl.validator.ValidatorConstant.IMPORT_FINISH;
import static pl.validator.ValidatorConstant.IMPORT_START;

public class ImportValidator implements Validator {
    @Override
    public boolean valid(String line) {
        return (line.startsWith(IMPORT_START)) && line.endsWith(IMPORT_FINISH);
    }
}
