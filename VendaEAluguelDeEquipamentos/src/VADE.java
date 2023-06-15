import java.time.LocalDate;
import java.util.List;

import Controle.ControleAluguelEVenda;
import Controle.ControleConfigDir;
import Controle.ControleLeituraEscritaArquivo;
import Equipamentos.Equipamento;
import Equipamentos.EquipamentoAlugavelAutomovel;
import Equipamentos.EquipamentoAlugavelElevacao;
import Equipamentos.EquipamentoTipo;
import Equipamentos.EquipamentoVendivelPerfuracao;
import Medidas.EquipamentoMedidaComprimento;
import Medidas.EquipamentoMedidaMassa;
import Medidas.EquipamentoMedidaTempo;
import Medidas.EquipamentoUnidadeMassa;
import Medidas.EquipamentoUnidadeTempo;

public class VADE {
        public static void main(String[] args) throws Exception {

                ControleAluguelEVenda controle = new ControleAluguelEVenda();

                controle.adicionarEquipamentoParaAlugar(new EquipamentoAlugavelAutomovel(
                                EquipamentoTipo.AlugavelAutomovel, 1, "Rolocompactador", 10000,
                                new EquipamentoMedidaComprimento(100, 130, 20),
                                new EquipamentoMedidaMassa(500, EquipamentoUnidadeMassa.G), 100,
                                LocalDate.of(2023, 06, 3), true,
                                true));

                controle.adicionarEquipamentoParaAlugar(new EquipamentoAlugavelAutomovel(
                                EquipamentoTipo.AlugavelAutomovel, 2, "Terraplanador", 15_000,
                                new EquipamentoMedidaComprimento(75, 20, 30),
                                new EquipamentoMedidaMassa(750, EquipamentoUnidadeMassa.G), 40,
                                LocalDate.of(2023, 06, 3), true,
                                true));

                controle.adicionarEquipamentoParaAlugar(new EquipamentoAlugavelElevacao(
                                EquipamentoTipo.AlugavelElevacao, 1, "Plataforma de Elevacao", 5_000,
                                new EquipamentoMedidaComprimento(100, 20, 5),
                                new EquipamentoMedidaMassa(400, EquipamentoUnidadeMassa.KG), 23,
                                LocalDate.of(2023, 02, 4), true,
                                false));

                controle.adicionarEquipamentoParaVender(new EquipamentoVendivelPerfuracao(
                                EquipamentoTipo.VendivelPerfuracao, 1, "Broca de Perfuracao", 1_500_000,
                                new EquipamentoMedidaComprimento(120, 100, 20),
                                new EquipamentoMedidaMassa(1, EquipamentoUnidadeMassa.TON), 10_000,
                                new EquipamentoMedidaTempo(10, EquipamentoUnidadeTempo.semana)));

                ControleConfigDir configDir = ControleLeituraEscritaArquivo.LerControleConfigDir();

                ControleLeituraEscritaArquivo.SerializarEquipamentosAlugaveis(controle.getListaEquipamentoParaAlugar(),
                                configDir.getFileSerialEquipParaAlugar());

                ControleLeituraEscritaArquivo.SerializarEquipamentosVendiveis(controle.getListaEquipamentoParaVender(),
                                configDir.getFileSerialEquipParaVender());

                // Object objEquipParaAlugar = ControleLeituraEscritaArquivo.DeserializarEquipamento(
                //                 configDir.getFileSerialEquipParaAlugar());

                // Object objEquipParaVender = ControleLeituraEscritaArquivo.DeserializarEquipamento(
                //                 configDir.getFileSerialEquipParaVender());

                // List<Equipamento> equipamentosParaAlugar = (List<Equipamento>) objEquipParaAlugar;

                // List<Equipamento> equipamentosParaVender = (List<Equipamento>) objEquipParaVender;

                // ControleAluguelEVenda controleDoArquivo = new ControleAluguelEVenda();

                // for (Equipamento equipamento : equipamentosParaVender) {
                //         controleDoArquivo.adicionarEquipamentoParaVender(equipamento);
                // }

                // for (Equipamento equipamento : equipamentosParaAlugar) {
                //         controleDoArquivo.adicionarEquipamentoParaAlugar(equipamento);
                // }

        }
}
