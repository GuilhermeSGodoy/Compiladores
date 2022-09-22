// Generated from br\u005Cufscar\dc\compiladores\descritura\gramatica.g4 by ANTLR 4.10.1
package br.ufscar.dc.compiladores.descritura;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gramaticaParser}.
 */
public interface gramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(gramaticaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(gramaticaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#delim}.
	 * @param ctx the parse tree
	 */
	void enterDelim(gramaticaParser.DelimContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#delim}.
	 * @param ctx the parse tree
	 */
	void exitDelim(gramaticaParser.DelimContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#estrutura}.
	 * @param ctx the parse tree
	 */
	void enterEstrutura(gramaticaParser.EstruturaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#estrutura}.
	 * @param ctx the parse tree
	 */
	void exitEstrutura(gramaticaParser.EstruturaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#nome}.
	 * @param ctx the parse tree
	 */
	void enterNome(gramaticaParser.NomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#nome}.
	 * @param ctx the parse tree
	 */
	void exitNome(gramaticaParser.NomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#arquetipos}.
	 * @param ctx the parse tree
	 */
	void enterArquetipos(gramaticaParser.ArquetiposContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#arquetipos}.
	 * @param ctx the parse tree
	 */
	void exitArquetipos(gramaticaParser.ArquetiposContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#elementos}.
	 * @param ctx the parse tree
	 */
	void enterElementos(gramaticaParser.ElementosContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#elementos}.
	 * @param ctx the parse tree
	 */
	void exitElementos(gramaticaParser.ElementosContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#historia}.
	 * @param ctx the parse tree
	 */
	void enterHistoria(gramaticaParser.HistoriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#historia}.
	 * @param ctx the parse tree
	 */
	void exitHistoria(gramaticaParser.HistoriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#nomeAutor}.
	 * @param ctx the parse tree
	 */
	void enterNomeAutor(gramaticaParser.NomeAutorContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#nomeAutor}.
	 * @param ctx the parse tree
	 */
	void exitNomeAutor(gramaticaParser.NomeAutorContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#sinopse}.
	 * @param ctx the parse tree
	 */
	void enterSinopse(gramaticaParser.SinopseContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#sinopse}.
	 * @param ctx the parse tree
	 */
	void exitSinopse(gramaticaParser.SinopseContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#versaoRascunho}.
	 * @param ctx the parse tree
	 */
	void enterVersaoRascunho(gramaticaParser.VersaoRascunhoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#versaoRascunho}.
	 * @param ctx the parse tree
	 */
	void exitVersaoRascunho(gramaticaParser.VersaoRascunhoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#data}.
	 * @param ctx the parse tree
	 */
	void enterData(gramaticaParser.DataContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#data}.
	 * @param ctx the parse tree
	 */
	void exitData(gramaticaParser.DataContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#declaracaoGlobal}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoGlobal(gramaticaParser.DeclaracaoGlobalContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#declaracaoGlobal}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoGlobal(gramaticaParser.DeclaracaoGlobalContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#personagem}.
	 * @param ctx the parse tree
	 */
	void enterPersonagem(gramaticaParser.PersonagemContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#personagem}.
	 * @param ctx the parse tree
	 */
	void exitPersonagem(gramaticaParser.PersonagemContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#arquetipo}.
	 * @param ctx the parse tree
	 */
	void enterArquetipo(gramaticaParser.ArquetipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#arquetipo}.
	 * @param ctx the parse tree
	 */
	void exitArquetipo(gramaticaParser.ArquetipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#capitulo}.
	 * @param ctx the parse tree
	 */
	void enterCapitulo(gramaticaParser.CapituloContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#capitulo}.
	 * @param ctx the parse tree
	 */
	void exitCapitulo(gramaticaParser.CapituloContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#elemento}.
	 * @param ctx the parse tree
	 */
	void enterElemento(gramaticaParser.ElementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#elemento}.
	 * @param ctx the parse tree
	 */
	void exitElemento(gramaticaParser.ElementoContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#personagens}.
	 * @param ctx the parse tree
	 */
	void enterPersonagens(gramaticaParser.PersonagensContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#personagens}.
	 * @param ctx the parse tree
	 */
	void exitPersonagens(gramaticaParser.PersonagensContext ctx);
	/**
	 * Enter a parse tree produced by {@link gramaticaParser#personagemDec}.
	 * @param ctx the parse tree
	 */
	void enterPersonagemDec(gramaticaParser.PersonagemDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link gramaticaParser#personagemDec}.
	 * @param ctx the parse tree
	 */
	void exitPersonagemDec(gramaticaParser.PersonagemDecContext ctx);
}