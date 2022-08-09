/*
Aluno: Guilherme Santos de Godoy
RA: 758710
Curso: Ciência da Computação
Disciplina: Construção de Compiladores
Professor: Daniel Lucrédio

OBS: mais informações sobre a gramática e execução podem ser encontradas no arquivo de
descrição anexado no GitHub.
Repositório: https://github.com/GuilhermeSGodoy/Construcao-Compiladores/tree/main/T4
*/

package br.ufscar.dc.compiladores.t4;

// Importações básicas para o funcionamento do programa.
import br.ufscar.dc.compiladores.t4.t4GramParser.ProgramaContext;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class T4 {

    public static void main(String args[]) throws IOException {

        // Inicialização da leitura e escrita em arquivo.
        try (PrintWriter pw = new PrintWriter(new FileWriter(args[1]))) {
            try {
                CharStream cs = CharStreams.fromFileName(args[0]);
                
                // Inicialização do analisador léxico.
                t4GramLexer lexer = new t4GramLexer(cs);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                
                // Inicialização do analisador sintático.
                t4GramParser parser = new t4GramParser(tokens);
                ProgramaContext arvore = parser.programa();
                T4Semantico t4s = new T4Semantico();
                
                // Inicialização do programa.
                t4s.visitPrograma(arvore);
                
                // Verifica a existência de erros, imprime todos os que foram identificados
                // e encerra a execução do analisador.
                T4SemanticoUtils.errosSemanticos.forEach((s) -> pw.println(s));
                pw.println("Fim da compilacao");
                pw.close();                
            } catch (RuntimeException e) {
            }
        }
    }
}
