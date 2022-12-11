package vendingmachine.controller;

import vendingmachine.domain.VendingmachineDomain;
import vendingmachine.util.PrintMsg;
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
            // 자판기 보유 동전 출력

        // Product 입력
            // 입력 VendingMachine에 넣기

        // 투입금액 입력
        // 구매 상품 반복 입력
        // 적으면 종료
    }

    public void readVendingmachineAmount() {
        vendingmachineDomain.setVendingmachine(getVendingMachineAmount());
    }

    public long getVendingMachineAmount() {
        while (true) {
            try {
                outputView.printMsg(PrintMsg.INPUT_VENDING_AMOUNT.getMsg());
                return inputView.readVendingmachineAmount();
            } catch (IllegalArgumentException exception) {
                outputView.printMsg(exception.getMessage());
                outputView.printEmptyMsg();
            }
        }
    }

}
