/*
Write a program that accepts an email string and validates that email.
If email is valid must display success message and If email is not valid must display error message
Example:  Input - test01*gmail.com
	     Output - Invalid Email Id
	     Input - student01@gmail.com
	     Output - Valid Email Id

 */
import java.util.*;
public class Email
{
    public static void validate(String mail)
    {
        String str=mail;
        int N=str.length();
        char arr[]=new char[N];
        int flag=0;
        for (int i=0;i<N;i++)
        {
            arr[i]=str.charAt(i);
        }

        for(int i=0;i<N;i++)
        {
            if(arr[i]=='@')
            {
                flag=flag+1;
                break;
            }
            else
            {
                flag=0;
            }
        }
        if(flag>0)
        {
            System.out.println("Valid Email Id");
        }
        else
        {
            System.out.println("Invalid Email Id");
        }
    }
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        String Input=s.next();
        validate(Input);

    }
}
