// Write a java program to find the greatest of 4 numbers.

public class second {
    public static void main(String[] args) {
        int a = 9;
        int b = 10;
        int c = 15;
        int d = 25;
        
        // if(a>b && a>c && a>d)
        // {
        //     System.out.println(a+" is a largest number");
        // }
        // if(b>a && b>c && b>d)
        // {
        //     System.out.println(b+" is a largest number");
        // }
        // if(c>a && c>b && c>d)
        // {
        //     System.out.println(c+" is a largest number");
        // }
        // else
        // {
        //     System.out.println(d+" is a largest number");
        // }
        if(a>b)
        {
            if(a>c)
            {
                if(a>d)
                {
                    System.out.println(a+" is a largest number");
                }
                else
                {
                     System.out.println(d+" is a largest number");
                }
            }
        }
        else if(b>c)
        {
            if(b>d)
            {
                 System.out.println(b+" is a largest number");
            }
            else
            {
                 System.out.println(d+" is a largest number");
            }
        }
        else if(c>d)
        {
             System.out.println(c+" is a largest number");
        }
        else
        {
             System.out.println(d+" is a largest number");
        }
    }
    
}
