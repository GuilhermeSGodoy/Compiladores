/*
Aluno: Guilherme Santos de Godoy
RA: 758710
Curso: Ciência da Computação
Disciplina: Construção de Compiladores
Professor: Daniel Lucrédio

OBS: mais informações sobre a gramática podem ser encontradas no arquivo de
descrição anexado.
*/

// Pacotes e importações básicas para o funcionamento do programa.
package br.ufscar.dc.compiladores.t1;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

public class Principal {

    public static void main(String[] args) throws IOException {

        // Processo de abertura de arquivos para leitura e escrita.
        try ( PrintWriter pw = new PrintWriter(new FileWriter(args[1]))) {
            try {
                CharStream cs = CharStreams.fromFileName(args[0]);
                
                // Geração dos tokens que serão utilizados para as verificações.
                t1Lex lex = new t1Lex(cs);
                Token t = null;
                
                // Loop que verificará todas as instâncias dos casos de teste,
                // de modo que verifique individualmente cada token que será
                // gerado, possibilitando sua posterior classificação e exeibição.
                while ((t = lex.nextToken()).getType() != Token.EOF) {
                    
                    // Para alguns dos padrões apresentados na gramática, é esperado
                    // que sejam exibidos os próprios símbolos/palavras-chave. Deste
                    // modo, esta condição seleciona tais padrões para que a exibição
                    // ocorra da forma desejada.
                    if (t.getType() == 1 || t.getType() == 4 || t.getType() == 5 || t.getType() == 6 || t.getType() == 11) {
                        pw.println("<'" + t.getText() + "','" + t.getText() + "'>");
                    // Caso não seja necessário uma exibição especial, o programa
                    // exibe o lexema seguido por sua classe.
                    } else {
                        pw.println("<'" + t.getText() + "'," + t1Lex.VOCABULARY.getDisplayName(t.getType()) + ">");
                    }

                }

            // Em caso de erros, o programa exibe mensagens personalizadas para o 
            // tipo de erro ocorrido e interrompe sua execução.
            } catch (Exception ex) {
                pw.println(ex.getMessage());
            }
        }
    }
}

