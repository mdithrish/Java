package math;


import java.util.Arrays;

public class FindMedianInArray {

    public static void main(String[] args) {

        System.out.println(activityNotifications(new int[]{10, 20, 30, 40, 50},3));

    }

    static int activityNotifications(int[] expenditure, int d) {

        int count = 0;
        double median=0;

        if(expenditure.length>d){

            for (int i=0; i<expenditure.length; i++){
                if(i>= expenditure.length-d){
                    break;
                }
                else{
                    System.out.println("Index " + i );
                    median= findMedian(copyArray(expenditure,d,i));
                    if(2 * median <=  expenditure[i+d-1]){
                        count++;
                    }
                }
            }

        }


        return count;


    }

    static double findMedian(int[] a){

        double median = 0;
        Arrays.sort(a);
        int size = a.length;

        if(size%2 ==0){
            return (double)(a[size-1]/2 + a[size/2])/2.0;

        }
        else{
            int middle = a[size/2];
            median = middle;
        }
        System.out.println("Median "+ median);
        return median;
    }

    static int[] copyArray(int[] in, int size, int index){

        int[] res = new int[size];
        int j =0;
        for (int i=index; i<size+index; i++){
            res[j] = in[i];
            j++;
        }
        System.out.println(Arrays.toString(res));
        return res;
    }



}
