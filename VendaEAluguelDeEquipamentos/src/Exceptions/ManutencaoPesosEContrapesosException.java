package Exceptions;

public class ManutencaoPesosEContrapesosException extends Exception {

    public ManutencaoPesosEContrapesosException(int codigo, String descricao)
    {
        super("Equipamento irregular ( código: "
                                + codigo 
                                + " - " 
                                + descricao 
                                + "). Proibida comercializa sem manutenção do sistema de pesos e contrapesos.");
    }
    
}
