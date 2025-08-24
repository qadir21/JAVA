package Array;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListInJavaBasic
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(18);
        arr.add(21);
        arr.add(5);
        arr.add(10);
        System.out.println(arr.get(0));
        arr.set(3, 50);
        System.out.println(arr.get(3));
        int n = arr.size();
        for(int i = 0; i < n; i++) System.out.println((arr.get(i)));
        System.out.println(arr);
        for(int x : arr) System.out.print(x + " ");
        System.out.println();
        System.out.println(arr);
        Collections.reverse(arr);
        System.out.println(arr);
        int i = 0, j = arr.size() - 1;
        while(i < j)
        {
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
            i++;
            j--;
        }
        System.out.println(arr);
        ArrayList<Character> arr2 = new ArrayList<>();
    }
}