import java.util.Scanner;

public class BrainTease {

    static Scanner scan = new Scanner(System.in);

    String[] answers = {"c", "b"};
    static String[] responses = {"", ""};

    public static void main(String[] args) {
        System.out.println("17----------------------------------->");
        System.out.println("|---1 jump---|---1jump---|---1jump---|");
        System.out.println("");
        System.out.println("If a Rabbit hops forward 3 times then how much distance did it cover if it started at 17 ?");
        System.out.println("");
        System.out.println("a) 3");
        System.out.println("b) 17");
        System.out.println("c) 20");
        System.out.println("d) 24");

        responses[0] = scan.next();

        System.out.println(responses[0]);

        System.out.println("There are 500 coffins and 500 men who need them. The undertaker " +
                "asks the first man to go to every coffin and open them. Then he tells the second " +
                "man to go to every one and close it. The third one goes to every third coffin " +
                "and so on. How many are open?");
        System.out.println("");
        System.out.println("a) 3");
        System.out.println("b) 22");
        System.out.println("c) 20");
        System.out.println("d) 24");
    }


}
