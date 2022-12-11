package vendingmachine.controller;

import vendingmachine.domain.VendingmachineDomain;
import vendingmachine.view.InputView;
import vendingmachine.view.OutputView;

public class VendingController {
    private final InputView inputView;
    private final OutputView outputView;
    private final VendingmachineDomain vendingmachineDomain;

    public VendingController(InputView inputView, OutputView outputView, VendingmachineDomain vendingmachineDomain) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.vendingmachineDomain = vendingmachineDomain;
    }

    public void start() {
        // 자판기 보유 금액 입력
        // 자판기 금액 -> 동전 랜덤 변경
        //
    }

    public void readVendingmachineAmount() {
        outputView.printMsg();
    }
}
