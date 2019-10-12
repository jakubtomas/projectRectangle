package other;

import javax.crypto.spec.PSource;
import java.util.Scanner;
import java.util.Random;
// 1 krok importovanie triedy scanner ,
// aby som mohol pouzit metody Triedy Scanner

public class FreeClass {


    public void sayHello() {
        System.out.println("hello");

    }

    public void sayNHello(int n) {
        int i;

        char x;

        for (i = 1; i < n; i++) {
            System.out.println("hello");
        }

        System.out.println();  // odradkovanie
    }

    public void sayHi() {
        System.out.println("HI");

    }

    public void sayNHi(int number) {
        int i = 1;
        /*for (i = 1; i < number; i++) {
            System.out.println("HII");
        }*/


        while (i < number) {
            System.out.println("Hi");
            i++;


        }
    }


    public int getEvenNummber(int number) {

        if (0 == number % 2) {
            return number;
        } else {
            return number + 1;
        }

    }

    //  1.  všetky dvojciferne cisla  26,9,2019
    public void test() {

        int i = 10;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 100);

        // 2.uloha všetly parne čisla
    }

    public void test2() {
        for (int i = 10; i < 100; i++) {

            if (0 == i % 2) {
                System.out.println(i + " ");

            }
        }
    }

    //3.uloha vypisat neparne dvojcisla od najvecieho po najmensie

    public void test3() {
        for (int i = 99; i > 10; i--) {

            if (0 != i % 2) {
                System.out.println(i + " ");

            }
        }
    }

    // 4 uloha. vypisat 3ciferne cisla delitelne 11

    public void test4() {
        for (int i = 100; i < 1000; i++) {

            if (0 == i % 11) {
                System.out.print(i + " ");  // print diferent printl

            }
        }
    }

    // 5 uloha vypisat 3 ciferne cisla delitelne 11 ale niesu delitelne 3

    public void test5() {
        for (int i = 100; i < 1000; i++) {

            if (0 == i % 11 && 0 != 3) {
                System.out.print(i + " ");  // print diferent printl

            }
        }

    }

    //6 uloha    vsetky dvojciferne cislo ktore su delitene 2 alebo 3


    public void test6() {
        for (int i = 10; i < 100; i++) {

            if (0 == i % 3 || 0 == i % 2) {
                System.out.print(i + " ");  //

            }
        }
    }

    //7.mission vsetky dvojciferne cisla delitelne 2 a trojko ale nedelitelne desiatkou
    // pozor na zatvorky v podmienke

    public void test7() {
        for (int i = 10; i < 100; i++) {


            if ((0 == i % 3 || 0 == i % 2) && 0 != i % 10) {
                System.out.print(i + " ");  //

            }


        }
    }

    // 8 mission  vsetky pekne 3 ciferne ak ciferny sucet je 10

    public void test8() {
        for (int i = 100; i < 1000; i++) {

            int a = i % 10;
            int b = (i / 10) % 10;
            int c = (i / 100) % 10;

// n

        }
    }

    // 9 mission  vsetky pekne 3 ciferne  ak aspon dve cisla sa navzajom rovnaju


    public void test9() {
        for (int i = 100; i < 1000; i++) {

            int a = i % 10;
            int b = (i / 10) % 10;
            int c = (i / 100) % 10;


            /// nedokoncene
            if (a == b && (a != c) && b != c) {

            }

        }

    }

    //10  mission vsetky pekne kde iba 2 sa rovnaju

    public void test10() {
        for (int i = 100; i < 1000; i++) {

            int a = i % 10;
            int b = (i / 10) % 10;
            int c = (i / 100) % 10;


            if ((a == b && b != c) || (a == c && a != b) || (b == c && b != a)) {
                System.out.print(i + " ");
            }

        }

    }

// 11.vsetky 3 ciferne cisla s roznymy ciframi

    public void test11() {
        for (int i = 100; i < 1000; i++) {

            int a = i % 10;
            int b = (i / 10) % 10;
            int c = (i / 100) % 10;


            if ((a != b && b != c && c != a)) {
                System.out.print(i + " ");
            }


        }

    }

    //12 mission vypisat kolko je pek cisel  .. je neparne ciferny sucet menej ako 6

    public void test12() {


        for (int i = 0; i < 1000; i++) {

            int a = i % 10;
            int b = 0;
            int c = 0;


            if (i < 100 && i > 9) {
                b = (i / 10) % 10;

            }
            if (i < 1000 && i > 99) {
                c = (i / 100) % 10;

            }


            if ((0 != i % 2) && (a + b + c < 6)) {
                System.out.print(i + " ");
            }


        }
    }


