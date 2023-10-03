import java.util.HashSet;
import java.util.Iterator;
public class Hashing {
    public static void main(String args[])
    {
        HashSet<Integer> set=new HashSet<>();
        //adding element in a HashSet
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(1);

        //Serach
        if(set.contains(1))
        {
            System.out.println("Contain");
        }

        //Delete element
        set.remove(1);
        if(!set.contains(1))
        {
            System.out.println("does not contain 1");
        }

        Iterator it=set.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
    
}
