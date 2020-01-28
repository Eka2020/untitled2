package com.company;


public class Main {

    public static void main(String[] args) {
        String name = "Ислам";
        int age = 20;
        int temperature = 30;
        if (age >= 20 && age <= 45 && temperature < 30 && temperature > -20) {
            System.out.println(name + " " + "можете итди гулять"); // Диапазон возраста от 20-45 лет и температура <+30и>-20
        } else if (age < 20 && temperature > 0 && temperature < 28) {
            System.out.println(name + " " + "можете гулять"); // Возраст <20 и температура>0 и <28
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            System.out.println(name + " " + "можете погулять"); // возраст >45 температура >-10 и<25

        } else {
            System.out.println(name + " " + "можете отдыхать дома");

        }

    }
}
