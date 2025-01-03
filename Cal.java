import java.util.Scanner;
public class Cal {
    public static void main(String[] args) {
        System.out.println("Simple calculator ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose your operator");
        System.out.println("Addition :1");
        System.out.println("Subtraction : 2");
        System.out.println("Multiplication : 3");
        System.out.println("Division : 4");
        int no =sc.nextInt();
        System.out.println("Enter first integer");
        Double n1 =sc.nextDouble();
        System.out.println("Enter Second integer ");
        Double n2 =sc.nextDouble();
        switch ( no) {
            case 1:
                System.out.println(n1+n2);
                break;
            case 2:
                System.out.println(n1-n2);
                break;
            case 3:
                System.out.println(n1*n2);
                break;
            case 4:
                if(n1 >0 && n2>0 ){
                    System.out.println(n1/n2);
                }
                else{
                    System.out.println("no zero ");
                }        
        
            default:
                break;
        }
        sc.close();




    }
    
}
