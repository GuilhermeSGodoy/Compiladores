package br.ufscar.dc.compiladores.t2;

import java.io.PrintWriter;
import java.util.BitSet;
import org.antlr.v4.runtime.ANTLRErrorListener; // cuidado para importar a versão 4
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token; // Vamos também precisar de Token
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
// Outros imports vão ser necessários aqui. O NetBeans ou IntelliJ fazem isso automaticamente

public class ErroCustomizado implements ANTLRErrorListener {
    
    PrintWriter pw;
    public ErroCustomizado(PrintWriter pw) {
        this.pw = pw;    
    }
    
    @Override
    public void	reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs) {
        // Não será necessário para o T2, pode deixar vazio
    }
    
    @Override
    public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex, BitSet conflictingAlts, ATNConfigSet configs) {
        // Não será necessário para o T2, pode deixar vazio
    }

    @Override
    public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction, ATNConfigSet configs) {
        // Não será necessário para o T2, pode deixar vazio
    }

    @Override
    public void	syntaxError(Recognizer<?,?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        // Aqui vamos colocar o tratamento de erro customizado

        Token t = (Token) offendingSymbol;
        
        switch (t.getType()) {
            case -1:
                pw.println("Linha " + line + ": erro sintatico proximo a EOF");
                break;
            case 66:
                pw.println("Linha " + line + ": cadeia literal nao fechada");
                break;
            case 67:
                pw.println("Linha " + line + ": comentario nao fechado");
                break;
            case 68:
                pw.println("Linha " + line + ": " + t.getText() + " - simbolo nao identificado");
                break;
            default:
                pw.println("Linha " + line + ": erro sintatico proximo a " + t.getText());
                break;
        }  
        pw.println("Fim da compilacao");
        
        throw new RuntimeException();
    }
}