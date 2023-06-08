public class Multiply extends Access
{
    public void divide(int x , int y)
    {
             int lst1=x%10;
             int lst2=y%10;

             int multi=lst1*lst2;
        System.out.println(multi);
    }
    public static void main(String[] args)
    {
        Multiply obj=new Multiply();
        obj.divide(obj.num1,obj.num2 );
    }
}
