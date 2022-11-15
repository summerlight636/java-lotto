package lotto;

public class Application {
    public static void main(String[] args) {
        // 로또 구입 금액 입력 받기 // 예외 처리 (int가 아닌 경우, 1000원 단위가 아닐 경우)
        System.out.println("구입 금액을 입력해주세요.");
        int money = Input.inputMoney();

        // 로또 구입 금액에 따른 로또 개수 계산
        int count = Judgement.buyLotto(money);
        System.out.println(count);

        // 당첨 번호 입력 받기 // 예외 처리 (1~45 자리 수, int가 아닌 경우, 6자리 수, 중복 문자 제거)

        // 보너스 번호 입력 받기 // 예외 처리 (1~45 자리 수, int가 아닌 경우 )

        // 발행한 로또 수량 및 번호 출력

        // 당첨 내역 출력

        // 수익률 계산 출력
    }
}
