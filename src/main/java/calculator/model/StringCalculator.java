package calculator.model;

import java.util.List;

public class StringCalculator {
    private final StringToNumParser parser;

    public StringCalculator(StringToNumParser parser) {
        this.parser = parser;
    }

    public int add(String text) {
        List<Integer> numberList = parser.parse(text);

        int sum = 0;
        for (int number : numberList) {
            sum += number;
        }

        return sum;
    }
}

