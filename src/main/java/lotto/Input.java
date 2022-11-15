package lotto;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Input {
    public static int inputMoney() {
        String input = Console.readLine();
        if(!validateNumber(input)){
            throw new IllegalArgumentException();
        }
        int price = Integer.parseInt(input);
        validateUnitIs1000(price);
        return price;
    }

    public static List<Integer> inputWinningNumber() {
        List<Integer> winningNumber = new ArrayList<>();
        String input = Console.readLine();
        String[] splitedInput = input.split(",");
        for (String number : splitedInput){
            validateLottoNumber(number);
            validateNotDuplicated(winningNumber, number);
            winningNumber.add(Integer.parseInt(number));
        }
        return winningNumber;
    }

    public static int inputBonusNumber(List<Integer> winningNumber) {
        String input = Console.readLine();
        validateLottoNumber(input);
        validateNotDuplicated(winningNumber, input);
        return Integer.parseInt(input);
    }

    public static boolean validateNumber(String input) {
        String pattern = "^[0-9]*$";
        boolean result = Pattern.matches(pattern, input);
        return result;
    }

//    public static boolean validateNumber(String input) {
//        String pattern = "^[0-9]*$";
//        boolean result = Pattern.matches(pattern, input);
////        if(!result){
////            System.out.println("[ERROR] 숫자를 입력해주세요.");
////        }
//        return result;
//    }


    public static void validateUnitIs1000(int input) {
        if(!(input%1000==0)){
            System.out.println("[ERROR] 1000원 단위로 입력해주세요.");
            throw new IllegalArgumentException();
        }
    }

    public static void validateLottoNumber(String input){
        validateNumber(input);
        int number = Integer.parseInt(input);
        if (!(1<=number && number<=45)) {
            System.out.println("[ERROR] 1과 45사이의 숫자를 입력해주세요.");
            throw new IllegalArgumentException();
        }
    }

    public static void validateNotDuplicated(List<Integer> target, String input){
        if(target.contains(Integer.parseInt(input))){
            System.out.println("[ERROR] 중복되지 않도록 입력해주세요.");
            throw new IllegalArgumentException();
        }
    }
}
