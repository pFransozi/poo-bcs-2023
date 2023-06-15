package Controle;

public class ControleConfigDir {

    private String fileSerialEquipParaAlugar;
    private String fileSerialEquipParaVender;
    private String fileSerialEquipAlugados;
    private String fileSerialEquipVendidos;

    public void setFileSerialEquipParaAlugar(String file) {
        this.fileSerialEquipParaAlugar = file;
    }

    public void setfileSerialEquipParaVender(String file)
    {
        this.fileSerialEquipParaVender = file;
    }

    public void setFileSerialEquipAlugados(String file)
    {
        this.fileSerialEquipAlugados = file;
    }

    public void setFileSerialEquipVendidos(String file)
    {
        this.fileSerialEquipVendidos = file;
    }

    public String getFileSerialEquipParaAlugar()
    {
        return this.fileSerialEquipParaAlugar;
    }

    public String getFileSerialEquipParaVender()
    {
        return this.fileSerialEquipParaVender;
    }

    public String getFileSerialEquipAlugados()
    {
        return this.fileSerialEquipAlugados;
    }

    public String getFileSerialEquipVendidos()
    {
        return this.fileSerialEquipVendidos;
    }

}
