package Exceptions;

public class ManutencaoAutomecanicaException extends Exception {
    
    public ManutencaoAutomecanicaException(int codigo, String descricao)
    {
        super("Veículo irregular ( código: "
                                + codigo 
                                + " - " 
                                + descricao 
                                + "). Proibida comercializa sem manutenção automecanica.");
    }
}
