package algorithm;

public class Swap {

    public static void main(String[] args)  {

        int[] a = {3,2,1};

        countSwaps(a);

    }

    static void countSwaps(int[] a) {

        int count=0;
        boolean flag= false;
        while(!flag){
            flag = true;
            for (int i=0;i<a.length-1;i++){
                if(a[i]> a[i+1]){
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    flag = false;
                    count++;
                }
            }
        }
        System.out.println(" Array is sorted in " + count + " swaps");
        System.out.println(" First Element: " + a[0]);
        System.out.println(" Last Element: " + a[a.length-1]);

    }
}
