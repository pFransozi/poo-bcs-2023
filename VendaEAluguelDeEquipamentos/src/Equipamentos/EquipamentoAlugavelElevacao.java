package Equipamentos;

import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.ArrayList;

import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import Exceptions.ManutencaoPesosEContrapesosException;
import Exceptions.ManutencaoSistemaPressaoException;
import Medidas.EquipamentoMedidaComprimento;
import Medidas.EquipamentoMedidaMassa;

public class EquipamentoAlugavelElevacao extends EquipamentoAlugavel {

    private boolean manutencaoPesosEContrapesos;
    private boolean manutencaoSistemaPressao;

    public boolean getManutencaoPesosEContrapesos() {
        return this.manutencaoPesosEContrapesos;
    }

    private void setManutencaoPesosEContrapesos(boolean manutencaoPesosEContrapesos) {
        this.manutencaoPesosEContrapesos = manutencaoPesosEContrapesos;
    }

    public boolean getManutencaoSistemaPressao() {
        return this.manutencaoSistemaPressao;
    }

    private void setManutencaoSistemaPressao(boolean manutencaoSistemaPressao) {
        this.manutencaoSistemaPressao = manutencaoSistemaPressao;
    }

    public EquipamentoAlugavelElevacao(EquipamentoTipo tipo, int codigo, String descricao, double valorBase,
            EquipamentoMedidaComprimento dimensao,
            EquipamentoMedidaMassa medidaMassa, int maxDiasAluguel, LocalDate dataAluguel,
            boolean manutencaoPesosEContrapesos, boolean manutencaoSistemaPressao) {
        super(tipo, codigo, descricao, valorBase, dimensao, medidaMassa, maxDiasAluguel, dataAluguel);

        this.setManutencaoPesosEContrapesos(manutencaoPesosEContrapesos);
        this.setManutencaoSistemaPressao(manutencaoSistemaPressao);
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
        System.out.println("Data Entrega do aluguel: " + this.dataFimAluguel());
        System.out.println("Manutencao Pesos e Contrapesos: " + this.getManutencaoPesosEContrapesos());
        System.out.println("Manutencao Pressao: " + this.getManutencaoSistemaPressao());
    }

    @Override
    public String toString() {
        return (new GsonBuilder()).create().toJson(this);
    }

    public static EquipamentoAlugavelElevacao toClass(String json) {
        return (EquipamentoAlugavelElevacao) (new GsonBuilder())
                .create().fromJson(json, EquipamentoAlugavelElevacao.class);
    }

    public static ArrayList<EquipamentoAlugavelElevacao> toArrayListClass(String json) {
        Type arrayListType = new TypeToken<ArrayList<EquipamentoAlugavelElevacao>>() {
        }.getType();
        return (new GsonBuilder()).create().fromJson(json, arrayListType);
    }
}