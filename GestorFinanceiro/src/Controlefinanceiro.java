import java.util.ArrayList;
import java.util.List;

/**
 * Classe ControleFinanceiro
 *
 * Responsável por gerenciar a lista de transações financeiras.
 * Aplica o princípio de responsabilidade única (SRP): só cuida
 * das regras de negócio relacionadas às transações.
 */
public class ControleFinanceiro {

    // =========================================================
    // ATRIBUTO — lista que armazena todas as transações
    // ArrayList é uma lista dinâmica (tamanho flexível)
    // =========================================================

    private ArrayList<Transacao> transacoes;

    // =========================================================
    // CONSTRUTOR
    // =========================================================

    /**
     * Inicializa o controle financeiro com uma lista vazia.
     */
    public ControleFinanceiro() {
        // Cria o ArrayList vazio — será preenchido pelo Main
        this.transacoes = new ArrayList<>();
    }

    // =========================================================
    // MÉTODOS DE NEGÓCIO
    // =========================================================

    /**
     * Adiciona uma nova transação à lista.
     * O id é gerado automaticamente com base no tamanho atual + 1.
     *
     * @param tipo      "RECEITA" ou "DESPESA"
     * @param descricao Texto descritivo
     * @param valor     Valor monetário
     * @param dia       Dia do lançamento
     * @param mes       Mês do lançamento
     * @param ano       Ano do lançamento
     */
    public void adicionarTransacao(String tipo, String descricao,
                                   double valor, short dia,
                                   short mes, int ano) {
        // Gera id sequencial (1, 2, 3, ...)
        int novoId = transacoes.size() + 1;

        // Cria o objeto Transacao e adiciona à lista
        Transacao t = new Transacao(novoId, tipo, descricao,
                valor, dia, mes, ano);
        transacoes.add(t);
    }

    /**
     * Exibe todas as transações no console.
     * Usa um laço for-each para percorrer o ArrayList.
     */
    public void listarTransacoes() {
        System.out.println("\n===== LANÇAMENTOS REGISTRADOS =====");

        // Estrutura for percorrendo cada item da lista
        for (Transacao t : transacoes) {
            System.out.println(t); // chama toString() implicitamente
        }

        System.out.println("===================================");
    }

    /**
     * Calcula e retorna o total de receitas.
     * Usa estrutura if dentro do for para filtrar apenas receitas.
     *
     * @return Soma de todos os valores com tipo "RECEITA"
     */
    public double totalReceitas() {
        double total = 0.0;

        for (Transacao t : transacoes) {
            // Verifica se o tipo é "RECEITA"
            if (t.getTipo().equals("RECEITA")) {
                total += t.getValor();
            }
        }

        return total;
    }

    /**
     * Calcula e retorna o total de despesas.
     *
     * @return Soma de todos os valores com tipo "DESPESA"
     */
    public double totalDespesas() {
        double total = 0.0;

        for (Transacao t : transacoes) {
            if (t.getTipo().equals("DESPESA")) {
                total += t.getValor();
            }
        }

        return total;
    }

    /**
     * Calcula o saldo final: receitas menos despesas.
     *
     * @return Saldo (pode ser positivo ou negativo)
     */
    public double saldoFinal() {
        return totalReceitas() - totalDespesas();
    }

    /**
     * Retorna a lista de transações (acesso de leitura).
     * Usada pelo ArquivoService para salvar os dados.
     *
     * @return Lista imutável de transações
     */
    public List<Transacao> getTransacoes() {
        return transacoes;
    }
}