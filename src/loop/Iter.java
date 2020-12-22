package loop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iter {

    public static void main(String[] args) {
        List<String> test = new ArrayList<String>();
        test.add("test1");
        test.add("test2");
        test.add("test3");
        test.add("test4");

        Iterator<String> it = test.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
