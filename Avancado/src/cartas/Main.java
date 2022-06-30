package cartas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Jogo j = new Jogo();
        boolean ex = true;
        while (ex) {
            PlayerOption opt = null;
            while(opt == null) {
                System.out.println("Options:");
                for(PlayerOption o : PlayerOption.values()) {
                    System.out.println(o);
                }
                opt = PlayerOption.getfromInt(in.nextInt());
                in.nextLine();
            }
        }
    }
}
