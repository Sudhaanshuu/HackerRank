import java.util.Scanner;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String inputString = scanner.nextLine();
        scanner.close();

        String md5hex = "";

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] encodedhash = md.digest(inputString.getBytes());

            // Convert the byte array to a hex string
            StringBuilder hexString = new StringBuilder();
            for (byte b : encodedhash) {
                String hex = String.format("%02x", b);
                hexString.append(hex);
            }
            md5hex = hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            // Handle algorithm not found exception
        }

        System.out.println(md5hex);
    }
}
