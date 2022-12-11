package vendingmachine.domain;

import org.junit.jupiter.api.Test;
import vendingmachine.Coin;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class VendingmachineTest {
    @Test
    void makeRandomCoint_Test() {
        Map<Integer, Long> randomCoins =  Vendingmachine.makeRandomCoinList(450);
        List<Integer> coinList = Coin.getCoinList();
        int amont = 0;
        for(int coin : coinList) {
            amont += coin * randomCoins.get(coin);
        }
        assertThat(amont).isEqualTo(450);
    }
}
