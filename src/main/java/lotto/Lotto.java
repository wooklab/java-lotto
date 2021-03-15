package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto {
    private final ArrayList<Integer> lottoNumbers;
    private LottoPrice lottoPrice;

    public Lotto() {
        this.lottoNumbers = new ArrayList<>();
        for (int i = 0; i < 46; i++) {
            lottoNumbers.add(i);
        }
        this.lottoPrice = new LottoPriceImpl();
    }

    public List<Integer> getLottoNumbers() {
        ArrayList<Integer> shuffledNumbers = (ArrayList<Integer>) lottoNumbers.clone();
        Collections.shuffle(shuffledNumbers);
        return shuffledNumbers;
    }

    public int howManyPass(int receiveMoney) {
        return this.lottoPrice.howManyPass(receiveMoney);
    }
}
