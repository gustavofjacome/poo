import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Classe ArquivoService
 *
 * Responsável por toda a manipulação de arquivos de texto.
 * Utiliza as classes modernas do pacote java.nio.file:
 *   - Path / Paths  → representam o caminho do arquivo
 *   - Files.write   → escreve bytes no arquivo
 *   - Files.readAllBytes → lê todos os bytes do arquivo
 *
 * Esta separação segue o princípio de responsabilidade única (SRP):
 * a classe cuida SOMENTE de I/O (entrada e saída de arquivos).
 */
public class ArquivoService {

    /**
     * Salva uma lista de transações em um arquivo de texto.
     *
     * Cada transação é convertida para String (via toString()),
     * depois tudo é unido em um único texto com quebras de linha
     * e escrito no arquivo como bytes (UTF-8).
     *
     * @param transacoes Lista de transações a salvar
     * @param caminho    Caminho do arquivo (ex: "lancamentos.txt")
     */
    public void salvar(List<Transacao> transacoes, String caminho) {

        // StringBuilder monta o conteúdo do arquivo em memória
        StringBuilder conteudo = new StringBuilder();

        // Cabeçalho do arquivo
        conteudo.append("===== CONTROLE FINANCEIRO PESSOAL =====\n");

        // Percorre cada transação e adiciona sua representação textual
        for (Transacao t : transacoes) {
            conteudo.append(t.toString()).append("\n");
        }

        // Rodapé com resumo financeiro
        conteudo.append("=======================================\n");

        try {
            // Paths.get() converte a String de caminho em um objeto Path
            Path arquivo = Paths.get(caminho);

            // Files.write() escreve os bytes no arquivo
            // .getBytes() converte a String para array de bytes
            Files.write(arquivo, conteudo.toString().getBytes());

            System.out.println("\n✔ Arquivo salvo com sucesso em: " + caminho);

        } catch (IOException e) {
            // Tratamento de exceção: exibe a mensagem de erro sem travar o programa
            System.err.println("✘ Erro ao salvar arquivo: " + e.getMessage());
        }
    }

    /**
     * Lê o conteúdo de um arquivo de texto e retorna como String.
     *
     * Usa Files.readAllBytes() que retorna um array de bytes (byte[]),
     * depois convertemos para String com new String(...).
     *
     * @param caminho Caminho do arquivo a ser lido
     * @return Conteúdo do arquivo como texto, ou null se houver erro
     */
    public String ler(String caminho) {

        try {
            // Cria o objeto Path a partir do caminho informado
            Path arquivo = Paths.get(caminho);

            // Lê todos os bytes do arquivo de uma vez
            byte[] bytes = Files.readAllBytes(arquivo);

            // Converte o array de bytes para String (texto legível)
            return new String(bytes);

        } catch (IOException e) {
            System.err.println("✘ Erro ao ler arquivo: " + e.getMessage());
            return null;
        }
    }
}