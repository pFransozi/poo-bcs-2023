package Equipamentos;
import java.io.Serializable;

import Medidas.EquipamentoMedidaComprimento;
import Medidas.EquipamentoMedidaMassa;

public abstract class Equipamento implements Serializable {

    private EquipamentoTipo tipo;
    private int codigo;
    private String descricao;
    private double valorBase;
    private EquipamentoMedidaComprimento dimensao;
    private EquipamentoMedidaMassa medidaMassa;

    private void setTipo(EquipamentoTipo tipo)
    {
        this.tipo = tipo;
    }

    public EquipamentoTipo getTipo()
    {
        return this.tipo;
    }

    private void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return this.codigo;
    }

    private void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }

    private void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }

    public double getValorBase() {
        return this.valorBase;
    }

    private void setDimensao(EquipamentoMedidaComprimento dimensao)
    {
        this.dimensao = dimensao;
    }

    public EquipamentoMedidaComprimento getDimensao()
    {
        return this.dimensao;
    }

    private void setMedidaMassa(EquipamentoMedidaMassa medidaMassa)
    {
        this.medidaMassa = medidaMassa;
    }

    public EquipamentoMedidaMassa getMedidaMassa()
    {
        return this.medidaMassa;
    }

    public Equipamento(EquipamentoTipo tipo, int codigo, String descricao, double valorBase
                        , EquipamentoMedidaComprimento dimensao, EquipamentoMedidaMassa medidaMassa) {
        
        this.setTipo(tipo);
        this.setCodigo(codigo);
        this.setDescricao(descricao);
        this.setValorBase(valorBase);
        this.setDimensao(dimensao);
        this.setMedidaMassa(medidaMassa);
    }

    public abstract double calcularValorFinal();

    @Override
    public String toString() {
        return "Código" + this.getCodigo()
                + " - " + this.getDescricao()
                + ". R$ " + this.getValorBase();
    }

    public void printInfo() {
        System.out.println("Item Info:");
        System.out.println(this.toString());
        System.out.println("Dimensões: " + this.getDimensao().toString());
        System.out.println("Massa: " + this.getMedidaMassa().toString());
    }


}
