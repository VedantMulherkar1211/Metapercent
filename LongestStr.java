/*
Create a function to return the longest word in a string.
Input: “dummy text of the printing and typesetting industry.”
Output: typesetting
Input: “It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout.
The point of using Lorem Ipsum is that it has a more-or-less normal distributionqqqqqqqqqqqqqqqqqqq of letters, as opposed to using 'Content here, content here', making it look like readable English”
Output: distributionqqqqqqqqqqqqqqqqqqq

*/
import java.util.*;
public class LongestStr
{

    public static void Longestr(String str)
    {
        String temp=str.substring(0);
        for(int i=1;i<str.length();i++)
        {
            //int len1 = str.substring(i).length();
            int len=str.substring(i+1).length();
            if(temp.length()>len)
            {
                temp=str.substring(i);
            }
            else if(len>temp.length())
            {
                temp=str.substring(i+1);
            }
            else
            {
                temp=str.substring(i);
            }
        }
        System.out.println(temp);  // debugging
    }
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        String input=s.next();

        Longestr(input);

    }

}
