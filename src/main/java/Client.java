import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        String host = "netology.homework";
        int port = 8089;

        try (Socket clientSocket = new Socket(host, port);
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            Scanner sc = new Scanner(System.in)){

            System.out.println(in.readLine());
            String name = sc.nextLine();
            out.println(name);

            System.out.println(in.readLine());
            String childNot = sc.nextLine();
            out.println(childNot);

            System.out.println(in.readLine());

        } catch (IOException err) {
            err.printStackTrace();
        }
    }
}