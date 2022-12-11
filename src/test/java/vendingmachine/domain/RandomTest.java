package vendingmachine.domain;

import camp.nextstep.edu.missionutils.Randoms;
import org.junit.jupiter.api.Test;

import java.util.List;

public class RandomTest {
    @Test
    void test() {
        System.out.print("??");
        System.out.println(Randoms.pickNumberInList(List.of(1,2,3,4)));
    }
}
