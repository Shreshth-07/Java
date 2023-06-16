import java.util.*;
public class AList
{
    public static void main(String[] args)
    {
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(10);
        l2.add(56);
        l2.add(65);
        l2.add(8);
        l1.addAll(0,l2);
        System.out.println(l1.contains(7));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(7));
        l1.set(1,56);
        for(int i=0;i<l1.size();i++)
        {
            System.out.println(l1.get(i));
        }
    }
}