package vendingmachine.view;

import vendingmachine.Coin;

import java.util.Map;

public class OutputView {
    public void printEmptyMsg() {
        System.out.println();
    }
    public void printMsg(String msg) {
        System.out.println(msg);
    }

    public void printInitCoins(Map<Integer, Long> currentCoinList) {
        for (Coin coin : Coin.values()) {
            printMsg(getCoinInfo(coin.getCoinMsg(), currentCoinList.get(coin.getAmount())));
        }
    }

    public String getCoinInfo(String coinMsg, Long coinAmount) {
        return coinMsg + String.valueOf(coinAmount);
    }
}
