package in.qadir.varargs;

import java.util.ArrayList;
import java.util.List;

public class Collection
{
    public static void main(String[] args)
    {
        List<String> strList = new ArrayList<>();
        strList.add("Prashant");
        strList.add("Jain");
        //strList.add(55);

        strList.removeFirst();

        strList.add(1,"Pradeep");

        if(strList.contains("Jain"))
        {
            System.out.println("Jain exists.");
        }

        if(strList.contains("Jain"))
        {
            System.out.println(strList.indexOf("Jain"));
        }


        for(int i = 0; i < strList.size(); i++)
        {
            System.out.println(strList.get(i));
        }
        for(String str : strList)
        {
            System.out.println(str);
        }
    }
 }