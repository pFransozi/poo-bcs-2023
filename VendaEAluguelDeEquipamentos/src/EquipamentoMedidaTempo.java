public class EquipamentoMedidaTempo {

    private double tempo;
    private EquipamentoMedidaTempo unidade;

    public double getTempo()
    {
        return this.tempo;
    }

    public void setTempo(double tempo)
    {
        this.tempo = tempo;
    }

    public EquipamentoMedidaTempo getUnidade()
    {
        return this.unidade;
    }

    public void setUnidade(EquipamentoUnidadeTempo unidade)
    {
        this.unidade = unidade;
    }

    public EquipamentoMedidaTempo(double tempo, EquipamentoUnidadeTempo unidade)
    {
        this.setTempo(tempo);
        this.setUnidade(unidade);
    }

    @Override
    public String toString() {
        return this.getTempo() + " " + this.getUnidade();
    }
    
}
