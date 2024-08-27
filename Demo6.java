import java.util.*;
class Array6
{
    private int[]data;
    public void setData(int[]data)
    {
        this.data=data; 
    }
    public int isBalanced()
    {
        int flag=1;
        for(int i=0;i<data.length;i++)  
        {
            if(i%2==0)
            {
                if(data[i]%2==1)
                {
                    flag=0;
                }
            }
            else
            {
                if(data[i]%2==0)
                {
                    flag=0;
                }
            }
        }
        return (flag);
    }
}

public class Demo6
{
    public static void main(String [] args)
    {
        int []data=new int[6];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements of array");
        for(int i=0;i<6;i++)
        {
            data[i]=sc.nextInt();
        }
        Array6 a=new Array6(); 
        a.setData(data);
        int res=a.isBalanced();
        if(res==1)
        {
            System.out.println("Array Is Balanced");
        }
        else
        {
            System.out.println("Array Is Not Balanced");
        }
    }
}

