package Equipamentos;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.ArrayList;

import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import Medidas.EquipamentoMedidaComprimento;
import Medidas.EquipamentoMedidaMassa;
import Exceptions.ManutencaoAutomecanicaException;
import Exceptions.ManutencaoPneusException;

public class EquipamentoAlugavelAutomovel extends EquipamentoAlugavel {

    private boolean manutencaoPneus;
    private boolean manutencaoAutomecanica;

    public boolean getManutencaoPneus() {
        return this.manutencaoPneus;
    }

    private void setManutencaoPneus(boolean manutencaoPneus) {
        this.manutencaoPneus = manutencaoPneus;
    }

    public boolean getManutencaoAutomecanica() {
        return this.manutencaoAutomecanica;
    }

    public void setManutencaoAutomecanica(boolean manutencaoAutomecanica) {
        this.manutencaoAutomecanica = manutencaoAutomecanica;
    }

    public EquipamentoAlugavelAutomovel(EquipamentoTipo tipo, int codigo, String descricao, double valorBase,
            EquipamentoMedidaComprimento dimensao,
            EquipamentoMedidaMassa medidaMassa, int maxDiasAluguel, LocalDate dataAluguel,
            boolean revisaoPneus, boolean revisaoAutomecanica) {
        super(tipo, codigo, descricao, valorBase, dimensao, medidaMassa, maxDiasAluguel, dataAluguel);

        setManutencaoPneus(revisaoPneus);
        setManutencaoAutomecanica(revisaoAutomecanica);
    }

    @Override
    public double calcularValorFinal() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularValorFinal'");
    }

    @Override
    public LocalDate dataFimAluguel() {
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

    @Override
    public String toString() {
        return (new GsonBuilder()).create().toJson(this);
    }

    public void validaManutencaoPneus() throws ManutencaoPneusException {
        if (!this.getManutencaoPneus())
            throw new ManutencaoPneusException(this.getCodigo(), this.getDescricao());
    }

    public void validarManutencaoAutomecanica() throws ManutencaoAutomecanicaException
    {
        if(!this.getManutencaoAutomecanica())
            throw new ManutencaoAutomecanicaException(getCodigo(), getDescricao());
    }

}
