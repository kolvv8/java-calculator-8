# java-calculator-precourse

# 문자열 덧셈 계산기

## 프로젝트 소개

- 사용자가 입력한 문자열에서 숫자를 추출하여 덧셈을 수행하는 계산기입니다.
- MVC 패턴을 활용하여 객체지향적 설계를 진행하였습니다.

---

## 주요 기능 목록

### 핵심 기능

- [ ] 쉼표(,) 또는 콜론(:)을 기본 구분자로 사용
- [ ] //와 \n 사이에 위치한 문자를 커스텀 구분자로 지정
- [ ] 구분자를 통해 문자열을 숫자로 나누고 더함.
- [ ] 구분자 사이에 값이 비어있는 경우, 또는 빈 문자열에 대해 0으로 처리 (예: 1::2 -> 1 + 0 + 2 = 3)

### 예외 처리

IllegalArgumentException을 발생시켜 애플리케이션을 종료

- 커스텀 구분자 관련 예외 처리
    - [ ] 커스텀 구분자로 숫자 사용 시 예외처리.
    - [ ] 커스텀 구분자에 여러 문자 입력 시 예외처리.

- 입력 문자열 관련 예외 처리
    - [ ] 구분자로 분리한 숫자에 대해 양수가 아닐 시 (음수 또는 0일 때) 예외 처리.
    - [ ] 문자열에 숫자가 아니며, 커스텀 구분자로 지정되지 않은 문자 포함시 예외 처리

---

## 프로젝트 구조

MVC 패턴에 따라 아래와 같이 파일을 구성하였습니다.

```
src
└── main
    └── java
        └── calculator
            ├── Application.java
            ├── controller
            │   └── CalculatorController.java
            ├── view
            │   ├── InputView.java
            │   └── OutputView.java
            └── model
                ├── StringCalculator.java
                └── StringToNumParser.java
```