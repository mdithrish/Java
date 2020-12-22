package StringOperation;

import java.util.Scanner;

public class VowelFreq {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string ");

        String str = scn.nextLine().toLowerCase();
        int a=0 ,e=0, i=0,o=0, u=0, j=0;

        while(j<=str.length()-1){
            char ch= str.charAt(j);
            if(ch == 'a'){
                a++;
            }
            else if(ch == 'e'){
                e++;
            }else if(ch == 'i'){
                i++;
            }else if(ch == 'o'){
                o++;
            }else if(ch == 'u'){
                u++;
            }
            j++;
        }
        System.out.println(" a " + a + " e " + e + "i " + i + "o " + o + "u " + u);

    }
}
