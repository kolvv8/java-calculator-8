package calculator.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public String getStringInput() {
        System.out.print("계산할 문자열을 입력하세요. : ");
        return Console.readLine();
    }
}