//13 mission  kolko delitelou mas cislo 870

    public void test13() {
        int amount = 0;
        for (int i = 1; i <= 870; i++) {

            if (0 == 870 % i) {

                amount = amount + 1;
            }

        }
        System.out.println(" vysledok  " + amount);
    }


    // 14 mission 1 .2*2 4,8,16,32,,
    // vypisat mocniny cisla 2 do 100 000


    public void test14() {
        for (int i = 1; i < 100000; i = i * 2) {
            System.out.println(i);
        }

    }


    //15 mission  janko zabudol pinkod  pametal si je deliteny cislo12
    // ma 4 cisli ,, 1 cifra je vacsie ako na mieste jednotiek
    // a na druha cifra je parna cislica


    public void test15() {
        int x = 0;
        for (int i = 1000; i < 10000; i++) {
            int a = i % 10; // 4 cifra
            int b = (i / 10) % 10; // 3 cifra
            int c = (i / 100) % 10; // 2 cifra
            int d = (i / 1000) % 10;// 1 cifra

            if ((0 == i % 12 && d > a && 0 == c % 2)) {
                System.out.println(i + " ");

                x = x + 1;
            }


        }
        System.out.println(x);

    }

    //16 mission vytvor premenu nazov time = 514 623 pocet sekund


    public void test16() {
        int time = 514623;

        int minuta = 60;
        int hodina = 3600;
        int den = 86400;


        // len zvisok
        // int a = time/den;

        int day = time / 86400;
        time = time % 86400;
        int hour = time / 3600;
        time = time % 3600;
        int minute = time / 60;
        int sec = time % 60;


/*
           int x = time%den;

            int b = x/den;
           int y = x%hodina;

        int c = y/minuta;
        int z = y%minuta;
*/


        System.out.println("pocet hodin " + hour);
        System.out.println("pocet minut " + minute);
        System.out.println("pocet secund " + sec);

    }


    //17   1+2+3+4+ ...... 158


    public void test17() {

        int number = 0;
        for (int i = 1; i < 159; i++) {

            number = number + i;
        }

        System.out.println(number);
    }

    public void test18() {

        int number = ((1 + 158) * 158) / 2;
        System.out.println(number);
    }

    // 18    mesiac 30 dni
    //    A     , every day give 7 euro
    //  B   1   1c 2c 4c 8c

    public void test19() {
        int number = 0;
        int pomocna = 0;
        for (int i = 1; i < 100; i = i * 2) {


            number = number + 1;
            // System.out.println(number);
            // System.out.println(i);

            pomocna = pomocna + i;
            //  System.out.println(pomocna);
            if (number == 30) {

                System.out.println(" vysledok je " + pomocna);
                System.out.println("pocet eur " + pomocna / 100);
            }


        }

    }

    public void test19a() {
        int suma = 0;
        int value = 1;

        for (int i = 1; i <= 30; i = i++) {
            suma = suma + value;
            value = value * 2;

        }

        System.out.println(suma / 100);
    }

    // 20 missions   spocitat kolko je 1 + 1/2  + 1/3  +1/4

    public void test20() {
        double suma = 0;
        for (int i = 1; i <= 100; i++) {
            suma = suma + (1 / (double) (i));
        }

        System.out.println(" vysled ok " + suma);
    }

    /*public void test21() {
        a = true;
        b = true;
        c= true;


        y = (a+(!C)) && ( !a +b)


    }*/
    /// najmensie delitel
    public void test22() {
        int a = 96;
        int b = 27;
        int c = 0;

        if (a < b) {
            c = a;
            a = b;
            b = c;

        }
        while (a % b != 0) {

            c = b;
            b = a - b;
            a = c;
            if (a < b) {
                c = a;
                a = b;
                b = c;

            }
        }
        System.out.println(b);

    }

    public void test23() {
        int i = 5;
        int k = 7;
        int n = 0;
        do {
            n = k * i;  //7*5
            System.out.println(" vysledok z testu 23 je " + n); //35
            i++;  //6
            k = k + 3;  //7+3  = 10

            //5*6 < 10
        } while (5 * i < k);
    }


    public void test24() {
        int a = 0;
        for (int i = 2; i < 5; i++) {
            int j = 1;
            while (j <= i) {
                a = a + 1;
                System.out.print("*");
                j++;

                System.out.println(a);
            }
        }
    }

    public void test25() {
        for (int j = 1; j < 5; j++) {  /// true
            // 1 = 1      // 1 = 2  //  1=3
            for (int i = 1; i <= j; i++) {
                System.out.print("**"); // **
                // ****
                // ******
                // ******

            }
            System.out.println();
        }
    }

    public void test26() {   // vypisanie obdlznika

        for (int a = 1; a <= 3; a++) {
            System.out.println();
            for (int j = 1; j <= 5; j++) {  /// true

                System.out.print("*"); // **

            }
        }

    }

    public void test27() {

        for (int a = 1; a <= 30; a++) {
            System.out.println();
            System.out.println(a);
            for (int j = 1; j <= a; j++) {  /// true

                System.out.print("*"); // **

            }
        }

    }

    public void test28() {

        for (int a = 20; a >= 0; a--) {
            System.out.println();
            System.out.println(a);
            for (int j = 1; j <= a; j++) {  /// true

                System.out.print("*"); // **

            }
        }

    }

    public void test29() {

        int p = 10;
        for (int a = 1; a <= 10; a++) {
            //
            //System.out.println(a);
            p = p - 1;
            for (int c = 0; c <= p; c++) {
                System.out.print(" ");
                //for ( int l = 0; l < 10 ; l--)

            }
            for (int j = 1; j <= a; j++) {  /// true


                System.out.print("*"); // **

            }
            System.out.println();
        }

    }

    public void test30() {

       /* for (int r = 1; r <= 10; r++) {
            for (int m = 1; m <= 10 - r; m++) {
                System.out.print(" ");
            }
            for (int h = 1; h <= r; h++) {
                System.out.print("*");
            }
            System.out.println();

        }*/

        for (int r = 10; r >= 0; r--) {
            for (int m = 1; m <= 10 - r; m++) {
                System.out.print(" ");
            }
            for (int h = 1; h <= r; h++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }


    public void test31() {
        int c = 0;
        int sum = 0;
        int n = 82654139;


        while (n > 0) {
            c = n % 10;
            sum = sum + c;
            n = n / 10;
        }

        System.out.println(sum);
    }


    // prepony typ double
    // calculate
    //create method  ktora prime cislo a zaokruhli ho na parne  na hor
// zadas 3 int cisla a vystup je double


    public void getName() {

        // 2 krok vytvoernie noveho objektu

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        /*System.out.println("Enter username");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input
        */

        // zadaj cislo

        System.out.println("Zadaj cislo ");
        //int value = myObj.nextInt();
        //System.out.println("tvoje cislo je " + value);

/*
        for (int i = 1; i <= value; i++) {
            System.out.println("*");
        }
        */

        // zadam meno heslo
        // porovna s  meno

        String meno = "jakub";
        int heslo = 123456;


        System.out.println("Write user name ");
        String userName = myObj.nextLine();


        System.out.println("Write password");
        int password = myObj.nextInt();


        if (meno.equals(userName) && password == heslo) {
            System.out.println("your data was correct .. success ");
        }


    }

    /// dva premmenne  oblznik
    // obdlznik sa vykresli zavinac

    // uloha po b   ale vo vnutry bude prazdne miesto
    // uloha po c  budeme si urcovat znak


    public void test32() {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object


        System.out.println("Enter values of your ");
        int row = myObj.nextInt();
        System.out.println();
        int column = myObj.nextInt();

        System.out.println("Enter symbol");
        String symbol = myObj.nextLine();
        String symbols = myObj.nextLine();


        for (int a = 1; a <= row; a++) {


            for (int j = 1; j <= column; j++) {  /// true
                if (a == 1 || a == row || j == 1 || j == column) {

                    System.out.print(symbols); // **

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }


    }

    public void test33() {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object


        System.out.println("Add number of month ");
        int month = myObj.nextInt();

        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");


            default:
                System.out.println("you add bad number");


        }// this is koment


    }

    public void test34() {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object


        System.out.println("Add number of month ");
        int month = myObj.nextInt();

        switch (month) {

            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");


            default:
                System.out.println("you add bad number");


        }// this is koment


    }

    public void test35() {
        // riesenie kvadraticke rovnice
        // quadratic equation


        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Hello I am program for solving quadratic equation");
        System.out.println(" ");
        System.out.println("Programmer Jakub Tomáš Contact   tomasjakub@gmail.com");
        System.out.println(" ");
        System.out.println("Add number a, b ,c  ");

        double a = myObj.nextDouble();
        double b = myObj.nextDouble();
        double c = myObj.nextDouble();
        double d = 0;
        double x;
        double x1;
        double x2;


        if (a != 0) {

            // vypocet diskrimi
            d = (b * b) - 4 * a * c;
            System.out.println(" discriminant is " + d);

            if (d == 0) {
                x = -b / (2 * a);
                System.out.println(x);

            } else if (d < 0) {
                System.out.println("this dont have root quadratic equation");
            } else {
                x1 = (-b + Math.sqrt(d)) / 2 * a;
                x2 = (-b - Math.sqrt(d)) / 2 * a;

                System.out.println(x1);
                System.out.println(" ");
                System.out.println(x2);

            }


        } else {
            System.out.println("this is not quadratic equation");
        }
    }

    public void test36() { // pyramid
        Scanner pyramid = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = pyramid.nextInt();
        System.out.print("Enter Symbol: ");

        char c = pyramid.next().charAt(0);

        for (int i = num; i > 0; i--) {
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (i * 2) - 1; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public void test37() {
        Random rand = new Random();
        System.out.println("toto je generovanie cisla ");
        int a = rand.nextInt(6) + 1;
        int b = rand.nextInt(6) + 1;
        int c = rand.nextInt(6) + 1;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("______________");
        do {
            // vygenerovat b a porovnat s ackom a ked je rovnake generuj znova


            b = rand.nextInt(6) + 1;

            c = rand.nextInt(6) + 1;


        } while (a == b || a == c || b == c);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


    }


    public void test38() {
        Random rand = new Random();
        int a = rand.nextInt(6) + 1;
        int c, b;
        do {
            b = rand.nextInt(6) + 1;

        } while (a == b);

        do {
            c = rand.nextInt(6) + 1;
        } while (a == c || b == c);

    }


    public void test39() {
        Random rand = new Random();
        int a = rand.nextInt(97) + 122;   // rozsah 97-122
        int b = rand.nextInt(10) + 48;   // rozsah 48-57
        int c = rand.nextInt(101) + 200;   // rozsah 100 az 200
        int d = rand.nextInt(21) + (-10);   // rozsah -10 az 10
        int e = rand.nextInt(4) + (-1);   // rozsah -1 az 2
        int f = rand.nextInt(503) + 113;   // rozsah 113 az 615

        System.out.println(f);
    }

    public void test40() {
        Random rand = new Random();
        int prime;
        int div;
        do {
            prime = rand.nextInt(4500) + 500; // 500 -4999
            prime = 2 * prime + 1;
            div = 0;
            for (int i = 2; i < Math.sqrt(prime); i++) {
                if (prime % i == 0) {
                    div++;
                }
            }


        } while (div > 0);

        System.out.println("prime cislo je ");
        System.out.println(prime);
    }

    public void test41() {
        Random rand = new Random();
        String password = "";

        for (int i = 0; i < 5; i++) {
            int num = rand.nextInt(26) + 65;
            char letter = (char) num;


            password = password + "" + letter;
        }

        for (int i = 0; i < 5; i++) {
            int small = rand.nextInt(26) + 97;
            char letter2 = (char) small;


            password = password + "" + letter2;
        }
        for (int i = 0; i < 5; i++) {
            int small = rand.nextInt(10) + 48;
            char letter2 = (char) small;


            password = password + "" + letter2;
        }


        System.out.println("generovanie hesla");
        System.out.println(password);
    }

    public void test42() {   /// vygenerovanie  hesla kde pouzijem velke aj male pismena a cisla
        Random rand = new Random();
        String password = "";

        for (int i = 0; i < 10; i++) {
            int num = rand.nextInt(75) + 48;
            System.out.println("prve generovanie");
            System.out.println(num);

            while ((num > 58 && num < 64) || (num > 91 && num < 96)) {
                num = rand.nextInt(75) + 122;
                System.out.println("druhe generovanie");
                System.out.println(num);
            }
            char letter2 = (char) num;


            password = password + "" + letter2;
        }
        System.out.println("Vysledne heslo");
        System.out.println(password);
    }

    // stopercent iste aspon jedna cislaca aspon jedna male a velke pismeno


    public void test43() {
        Random rand = new Random();
        String password = "";
        int x;

        for (int i = 1; i < 11; i++) {
            int type = rand.nextInt(3) + 1;  // attention maybe generate 0  , problem
            System.out.println(type);

            switch (type) {

                case 1:
                    System.out.println("type  1 ");
                    x = rand.nextInt(10) + 48;
                    break;
                case 2:
                    System.out.println("type 2 ");

                    x = rand.nextInt(26) + 48;
                    break;
                case 3:
                    System.out.println("type 3 ");
                    break;

            }
        }

    }

    public String generatePassword(int n, boolean rules){
        if(rules==true && (n<6 || n>30) )  // kontrola dlzky hesla
            n = 10;

        String passwd="";
        int count=0;
        int digits=0;
        int upper=0;
        int lower=0;
        if(rules==false){
            digits=upper=lower=1;
        }
        int num=0;
        Random rnd=new Random();
        do{
            int type=rnd.nextInt(3);
            switch(type){
                case 0: num=rnd.nextInt(10)+'0'; digits++; break;
                case 1: num=rnd.nextInt(26)+'A'; upper++; break;
                case 2: num=rnd.nextInt(26)+'a'; lower++; break;
            }
            char c=(char)num;
            passwd+=c;
            count++;
            if(count==n && (digits==0 || upper==0 || lower==0)){
                count=digits=upper=lower=0;
                passwd="";
            }

        } while(count<n);

        return passwd;
    }



    /**
     * @author Jakub Tomáš
     * @date 12.10.2019
     * @param day this is your day of birth
     * @param month this is day of birth
     * @description this method solve horoscop with data day and month
     * @return
     */





}

