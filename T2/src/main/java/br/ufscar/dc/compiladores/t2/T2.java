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
package br.ufscar.dc.compiladores.t2;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class T2 {
    
    public static void main(String args[]) throws IOException {
        
        // Abertura do arquivo para leitura e escrita.
        try(PrintWriter pw = new PrintWriter(new File(args[1]))) { 
            CharStream cs = CharStreams.fromFileName(args[0]);
            
            // Geração dos tokens que serão utilizados para as verificações.
            t2SintLexer lexer = new t2SintLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            
            // Início do processo de análise.
            t2SintParser parser = new t2SintParser(tokens);

            // Para este programa, foram definidoas mensagens de erros
            // personalizadas, mais detalhadas na classe ErroCustomizado.java.
            ErroCustomizado mcel = new ErroCustomizado(pw);
            parser.removeErrorListeners(); // Remove os erros pré-definidos.
            parser.addErrorListener(mcel); // Adiciona os erros customizados.

            // Analisa o programa de entrada.
            parser.programa();
         
        } catch(RuntimeException e){} // Exceção criada para evitar mensagens duplicadas.
    }
}