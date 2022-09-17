package br.ufscar.dc.compiladores.descritura;

import org.antlr.v4.runtime.Token;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DescrituraUtils {
    // Lista que armazenará os erros semânticos identificados.
    public static List<String> errosSemanticos = new ArrayList<>();
    
    // Método que adiciona um erro semântico à lista, com a linha do erro
    // e uma mensagem personalizada.
    public static void adicionaErroSemantico(Token tok, String mensagem) {
        int linha = tok.getLine();
        
        // Flag usada para verificar se a mensagem atual já foi adicionada, como
        // no caso de houver uma repetição de três ou mais valores iguais na declaração
        // de elementos ou arquétipos, por exemplo.
        boolean repetida = false;
        Iterator itr = errosSemanticos.iterator();
        
        // Remoção de redundâncias.
        while (itr.hasNext()) {
            if (itr.next().toString().contains(mensagem)) {
                repetida = true;
            }
        }
        
        if (!repetida) {
            errosSemanticos.add(String.format("Linha %d: %s", linha, mensagem));
        }
    }

    // Método que adiciona um erro semântico sem o valor da linha à lista (usado
    // para apresentar mensagens especiais ao final da verificação).
    public static void adicionaErroSemLinha(String mensagem) {
        if (!errosSemanticos.contains(mensagem)) {
            errosSemanticos.add(String.format(mensagem));
        }
    }
            
    // Método auxiliar que remove as aspas de uma string.
    // Exemplo: com uma entrada "elemento", a saída é elemento.
    public static String removeAspas(String text) {
        return text.substring(1, text.length() - 1);
    }
    
    // Método auxiliar utilizado para verificar se os elementos utilizados na declaração
    // dos capítulos estão na mesma ordem da declaração inicial.
    public static boolean ordemElementos(List lista1, List lista2) {
        for (int i = 0; i < lista1.size(); i++) {
            if (!lista1.get(i).equals(lista2.get(i))) {
                return false;
            }
        }

        return true;
    }
    
    // Méotodo auxiliar utilizado para capitalizar títulos e nomes.
    public static String converteTitulo(String str) {
        
        // Converte a primeira letra para maiúscula.
        String ret = str.substring(0, 1).toUpperCase();
        
        // Percorre o restante da string.
        for (int i = 1; i < str.length(); i++) {
            // Caso encontre um espaço em branco, converte a primeira letra da
            // próxima palavra para maiúscula.
            if (str.substring(i, i+1).equals(" ")) {
                // Adiciona o espaço na string.
                ret = ret.concat(str.substring(i, i+1));
                i++; // Pula para a próxima posição.
                // Adiciona a primeira letra da próxima palavra convertida em maiúscula.
                ret = ret.concat(str.substring(i, i+1).toUpperCase());
            } else {
                // Converte as outras letras em minúsculas.
                ret = ret.concat(str.substring(i, i+1).toLowerCase());
            }
        }

        return ret;
    }
}
