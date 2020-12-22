package StringOperation;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string here");
        String str = sc.nextLine();

        boolean res = true;
        for(int i=0; i< str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                res=false;
                break;
            }

        }
        System.out.println("Input " + str + " is palindrome " + res);
    }
}
