package Equipamentos;
import java.time.LocalDate;

import Medidas.EquipamentoMedidaComprimento;
import Medidas.EquipamentoMedidaMassa;

public abstract class EquipamentoAlugavel extends Equipamento {

    private int maxDiasAluguel;
    private LocalDate dataAluguel;

    private void setMaxDiasAluguel(int maxDiasAluguel) {
        this.maxDiasAluguel = maxDiasAluguel;
    }

    public int getMaxDiasAluguel() {
        return this.maxDiasAluguel;
    }

    private void setDataAluguel(LocalDate dataAluguel)
    {
        this.dataAluguel = dataAluguel;
    }

    public LocalDate getDataAluguel()
    {
        return this.dataAluguel;
    }

    public EquipamentoAlugavel(EquipamentoTipo tipo, int codigo, String descricao, double valorBase, EquipamentoMedidaComprimento dimensao,
            EquipamentoMedidaMassa medidaMassa, int maxDiasAluguel,
            LocalDate dataAluguel) {

        super(tipo, codigo, descricao, valorBase, dimensao, medidaMassa);

        this.setMaxDiasAluguel(maxDiasAluguel);
        this.setDataAluguel(dataAluguel);
    }

    public abstract LocalDate dataFimAluguel();

    @Override
    public double calcularValorFinal() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularValorFinal'");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Equipamento Alugavel:");
        System.out.println("Dias de Aluguel: " + this.getMaxDiasAluguel());
        System.out.println("Data Inicio Aluguel: " + this.getDataAluguel());
    }

}
