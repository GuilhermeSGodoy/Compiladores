/*
Aluno: Guilherme Santos de Godoy
RA: 758710
Curso: Ciência da Computação
Disciplina: Construção de Compiladores
Professor: Daniel Lucrédio

OBS: mais informações sobre a gramática e execução podem ser encontradas no arquivo de
descrição anexado no GitHub.
Repositório: https://github.com/GuilhermeSGodoy/Construcao-Compiladores/tree/main/T3
*/

package br.ufscar.dc.compiladores.t3;

// Importações básicas para o funcionamento do programa.
import br.ufscar.dc.compiladores.t3.t3GramParser.ProgramaContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class T3 {

    public static void main(String args[]) throws IOException {

        // Inicialização da leitura e escrita em arquivo.
        try (PrintWriter pw = new PrintWriter(new FileWriter(args[1]))) {
            try {
                CharStream cs = CharStreams.fromFileName(args[0]);
                
                // Inicialização do analisador léxico.
                t3GramLexer lexer = new t3GramLexer(cs);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                
                // Inicialização do analisador sintático.
                t3GramParser parser = new t3GramParser(tokens);
                ProgramaContext arvore = parser.programa();
                T3Semantico t3s = new T3Semantico();
                
                // Inicialização do programa.
                t3s.visitPrograma(arvore);
                
                // Verifica a existência de erros, imprime todos os que foram identificados
                // e encerra a execução do analisador.
                T3SemanticoUtils.errosSemanticos.forEach((s) -> pw.println(s));
                pw.println("Fim da compilacao");
                pw.close();                
            } catch (RuntimeException e) {
            }
        }
    }
}
