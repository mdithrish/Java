package test;


import java.util.*;

public class Main {

    public static void main(String[] args) {

        int[][] a = {{5,2,1,8,10,5},{1,1,1,1,0,0}};
        duplicateString("abcabd");

    }
    // 1 2 3 4 5 6 7 8   3


    static void duplicateString(String s)
    {
        char[] chararr = s.toCharArray();
        Map<Character,Integer> charMap = new HashMap<Character, Integer>();

        for(char c : chararr){
            if(charMap.containsKey(c))
            {
                charMap.put(c,charMap.get(c)+1);
            }
            else
            {
                charMap.put(c,1);
            }
        }
        for(Map.Entry<Character,Integer> entry: charMap.entrySet()){

            if(entry.getValue()>1){
                System.out.println(entry.getKey().toString() +  entry.getValue().toString());
            }

    }
    }






}
