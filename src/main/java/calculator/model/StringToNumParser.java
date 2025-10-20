package calculator.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringToNumParser {
    private static String DELIMITERS = ",:";
    private static final String CUSTOM_DELIMITER_PREFIX = "//";
    private static final String CUSTOM_DELIMITER_SUFFIX = "\\n";
    private static final int CUSTOM_DELIMITER_PREFIX_LENGTH = CUSTOM_DELIMITER_PREFIX.length(); // 2

    public List<Integer> parse(String input) {
        String numberString = input;
        if (input.startsWith(CUSTOM_DELIMITER_PREFIX)) {
            final int endDelimiterIndex = input.indexOf(CUSTOM_DELIMITER_SUFFIX);
            final int beginNumberStringIndex = CUSTOM_DELIMITER_PREFIX_LENGTH + 1;

            if (endDelimiterIndex == beginNumberStringIndex) {
                String customDelimiter = input.substring(CUSTOM_DELIMITER_PREFIX_LENGTH, endDelimiterIndex);
                validateCustomDelimiter(customDelimiter);
                numberString = input.substring(endDelimiterIndex + 2);

                DELIMITERS += customDelimiter;
            }
        }
        DELIMITERS = '[' + DELIMITERS + ']';
        return splitAndParse(numberString, DELIMITERS);
    }

    private void validateCustomDelimiter(String delimiter) {
        if (delimiter.length() != 1) {
            throw new IllegalArgumentException("[ERROR] Custom delimiter should contain only one character.");
        }
        if (Character.isDigit(delimiter.charAt(0))) {
            throw new IllegalArgumentException("[ERROR] Custom delimiter should not contain digit.");
        }
    }

    private List<Integer> splitAndParse(String text, String delimiter) {
        String[] numberStrings = text.split(delimiter, -1);
        List<Integer> numberList = new ArrayList<>();

        for (String numberString : numberStrings) {
            int number = Integer.parseInt(numberString);
            numberList.add(number);
        }
        return numberList;
    }
}
