package vendingmachine;

import vendingmachine.controller.VendingController;
import vendingmachine.view.InputView;
import vendingmachine.view.OutputView;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        VendingController vendingController = new VendingController(new InputView(), new OutputView());
    }
}
