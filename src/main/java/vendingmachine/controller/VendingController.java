package vendingmachine.controller;

import vendingmachine.view.InputView;
import vendingmachine.view.OutputView;

public class VendingController {
    private final InputView inputView;
    private final OutputView outputView;

    public VendingController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void start() {
        // 자판기 보유 금액 입력
        // 자판기 금액 -> 동전 랜덤 변경
        //
    }
}
