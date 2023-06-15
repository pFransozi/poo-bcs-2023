package Controle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import Equipamentos.Equipamento;
import Equipamentos.EquipamentoAlugavel;
import Equipamentos.EquipamentoVendivel;
import Exceptions.ArquivoConfigDirSerialInvalido;

public class ControleLeituraEscritaArquivo {

    public static ControleConfigDir LerControleConfigDir()
            throws FileNotFoundException, IOException, ArquivoConfigDirSerialInvalido {
        File file = new File("./config/config.txt");
        ControleConfigDir retorno = new ControleConfigDir();
        String[] lines = new String[4];

        try (FileReader fReader = new FileReader(file)) {

            try (BufferedReader bReader = new BufferedReader(fReader)) {

                for (int i = 0; i < 4; i++) {
                    String line;
                    if ((line = bReader.readLine()) != null)
                        lines[i] = line;
                    else
                        throw new ArquivoConfigDirSerialInvalido();
                }

            }

        }

        retorno.setFileSerialEquipParaAlugar(lines[0]);
        retorno.setfileSerialEquipParaVender(lines[1]);
        retorno.setFileSerialEquipAlugados(lines[2]);
        retorno.setFileSerialEquipVendidos(lines[3]);

        return retorno;
    }

    public static boolean SalvarArquivoEquipamentos(ArrayList<Equipamento> equipamentos, String filePath)
            throws IOException {
        try {
            File file = new File(filePath);
            file.createNewFile();
            FileWriter fileW = new FileWriter(file);

            for (Equipamento equipamento : equipamentos) {
                fileW.write(equipamento.toString());
            }
            fileW.flush();
            fileW.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    public static String LerArquivoEquipamentos(String filePath) {

        String fileContent = "";
        try {
            fileContent = new String(Files.readAllBytes(Paths.get(filePath)), Charset.defaultCharset());

        } catch (Exception e) {
            e.printStackTrace();
        }
        return fileContent;
    }

    public static boolean SerializarEquipamentosAlugaveis(ArrayList<Equipamento> equipamentos, String filePath)
            throws IOException {
        File file = new File(filePath);
        file.createNewFile();
        try (FileOutputStream fileOut = new FileOutputStream(file, false)) {
            try (ObjectOutputStream objOut = new ObjectOutputStream(fileOut)) {
                objOut.writeObject(equipamentos);
            }
        }

        return true;
    }

    public static boolean SerializarEquipamentosVendiveis(ArrayList<Equipamento> equipamentos, String filePath)
            throws IOException {
        File file = new File(filePath);
        file.createNewFile();
        try (FileOutputStream fileOut = new FileOutputStream(file, false)) {
            try (ObjectOutputStream objOut = new ObjectOutputStream(fileOut)) {
                objOut.writeObject(equipamentos);
            }
        }
        return true;
    }

    // public static ArrayList<Equipamento> DeserializarEquipamentos(String filePath) throws Exception {
    //     return (ArrayList<Equipamento>) ControleLeituraEscritaArquivo.DeserializarEquipamento(filePath);
    // }

    public static java.lang.Object DeserializarEquipamento(String filePath) throws FileNotFoundException, IOException, ClassNotFoundException {
        try (FileInputStream fileIn = new FileInputStream(filePath)) {
            try (ObjectInputStream objIn = new ObjectInputStream(fileIn)) {
                java.lang.Object obj = objIn.readObject();
                return obj;
            }
        }

    }

}
