import java.util.Scanner;

public class Input{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name? ");
        String name = scanner.nextLine();

        System.out.println("How old are you? ");
        int age = scanner.nextInt();

        System.out.println("What's your weight (freedom units/in pounds)? ");
        double weight = scanner.nextDouble();

        System.out.println("Are you a smoker (True/False)? ");
        boolean areSmoker = scanner.nextBoolean();

        System.out.println();

        System.out.println(name + " is " + age + " and weighs " + weight + " pounds. their status of smoking is: " + areSmoker + "." );
    }
}