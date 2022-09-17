// Classe TabelaDeSimbolos, inspirada no código apresentado pelo
// professor em sala de aula.
package br.ufscar.dc.compiladores.descritura;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TabelaDeSimbolos {

    private final Map<String, EntradaTabelaDeSimbolos> tabela;
    
    public TabelaDeSimbolos() {
        this.tabela = new HashMap<>();
    }

    // Tipos possíveis de variáveis.
    public enum TipoDescritura {
        ARQUETIPO, // Definição de arquétipos de personagem (herói, antagonista...).
        ELEMENTO,  // Definição de um elemento da história (jornada, batalha...).
        PERSONAGEM, // Definição de personagens declarados.
        CAPITULO, // Definição dos capítulos da história.
        ESTRUTURA // Definição da estrutura declarada para a história.
    }

    // Inicialização da tabela.
    class EntradaTabelaDeSimbolos {
        String nome;
        TipoDescritura tipo;

        
        private EntradaTabelaDeSimbolos(String nome, TipoDescritura tipo) {
            this.nome = nome;
            this.tipo = tipo;
        }
    }
    
    // Verifica o tipo de um valor da tabela.
    public TipoDescritura verificar(String nome) {
        return tabela.get(nome).tipo;
    }

    // Adiciona um valor à tabela.
    public void adicionar(String nome, TipoDescritura tipo) {
        tabela.put(nome, new EntradaTabelaDeSimbolos(nome, tipo));
    }    

    // Verifica se um valor existe na tabela.
    public boolean existe(String nome) {
        return tabela.containsKey(nome);
    }
    
    // Retorna a quantidade de itens na tabela.
    public int tamanho() {
        int cont = 0;
        
        Iterator<String> itr = tabela.keySet().iterator();
        
        while (itr.hasNext()) {
            cont++;
            itr.next();
        }
        
        return cont;
    }
    
    // Retorna um item em uma determinada posição.
    public String elemento(int posicao) {
        int cont = -1;
        String aux = null;
        
        Iterator<String> itr = tabela.keySet().iterator();
        
        while (cont != posicao) {
            cont++;
            aux = itr.next();
        }
        
        return aux;
    }
}