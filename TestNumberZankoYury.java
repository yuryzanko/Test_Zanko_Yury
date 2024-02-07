
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class TestNumberZankoYury {
    public static void main(String[] args) {

        while (true) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите число больше 7: ");
            AtomicInteger choice = new AtomicInteger();
            try {
                choice.set(scanner.nextInt());
            } catch (Exception e) {
                System.out.println("Вы ввели Не ТО.Нужно ввести ЧИСЛО,без точек и запятых.Натуральное число,БОЛЬШЕ 7 ");
            }

            if (choice.get() > 7) {
                System.out.println("Привет");
                break;
            }   else if (choice.get() == 7) {
                System.out.println("Вы ввели число " + choice + ", а нужно БОЛЬШЕ 7 ");

            }  else  {
                System.out.println("Вы ввели число "+ choice +" оно меньше 7");
            }

        }
    }
}




