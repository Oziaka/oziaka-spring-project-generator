package pl.validator;

import static pl.validator.ValidatorConstant.*;

public class StaticImportValidator implements Validator{
    @Override
    public boolean valid(String line) {
        return (line.startsWith(STATIC_IMPORT_START)) && line.endsWith(STATIC_IMPORT_FINISH);
    }
}
