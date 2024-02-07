import java.util.Scanner;

public class TestNameZankoYury {
    public static void main(String[] args) {
        while (true){

        Scanner input = new Scanner(System.in);
        System.out.println("Введите пожалуйста Ваше имя: ");
        String name = input.nextLine();

        if (name.equals("Вячеслав")){
            System.out.println("Привет, Вячеслав");
            break;
        } else {
            System.out.println("Нет такого имени");
        }
        }
    }
}
