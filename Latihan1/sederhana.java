import java.util.Scanner;

public class sederhana {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String username = "Rifda", username1;
        int password = 12345, password1;

        System.out.println("Masukkan Username Anda");
        username1 = input.next();
        System.out.println("Masukkan Password Anda");
        password1 = input.nextInt();
        input.close();

        if (username1.equals(username) && password1 == password) {
            System.out.println("Anda Berhasil login");
        } else if (username1 != username && password1 == password) {
            System.out.println("Username Anda Salah");
        } else if (username1.equals(username) && password1 != password) {
            System.out.println("Password Anda Salah");
        } else {
            System.out.println("Username dan Password Anda Salah");
        }
    }
}