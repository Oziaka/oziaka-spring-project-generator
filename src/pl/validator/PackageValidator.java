package pl.validator;

import static pl.validator.ValidatorConstant.*;

public class PackageValidator implements Validator {
    @Override
    public boolean valid(String line) {
        return line.startsWith(PACKAGE_START) && line.endsWith(PACKAGE_FINISH);
    }
}
