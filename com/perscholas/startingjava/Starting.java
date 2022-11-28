package com.perscholas.startingjava;

public class Starting {
    public static void main(String[] args) {
        //1. Name Age Income
        System.out.println("1.\tName Age and Income");
        String name;
        int age;
        double annualPay;
        name = "Abi";
        age = 31;
        annualPay = 100000;
        System.out.println("My name is "+name+", my age is "+age+" and\nI hope to earn $"+annualPay+" per year.\n");
        //2.First Middle Last name
        System.out.println("2.\tName and Initial");
        String firstName, middleName, lastName;
        char firstInitial, middleInitial, lastInitial;
        firstName = "Abi";
        lastName = "Jay";
        middleName = "Rad";
        firstInitial = 'a';
        middleInitial = 'r';
        lastInitial = 'j';
        System.out.println("My name is "+firstName+" "+middleName+" "+lastName);
        System.out.println("My initial is "+firstInitial+middleInitial+lastInitial+"\n");
        //3.Details
        System.out.println("3.\tDetails");
        String address = "123 abc colony new york NY 12345";
        String phone = "9876542344";
        String major = "CS";
        System.out.println(name+"\n"+ address+"\n"+phone+"\n"+major);
        //4.Star Pattern
        System.out.println("4.\tStar Pattern");
        int i, j;
        int space = 4 - 1;
        for (j = 1; j<= 4; j++)
        {
            for (i = 1; i<= space; i++)
            {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for (j = 1; j<= 3; j++)
        {
            for (i = 1; i<= space; i++)
            {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i<= 2 * (4 - j) - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        //5.Sales Prediction
        System.out.println("5.\tSales Prediction");
        double percent = 0.62;
        double sales = 4600000;
        System.out.println("East Coast division will generate $"+ (percent*sales));
        //6.Land Calculation
    }
}
