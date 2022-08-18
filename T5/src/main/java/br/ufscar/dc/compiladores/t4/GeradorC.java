package br.ufscar.dc.compiladores.t4;

//import br.ufscar.dc.compiladores.t4.TabelaDeSimbolos.TipoT4;
//import br.ufscar.dc.compiladores.t4.TabelaDeSimbolos.TipoEntrada;
import static br.ufscar.dc.compiladores.t4.T4SemanticoUtils.verificarTipo;
import static br.ufscar.dc.compiladores.t4.T4Semantico.escoposAninhados;
import static br.ufscar.dc.compiladores.t4.T4SemanticoUtils.adicionaErroSemantico;
import static br.ufscar.dc.compiladores.t4.T4SemanticoUtils.verificaCompatibilidade;
import static br.ufscar.dc.compiladores.t4.T4SemanticoUtils.confereTipo;
import br.ufscar.dc.compiladores.t4.TabelaDeSimbolos.TipoEntrada;
import br.ufscar.dc.compiladores.t4.TabelaDeSimbolos.TipoT4;
import java.util.HashMap;

public class GeradorC extends t4GramBaseVisitor<Void> {

    //StringBuilder saida;
    //TabelaDeSimbolos tabela;
    
    //saida = new StringBuilder();
    //this.tabela = new TabelaDeSimbolos();

    //public Void T5GeradorC() {
    /*
    public Void T5GeradorC() {
        saida = new StringBuilder();
        this.tabela = new TabelaDeSimbolos();
        return null;
    }*/
    
    
    // funções auxiliares, explica depois
    public String converteTipo(TipoT4 tipoAuxT4) {
        
        String tipoRetorno = null;
        
        if (tipoAuxT4 != null) { 
            switch (tipoAuxT4) {
                case INTEIRO:
                    tipoRetorno = "int";
                    break; 
                case LITERAL:
                    tipoRetorno = "char";
                    break; 
                case REAL:
                    tipoRetorno = "float";
                    break; 
                default:
                    break;
            }
        }
        
        
        return tipoRetorno;
    }

    // retorna TipoT4 dada uma string
    public TipoT4 converteTipoT4(String tipo) {

        TipoT4 tipoRetorno = TipoT4.INVALIDO;

        switch (tipo) {
            case "literal":
                tipoRetorno = TipoT4.LITERAL;
                break;
            case "inteiro":
                tipoRetorno = TipoT4.INTEIRO;
                break;
            case "real":
                tipoRetorno = TipoT4.REAL;
                break;
            case "logico":
                tipoRetorno = TipoT4.LOGICO;
                break;
            default:
                break;
        }

        return tipoRetorno;
    }

    public String verificaTipoC(String tipo) {
        
        String tipoRetorno = null;
        
        switch (tipo) {
            case "inteiro":
                tipoRetorno = "int";
                break; 
            case "literal":
                tipoRetorno = "char";
                break; 
            case "real":
                tipoRetorno = "float";
                break; 
            default:
                break;
        }
        
        return tipoRetorno;
    }

    public String verificaParamTipo(String tipo) {
        
        String tipoRetorno = null;
        
        switch (tipo) {
            case "int":
                tipoRetorno = "d";
                break; 
            case "float":
                tipoRetorno = "f";
                break; 
            case "char":
                tipoRetorno = "s";
                break; 
            default:
                break;
        }

        return tipoRetorno;
    }

    public String verificaParamTipoT4(TipoT4 tipoAuxT4) {
        
        String tipoRetorno = null;
        
        if (tipoAuxT4 != null) {
            switch (tipoAuxT4) {
                case INTEIRO:
                    tipoRetorno = "d";
                    break;
                case REAL:
                    tipoRetorno = "f";
                    break;
                case LITERAL:
                    tipoRetorno = "s";
                    break;
                default:
                    break;
            }
        }
        
        return tipoRetorno;
    }
    
    public boolean verificaTipoEstendido(TabelaDeSimbolos tabela, String tipoEstendido){
        if(!tabela.existe(tipoEstendido))
            return false;
        return true;
    }
    
    public String getLimitesCaso(String str, boolean ehEsquerda) {
                
        String strAux;

        if (str.contains(".")) {

            String strOriginal = str; // talvez dê pra tirar isso aqui e deixar só a str
            int cont = 0;
            boolean continua = true;
            
            while (continua) {
                strAux = strOriginal.substring(cont);

                if (strAux.startsWith("."))
                    continua = false;
                else
                    cont++;
            }

            if (ehEsquerda) {
                strAux = strOriginal.substring(0, cont);
            } else {
                strAux = strOriginal.substring(cont + 2);
            }
        
        } else {
            strAux = str;
        }
        
        return strAux;
    }
    
