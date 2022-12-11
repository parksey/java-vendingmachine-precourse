package vendingmachine.view;

import camp.nextstep.edu.missionutils.Console;
import vendingmachine.util.ProductFormat;

import java.util.List;

public class InputView {
    public String getUserInput() {
        return Console.readLine();
    }

    /**
     * 자판기 보유 금액 입력
     * @return
     */
    public long readVendingmachineAmount() {
        String userInput = getUserInput();
        checkAmount(userInput);
        return Long.parseLong(userInput);
    }

    public void checkAmount(String userInput) {
        InputException.nullException(userInput);
        InputException.notNumberException(userInput);
        InputException.notChangeMoney(Long.parseLong(userInput));
    }

    /**
     * 투입 금액
     * @return
     */
    public long readUserAmount() {
        String userInput = getUserInput();
        checkUserAmount(userInput);
        return Long.parseLong(userInput);
    }

    public void checkUserAmount(String userInput) {
        checkAmount(userInput);
        InputException.isZero(Long.parseLong(userInput));
    }

    /**
     * 자판기 상품 리스트 입력
     */
    public void readProducts() {
        String userInput = getUserInput();
        checkProductsFormat(userInput);
    }

    public void checkProductsFormat(String userInput) {
        InputException.nullException(userInput);
        InputException.notProductStartEndFormatException(userInput);
        List<String> inputList = List.of(userInput.split(ProductFormat.CLONE.getFormat()));
        InputException.notProductsListFormatException(inputList);

    }


    /**
     * 구입 상품명 입력
     */
    public void readProductsName() {
        String userInput = getUserInput();
    }

}
