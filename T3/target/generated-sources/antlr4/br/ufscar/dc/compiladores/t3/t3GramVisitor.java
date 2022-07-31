// Generated from br\u005Cufscar\dc\compiladores\t3\t3Gram.g4 by ANTLR 4.10.1
package br.ufscar.dc.compiladores.t3;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link t3GramParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface t3GramVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link t3GramParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(t3GramParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3GramParser#declaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracoes(t3GramParser.DeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3GramParser#decl_local_global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_local_global(t3GramParser.Decl_local_globalContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3GramParser#declaracao_local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_local(t3GramParser.Declaracao_localContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3GramParser#variavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavel(t3GramParser.VariavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3GramParser#identificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificador(t3GramParser.IdentificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3GramParser#dimensao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensao(t3GramParser.DimensaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3GramParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(t3GramParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3GramParser#tipo_basico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_basico(t3GramParser.Tipo_basicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3GramParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_basico_ident(t3GramParser.Tipo_basico_identContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3GramParser#tipo_estendido}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_estendido(t3GramParser.Tipo_estendidoContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3GramParser#valor_constante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor_constante(t3GramParser.Valor_constanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3GramParser#registro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegistro(t3GramParser.RegistroContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3GramParser#declaracao_global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_global(t3GramParser.Declaracao_globalContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3GramParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(t3GramParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3GramParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(t3GramParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3GramParser#corpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpo(t3GramParser.CorpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3GramParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(t3GramParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3GramParser#cmdLeia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdLeia(t3GramParser.CmdLeiaContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3GramParser#cmdEscreva}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdEscreva(t3GramParser.CmdEscrevaContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3GramParser#cmdSe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdSe(t3GramParser.CmdSeContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3GramParser#cmdCaso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdCaso(t3GramParser.CmdCasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3GramParser#cmdPara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdPara(t3GramParser.CmdParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3GramParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdEnquanto(t3GramParser.CmdEnquantoContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3GramParser#cmdFaca}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdFaca(t3GramParser.CmdFacaContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3GramParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdAtribuicao(t3GramParser.CmdAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3GramParser#cmdChamada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdChamada(t3GramParser.CmdChamadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3GramParser#cmdRetorne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdRetorne(t3GramParser.CmdRetorneContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3GramParser#selecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelecao(t3GramParser.SelecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3GramParser#item_selecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem_selecao(t3GramParser.Item_selecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3GramParser#constantes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantes(t3GramParser.ConstantesContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3GramParser#numero_intervalo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero_intervalo(t3GramParser.Numero_intervaloContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3GramParser#op_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_unario(t3GramParser.Op_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3GramParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_aritmetica(t3GramParser.Exp_aritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3GramParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(t3GramParser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3GramParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(t3GramParser.FatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3GramParser#op1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp1(t3GramParser.Op1Context ctx);
	/**
	 * Visit a parse tree produced by {@link t3GramParser#op2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp2(t3GramParser.Op2Context ctx);
	/**
	 * Visit a parse tree produced by {@link t3GramParser#op3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp3(t3GramParser.Op3Context ctx);
	/**
	 * Visit a parse tree produced by {@link t3GramParser#parcela}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela(t3GramParser.ParcelaContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3GramParser#parcela_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_unario(t3GramParser.Parcela_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3GramParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_nao_unario(t3GramParser.Parcela_nao_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3GramParser#exp_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_relacional(t3GramParser.Exp_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3GramParser#op_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_relacional(t3GramParser.Op_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3GramParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(t3GramParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3GramParser#termo_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo_logico(t3GramParser.Termo_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3GramParser#fator_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator_logico(t3GramParser.Fator_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3GramParser#parcela_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_logica(t3GramParser.Parcela_logicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link t3GramParser#op_logico_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_logico_1(t3GramParser.Op_logico_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link t3GramParser#op_logico_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_logico_2(t3GramParser.Op_logico_2Context ctx);
}