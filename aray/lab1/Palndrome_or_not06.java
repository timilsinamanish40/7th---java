//pakinroeme or not

import java.util.*;
class Number
{
    public int num;
    public void inputNumber()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number :  ");
        num=sc.nextInt();
    }
    public boolean isPalindrome()
    {
        int rev=0;
        int org=num;
        while(num!=0)
        {
            int ext=num%10;
            rev=rev*10+ext;
            num=num/10;
        }
        if(org==rev)
        {
            return (true);
        } 
        else
        {
            return (false);
        }
    }
}
class Palndrome_or_not06
{
    public static void main(String[]args) {
        {
            Number n=new Number();
            n.inputNumber();
            boolean res=n.isPalindrome();
            if(res==true)
                System.out.println("Palindrome");
            else
                System.out.println("Not Palindrome");
        }
    }
}