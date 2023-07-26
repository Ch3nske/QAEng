import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = scanner.nextInt();
        if (num == 7){
            System.out.println("Привет");
        }else{
            System.out.println("Введенное число " + num);
        }

    }
}
