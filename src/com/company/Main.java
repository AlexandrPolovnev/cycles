package com.company;

public class Main {

    public static void main(String[] args) {


        {
            int i = 1;
            while (i < 11) {
                System.out.print(i);
                i++;
            }
            System.out.println();
        }

        {
            for (int i = 10; i > 0; i--) {
                System.out.print(i);

            }
        }
        System.out.println();
        {
            int friday = 4;
            while (friday <= 31) {
                System.out.println("Сегодня пятница " + friday + "е число, необходимо подготовить отчет");
                friday += 7;
            }
        }
        {
            for (int i =0; i<2122; i++){
              if  ((i % 79 == 0) && (i>=1822) && (i<=2122)) {
               System.out.println(i);
                }
            }
        }
    }
}

