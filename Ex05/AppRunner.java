package Ex05;

import java.util.Scanner;

public class AppRunner {
    public static void main(String[] args) {
        App app = new App(new Santander(), new Scanner(System.in, "UTF-8").useDelimiter("\n"));
        app.run();

    }

}
