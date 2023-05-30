import java.util.Date;

public class EquipamentoAlugavelElevacao extends EquipamentoAlugavel
{

    private boolean manutencaoPesosEContrapesos;
    private boolean manutencaoSistemaPressao;

    public boolean getManutencaoPesosEContrapesos()
    {
        return this.manutencaoPesosEContrapesos;
    }

    private void setManutencaoPesosEContrapesos(boolean manutencaoPesosEContrapesos)
    {
        this.manutencaoPesosEContrapesos = manutencaoPesosEContrapesos;
    }

    public boolean getManutencaoSistemaPressao()
    {
        return this.manutencaoSistemaPressao;
    }

    private void setManutencaoSistemaPressao(boolean manutencaoSistemaPressao)
    {
        this.manutencaoSistemaPressao = manutencaoSistemaPressao;
    }

    public EquipamentoAlugavelElevacao(int codigo, String descricao, double valorBase, EquipamentoDimensao dimensao,
            EquipamentoMedidaMassa medidaMassa, int maxDiasAluguel, Date dataAluguel
            ,boolean manutencaoPesosEContrapesos, boolean manutencaoSistemaPressao) {
        super(codigo, descricao, valorBase, dimensao, medidaMassa, maxDiasAluguel, dataAluguel);

        this.setManutencaoPesosEContrapesos(manutencaoPesosEContrapesos);
        this.setManutencaoSistemaPressao(manutencaoSistemaPressao);
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
        System.out.println("Data Entrega do aluguel: " + this.dataFimAluguel());
        System.out.println("Manutencao Pesos e Contrapesos: " + this.getManutencaoPesosEContrapesos());
        System.out.println("Manutencao Pressao: " + this.getManutencaoSistemaPressao());
    }
    
}