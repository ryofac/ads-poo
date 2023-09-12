package questao10;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in, "UTF-8");

    public static void main(String[] args) {
        Enemy globalEnemys[] = { new Enemy("bug"), new Enemy("giant") };
        String name = initPlayer();
        Player p1 = new Player(name);
        System.out.println("Player criado!");
        p1.getStatus();

        enterToContinue();
        clearScreen();

        sc.close(); // Dont forget to close!!

    }

    static String getStr(String msg) {
        System.out.println(msg);
        String name = sc.nextLine().trim();
        return name;
    }

    static String getName() {
        String name = getStr("Olá habitante de outro mundo, digite seu nome: ");
        if (name == "") {
            name = "Roberto";
        }
        return name;

    }

    static String initPlayer() {
        String name = getName();

        char confirma = getStr("O seu nome é " + name + " certo?").toUpperCase().charAt(0);

        while (confirma != 'S') {
            name = getName();
            confirma = getStr("O seu nome é " + name + " certo?").toUpperCase().charAt(0);
        }
        return name;

    }

    static void enterToContinue() {
        System.out.println("Digite enter para continuar...");
        sc.nextLine();
    }

    static void clearScreen() {
        System.out.print("\033[H\033[2KJ");
        System.out.flush();
    }

}
