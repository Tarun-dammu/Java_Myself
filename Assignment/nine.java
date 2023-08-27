// Write a program to accept a number from user as a command line argument and check whether the given number is positive or negative number.;

public class nine {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        if(a>0)
        {
            System.out.println(a+" is a positive number");
        }       

        else
        {
            System.out.println(a+" is a negative number");
        }
    }
    }
    

