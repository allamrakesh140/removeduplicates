//remove all the duplicates from a string

import java.util.Scanner;
import java.util.Arrays;
public class stringduplicates{

//creating a static method with input parameter as string
public static String removeduplicates(String s)
{
//building a new stringbuilder to store the updated string value

StringBuilder sb=new StringBuilder(s.length());

//create a Boolean array to keep track the found characters

boolean found[]=new boolean[256];

    for(int i=0;i<s.length();i++)
    {
     char ch=s.charAt(i);

        if(!found[ch])
           {
            sb.append(ch);
             found[ch]=true;
           }
    }
  return sb.toString();

}

public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the string name");
String s=sc.nextLine();
System.out.println("after removing the duplicates in a string is:"+removeduplicates(s));


}
}