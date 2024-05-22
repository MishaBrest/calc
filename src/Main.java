import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
// получаем алгебраическое вырожение в виде строки
        Scanner calc = new Scanner(System.in);
        System.out.println("Введите алгебраическое выражение"+ "\n"+ "только арабскими или только римскими: ");
        String expr = calc.nextLine();

        int mas = 1; //ключ между первой и второй величиной выражения
        int a = 0;//текущая разрядность массива первой и второй величины выраженя
        int vm1 = 0, vm2 = 0;//конечная разрядность массива первой и второй величины выражения
        int znak =0;//показатель арифметического знака
        char [] mas1 = new char[10];
        char [] mas2 = new char[10];
        char[] chars = expr.toCharArray();// преобразуем в массив полученную строку
        for (int i=0; i < chars.length; i++) {// инициализируем массивов первой и второй величины выражения
            switch (chars[i]) {
// определение арифметического знака
                case '+': mas = 2; a = 0; znak = 1;  break;
                case '-': mas = 2; a = 0; znak = 2; break;
                case '*': mas = 2; a = 0; znak = 3; break;
                case '/': mas = 2; a = 0; znak = 4; break;
                default:
// инициализируем массив первой величины выражения с задонной разрядностью
                    if (mas == 1) {
                        if (chars[i]!=0){
                            mas1[a] = chars[i];
                            a = a + 1; vm1 = vm1+1;
                        }
                    }
                    else {
// инициализируем массив второй величины выражения с задонной разрядностью
                        if (chars[i]!=0){
                            mas2[a] = chars[i];
                            a = a + 1; vm2 = vm2 + 1;
                        }
                    }
            }
        }
//исключения на арифметический знак
        if (znak == 0) {
            System.out.println("Вами не был введен арифметический знак, попробуйте еше раз");
            System.exit(0);
        }
        char [] mas11 = new char[vm1];// объявление первой величины выражения
        char [] mas22 = new char[vm2];// объявление второй величины выражения
// инициализируем массив первой величины выражения с определенной разрядностью
        for (int i=0; i < vm1; i++) {
            mas11[i] = mas1[i];
        }
// инициализируем массив второй величины выражения с определенной разрядностью
        for (int i=0; i < vm2; i++) {
            mas22[i] = mas2[i];
        }

        int x1 = 0, x2 = 0, poz1 = 0, poz2 = 0;
        int rez = 0;



        String str1 = new String(mas11);
        String str2 = new String(mas22);


// определяем тип выражения
        switch (str1) {
            case ("1"): x1 = 1; poz1 = 1; break;
            case ("2"): x1 = 2; poz1 = 1; break;
            case ("3"): x1 = 3; poz1 = 1; break;
            case ("4"): x1 = 4; poz1 = 1; break;
            case ("5"): x1 = 5; poz1 = 1; break;
            case ("6"): x1 = 6; poz1 = 1; break;
            case ("7"): x1 = 7; poz1 = 1; break;
            case ("8"): x1 = 8; poz1 = 1; break;
            case ("9"): x1 = 9; poz1 = 1; break;
            case ("10"): x1 = 10; poz1 = 1; break;
            case ("I"): x1 = 1; poz1 = 2; break;
            case ("II"): x1 = 2; poz1= 2; break;
            case ("III"): x1 = 3; poz1 = 2; break;
            case ("IV"): x1 = 4; poz1 = 2; break;
            case ("V"): x1 = 5; poz1 = 2; break;
            case ("VI"): x1 = 6; poz1 = 2; break;
            case ("VII"): x1 = 7; poz1 = 2; break;
            case ("VIII"): x1 = 8; poz1 = 2; break;
            case ("IX"): x1 = 9; poz1 = 2; break;
            case ("X"): x1 = 10; poz1 = 2; break;
            default:  System.out.println("Введенные величины вне разряда 1-10");
                System.exit(0);
        }
        switch (str2) {
            case ("1"): x2 = 1; poz2 = 1; break;
            case ("2"): x2 = 2; poz2 = 1; break;
            case ("3"): x2 = 3; poz2 = 1; break;
            case ("4"): x2 = 4; poz2 = 1; break;
            case ("5"): x2 = 5; poz2 = 1; break;
            case ("6"): x2 = 6; poz2 = 1; break;
            case ("7"): x2 = 7; poz2 = 1; break;
            case ("8"): x2 = 8; poz2 = 1; break;
            case ("9"): x2 = 9; poz2 = 1; break;
            case ("10"): x2 = 10; poz2 = 1; break;
            case ("I"): x2 = 1; poz2 = 2; break;
            case ("II"): x2 = 2; poz2 = 2; break;
            case ("III"): x2 = 3; poz2 = 2; break;
            case ("IV"): x2 = 4; poz2 = 2; break;
            case ("V"): x2 = 5; poz2 = 2; break;
            case ("VI"): x2 = 6; poz2 = 2; break;
            case ("VII"): x2 = 7; poz2 = 2; break;
            case ("VIII"): x2 = 8; poz2 = 2; break;
            case ("IX"): x2 = 9; poz2 = 2; break;
            case ("X"): x2 = 10; poz2 = 2; break;
            default:  System.out.println("Введенные величины вне разряда 1-10");
                System.exit(0);
        }

//алгебраическое действие
        if(poz1 == poz2) {
            if (znak == 1) rez = x1 + x2;
            if (znak == 2) rez = x1 - x2;
            if (znak == 3) rez = x1 * x2;
            if (znak == 4) rez = x1 / x2;
        }

//исключения на ввод величин не по условию задания
        else {
            System.out.println("Вами не был введен значение выражения, попробуйте еше раз");
            System.exit(0);
        }
// исключения на положительность римских величин
        if (poz1 == 2 & rez <1) {
            System.out.println("Ваш результат отрицателен");
            System.exit(0);
        }
// перевод арабских в римские цифры
        if (poz1 == 2 )
        {
            String rimski;
            String[] rimAr = new String[]{"0","I","II","III","IV","V","VI","VII","VIII","IX","X",
                    "XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX",
                    "XXI","XXII","XIII","XXIV","XXV","XXVI","XXVII","XXVIII","XXIX","XXX",
                    "XXXI","XXXII","XXIII","XXXIV","XXXV","XXXVI","XXXVII","XXXVIII","XXXIX","XXXX",
                    "XXXXI","XXXXII","XXXIII","XXXXIV","XXXXV","XXXXVI","XXXXVII","XXXXVIII","XXXXIX","L",
                    "LI","LII","LIII","LIV","LV","LVI","LVII","LVIII","LIX","LX",
                    "LXI","LXII","LXIII","LXIV","LXV","LXVI","LXVII","LXVIII","LXIX","LXX",
                    "LXXI","LXXII","LXXIII","LXXIV","LXXV","LXXVI","LXXVII","LXXVIII","LXXIX","LXXX",
                    "LXXXI","LXXXII","LXXXIII","LXXXIV","LXXXV","LXXXVI","LXXXVII","LXXXVIII","LXXXIX","LXXXX",
                    "LXXXXI","LXXXXII","LXXXXIII","LXXXXIV","LXXXXV","LXXXXVI","LXXXXVII","LXXXXVIII","LXXXXIX","C",
            };
            rimski = rimAr[rez];
            System.out.println(rimski);

        }
        else System.out.println(rez);
    }
}