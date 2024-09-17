/**
 * Ache uma solução que testa todas as combinações possíveis e seleciona a melhor, aplicando divisão-e-conquista ou não;
 * Contabilize o número de iterações;
 * Implemente e teste sua solução, para o caso exposto em aula e outros de mesmo porte (;-)).
 *
 * N = número de produtos;
 * C = capacidade real da mochila
 * itens[N +1]; (O índice 0 guarda null)
 * maxTab[N+1][C+1];
 *
 * Inicialize com 0 toda a linha 0 e também a coluna 0;
 * para i = 1 até N
 *   para j = 1 até C
 *      se item itens[i].peso <= j // se o item cabe na mochila atual
 *          maxTab[i][j] = Max(maxTab[i-1][j],
 *                  itens[i].valor +
 *                       maxTab[i-1][j – itens[i].peso]);
 *      senão
 *          maxTab[i][j] = maxTab[i-1][j];
 * retorne maxTab[N][C] // valor máximo para uma mochila de capacidade C e //que pode conter itens que vão do item 1 até o item N.
 * */
public class Mochila {
    public static void main(String[] args) {
        int N = 4;
        int C = 7;

        int[] itens =  new int[N + 1];
        int[][] maxTab = new int[N + 1][C + 1];

        for (int i = 1; i<=N; i++) {
            for (int j = 1; j<=C; j++) {
                if (itens[i].)
            }
        }
    }
}
