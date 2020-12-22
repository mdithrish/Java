package StringOperation;

public class ReverseString {

    public static void main(String[] args) {
        String str = "I need to reverse the string";
        String[] strArray = str.split(" ");

        for (int i=0; i < strArray.length; i++){
            char[] s = strArray[i].toCharArray();
            for(int j= s.length-1; j>=0; j--){
                System.out.print(s[j]);
            }
            System.out.print(" ");
        }
    }
}
