// Generated from br\u005Cufscar\dc\compiladores\t2\t2Sint.g4 by ANTLR 4.10.1
package br.ufscar.dc.compiladores.t2;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link t2SintParser}.
 */
public interface t2SintListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link t2SintParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(t2SintParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(t2SintParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2SintParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(t2SintParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(t2SintParser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2SintParser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void enterDecl_local_global(t2SintParser.Decl_local_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void exitDecl_local_global(t2SintParser.Decl_local_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2SintParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_local(t2SintParser.Declaracao_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_local(t2SintParser.Declaracao_localContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2SintParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(t2SintParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(t2SintParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2SintParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(t2SintParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(t2SintParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2SintParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void enterDimensao(t2SintParser.DimensaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void exitDimensao(t2SintParser.DimensaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2SintParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(t2SintParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(t2SintParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2SintParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico(t2SintParser.Tipo_basicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico(t2SintParser.Tipo_basicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2SintParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico_ident(t2SintParser.Tipo_basico_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico_ident(t2SintParser.Tipo_basico_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2SintParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void enterTipo_estendido(t2SintParser.Tipo_estendidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void exitTipo_estendido(t2SintParser.Tipo_estendidoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2SintParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void enterValor_constante(t2SintParser.Valor_constanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void exitValor_constante(t2SintParser.Valor_constanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2SintParser#registro}.
	 * @param ctx the parse tree
	 */
	void enterRegistro(t2SintParser.RegistroContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#registro}.
	 * @param ctx the parse tree
	 */
	void exitRegistro(t2SintParser.RegistroContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2SintParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_global(t2SintParser.Declaracao_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_global(t2SintParser.Declaracao_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2SintParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(t2SintParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(t2SintParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2SintParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(t2SintParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(t2SintParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2SintParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(t2SintParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(t2SintParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2SintParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(t2SintParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(t2SintParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2SintParser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void enterCmdLeia(t2SintParser.CmdLeiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void exitCmdLeia(t2SintParser.CmdLeiaContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2SintParser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void enterCmdEscreva(t2SintParser.CmdEscrevaContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void exitCmdEscreva(t2SintParser.CmdEscrevaContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2SintParser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void enterCmdSe(t2SintParser.CmdSeContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void exitCmdSe(t2SintParser.CmdSeContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2SintParser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void enterCmdCaso(t2SintParser.CmdCasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void exitCmdCaso(t2SintParser.CmdCasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2SintParser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void enterCmdPara(t2SintParser.CmdParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void exitCmdPara(t2SintParser.CmdParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2SintParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void enterCmdEnquanto(t2SintParser.CmdEnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void exitCmdEnquanto(t2SintParser.CmdEnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2SintParser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void enterCmdFaca(t2SintParser.CmdFacaContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void exitCmdFaca(t2SintParser.CmdFacaContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2SintParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterCmdAtribuicao(t2SintParser.CmdAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitCmdAtribuicao(t2SintParser.CmdAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2SintParser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void enterCmdChamada(t2SintParser.CmdChamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void exitCmdChamada(t2SintParser.CmdChamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2SintParser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void enterCmdRetorne(t2SintParser.CmdRetorneContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void exitCmdRetorne(t2SintParser.CmdRetorneContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2SintParser#selecao}.
	 * @param ctx the parse tree
	 */
	void enterSelecao(t2SintParser.SelecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#selecao}.
	 * @param ctx the parse tree
	 */
	void exitSelecao(t2SintParser.SelecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2SintParser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void enterItem_selecao(t2SintParser.Item_selecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void exitItem_selecao(t2SintParser.Item_selecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2SintParser#constantes}.
	 * @param ctx the parse tree
	 */
	void enterConstantes(t2SintParser.ConstantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#constantes}.
	 * @param ctx the parse tree
	 */
	void exitConstantes(t2SintParser.ConstantesContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2SintParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void enterNumero_intervalo(t2SintParser.Numero_intervaloContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void exitNumero_intervalo(t2SintParser.Numero_intervaloContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2SintParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void enterOp_unario(t2SintParser.Op_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void exitOp_unario(t2SintParser.Op_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2SintParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExp_aritmetica(t2SintParser.Exp_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExp_aritmetica(t2SintParser.Exp_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2SintParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(t2SintParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(t2SintParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2SintParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(t2SintParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(t2SintParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2SintParser#op1}.
	 * @param ctx the parse tree
	 */
	void enterOp1(t2SintParser.Op1Context ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#op1}.
	 * @param ctx the parse tree
	 */
	void exitOp1(t2SintParser.Op1Context ctx);
	/**
	 * Enter a parse tree produced by {@link t2SintParser#op2}.
	 * @param ctx the parse tree
	 */
	void enterOp2(t2SintParser.Op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#op2}.
	 * @param ctx the parse tree
	 */
	void exitOp2(t2SintParser.Op2Context ctx);
	/**
	 * Enter a parse tree produced by {@link t2SintParser#op3}.
	 * @param ctx the parse tree
	 */
	void enterOp3(t2SintParser.Op3Context ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#op3}.
	 * @param ctx the parse tree
	 */
	void exitOp3(t2SintParser.Op3Context ctx);
	/**
	 * Enter a parse tree produced by {@link t2SintParser#parcela}.
	 * @param ctx the parse tree
	 */
	void enterParcela(t2SintParser.ParcelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#parcela}.
	 * @param ctx the parse tree
	 */
	void exitParcela(t2SintParser.ParcelaContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2SintParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_unario(t2SintParser.Parcela_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_unario(t2SintParser.Parcela_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2SintParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_nao_unario(t2SintParser.Parcela_nao_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_nao_unario(t2SintParser.Parcela_nao_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2SintParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExp_relacional(t2SintParser.Exp_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExp_relacional(t2SintParser.Exp_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2SintParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOp_relacional(t2SintParser.Op_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOp_relacional(t2SintParser.Op_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2SintParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(t2SintParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(t2SintParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2SintParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void enterTermo_logico(t2SintParser.Termo_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void exitTermo_logico(t2SintParser.Termo_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2SintParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void enterFator_logico(t2SintParser.Fator_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void exitFator_logico(t2SintParser.Fator_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2SintParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void enterParcela_logica(t2SintParser.Parcela_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void exitParcela_logica(t2SintParser.Parcela_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link t2SintParser#op_logico_1}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico_1(t2SintParser.Op_logico_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#op_logico_1}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico_1(t2SintParser.Op_logico_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link t2SintParser#op_logico_2}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico_2(t2SintParser.Op_logico_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link t2SintParser#op_logico_2}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico_2(t2SintParser.Op_logico_2Context ctx);
}