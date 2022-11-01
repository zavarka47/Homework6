import java.text.Format;

public class Main {
    public static void main(String[] args) {


        System.out.println("Exercise 1.1");
        //С помощью цикла for выведите в консоль все числа от 1 до 10
        for (int i11 = 1; i11<=10; i11=i11+1){
            System.out.println("Итерация цикла " + i11);

        }

        System.out.println("Exercise 1.2");
        // С помощью цикла for выведите в консоль все числа от 10 до 1
        for (int i12 = 10; i12>0; i12=i12-1){
            System.out.println("Итерация цикла " + i12);
        }

        System.out.println("Exercise 1.3");
        //Выведите в консоль все четные числа от 0 до 17
        for (int i13 = 0; i13 <= 17; i13=i13+2){

            System.out.println("Итерация цикла " + i13);
        }

        System.out.println("Exercise 1.4");
        //Выведите в консоль все числа от 10 до - 10 от бОльшего числа к меньшему
        for (int i14 = 10; i14>=-10; i14--){
            System.out.println("Итерация цикла " + i14);
        }

        System.out.println("Exercise 2.1");
        //Напишите программу, которая выводит в консоль все високосные года, начиная с 1904 года до 2096.
        //В консоль результат должен выводиться в формате "… год является високосным"
        for (int i21 = 1904; i21 <= 2096; i21 = i21 + 4){
            System.out.println(i21 + " год является високосным");
        }

        System.out.println("Exercise 2.2");
        //Напишите программу, которая выводит в консоль последовательность цифр:
        //7 14 21 28 35 42 49 56 63 70 77 84 91 98
        for (int i22 = 7; i22<=98; i22=i22+7){
            System.out.print(i22+" ");
        }

        System.out.println( );

        System.out.println("Exercise 2.3");
        //Напишите программу, которая выводит в консоль последовательность цифр:
        //1 2 4 8 16 32 64 128 256 512
        for (int i23 = 2; i23<=512; i23=i23*2 ){
            System.out.print(i23 + " ");
        }

        System.out.println( );

        System.out.println("Exercise 3.1");
        //Посчитайте с помощью цикла for сумму годовых накоплений, если каждый месяц вы будете
        // откладывать по 29 000 рублей "в банку".
        //Выведите сумму накоплений за каждый месяц в консоль в формате "Месяц … , сумма накоплений равна … рублей".
        int monthIncome = 29000;
        int amount = 0;
        for (int i31 = 1; i31<=12; i31++) {
            amount = amount + monthIncome;
            System.out.println("Месяц " + i31 + " сумма накоплений равна " + amount + " рублей");
        }

        System.out.println("Exercise 3.2");
        //Перепишите решение задачи выше при условии, что деньги вы откладывать будете не "в банку",
        // а в банк под проценты – 12% годовых. Выведите сумму накоплений за каждый месяц в консоль в формате
        // "Месяц … , сумма накоплений равна … рублей"
        int monthIncome2 = 29000;
        int amount2 = 0;
        for (int i32 = 1; i32<=12; i32++){
            amount2 = amount2 + amount2/100;
            amount2 = amount2 + monthIncome2;
            System.out.println("Месяц " + i32 + " сумма накоплений равна " + amount2 + " рублей");
        }
    }
}