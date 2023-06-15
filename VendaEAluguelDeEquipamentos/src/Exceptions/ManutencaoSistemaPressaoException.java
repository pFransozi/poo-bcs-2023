package Exceptions;

public class ManutencaoSistemaPressaoException extends Exception {

    public ManutencaoSistemaPressaoException(int codigo, String descricao)
    {
        super("Equipamento irregular ( código: "
                                + codigo 
                                + " - " 
                                + descricao 
                                + "). Proibida comercializacao sem manutenção do sistema de pressão.");
    }
    
}
