import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String strSc = scanner.nextLine();
        if (strSc.equals("Вячеслав")){
            System.out.println("Привет, Вячеслав!");
        }else {
            System.out.println("Нет такого имени!");
        }
    }
}
