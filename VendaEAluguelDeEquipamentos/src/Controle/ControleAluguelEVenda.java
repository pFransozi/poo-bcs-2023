package Controle;

import java.util.ArrayList;

import Equipamentos.Equipamento;
import Equipamentos.EquipamentoAlugavel;
import Equipamentos.EquipamentoVendivel;

public class ControleAluguelEVenda {

    private ArrayList<Equipamento> equipamentosParaAlugar;
    private ArrayList<Equipamento> equipamentosParaVender;
    private ArrayList<Equipamento> equipamentosAlugados;
    private ArrayList<Equipamento> equipamentosVendidos;

    public ArrayList<Equipamento> getListaEquipamentoParaAlugar() {
        return this.equipamentosParaAlugar;
    }

    public ArrayList<Equipamento> getListaEquipamentoParaVender() {
        return this.equipamentosParaVender;
    }

    public ArrayList<Equipamento> getListaEquipamentosAlugados() {
        return this.equipamentosAlugados;
    }

    public ArrayList<Equipamento> getListaEquipamentosVendidos() {
        return this.equipamentosVendidos;
    }

    public ControleAluguelEVenda() {
        this.equipamentosParaAlugar = new ArrayList<Equipamento>();
        this.equipamentosParaVender = new ArrayList<Equipamento>();
        this.equipamentosAlugados = new ArrayList<Equipamento>();
        this.equipamentosVendidos = new ArrayList<Equipamento>();
    }

    public boolean existeEquipamentosParaVender() {
        return this.getListaEquipamentoParaVender().size() > 0;
    }

    public boolean existeEquipamentosParaAlugar() {
        return this.getListaEquipamentoParaAlugar().size() > 0;
    }

    public boolean existeEquipamentosVendidos() {
        return this.getListaEquipamentosVendidos().size() > 0;
    }

    public boolean existeEquipamentosAlugados() {
        return this.getListaEquipamentosAlugados().size() > 0;
    }

    public void adicionarEquipamentoParaVender(Equipamento equipamento) {
        this.getListaEquipamentoParaVender().add(equipamento);
    }

    public void adicionarEquipamentoParaAlugar(Equipamento equipamento) {
        this.getListaEquipamentoParaAlugar().add(equipamento);
    }

    public void adicionarEquipamentoVendidos(Equipamento equipamento) {
        this.getListaEquipamentosVendidos().add(equipamento);
    }

    public void adicionarEquipamentoAlugados(Equipamento equipamento) {
        this.getListaEquipamentosAlugados().add(equipamento);
    }

}