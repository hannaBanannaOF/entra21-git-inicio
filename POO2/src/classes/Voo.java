package classes;

public class Voo {
    public String[][] codificacaoAssentos;
    public boolean[][] ocupacaoAssentos;

    public Voo(int linhas, int cadeirasPorLinha) {
        this.ocupacaoAssentos = new boolean[linhas][cadeirasPorLinha];
        this.codificacaoAssentos = new String[linhas][cadeirasPorLinha];
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i = 0; i < linhas; i++) {
            for (int j = 0; j < cadeirasPorLinha; j++)  {
                this.codificacaoAssentos[i][j] =
                        String.valueOf(alfabeto.charAt(i))+(j+1);
            }
        }
    }

    public boolean verificaOcupacao(String codigo) {
        for (int i = 0; i < this.codificacaoAssentos.length; i++) {
            for (int j = 0; j < this.codificacaoAssentos[i].length; j++) {
                if (this.codificacaoAssentos[i][j].equalsIgnoreCase(codigo)) {
                    return this.ocupacaoAssentos[i][j];
                }
            }
        }
        return false;
    }

    public void ocupar(String codigo) {
        for (int i = 0; i < this.codificacaoAssentos.length; i++) {
            for (int j = 0; j < this.codificacaoAssentos[i].length; j++) {
                if (this.codificacaoAssentos[i][j].equalsIgnoreCase(codigo)) {
                    this.ocupacaoAssentos[i][j] = true;
                }
            }
        }
    }

    public int quantidadeLivre() {
        int qtdeAssentosLivres = 0;
        for (int i = 0; i < this.codificacaoAssentos.length; i++) {
            for (int j = 0; j < this.codificacaoAssentos[i].length; j++) {
                if(!this.ocupacaoAssentos[i][j]) {
                    qtdeAssentosLivres++;
                }
            }
        }
        return qtdeAssentosLivres;
    }

    public void mostrarAssentos() {
        for (int i = 0; i < this.codificacaoAssentos.length; i++) {
            for (int j = 0; j < this.codificacaoAssentos[i].length; j++) {
                if(this.ocupacaoAssentos[i][j]) {
                    System.out.print("- ");
                } else {
                    System.out.print(this.codificacaoAssentos[i][j] + " ");
                }
            }
            System.out.println("");
        }
    }
}