    StringBuilder saida  = new StringBuilder();
    TabelaDeSimbolos tabela  = new TabelaDeSimbolos();
    Escopos escopos = new Escopos();
    static Escopos escoposAninhados = new Escopos();

    @Override
    public Void visitPrograma(t4GramParser.ProgramaContext ctx) {
        
        saida.append("#include <stdio.h>\n");
        
        saida.append("#include <stdlib.h>\n");
        saida.append("#include <string.h>\n"); // precisa dessa?
        saida.append("\n");

        visitDeclaracoes(ctx.declaracoes());

        saida.append("\n");
        saida.append("int main() {\n");
        

        visitCorpo(ctx.corpo());
        //visitCmd(ctx.corpo().cmd(0));

        saida.append("\nreturn 0;\n");
        saida.append("}\n");

        return null;
    }
    
    /*
    @Override
    public Void visitDeclaracoes(t4GramParser.DeclaracoesContext ctx){

        for(t4GramParser.Decl_local_globalContext c : ctx.decl_local_global()){
            visitDecl_local_global(c);
        }
        
        return null;
    }*/
    
    /*
    @Override
    public Void visitDecl_local_global(t4GramParser.Decl_local_globalContext ctx){
      
        if(ctx.declaracao_global()!=null){
            visitDeclaracao_global(ctx.declaracao_global());
        }else{
            visitDeclaracao_local(ctx.declaracao_local());
        }
        return null;
    }*/
    
    @Override
    public Void visitDeclaracao_local(t4GramParser.Declaracao_localContext ctx) {
        
        String str;

        // constante
        if (ctx.valor_constante() != null) {
            str = "#define " + ctx.IDENT().getText() + " " + ctx.valor_constante().getText() + "\n";
            saida.append(str);
        } // registro
        else if (ctx.tipo() != null) {
                       
            TabelaDeSimbolos escopoAtual = escopos.obterEscopoAtual();
            escopos.criarNovoEscopo();

            saida.append("typedef struct {\n");
            super.visitRegistro(ctx.tipo().registro());
            // será que dá pra tirar isso?
            TabelaDeSimbolos escopoRegistro = escopos.obterEscopoAtual();
            escopos.abandonarEscopo();
            
            escopoAtual.adicionar(ctx.IDENT().getText(), TipoT4.REGISTRO, TipoEntrada.VARIAVEL);
            
            str = "} " + ctx.IDENT().getText() + ";\n";
            saida.append(str);
        } else if (ctx.variavel() != null) {
            visitVariavel(ctx.variavel());
        }

        return null;
    }
    
    @Override
    public Void visitVariavel(t4GramParser.VariavelContext ctx) {

        TabelaDeSimbolos escopoAtual = escopos.obterEscopoAtual();
        TabelaDeSimbolos escopoRegistro; // ainda precisa disso?
        boolean tipoEstendido = false;
        String str;

        // tipos normais
        if (ctx.tipo().tipo_estendido() != null) {

            String nomeVar;
            String tipoVariavel = ctx.tipo().getText();
            TipoT4 tipoAuxT4 = TipoT4.INVALIDO; // acho que dá pra mudar isso
            boolean ponteiro = false;

            if (tipoVariavel.contains("^")) { // ponteiro
                ponteiro = true;
                tipoVariavel = tipoVariavel.substring(1); // remove caractere de ponteiro
            }

            if (verificaTipoEstendido(escopoAtual, tipoVariavel)) {
                tipoEstendido = true;
                tipoAuxT4 = TipoT4.TIPOESTENDIDO;

            } else {
                tipoAuxT4 = converteTipoT4(tipoVariavel);
                tipoVariavel = converteTipo(tipoAuxT4);
            }

            if (ponteiro == true) {
                tipoVariavel += "*";
            }

            for (t4GramParser.IdentificadorContext ictx : ctx.identificador()) {
                nomeVar = ictx.getText();

                if (tipoEstendido) {
                    escopoRegistro = escoposAninhados.obterEscopoAtual();
                    escopoAtual.adicionar(nomeVar, TipoT4.REGISTRO, TipoEntrada.VARIAVEL);
                } else {
                    escopoAtual.adicionar(nomeVar, tipoAuxT4, TipoEntrada.VARIAVEL);
                }

                if (tipoAuxT4 == TipoT4.LITERAL) {
                    str = tipoVariavel + " " + nomeVar + "[80];\n";
                    saida.append(str);
                } else {
                    str = tipoVariavel + " " + nomeVar + ";\n";
                    saida.append(str);
                }

            }
        // registro
        } else {
            // escopo para as variáveis do registro
            escopos.criarNovoEscopo();
            escopoRegistro = escopos.obterEscopoAtual();

            saida.append("struct{\n");
            for (t4GramParser.VariavelContext vctx : ctx.tipo().registro().variavel()) {
                visitVariavel(vctx);
            }
            str = "}" + ctx.identificador(0).getText() + ";\n";
            saida.append(str);
            
            escopos.abandonarEscopo();
            escopoAtual.adicionar(ctx.identificador(0).getText(), TipoT4.REGISTRO, null);

        }

        return null;
    }
    
