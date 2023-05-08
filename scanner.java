import java.util.Scanner;
class all{
    public static void main(String args[]) {
        System.out.print("enter data\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("enter element 1\n");
       int a=sc.nextInt();
       System.out.print("enter element 2\n");
       int b = sc.nextInt();
       System.out.print("enter opration\n");
         char scanner =sc.next().charAt(0);
        int sum = a+b;
       int multi = a*b;
       int devide= a/b;
       int sub=a-b;
        switch (scanner) {
            case '+':
                System.out.println("sum="+sum);
                break;
                case '-':
                System.out.println("sub=" +sub);
                break;
                case '*':
                System.out.println("multi=" +multi);
                break;
                case '/' :
                System.out.println("devide=" +devide);
                break;
            default:
            System.out.println("somthing else");
                break;
        }
    }
}