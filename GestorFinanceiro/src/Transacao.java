/**
 * Classe Transacao
 *
 * Representa um lançamento financeiro (receita ou despesa).
 * Esta é uma classe de modelo (Model), responsável apenas por
 * armazenar e fornecer os dados de uma transação.
 */
public class Transacao {

    // =========================================================
    // ATRIBUTOS (campos privados — encapsulamento)
    // =========================================================

    private int    id;          // Identificador único da transação
    private String tipo;        // "RECEITA" ou "DESPESA"
    private String descricao;   // Descrição do lançamento
    private double valor;       // Valor monetário (ex: 1500.00)
    private short  dia;         // Dia do lançamento (1–31)
    private short  mes;         // Mês do lançamento (1–12)
    private int    ano;         // Ano do lançamento (ex: 2025)

    // =========================================================
    // CONSTRUTOR
    // Chamado com "new Transacao(...)" para criar um objeto
    // =========================================================

    /**
     * Cria uma nova transação com todos os dados obrigatórios.
     *
     * @param id        Número identificador único
     * @param tipo      "RECEITA" ou "DESPESA"
     * @param descricao Texto descritivo do lançamento
     * @param valor     Valor em reais
     * @param dia       Dia do lançamento
     * @param mes       Mês do lançamento
     * @param ano       Ano do lançamento
     */
    public Transacao(int id, String tipo, String descricao,
                     double valor, short dia, short mes, int ano) {
        this.id        = id;
        this.tipo      = tipo;
        this.descricao = descricao;
        this.valor     = valor;
        this.dia       = dia;
        this.mes       = mes;
        this.ano       = ano;
    }

    // =========================================================
    // MÉTODOS
    // =========================================================

    /**
     * Formata a data no padrão DD/MM/AAAA.
     * %02d garante dois dígitos (ex: dia 5 → "05").
     *
     * @return String com a data formatada
     */
    public String formatarData() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

    /**
     * Retorna uma representação textual da transação.
     * Utilizado para exibir no console e salvar em arquivo.
     *
     * @return String formatada com todos os dados
     */
    @Override
    public String toString() {
        return String.format(
                "[%d] %s | %s | R$ %.2f | %s",
                id, tipo, descricao, valor, formatarData()
        );
    }

    // =========================================================
    // GETTERS — acesso controlado aos atributos privados
    // =========================================================

    /** Retorna o id da transação */
    public int getId() { return id; }

    /** Retorna o tipo: "RECEITA" ou "DESPESA" */
    public String getTipo() { return tipo; }

    /** Retorna a descrição do lançamento */
    public String getDescricao() { return descricao; }

    /** Retorna o valor monetário */
    public double getValor() { return valor; }

    /** Retorna o dia do lançamento */
    public short getDia() { return dia; }

    /** Retorna o mês do lançamento */
    public short getMes() { return mes; }

    /** Retorna o ano do lançamento */
    public int getAno() { return ano; }
}