package Exceptions;

public class ManutencaoPneusException extends Exception {
    public ManutencaoPneusException(int codigo, String descricao) {
        super("Veículo irregular (codigo: "
                + codigo + " - "
                + descricao + "). Proibida comercialização sem manutenção dos pneus.");

    }
}