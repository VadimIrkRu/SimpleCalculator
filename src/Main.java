import java.util.Scanner; //ввод с клавиатуры

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //инструмент чтения ввода
        Calculator calc = new Calculator(); //создаем калькулятор

        //ввод первого числа
        System.out.print("Введите первое число");
        calc.number1 = scanner.nextInt();

        // ввод знакаа +
        System.out.print(" Введите знак (+)");
        String sign = scanner.next();

        // ввод второго числа
        System.out.print(" Введите второе число");
        calc.number2 = scanner.nextInt();

        // Ввод знака =
        System.out.print("введите знак =");

        // вывод результата
        int result = calc.add();
        System.out.print("Результат" + result);
        // сброс
        System.out.print("Сбросить? (да/нет): ");
        String reset = scanner.next();
        if (reset.equals("да")){
            calc.reset();
            System.out.print("Сброшено! Числа: "+ calc.number1 + " и " + calc.number2);

        }
    }
}
