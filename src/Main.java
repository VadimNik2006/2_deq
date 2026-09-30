import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        Deq deq = new Deq(5);
        System.out.println("Введите 5 целых чисел:");

        for (int i = 0; i < 5; i++) {
            deq.pushBack(in.nextInt());
        }
        System.out.print("Прямое направление: ");
        for (int i = 0; i < 5; i++) {
            int val = deq.popFront();
            System.out.print(val + " ");
            deq.pushBack(val);
        }
        System.out.println();
        System.out.print("Обратное направление: ");
        for (int i = 0; i < 5; i++) {
            int val = deq.popBack();
            System.out.print(val + " ");
            deq.pushFront(val);
        }
    }
}