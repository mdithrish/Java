package algorithm;

import java.util.PriorityQueue;

public class FindKthLargest {

    public static void main(String[] args) {
        int[] a={1,2,3,4};
        System.out.println(KthLargest(a, 2));
    }

    public static int KthLargest(int[] a, int k){

        if(a.length==1 && k==1){
            return a[0];
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

        for (int n:a){
            minHeap.add(n);

            if(minHeap.size()>k){
                minHeap.poll();
            }
        }


        return minHeap.poll();
    }


}
