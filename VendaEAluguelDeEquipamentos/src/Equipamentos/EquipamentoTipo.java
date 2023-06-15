package Equipamentos;

public enum EquipamentoTipo {
    AlugavelAutomovel(1), AlugavelElevacao(2), VendivelPerfuracao(3);

    private final int valor;

    EquipamentoTipo(int valor)
    {
        this.valor = valor;
    }

    public int getValor()
    {
        return this.valor;
    }
    
}
