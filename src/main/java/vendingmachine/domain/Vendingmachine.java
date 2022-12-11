package vendingmachine.domain;

import camp.nextstep.edu.missionutils.Randoms;
import vendingmachine.Coin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Vendingmachine {
    private long vendingAmount;
    private Map<Integer, Long> coinList;
    private Map<String, Product> productMap;

    public Vendingmachine(long vendingAmount) {
        this.vendingAmount = vendingAmount;
        this.coinList = makeRandomCoinList(vendingAmount);
    }



    public Map<String, Product> getProductMap() {
        return productMap;
    }

    public static Map<Integer, Long> makeRandomCoinList(long vendingAmount) {
        Map<Integer, Long> coinResult;
        while (true) {
            coinResult = initCoinsMap();
            if (makeSuccess(coinResult, vendingAmount)) {
                break;
            }
        }
        return coinResult;
    }
    public static Map<Integer, Long> initCoinsMap() {
        Map<Integer, Long> coins = new HashMap<>();
        for (Coin coin : Coin.values()) {
            coins.put(coin.getAmount(), 0L);
        }
        return coins;
    }

    public static boolean makeSuccess(Map<Integer, Long> coinReuslt, long vendingAmount) {
        List<Integer> coinList = Coin.getCoinList();
        long amount = 0;
        while (amount != vendingAmount) {
            int  randomCoin = getRandomCoin(coinList);

            amount += randomCoin;
            addCoin(coinReuslt, randomCoin);
            if (amount > vendingAmount) {
                return false;
            }
        }
        return true;
    }
    public static int getRandomCoin(List<Integer> coinList) {
        return Randoms.pickNumberInList(coinList);
    }

    public static void addCoin(Map<Integer, Long> coinReuslt, int randomCoin) {
        coinReuslt.put(randomCoin, coinReuslt.get(randomCoin)+1);
    }
}
