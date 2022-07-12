package br.ufscar.dc.compiladores.t2;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

public class T2 {
    public static void main(String args[]) throws IOException {
        try(PrintWriter pw = new PrintWriter(new File(args[1]))) { 
            CharStream cs = CharStreams.fromFileName(args[0]);
            t2SintLexer lexer = new t2SintLexer(cs);
            
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            t2SintParser parser = new t2SintParser(tokens);

            // Registrar o error lister personalizado aqui
            ErroCustomizado mcel = new ErroCustomizado(pw);
            parser.removeErrorListeners();
            parser.addErrorListener(mcel);

            parser.programa();
         
        } catch(RuntimeException e){}
    }
}