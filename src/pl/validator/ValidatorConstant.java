package pl.validator;

public interface ValidatorConstant {
    String CLASS_NAME_START = "public class ";
    String CLASS_NAME_FINISH = ";";

    String CLASS_IMPORT_START = "import ";
    String CLASS_IMPORT_FINISH = ";";

    String STATIC_IMPORT_START = "import static ";
    String STATIC_IMPORT_FINISH = ";";


    String PACKAGE_START = "package ";
    String PACKAGE_FINISH = ";";

    String VARIABLE_PATTERN_FOR_CLASS = "\\G[a-zA-Z]+\\s[a-zA-Z]+;$";
    String VARIABLE_PATTERN_FOR_LIST = "\\G[a-zA-Z]+<[a-zA-Z<>]+>\\s[a-zA-Z]+;$";
    String VARIABLE_PATTERN_FOR_MAP = "\\G[a-zA-Z]+<[a-zA-Z<>]+,\\s[a-zA-Z<>]+>\\s[a-zA-Z]+;$";

    String VARIABLE_PATTERN_FOR_CLASS_WITH_SETTING_ACCESS = "\\G[a-z]+\\s[a-zA-Z]+\\s[a-zA-Z]+;$";
    String VARIABLE_PATTERN_FOR_LIST_WITH_SETTING_ACCESS = "\\G[a-z]+\\s[a-zA-Z]+<[a-zA-Z<>]+>\\s[a-zA-Z]+;$";
    String VARIABLE_PATTERN_FOR_MAP_WITH_SETTING_ACCESS = "\\G[a-z]+\\s[a-zA-Z]+<[a-zA-Z<>]+,\\s[a-zA-Z<>]+>\\s[a-zA-Z]+;$";


}
