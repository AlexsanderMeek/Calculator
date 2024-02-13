import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Добро пожаловать в калькулятор!");
        System.out.print("Введите выражение (Например: a + b, a - b, и т.д.): " );
        // Получаем выражение от пользователя и передаём в переменную "num"
        String num = scan.nextLine();
        Calculator calc = new Calculator();
        // Передаём данные "num" в метод "calc"
        calc.calc(num);
        CalculatorRom calcRom = new CalculatorRom();
        // Передаём данные "num" в метод "calcRom"
        calcRom.calcRom(num);
    }
}


class Calculator{
    public static String calc(String input){
        int a = 0;
        int b = 0;
        int result = 0;
        float result1 = 0;
        // Убираем пробелы если они имеются в выражение
        String s = input.replaceAll(" ", "");

        //Преобразуем строчку в массив
        String[] nums = s.split("[+\\-*/]");

        // Удаляем в строке всё кроме знака
        String number = s.replaceAll("\\w+", "");

        // Преобразуем строки в int
        switch (nums[0]) {
            case "1":
                a = 1;
                break;
            case "2":
                a = 2;
                break;
            case "3":
                a = 3;
                break;
            case "4":
                a = 4;
                break;
            case "5":
                a = 5;
                break;
            case "6":
                a = 6;
                break;
            case "7":
                a = 7;
                break;
            case "8":
                a = 8;
                break;
            case "9":
                a = 9;
                break;
            case "10":
                a = 10;
                break;
        }

        switch (nums[1]) {
            case "1":
                b = 1;
                break;
            case "2":
                b = 2;
                break;
            case "3":
                b = 3;
                break;
            case "4":
                b = 4;
                break;
            case "5":
                b = 5;
                break;
            case "6":
                b = 6;
                break;
            case "7":
                b = 7;
                break;
            case "8":
                b = 8;
                break;
            case "9":
                b = 9;
                break;
            case "10":
                b = 10;
                break;
        }

        // Проверяет выражение на арефметический знак и выполняет действие(сложение,умножение и тп)
        if(a != 0 || b != 0) {

            switch (number) {
                case "+":
                    result = a + b;
                    System.out.println(a + "+" + b + "=" + result);
                    System. exit(0);
                    break;
                case "-":
                    result = a - b;
                    System.out.println(a + "-" + b + "=" + result);
                    System. exit(0);
                    break;
                case "*":
                    result = a * b;
                    System.out.println(a + "*" + b + "=" + result);
                    System. exit(0);
                    break;
                case "/":
                    result = a / b;
                    System.out.println(a + "/" + b + "=" + result);
                    System. exit(0);
                    break;
                default:
                    throw new IllegalStateException("Неизвестный/Неправильный арефметический знак: " + nums[1]);

            }
        }


        return s;
    }
}
class CalculatorRom{
    public static String calcRom(String input) {
        int a = 0;
        int b = 0;
        int result = 0;



        String x = input.replaceAll(" ", "");

        //Преобразуем строчку в массив без знаков
        String[] nums = x.split("[+\\-*/]");

        // Удаляем в строке всё кроме знака
        String number = x.replaceAll("\\w+", "");

        // Преобразуем римские числа в арабские для вычеслений
        switch (nums[0]) {
            case "I":
                a = 1;
                break;
            case "II":
                a = 2;
                break;
            case "III":
                a = 3;
                break;
            case "IV":
                a = 4;
                break;
            case "V":
                a = 5;
                break;
            case "VI":
                a = 6;
                break;
            case "VII":
                a = 7;
                break;
            case "VIII":
                a = 8;
                break;
            case "IX":
                a = 9;
                break;
            case "X":
                a = 10;
                break;
        }


        switch (nums[1]) {
            case "I":
                b = 1;
                break;
            case "II":
                b = 2;
                break;
            case "III":
                b = 3;
                break;
            case "IV":
                b = 4;
                break;
            case "V":
                b = 5;
                break;
            case "VI":
                b = 6;
                break;
            case "VII":
                b = 7;
                break;
            case "VIII":
                b = 8;
                break;
            case "IX":
                b = 9;
                break;
            case "X":
                b = 10;
                break;

        }



        switch (number) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
               result = a * b;
               break;
            case "/":
                result = a / b;
                break;
            default:
                throw new IllegalStateException("Неизвестный/Неправильный арефметический знак: " + number);
        }
        String result1 = (nums[0]+number+nums[1]+"=");
        // Массив с римскими числами
        String[] RomanResult = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        System.out.print(result1+RomanResult[result]);

        return input;
    }
}
