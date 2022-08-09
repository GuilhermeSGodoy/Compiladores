// Generated from br\u005Cufscar\dc\compiladores\t4\t4Gram.g4 by ANTLR 4.10.1
package br.ufscar.dc.compiladores.t4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link t4GramParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface t4GramVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link t4GramParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(t4GramParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link t4GramParser#declaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracoes(t4GramParser.DeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link t4GramParser#decl_local_global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_local_global(t4GramParser.Decl_local_globalContext ctx);
	/**
	 * Visit a parse tree produced by {@link t4GramParser#declaracao_local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_local(t4GramParser.Declaracao_localContext ctx);
	/**
	 * Visit a parse tree produced by {@link t4GramParser#variavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavel(t4GramParser.VariavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link t4GramParser#identificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificador(t4GramParser.IdentificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link t4GramParser#dimensao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensao(t4GramParser.DimensaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link t4GramParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(t4GramParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link t4GramParser#tipo_basico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_basico(t4GramParser.Tipo_basicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link t4GramParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_basico_ident(t4GramParser.Tipo_basico_identContext ctx);
	/**
	 * Visit a parse tree produced by {@link t4GramParser#tipo_estendido}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_estendido(t4GramParser.Tipo_estendidoContext ctx);
	/**
	 * Visit a parse tree produced by {@link t4GramParser#valor_constante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor_constante(t4GramParser.Valor_constanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link t4GramParser#registro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegistro(t4GramParser.RegistroContext ctx);
	/**
	 * Visit a parse tree produced by {@link t4GramParser#declaracao_global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_global(t4GramParser.Declaracao_globalContext ctx);
	/**
	 * Visit a parse tree produced by {@link t4GramParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(t4GramParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link t4GramParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(t4GramParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link t4GramParser#corpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpo(t4GramParser.CorpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link t4GramParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(t4GramParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link t4GramParser#cmdLeia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdLeia(t4GramParser.CmdLeiaContext ctx);
	/**
	 * Visit a parse tree produced by {@link t4GramParser#cmdEscreva}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdEscreva(t4GramParser.CmdEscrevaContext ctx);
	/**
	 * Visit a parse tree produced by {@link t4GramParser#cmdSe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdSe(t4GramParser.CmdSeContext ctx);
	/**
	 * Visit a parse tree produced by {@link t4GramParser#cmdCaso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdCaso(t4GramParser.CmdCasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link t4GramParser#cmdPara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdPara(t4GramParser.CmdParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link t4GramParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdEnquanto(t4GramParser.CmdEnquantoContext ctx);
	/**
	 * Visit a parse tree produced by {@link t4GramParser#cmdFaca}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdFaca(t4GramParser.CmdFacaContext ctx);
	/**
	 * Visit a parse tree produced by {@link t4GramParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdAtribuicao(t4GramParser.CmdAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link t4GramParser#cmdChamada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdChamada(t4GramParser.CmdChamadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link t4GramParser#cmdRetorne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdRetorne(t4GramParser.CmdRetorneContext ctx);
	/**
	 * Visit a parse tree produced by {@link t4GramParser#selecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelecao(t4GramParser.SelecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link t4GramParser#item_selecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem_selecao(t4GramParser.Item_selecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link t4GramParser#constantes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantes(t4GramParser.ConstantesContext ctx);
	/**
	 * Visit a parse tree produced by {@link t4GramParser#numero_intervalo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero_intervalo(t4GramParser.Numero_intervaloContext ctx);
	/**
	 * Visit a parse tree produced by {@link t4GramParser#op_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_unario(t4GramParser.Op_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link t4GramParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_aritmetica(t4GramParser.Exp_aritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link t4GramParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(t4GramParser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link t4GramParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(t4GramParser.FatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link t4GramParser#op1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp1(t4GramParser.Op1Context ctx);
	/**
	 * Visit a parse tree produced by {@link t4GramParser#op2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp2(t4GramParser.Op2Context ctx);
	/**
	 * Visit a parse tree produced by {@link t4GramParser#op3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp3(t4GramParser.Op3Context ctx);
	/**
	 * Visit a parse tree produced by {@link t4GramParser#parcela}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela(t4GramParser.ParcelaContext ctx);
	/**
	 * Visit a parse tree produced by {@link t4GramParser#parcela_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_unario(t4GramParser.Parcela_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link t4GramParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_nao_unario(t4GramParser.Parcela_nao_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link t4GramParser#exp_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_relacional(t4GramParser.Exp_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link t4GramParser#op_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_relacional(t4GramParser.Op_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link t4GramParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(t4GramParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link t4GramParser#termo_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo_logico(t4GramParser.Termo_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link t4GramParser#fator_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator_logico(t4GramParser.Fator_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link t4GramParser#parcela_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_logica(t4GramParser.Parcela_logicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link t4GramParser#op_logico_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_logico_1(t4GramParser.Op_logico_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link t4GramParser#op_logico_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_logico_2(t4GramParser.Op_logico_2Context ctx);
}