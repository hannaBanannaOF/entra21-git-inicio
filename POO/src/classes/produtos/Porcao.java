package classes.produtos;

import classes.ConsoleHelper;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Porcao extends Complementable {

    private String tipoPorcao;
    private ETamanho tamanho;

    public Porcao() {
        this.setTipo(ETipoProduto.PORCAO);
    }

    public String getTipoPorcao() {
        return tipoPorcao;
    }

    public void setTipoPorcao(String tipoPorcao) {
        this.tipoPorcao = tipoPorcao;
    }

    public ETamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(ETamanho tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public void montarDetalhesProduto(Scanner in) {
        super.montarDetalhesProduto(in);
        System.out.print("Porção de: ");
        setTipoPorcao(in.nextLine());
        while (true) {
            System.out.println("Tamanho da porção: ");
            for (ETamanho tam : ETamanho.values()) {
                System.out.printf("(%d) %s\n", tam.getOpcao(), tam.getNomeApresentavel());
            }
            try {
                ETamanho tam = ETamanho.getByOpcaoMenu(in.nextInt());
                if (tam == null) {
                    ConsoleHelper.showError("Selecione um tamanho válido");
                    continue;
                }
                this.setTamanho(tam);
                break;
            } catch (InputMismatchException e) {
                ConsoleHelper.showError("Selecione um tamanho válido");
            } finally {
                in.nextLine();
            }
        }
    }
}
