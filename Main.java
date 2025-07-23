import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SpamClassifier classifier = new SpamClassifier();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an email message:");
        String email = scanner.nextLine();

        if (classifier.isSpam(email)) {
            System.out.println("⚠️ This email is classified as SPAM.");
        } else {
            System.out.println("✅ This email is NOT spam.");
        }

        scanner.close();
    }
}
