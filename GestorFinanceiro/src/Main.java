import java.util.Scanner;

/**
 * Classe Main
 *
 * Ponto de entrada do programa (metodo main).
 * Responsavel pela interface com o usuario via linha de comando (CLI).
 *
 * Fluxo do programa:
 *  1. Receber 5 transacoes do usuario via Scanner
 *  2. Armazenar no ControleFinanceiro
 *  3. Listar todas as transacoes
 *  4. Exibir resumo financeiro (receitas, despesas, saldo)
 *  5. Salvar em arquivo de texto
 *  6. Ler e exibir o conteudo do arquivo salvo
 */
public class Main {

    public static void main(String[] args) {

        // =====================================================
        // INSTANCIANDO OS OBJETOS PRINCIPAIS
        // =====================================================

        // Scanner le a entrada do usuario pelo terminal
        Scanner scanner = new Scanner(System.in);

        // Gerenciador de transacoes
        ControleFinanceiro controle = new ControleFinanceiro();

        // Servico de arquivo para salvar/ler dados
        ArquivoService arquivoService = new ArquivoService();

        // Nome do arquivo onde os dados serao salvos
        String caminhoArquivo = "lancamentos.txt";

        // =====================================================
        // BOAS-VINDAS
        // =====================================================

        System.out.println("+======================================+");
        System.out.println("|   CONTROLE FINANCEIRO PESSOAL v1.0   |");
        System.out.println("+======================================+");
        System.out.println("Voce ira registrar 5 lancamentos financeiros.\n");

        // =====================================================
        // LACO FOR: coleta exatamente 5 transacoes do usuario
        // =====================================================

        for (int i = 1; i <= 5; i++) {

            System.out.println("--- Lancamento " + i + " de 5 ---");

            // ----- TIPO (RECEITA ou DESPESA) -----
            String tipo = "";

            // Loop de validacao: repete ate o usuario digitar corretamente
            while (true) {
                System.out.print("Tipo (R = Receita / D = Despesa): ");
                String entrada = scanner.nextLine().trim().toUpperCase();

                // Estrutura if para validar e traduzir a entrada
                if (entrada.equals("R")) {
                    tipo = "RECEITA";
                    break; // sai do while
                } else if (entrada.equals("D")) {
                    tipo = "DESPESA";
                    break;
                } else {
                    System.out.println("  [!] Digite apenas R ou D.");
                }
            }

            // ----- DESCRICAO -----
            System.out.print("Descricao: ");
            String descricao = scanner.nextLine().trim();

            // ----- VALOR -----
            double valor = 0;
            while (true) {
                System.out.print("Valor (R$): ");
                try {
                    // Substitui virgula por ponto (suporte ao padrao BR)
                    valor = Double.parseDouble(
                            scanner.nextLine().trim().replace(",", ".")
                    );

                    // Valor deve ser positivo
                    if (valor <= 0) {
                        System.out.println("  [!] O valor deve ser maior que zero.");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("  [!] Digite um numero valido (ex: 150.00).");
                }
            }

            // ----- DATA -----
            short dia = 0, mes = 0;
            int   ano = 0;

            // Leitura do dia
            while (true) {
                System.out.print("Dia (1-31): ");
                try {
                    dia = Short.parseShort(scanner.nextLine().trim());
                    if (dia >= 1 && dia <= 31) break;
                    System.out.println("  [!] Dia invalido.");
                } catch (NumberFormatException e) {
                    System.out.println("  [!] Digite um numero inteiro.");
                }
            }

            // Leitura do mes
            while (true) {
                System.out.print("Mes (1-12): ");
                try {
                    mes = Short.parseShort(scanner.nextLine().trim());
                    if (mes >= 1 && mes <= 12) break;
                    System.out.println("  [!] Mes invalido.");
                } catch (NumberFormatException e) {
                    System.out.println("  [!] Digite um numero inteiro.");
                }
            }

            // Leitura do ano
            while (true) {
                System.out.print("Ano (ex: 2025): ");
                try {
                    ano = Integer.parseInt(scanner.nextLine().trim());
                    if (ano >= 2000 && ano <= 2100) break;
                    System.out.println("  [!] Ano fora do intervalo permitido.");
                } catch (NumberFormatException e) {
                    System.out.println("  [!] Digite um numero inteiro.");
                }
            }

            // ----- ADICIONAR NA LISTA -----
            controle.adicionarTransacao(tipo, descricao, valor, dia, mes, ano);
            System.out.println("  [OK] Lancamento registrado!\n");
        }

        // =====================================================
        // EXIBIR TODAS AS TRANSACOES
        // =====================================================

        controle.listarTransacoes();

        // =====================================================
        // EXIBIR RESUMO FINANCEIRO
        // =====================================================

        System.out.println("\n===== RESUMO FINANCEIRO =====");
        System.out.printf("Total de Receitas: R$ %.2f%n", controle.totalReceitas());
        System.out.printf("Total de Despesas: R$ %.2f%n", controle.totalDespesas());

        double saldo = controle.saldoFinal();

        // Estrutura if para exibir mensagem de acordo com o saldo
        if (saldo > 0) {
            System.out.printf("Saldo Final:       R$ %.2f [POSITIVO]%n", saldo);
        } else if (saldo < 0) {
            System.out.printf("Saldo Final:       R$ %.2f [NEGATIVO]%n", saldo);
        } else {
            System.out.printf("Saldo Final:       R$ %.2f [NEUTRO]%n", saldo);
        }

        System.out.println("=============================");

        // =====================================================
        // SALVAR EM ARQUIVO
        // =====================================================

        arquivoService.salvar(controle.getTransacoes(), caminhoArquivo);

        // =====================================================
        // LER O ARQUIVO E EXIBIR NO CONSOLE
        // =====================================================

        System.out.println("\n===== CONTEUDO DO ARQUIVO SALVO =====");

        String conteudoLido = arquivoService.ler(caminhoArquivo);

        // Estrutura if para verificar se a leitura foi bem-sucedida
        if (conteudoLido != null) {
            System.out.println(conteudoLido);
        } else {
            System.out.println("Nao foi possivel ler o arquivo.");
        }

        // =====================================================
        // ENCERRAMENTO
        // =====================================================

        scanner.close(); // Boa pratica: fechar o Scanner ao terminar
        System.out.println("Programa encerrado. Ate logo!");
    }
}