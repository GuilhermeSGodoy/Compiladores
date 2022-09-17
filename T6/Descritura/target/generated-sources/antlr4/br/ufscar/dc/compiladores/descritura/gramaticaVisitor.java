// Generated from br\u005Cufscar\dc\compiladores\descritura\gramatica.g4 by ANTLR 4.10.1
package br.ufscar.dc.compiladores.descritura;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(gramaticaParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#delim}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelim(gramaticaParser.DelimContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#estrutura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEstrutura(gramaticaParser.EstruturaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#arquetipos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArquetipos(gramaticaParser.ArquetiposContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#elementos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementos(gramaticaParser.ElementosContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#historia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHistoria(gramaticaParser.HistoriaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#nome}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNome(gramaticaParser.NomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#nomeAutor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNomeAutor(gramaticaParser.NomeAutorContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#sinopse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSinopse(gramaticaParser.SinopseContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#versaoRascunho}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVersaoRascunho(gramaticaParser.VersaoRascunhoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData(gramaticaParser.DataContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#declaracaoGlobal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracaoGlobal(gramaticaParser.DeclaracaoGlobalContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#personagem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPersonagem(gramaticaParser.PersonagemContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#arquetipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArquetipo(gramaticaParser.ArquetipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#capitulo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCapitulo(gramaticaParser.CapituloContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#elemento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElemento(gramaticaParser.ElementoContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#personagens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPersonagens(gramaticaParser.PersonagensContext ctx);
	/**
	 * Visit a parse tree produced by {@link gramaticaParser#personagemDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPersonagemDec(gramaticaParser.PersonagemDecContext ctx);
}