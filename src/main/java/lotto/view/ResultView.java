package lotto.view;

import lotto.domain.LottoRecord;

import java.util.Arrays;

import lotto.domain.LottoList;

public class ResultView {

    public void printLotto(LottoList list){
        list.getLottoList().stream().forEach(l -> System.out.println(Arrays.toString(l.getLotto())));
    }

    public void printRecord(LottoRecord record){
        System.out.println("당첨 통계");
        System.out.println("--------------------");
        System.out.println("3개 일치 (5000원) - " + record.getCountThree());
        System.out.println("4개 일치 (50000원) - " + record.getCountFour());
        System.out.println("5개 일치 (1500000원) - " + record.getCountFive());
        System.out.println("5개 일치 + 보너스 일치 (1500000원) - " + record.getcountFiveAndBonus());
        System.out.println("6개 일치 (200000000원) - " + record.getCountSix());
        System.out.println("총 수익률은 " + record.getProfit() + "입니다.");
    }
    
}