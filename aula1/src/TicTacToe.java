import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        ticTacToe();
    }

    public static void ticTacToe() {
        Scanner in = new Scanner(System.in);
        String[][] map = new String[3][3];
        boolean isCross = false;
        boolean hasWinner = false;
        boolean toe = false;
        while (!hasWinner && !toe) {
            if (isCross) {
                System.out.print("Informe um lugar para X: ");
            } else {
                System.out.print("Informe um lugar para O: ");
            }
            boolean ok = false;
            while (!ok) {
                int inS = in.nextInt();
                if (inS <= 0 || inS > 9) {
                    System.err.println("Informe uma posição válida!");
                } else {
                    int i = 0;
                    int j = 0;
                    switch (inS) {
                        case 1:
                            i = 0;
                            j = 0;
                            break;
                        case 2:
                            i = 0;
                            j = 1;
                            break;
                        case 3:
                            i = 0;
                            j = 2;
                            break;
                        case 4:
                            i = 1;
                            j = 0;
                            break;
                        case 5:
                            i = 1;
                            j = 1;
                            break;
                        case 6:
                            i = 1;
                            j = 2;
                            break;
                        case 7:
                            i = 2;
                            j = 0;
                            break;
                        case 8:
                            i = 2;
                            j = 1;
                            break;
                        case 9:
                            i = 2;
                            j = 2;
                            break;
                    }
                    if (map[i][j] == null || map[i][j].equals("")) {
                        if (isCross) {
                            map[i][j] = "X";
                        } else {
                            map[i][j] = "O";
                        }
                        ok = true;
                    } else {
                        System.err.println("Informe uma posição válida!");
                    }
                }
            }
            //checar vencedor ou velha
            String winner = "";
            if (isCross) {
                winner = "X";
            } else {
                winner = "O";
            }
            boolean hasEmpty = false;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (map[i][j] == null || map[i][j].equals("")) {
                        hasEmpty = true;
                        break;
                    }
                }
                if(hasEmpty) {
                    break;
                }
            }
            toe = !hasEmpty;
            if ( !toe &&
                    (winner.equals(map[0][0]) && winner.equals(map[0][1]) && winner.equals(map[0][2])) ||
                            (winner.equals(map[1][0]) && winner.equals(map[1][1]) && winner.equals(map[1][2])) ||
                            (winner.equals(map[2][0]) && winner.equals(map[2][1]) && winner.equals(map[2][2])) ||
                            (winner.equals(map[0][0]) && winner.equals(map[1][0]) && winner.equals(map[2][0])) ||
                            (winner.equals(map[0][1]) && winner.equals(map[1][1]) && winner.equals(map[2][1])) ||
                            (winner.equals(map[0][2]) && winner.equals(map[1][2]) && winner.equals(map[2][2])) ||
                            (winner.equals(map[0][0]) && winner.equals(map[1][1]) && winner.equals(map[2][2])) ||
                            (winner.equals(map[2][0]) && winner.equals(map[1][1]) && winner.equals(map[0][2]))
            ) {
                hasWinner = true;
            } else {
                isCross = !isCross;
            }
            //mostrar mapa
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (map[i][j] == null || map[i][j].equals("")) {
                        System.out.print(" - ");
                    } else {
                        System.out.print(" "+map[i][j]+" ");
                    }
                }
                System.out.println("");
            }
            if (hasWinner) {
                System.out.println("Vencedor: " + winner);
            }
            if (toe && !hasWinner) {
                System.out.println("VELHA!");
            }
        }
    }

}

