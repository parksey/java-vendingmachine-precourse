package vendingmachine.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public String getUserInput() {
        return Console.readLine();
    }
    /**
     * 자판기 보유 금액 입력
     */
    public void readVendingmachineAmount() {
        String userInput = getUserInput();
        checkVendingmachineAmount();
    }

    public void checkVendingmachineAmount() {
        
    }

    /**
     * 투입 금액
     */
    public void readUserAmount() {
        String userInput = getUserInput();
    }

    /**
     * 자판기 상품 리스트 입력
     */
    public void readProducts() {
        String userInput = getUserInput();
    }

    /**
     * 구입 상품명 입력
     */
    public void readProductsName() {
        String userInput = getUserInput();
    }

}
