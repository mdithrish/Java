package algorithm;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorQueue {

    public static void main(String[] args) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();


        priorityQueue.add(30);
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(400);

        System.out.println("Head value using peek function:" + priorityQueue.peek());

        priorityQueue.poll();
        Iterator it = priorityQueue.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }




    }


}
