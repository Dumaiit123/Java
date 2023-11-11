import java.util.Scanner;

public  class Solution1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number(Hint:This needs to be an integer): ");
        int   i= sc.nextInt();
        System.out.println("Enter a number (Hint:This needs to be a decimal number): ");
        double d= sc.nextDouble();
        System.out.println("Enter a word :");
        String s= sc.next();


        System.out.println("String:"+s);
        System.out.println("Double: "+ d);
        System.out.println("Int: "+ i);


    }

}
