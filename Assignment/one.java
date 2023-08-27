//Write a menu driven java program using switch case statement to find the Arithmetic operations.


public class one {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        char opr = '+';
        switch(opr){

            case '+' :
            {
                System.out.println("Sum is : "+(a+b));
                break;
            }
            case '-' :
            {
                System.out.println("Dif is : "+(a-b));
                break;
            }
            case '*' :
            {
                System.out.println("Mul is : "+(a*b));
                break;
            }
            case '/' :
            {
                System.out.println("Div is : "+(a/b));
                break;
            }
            case '%' :
            {
                System.out.println("Mod is : "+(a%b));
                break;
            }
            default :
            System.out.println("Enter appopriate arithmetic operation");


        }

        
    }
    
}
