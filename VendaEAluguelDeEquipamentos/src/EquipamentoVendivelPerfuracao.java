public class EquipamentoVendivelPerfuracao extends EquipamentoVendivel{

    public EquipamentoVendivelPerfuracao(int codigo, String descricao, double valorBase, EquipamentoDimensao dimensao,
            EquipamentoMedidaMassa medidaMassa, double valorFrete, EquipamentoMedidaTempo tempoFrete) {
        super(codigo, descricao, valorBase, dimensao, medidaMassa, valorFrete, tempoFrete);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double calcularValorFinal() {
        throw new UnsupportedOperationException("Unimplemented method 'calcularValorFinal'");
    }

    @Override
    public double calcularValorFrete()
    {
        //para equipamentos de perfuracao, o frete precisa ser ajustado em 1.15
        return this.getValorBase();
    }

    @Override
    public EquipamentoMedidaTempo calcularTempoFrete()
    {
        //para equipamentos de perfuracao, o tempo do frete precisa ser ajustado em 7 dias.
        return this.getTempoFreteBase();
    }
    
}
