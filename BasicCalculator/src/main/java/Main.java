import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNum = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int secNum = scanner.nextInt();

        System.out.println("""
                Possible calculations:
                (A)dd
                (S)ubtract
                (M)ultiply
                (D)ivide
                Please select an option:
                """);
        // charAt(0) means char at index 0
        int option = scanner.next().charAt(0);

        int answer;
        switch (option) {
            case 'A':
                answer = firstNum + secNum;
                System.out.println(firstNum + "+" + secNum + "=" + answer);
                break;
            case 'S':
                answer = firstNum - secNum;
                System.out.println(firstNum + "-" + secNum + "=" + answer);
                break;
            case 'M':
                answer = firstNum * secNum;
                System.out.println(firstNum + "*" + secNum + "=" + answer);
                break;
            case 'D':
                answer = firstNum / secNum;
                System.out.println(firstNum + "/" + secNum + "=" + answer);
                break;
        }
    }
}