    @Override
    public Void visitDeclaracao_global(t4GramParser.Declaracao_globalContext ctx) {

        String str;
        
        TabelaDeSimbolos escopoAtual = escopos.obterEscopoAtual();
        escopos.criarNovoEscopo();
        TabelaDeSimbolos escopoParametros = escopos.obterEscopoAtual();
        String tipo, nomeVariaveis;

        if (ctx.tipo_estendido() != null) {
            saida.append(verificaTipoC(ctx.tipo_estendido().getText()));
        } else {
            saida.append("void");
        }

        str = " " + ctx.IDENT().getText() + "(";
        saida.append(str);

        if (ctx.parametros() != null) {
            for (t4GramParser.ParametroContext pctx : ctx.parametros().parametro()) {
                tipo = verificaTipoC(pctx.tipo_estendido().getText());
                nomeVariaveis = "";
                for (t4GramParser.IdentificadorContext ictx : pctx.identificador()) {
                    nomeVariaveis += ictx.getText();
                    escopoParametros.adicionar(ictx.getText(), converteTipoT4(pctx.tipo_estendido().getText()), TipoEntrada.VARIAVEL);
                }
                if (tipo.equals("char")) {
                    tipo = "char*";
                }
                str = tipo + " " + nomeVariaveis;
                saida.append(str);
            }
        }

        saida.append(") {\n");

        if (ctx.tipo_estendido() != null) { // função
            escopoAtual.adicionar(ctx.IDENT().getText(), converteTipoT4(ctx.tipo_estendido().getText()), TipoEntrada.FUNCAO);
        }
        else { // procedimento
            escopoAtual.adicionar(ctx.IDENT().getText(), TipoT4.VOID, TipoEntrada.PROCEDIMENTO);
        }

        for (t4GramParser.CmdContext cctx : ctx.cmd()) {
            visitCmd(cctx);
        }

        saida.append("}\n");
        escopos.abandonarEscopo();
        
        return null;
       
    }
    
    @Override
    public Void visitParcela_nao_unario(t4GramParser.Parcela_nao_unarioContext ctx) {

        if (ctx.identificador() != null) {
            saida.append(ctx.identificador().getText());
        }

        super.visitParcela_nao_unario(ctx);

        return null;
    }
    
    @Override
    public Void visitParcela_unario(t4GramParser.Parcela_unarioContext ctx) {

        if (!ctx.expressao().get(0).getText().contains("(")) {
            saida.append(ctx.getText());
        } else {
            saida.append("(");
            super.visitParcela_unario(ctx);
            saida.append(")");
        }
        return null;
    }
    
    @Override
    public Void visitOp_relacional(t4GramParser.Op_relacionalContext ctx) {

        String texto = ctx.getText();

        if (ctx.getText().contains("=")) { // talvez dê pra melhorar isso, mas por enquanto tá ok
            if (!ctx.getText().contains("<=") || !ctx.getText().contains(">="))
                texto = "==";
        }

        saida.append(texto);

        super.visitOp_relacional(ctx);

        return null;
    }
    
    @Override
    public Void visitCmdRetorne(t4GramParser.CmdRetorneContext ctx) {

        saida.append("return ");
        super.visitExpressao(ctx.expressao());
        saida.append(";\n");

        return null;
    }
    
