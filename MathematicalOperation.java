import java.util.Scanner;

class MathematicalOperation {
    public static void main(String args[]) {
        System.out.println("Enter Data");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter element 1");
        int a = scanner.nextInt();
        System.out.println("Enter element 2");
        int b = scanner.nextInt();
        System.out.println("enter opration");
        char operation = scanner.next().charAt(0);

        switch (operation) {
            case '+':
                System.out.println("sum=" + (a + b));
                break;
            case '-':
                System.out.println("subtraction=" + (a - b));
                break;
            case '*':
                System.out.println("multiplication=" + (a * b));
                break;
            case '/':
                System.out.println("divide=" + (a / b));
                break;
            default:
                System.out.println("somthing else");
                break;
        }
    }
}