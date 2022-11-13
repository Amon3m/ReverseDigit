package oob;

import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter Number ");


        int userInput= input.nextInt();
        int digit=0;
        int RevNumber=0;
        while (userInput!=0){
            RevNumber=RevNumber*10;
            digit=userInput%10;
            userInput/=10;
            RevNumber+=digit;
        }
        System.out.println("the reversed Number is "+RevNumber);
    }
}
