import java.util.Scanner;

public class InputExample {
    Scanner scanner =new Scanner(System.in);

    public void readNameAndAge() {
        String name;
        int age;
        System.out.println("name?");
        name= scanner.next();

        System.out.print("age?");
        age= scanner.nextInt();

        System.out.println("Hello "+name+". you are  " + age+"springs young");

    }
    public static void main(String[] args) {
        (new InputExample()).readNameAndAge();
    }
}
