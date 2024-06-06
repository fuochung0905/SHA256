import java.nio.charset.StandardCharsets;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            SHA256 sha = new SHA256();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the message to be hashed: ");
            String message = scanner.nextLine();
            scanner.close();

            byte[] hash = new byte[32];
            sha.update(message.getBytes(StandardCharsets.UTF_8), message.length());
            sha.finalize(hash);

            System.out.println("SHA-256 hash: " + sha.toString(hash));
        }
    }
