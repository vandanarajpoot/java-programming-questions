import java.util.Scanner;

class SwitchExample {
    public static void main(String args[]) {
        System.out.println("enter data");
        try (Scanner scanner = new Scanner(System.in)) {

            int key = scanner.nextInt();

            switch (key) {
                case 1:
                    System.out.println("happy");
                    break;
                case 2:
                    System.out.println("sad");
                    break;
                case 3:
                    System.out.println("cry");
                    break;
                case 4:
                    System.out.println("very happy");
                    break;
                default:
                    System.out.println("somthing else");
                    break;
            }
        }
    }
}