    @Override
    public Void visitCmdAtribuicao(t4GramParser.CmdAtribuicaoContext ctx) {

        String str;

        if (ctx.getText().contains("^")) {
            str = "*" + ctx.identificador().getText() + " = " + ctx.expressao().getText() + ";\n";
            saida.append(str);
        }
        else if (ctx.identificador().getText().contains(".") && verificarTipo(tabela, ctx.identificador()) == TipoT4.LITERAL) {
            str = "strcpy(" + ctx.identificador().getText() + "," + ctx.expressao().getText() + ");\n";
            saida.append(str);
        } else {
            str = ctx.identificador().getText() + " = " + ctx.expressao().getText() + ";\n";
            saida.append(str);
        }

        return null;
    }
    
    @Override
    public Void visitExpressao(t4GramParser.ExpressaoContext ctx) {
        visitTermo_logico(ctx.termo_logico(0));
        
        for(t4GramParser.Termo_logicoContext termoLogico : ctx.termo_logico()) {
            saida.append(" || ");
            visitTermo_logico(termoLogico);
        }
        
        return null;
    }
    
    @Override 
    public Void visitTermo_logico(t4GramParser.Termo_logicoContext ctx){
        visitFator_logico(ctx.fator_logico(0));
        
        for(t4GramParser.Fator_logicoContext fatorLogico : ctx.fator_logico()) {
            saida.append(" && ");
            visitFator_logico(fatorLogico);
        }
        
        return null;
    }
    
    @Override
    public Void visitFator_logico(t4GramParser.Fator_logicoContext ctx) {
        
        if(ctx.getText().contains("nao")) {
            saida.append("!");
        }
        
        visitParcela_logica(ctx.parcela_logica());
        
        return null;
    }
    
    @Override
    public Void visitOp2(t4GramParser.Op2Context ctx) {

        saida.append(ctx.getText());

        super.visitOp2(ctx);

        return null;
    }
    
    @Override
    public Void visitParcela_logica(t4GramParser.Parcela_logicaContext ctx) {
        
        if(ctx.getText().contains("falso")) {
            saida.append("false");
        } else if(ctx.getText().contains("verdadeiro")) {
            saida.append("true");
        } else {
            visitExp_relacional(ctx.exp_relacional());
        }
        
        return null;
    }
    
    @Override
    public Void visitExp_relacional(t4GramParser.Exp_relacionalContext ctx) {
        
        String arit1 = ctx.exp_aritmetica().get(0).getText();
        saida.append(arit1);
        
        if(ctx.op_relacional()!= null) {
            switch(ctx.op_relacional().getText()) {
                case "=" :
                    saida.append("==");
                    break;
                case "<>":
                    saida.append("!=");
                    break;
                default:
                    saida.append(ctx.op_relacional().getText());
                    break;
            }
            
        }
        
        saida.append(ctx.exp_aritmetica(1).getText());

        return null;
    }
    
    @Override
    public Void visitCmdSe(t4GramParser.CmdSeContext ctx) {

        String str;

        String textoExpressao;
        textoExpressao = ctx.expressao().getText().replace("e", "&&");
        textoExpressao = textoExpressao.replace("=", "==");

        str = "if (" + textoExpressao + "){\n";
        saida.append(str);

        for (t4GramParser.CmdContext cctx : ctx.cmdEntao) {
            super.visitCmd(cctx);
        }
        saida.append("}\n");

        if (ctx.getText().contains("senao")) {
            
            saida.append("else{\n");
            
            for (t4GramParser.CmdContext cctx : ctx.cmdSenao) {
                super.visitCmd(cctx);
            }
            saida.append("}\n");
        }

        return null;
    }
    
    @Override
    public Void visitCmdLeia(t4GramParser.CmdLeiaContext ctx) {

        TabelaDeSimbolos escopoAtual = escopos.obterEscopoAtual();
        String nomeVar;
        TipoT4 tipoAuxT4;
        String codigoTipo;
        String str;

        for (t4GramParser.IdentificadorContext ictx : ctx.identificador()) {
            nomeVar = ictx.getText();
            tipoAuxT4 = escopoAtual.verificar(nomeVar);
            codigoTipo = verificaParamTipoT4(tipoAuxT4);
            
            if (tipoAuxT4 == TipoT4.LITERAL) {
                str = "gets(" + nomeVar + ");\n";
                saida.append(str);
            } else {
                str = "scanf(\"%" + codigoTipo + "\",&" + nomeVar + ");\n";
                saida.append(str);
            }
        }

        return null;
    }

