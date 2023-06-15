import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

import Controle.ControleAluguelEVenda;
import Controle.ControleConfigDir;
import Controle.ControleLeituraEscritaArquivo;
import Equipamentos.Equipamento;
import Exceptions.ArquivoConfigDirSerialInvalido;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class VADE_GUI {

  private JFrame frame;
  ControleConfigDir configDir;
  ControleAluguelEVenda controleDoArquivo;

  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          VADE_GUI window = new VADE_GUI();
          window.frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });

  }

  public VADE_GUI() throws FileNotFoundException, ClassNotFoundException, IOException, ArquivoConfigDirSerialInvalido {

    configDir = ControleLeituraEscritaArquivo.LerControleConfigDir();
    controleDoArquivo = new ControleAluguelEVenda();

    initialize();

  }

  private void initialize() throws FileNotFoundException, ClassNotFoundException, IOException {
    frame = new JFrame();
    // frame.setResizable(false);
    frame.setTitle("VADE: Leitor de arquivos serializados.");
    frame.setBounds(50, 0, 1200, 500);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JMenuBar menuBar = new JMenuBar();
    frame.setJMenuBar(menuBar);

    JMenu mnNewMenu = new JMenu("VADE");
    menuBar.add(mnNewMenu);

    JSeparator separator = new JSeparator();
    mnNewMenu.add(separator);

    JMenuItem mntmNewMenuItem_2 = new JMenuItem("Sair");
    mntmNewMenuItem_2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.exit(0);
      }
    });
    mnNewMenu.add(mntmNewMenuItem_2);

    // Listar Equipamentos
    JPanel panelListar = new JPanel();
    panelListar.setPreferredSize(new Dimension(700, 400));
    String[] columnNamesListar = { "Codigo", "Descricao", "Tipo", "Valor Base", "Dimensoes", "Massa" };

    JTable jTableListar = new JTable(getDataFromSER(), columnNamesListar);
    jTableListar.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
    jTableListar.setFillsViewportHeight(true);
    jTableListar.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
    jTableListar.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    JScrollPane tableContainerListar = new JScrollPane(jTableListar);
    frame.getContentPane().add(tableContainerListar, BorderLayout.SOUTH);

  }

  private String[][] getDataFromSER() throws FileNotFoundException, ClassNotFoundException, IOException {

    List<Equipamento> equipamentosParaAlugar = (List<Equipamento>) ControleLeituraEscritaArquivo
        .DeserializarEquipamento(configDir.getFileSerialEquipParaAlugar());

    List<Equipamento> equipamentosParaVender = (List<Equipamento>) ControleLeituraEscritaArquivo
        .DeserializarEquipamento(configDir.getFileSerialEquipParaVender());

    String[][] data = new String[equipamentosParaAlugar.size() + equipamentosParaVender.size()][6];

    int countLista = 0;
    for (int i = 0; i < equipamentosParaAlugar.size(); i++) {
      data[countLista] = new String[] {
          Integer.toString(equipamentosParaAlugar.get(i).getCodigo()), equipamentosParaAlugar.get(i).getDescricao(),
          equipamentosParaAlugar.get(i).getTipo().name(), Double.toString(equipamentosParaAlugar.get(i).getValorBase()),
          equipamentosParaAlugar.get(i).getDimensao().toString(),
          equipamentosParaAlugar.get(i).getMedidaMassa().toString() };

      controleDoArquivo.adicionarEquipamentoParaAlugar(equipamentosParaAlugar.get(i));
      countLista++;
    }

    for (int i = 0; i < equipamentosParaVender.size(); i++) {
      data[countLista] = new String[] {
          Integer.toString(equipamentosParaVender.get(i).getCodigo()), equipamentosParaVender.get(i).getDescricao(),
          equipamentosParaVender.get(i).getTipo().name(), Double.toString(equipamentosParaVender.get(i).getValorBase()),
          equipamentosParaVender.get(i).getDimensao().toString(),
          equipamentosParaVender.get(i).getMedidaMassa().toString() };

      controleDoArquivo.adicionarEquipamentoParaVender(equipamentosParaVender.get(i));
      countLista++;
    }

    return data;
  }

}