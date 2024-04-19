package com.jun.Fifth;


//BLUE YONDER INTERVIEW//

import java.util.Scanner;

public class SingleDigitConverter {
    public static int sumDigits(int num){
        if(num>10){
            return num;
        }
        return num %10 +sumDigits(num/10);
    }

    public static int toSingleDigit(int num){
        while(num>=10){
            num=sumDigits(num);
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int digit=scanner.nextInt();
       int singleDigit= toSingleDigit(digit);
        System.out.println(singleDigit);
    }
}