    @Override
    public Void visitCmdEnquanto(t4GramParser.CmdEnquantoContext ctx) {

        saida.append("while(");
        super.visitExpressao(ctx.expressao());
        saida.append("){\n");
        
        for (t4GramParser.CmdContext cctx : ctx.cmd()) {
            super.visitCmd(cctx);
        }
        saida.append("}\n");

        return null;
    }
    
    @Override
    public Void visitCmdPara(t4GramParser.CmdParaContext ctx) {

        String str;
        
        String nomeVariavel, limitanteEsquerda, limitanteDireita;

        nomeVariavel = ctx.IDENT().getText();
        limitanteEsquerda = ctx.exp_aritmetica(0).getText();
        limitanteDireita = ctx.exp_aritmetica(1).getText();

        str = "for(" + nomeVariavel + " = " + limitanteEsquerda + "; " + nomeVariavel + " <= " + limitanteDireita + "; " + nomeVariavel + "++){\n";
        saida.append(str);

        for (t4GramParser.CmdContext cctx : ctx.cmd()) {
            visitCmd(cctx);
        }

        saida.append("}\n");

        return null;
    }
    
    @Override
    public Void visitCmdFaca(t4GramParser.CmdFacaContext ctx) {

        saida.append("do{\n");

        for (t4GramParser.CmdContext cctx : ctx.cmd()) {
            super.visitCmd(cctx);
        }

        saida.append("}while(");

        super.visitExpressao(ctx.expressao());
        saida.append(");\n");

        return null;
    }
    
    
    @Override
    public Void visitCmdEscreva(t4GramParser.CmdEscrevaContext ctx) {

        TipoT4 tipoAuxT4Exp = verificarTipo(tabela, ctx.expressao(0));
        String codTipoExp;
        String nomeVariaveis = "";


        for (t4GramParser.ExpressaoContext ectx : ctx.expressao()) {

            String str;

            saida.append("printf(\"");

            if (ectx.getText().contains("\"")) {
                str = ectx.getText().replace("\"", "") + "\");\n";
                saida.append(str);
            } else {
                tipoAuxT4Exp = verificarTipo(tabela, ectx);
                
                if (tipoAuxT4Exp == TipoT4.LITERAL) {
                    str = "%s" + "\", " + ectx.getText() + ");\n";
                    saida.append(str);
                } 
                else {
                    codTipoExp = verificaParamTipoT4(tipoAuxT4Exp);
                    str = "%" + codTipoExp + "\", " + ectx.getText() + ");\n";
                    saida.append(str);
                }
            }

        }

        return null;
    }
    
    @Override
    public Void visitCmdCaso(t4GramParser.CmdCasoContext ctx) {

        String str;
        String limitanteEsquerda, limitanteDireita;

        str = "switch (" + ctx.exp_aritmetica().getText() + "){\n";
        saida.append(str);

        for (t4GramParser.Item_selecaoContext sctx : ctx.selecao().item_selecao()) {

            String strOriginal = sctx.constantes().numero_intervalo(0).getText();
            
            if (strOriginal.contains(".")) {
                limitanteEsquerda = getLimitesCaso(strOriginal, true);
                limitanteDireita = getLimitesCaso(strOriginal, false);
            } else {
                limitanteEsquerda = getLimitesCaso(strOriginal, true);
                limitanteDireita = getLimitesCaso(strOriginal, true);
            }
            
            

            if (!sctx.constantes().isEmpty()) {
                
                for (int i = Integer.parseInt(limitanteEsquerda); i <= Integer.parseInt(limitanteDireita); i++) {
                    str = "case " + Integer.toString(i) + ":\n";

                    saida.append(str);
                }
            } else {
                
                str = "case " + limitanteEsquerda + ":\n";
                saida.append(str);
            }
            for (t4GramParser.CmdContext cctx : sctx.cmd()) {
                visitCmd(cctx);
            }
            saida.append("break;\n");
        }

        saida.append("default:\n");
        for (t4GramParser.CmdContext cctx : ctx.cmd()) {
            visitCmd(cctx);
        }
        saida.append("}\n");

        return null;
    }
    
    @Override
    public Void visitCmdChamada(t4GramParser.CmdChamadaContext ctx) {

        String str;

        str = ctx.IDENT().getText() + "(";
        saida.append(str);

        int count = 0;

        for (t4GramParser.ExpressaoContext ectx : ctx.expressao()) {
            if (count >= 1) { 
                saida.append(", ");
            }
            saida.append(ectx.getText());
            count += 1;
        }

        saida.append(");\n");

        return null;
    }

}