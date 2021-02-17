package pl.validator;

public interface ValidatorConstant {
    String CLASS_NAME_START = "public class ";
    String CLASS_NAME_FINISH = ";";

    String IMPORT_START = "import ";
    String IMPORT_FINISH = ";";

    String PACKAGE_START = "package ";
    String PACKAGE_FINISH = ";";

    String VARIABLE_PATTERN_FOR_CLASS = "\\G[a-zA-z]+\\s{1}[a-zA-z]+[;]{1}$";
    String VARIABLE_PATTERN_FOR_LIST = "\\G[a-zA-z]+<{1}[a-zA-z<>]+>{1}\\s{1}[a-zA-z]+;{1}$";
    String VARIABLE_PATTERN_FOR_MAP = "\\G[a-zA-z]+<{1}[a-zA-z<>]+[,]{1}\\s{1}[a-zA-z<>]+[>]{1}\\s{1}[a-zA-z]+;{1}$";
    String VARIABLE_PATTERN_FOR_CLASS_WITH_SETTING_ACCESS = "\\G[a-zA-z]+\\s{1}[a-zA-z]+\\s{1}[a-zA-z]+[;]{1}$";
    String VARIABLE_PATTERN_FOR_LIST_WITH_SETTING_ACCESS = "\\G[a-zA-z]+\\s{1}[a-zA-z]+<{1}[a-zA-z<>]+>{1}\\s{1}[a-zA-z]+[;]{1}$";
    String VARIABLE_PATTERN_FOR_MAP_WITH_SETTING_ACCESS = "\\G[a-zA-z]+\\s{1}[a-zA-z]+<{1}[a-zA-z<>]+[,]{1}\\s{1}[a-zA-z<>]+[>]{1}\\s{1}[a-zA-z]+[;]{1}$";


}
