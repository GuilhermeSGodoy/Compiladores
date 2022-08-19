// Generated from br\u005Cufscar\dc\compiladores\t5\t5Gram.g4 by ANTLR 4.10.1
package br.ufscar.dc.compiladores.t5;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link t5GramParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface t5GramVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link t5GramParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(t5GramParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link t5GramParser#declaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracoes(t5GramParser.DeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link t5GramParser#decl_local_global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_local_global(t5GramParser.Decl_local_globalContext ctx);
	/**
	 * Visit a parse tree produced by {@link t5GramParser#declaracao_local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_local(t5GramParser.Declaracao_localContext ctx);
	/**
	 * Visit a parse tree produced by {@link t5GramParser#variavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavel(t5GramParser.VariavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link t5GramParser#identificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificador(t5GramParser.IdentificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link t5GramParser#dimensao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensao(t5GramParser.DimensaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link t5GramParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(t5GramParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link t5GramParser#tipo_basico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_basico(t5GramParser.Tipo_basicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link t5GramParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_basico_ident(t5GramParser.Tipo_basico_identContext ctx);
	/**
	 * Visit a parse tree produced by {@link t5GramParser#tipo_estendido}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_estendido(t5GramParser.Tipo_estendidoContext ctx);
	/**
	 * Visit a parse tree produced by {@link t5GramParser#valor_constante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor_constante(t5GramParser.Valor_constanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link t5GramParser#registro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegistro(t5GramParser.RegistroContext ctx);
	/**
	 * Visit a parse tree produced by {@link t5GramParser#declaracao_global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_global(t5GramParser.Declaracao_globalContext ctx);
	/**
	 * Visit a parse tree produced by {@link t5GramParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(t5GramParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link t5GramParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(t5GramParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link t5GramParser#corpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpo(t5GramParser.CorpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link t5GramParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(t5GramParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link t5GramParser#cmdLeia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdLeia(t5GramParser.CmdLeiaContext ctx);
	/**
	 * Visit a parse tree produced by {@link t5GramParser#cmdEscreva}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdEscreva(t5GramParser.CmdEscrevaContext ctx);
	/**
	 * Visit a parse tree produced by {@link t5GramParser#cmdSe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdSe(t5GramParser.CmdSeContext ctx);
	/**
	 * Visit a parse tree produced by {@link t5GramParser#cmdCaso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdCaso(t5GramParser.CmdCasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link t5GramParser#cmdPara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdPara(t5GramParser.CmdParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link t5GramParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdEnquanto(t5GramParser.CmdEnquantoContext ctx);
	/**
	 * Visit a parse tree produced by {@link t5GramParser#cmdFaca}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdFaca(t5GramParser.CmdFacaContext ctx);
	/**
	 * Visit a parse tree produced by {@link t5GramParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdAtribuicao(t5GramParser.CmdAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link t5GramParser#cmdChamada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdChamada(t5GramParser.CmdChamadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link t5GramParser#cmdRetorne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdRetorne(t5GramParser.CmdRetorneContext ctx);
	/**
	 * Visit a parse tree produced by {@link t5GramParser#selecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelecao(t5GramParser.SelecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link t5GramParser#item_selecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem_selecao(t5GramParser.Item_selecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link t5GramParser#constantes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantes(t5GramParser.ConstantesContext ctx);
	/**
	 * Visit a parse tree produced by {@link t5GramParser#numero_intervalo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero_intervalo(t5GramParser.Numero_intervaloContext ctx);
	/**
	 * Visit a parse tree produced by {@link t5GramParser#op_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_unario(t5GramParser.Op_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link t5GramParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_aritmetica(t5GramParser.Exp_aritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link t5GramParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(t5GramParser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link t5GramParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(t5GramParser.FatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link t5GramParser#op1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp1(t5GramParser.Op1Context ctx);
	/**
	 * Visit a parse tree produced by {@link t5GramParser#op2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp2(t5GramParser.Op2Context ctx);
	/**
	 * Visit a parse tree produced by {@link t5GramParser#op3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp3(t5GramParser.Op3Context ctx);
	/**
	 * Visit a parse tree produced by {@link t5GramParser#parcela}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela(t5GramParser.ParcelaContext ctx);
	/**
	 * Visit a parse tree produced by {@link t5GramParser#parcela_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_unario(t5GramParser.Parcela_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link t5GramParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_nao_unario(t5GramParser.Parcela_nao_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link t5GramParser#exp_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_relacional(t5GramParser.Exp_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link t5GramParser#op_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_relacional(t5GramParser.Op_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link t5GramParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(t5GramParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link t5GramParser#termo_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo_logico(t5GramParser.Termo_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link t5GramParser#fator_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator_logico(t5GramParser.Fator_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link t5GramParser#parcela_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_logica(t5GramParser.Parcela_logicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link t5GramParser#op_logico_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_logico_1(t5GramParser.Op_logico_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link t5GramParser#op_logico_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_logico_2(t5GramParser.Op_logico_2Context ctx);
}