package math;

public class Arithemetic {

    static void ratio(int[] arr) {

        double pos=0, neg=0, zer=0;

        int l = arr.length;


        for(int i : arr){
            if(i>0)
                pos++;
            else if (i<0){
                neg++;
            }
            else {
                zer++;
            }
        }

        System.out.println(pos/l);
        System.out.println(neg/l);
        System.out.println(zer/l);

    }
}
