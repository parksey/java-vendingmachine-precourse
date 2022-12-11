package vendingmachine.controller;

import vendingmachine.domain.Product;
import vendingmachine.domain.VendingmachineDomain;
import vendingmachine.util.PrintMsg;
import vendingmachine.view.InputView;
import vendingmachine.view.OutputView;

import java.util.Map;

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
        readVendingmachineAmount();
        readProuduct();
        readUserAmount();

        // 구매 상품 반복 입력
        // 적으면 종료
    }

    public void readVendingmachineAmount() {
        vendingmachineDomain.setVendingmachine(getVendingMachineAmount());
        outputView.printEmptyMsg();
        outputView.printInitCoins(vendingmachineDomain.getCurrentCoinList());
        outputView.printEmptyMsg();
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

    public void readProuduct() {
        vendingmachineDomain.setProducts(getProducts());
        outputView.printEmptyMsg();
    }

    public Map<String, Product> getProducts() {
        while (true) {
            try {
                outputView.printMsg(PrintMsg.INPUT_PRODUCT.getMsg());
                return inputView.readProducts();
            } catch (IllegalArgumentException exception) {
                outputView.printMsg(exception.getMessage());
                outputView.printEmptyMsg();
            }
        }
    }

    public void readUserAmount() {
        vendingmachineDomain.setUserAmount(getUserAmount());
    }

    public long getUserAmount() {
        while (true) {
            try {
                outputView.printMsg(PrintMsg.INIPUT_USER_AMOUNT.getMsg());
                return inputView.readUserAmount();
            } catch (IllegalArgumentException exception) {
                outputView.printMsg(exception.getMessage());
                outputView.printEmptyMsg();
            }
        }
    }

    public void buySomthing() {
        while (true) {

        }
    }



}
