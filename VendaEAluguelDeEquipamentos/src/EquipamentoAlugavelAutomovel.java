import java.util.Date;

public class EquipamentoAlugavelAutomovel extends EquipamentoAlugavel {

    private boolean manutencaoPneus;
    private boolean manutencaoAutomecanica;

    public boolean getManutencaoPneus()
    {
        return this.manutencaoPneus;
    }

    private void setManutencaoPneus(boolean manutencaoPneus)
    {
        this.manutencaoPneus = manutencaoPneus;
    }

    public boolean getManutencaoAutomecanica()
    {
        return this.manutencaoAutomecanica;
    }

    public void setManutencaoAutomecanica(boolean manutencaoAutomecanica)
    {
        this.manutencaoAutomecanica = manutencaoAutomecanica;
    }

    public EquipamentoAlugavelAutomovel(int codigo, String descricao, double valorBase, EquipamentoDimensao dimensao,
            EquipamentoMedidaMassa medidaMassa, int maxDiasAluguel, Date dataAluguel,
            boolean revisaoPneus, boolean revisaoAutomecanica) {
        super(codigo, descricao, valorBase, dimensao, medidaMassa, maxDiasAluguel, dataAluguel);
        
        setManutencaoPneus(revisaoPneus);
        setManutencaoAutomecanica(revisaoAutomecanica);
    }

    @Override
    public double calcularValorFinal() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularValorFinal'");
    }

    @Override
    public Date dataFimAluguel() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dataEntregaAluguel'");
    }

    @Override
    public void printInfo() {
        // TODO Auto-generated method stub
        super.printInfo();
        System.out.println("Do tipo automovel:");
        System.out.println("Valor final do aluguel: " + this.calcularValorFinal());
        System.out.println("Data Fim do aluguel: " + this.dataFimAluguel());
        System.out.println("Manutencao Pneu: " + this.getManutencaoPneus());
        System.out.println("Manutencao automecânica: " + this.getManutencaoAutomecanica());
    }

}
