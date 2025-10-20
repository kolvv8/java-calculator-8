package calculator;

import calculator.controller.CalculatorController;
import calculator.model.StringCalculator;
import calculator.model.StringToNumParser;
import calculator.view.InputView;
import calculator.view.OutputView;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        StringToNumParser parser = new StringToNumParser();
        StringCalculator stringCalculator = new StringCalculator(parser);

        InputView inputView = new InputView();
        OutputView outputView = new OutputView();

        CalculatorController controller = new CalculatorController(stringCalculator, inputView, outputView);

        controller.calculate();
    }
}
