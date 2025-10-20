package calculator.controller;

import calculator.model.StringCalculator;
import calculator.view.InputView;
import calculator.view.OutputView;

public class CalculatorController {

    private final StringCalculator stringCalculator;
    private final InputView inputView;
    private final OutputView outputView;

    public CalculatorController(StringCalculator stringCalculator, InputView inputView, OutputView outputView) {
        this.stringCalculator = stringCalculator;
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void calculate() {
        String userInput = inputView.getStringInput();
        int result = stringCalculator.add(userInput);
        outputView.printSum(result);
    }
}

