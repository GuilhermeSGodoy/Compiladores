/*
Aluno: Guilherme Santos de Godoy
RA: 758710
Curso: Ciência da Computação
Disciplina: Construção de Compiladores
Professor: Daniel Lucrédio

OBS: mais informações sobre a implementação e execução podem ser encontradas no arquivo de
descrição anexado no GitHub.
Repositório: https://github.com/GuilhermeSGodoy/Construcao-Compiladores/tree/main/T6
*/

package br.ufscar.dc.compiladores.descritura;

import br.ufscar.dc.compiladores.descritura.gramaticaParser.ProgramaContext;
import java.io.IOException;
import java.io.PrintWriter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Descritura {

    public static void main(String[] args) throws IOException {
        // Obtenção dos dados do arquivo de entrada.
        CharStream cs = CharStreams.fromFileName(args[0]);
        
        // Inicialização do analisador léxico.
        gramaticaLexer lexer = new gramaticaLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        // Inicialização do analisador sintático.
        gramaticaParser parser = new gramaticaParser(tokens);
        ProgramaContext arvore = parser.programa();
        DescrituraSemantico ds = new DescrituraSemantico();
        
        // Inicialização do programa
        ds.visitPrograma(arvore);
        
        // Caso hajam erros identificados, o programa gera um arquivo com estes erros
        // detalhados.
        if (!DescrituraUtils.errosSemanticos.isEmpty()) {
            try (PrintWriter pw = new PrintWriter(args[1])) {
                DescrituraUtils.errosSemanticos.forEach((s) -> pw.println(s));
            }
            
            // Também é gerada a página html. Dependendo dos erros identificados,
            // algumas informações podem ficar erradas também no html, então também é
            // exibida uma mensagem ao usuário informando a necessidade de verificar o
            // arquivo de erros.
            GeradorHTML gera = new GeradorHTML();
            gera.visitPrograma(arvore);
            try (PrintWriter pw = new PrintWriter(args[2])) {
                pw.print(gera.saida.toString());
            }
            
        // Caso não haja erros, o programa cria um arquivo informando que não foram
        // identificados erros e o html é gerado normalmente.
        } else {
            try (PrintWriter pw = new PrintWriter(args[1])) {
                pw.println("Não foram identificados erros.");
            }
            
            GeradorHTML gera = new GeradorHTML();
            gera.visitPrograma(arvore);
            try (PrintWriter pw = new PrintWriter(args[2])) {
                pw.print(gera.saida.toString());
            }
        }
    }
}
