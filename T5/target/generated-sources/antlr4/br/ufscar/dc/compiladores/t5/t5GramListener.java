// Generated from br\u005Cufscar\dc\compiladores\t5\t5Gram.g4 by ANTLR 4.10.1
package br.ufscar.dc.compiladores.t5;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link t5GramParser}.
 */
public interface t5GramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link t5GramParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(t5GramParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(t5GramParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link t5GramParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(t5GramParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(t5GramParser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link t5GramParser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void enterDecl_local_global(t5GramParser.Decl_local_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void exitDecl_local_global(t5GramParser.Decl_local_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link t5GramParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_local(t5GramParser.Declaracao_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_local(t5GramParser.Declaracao_localContext ctx);
	/**
	 * Enter a parse tree produced by {@link t5GramParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(t5GramParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(t5GramParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link t5GramParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(t5GramParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(t5GramParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link t5GramParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void enterDimensao(t5GramParser.DimensaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void exitDimensao(t5GramParser.DimensaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t5GramParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(t5GramParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(t5GramParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t5GramParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico(t5GramParser.Tipo_basicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico(t5GramParser.Tipo_basicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t5GramParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico_ident(t5GramParser.Tipo_basico_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico_ident(t5GramParser.Tipo_basico_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link t5GramParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void enterTipo_estendido(t5GramParser.Tipo_estendidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void exitTipo_estendido(t5GramParser.Tipo_estendidoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t5GramParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void enterValor_constante(t5GramParser.Valor_constanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void exitValor_constante(t5GramParser.Valor_constanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link t5GramParser#registro}.
	 * @param ctx the parse tree
	 */
	void enterRegistro(t5GramParser.RegistroContext ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#registro}.
	 * @param ctx the parse tree
	 */
	void exitRegistro(t5GramParser.RegistroContext ctx);
	/**
	 * Enter a parse tree produced by {@link t5GramParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_global(t5GramParser.Declaracao_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_global(t5GramParser.Declaracao_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link t5GramParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(t5GramParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(t5GramParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link t5GramParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(t5GramParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(t5GramParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link t5GramParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(t5GramParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(t5GramParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t5GramParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(t5GramParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(t5GramParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link t5GramParser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void enterCmdLeia(t5GramParser.CmdLeiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void exitCmdLeia(t5GramParser.CmdLeiaContext ctx);
	/**
	 * Enter a parse tree produced by {@link t5GramParser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void enterCmdEscreva(t5GramParser.CmdEscrevaContext ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void exitCmdEscreva(t5GramParser.CmdEscrevaContext ctx);
	/**
	 * Enter a parse tree produced by {@link t5GramParser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void enterCmdSe(t5GramParser.CmdSeContext ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void exitCmdSe(t5GramParser.CmdSeContext ctx);
	/**
	 * Enter a parse tree produced by {@link t5GramParser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void enterCmdCaso(t5GramParser.CmdCasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void exitCmdCaso(t5GramParser.CmdCasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t5GramParser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void enterCmdPara(t5GramParser.CmdParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void exitCmdPara(t5GramParser.CmdParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link t5GramParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void enterCmdEnquanto(t5GramParser.CmdEnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void exitCmdEnquanto(t5GramParser.CmdEnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t5GramParser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void enterCmdFaca(t5GramParser.CmdFacaContext ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void exitCmdFaca(t5GramParser.CmdFacaContext ctx);
	/**
	 * Enter a parse tree produced by {@link t5GramParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterCmdAtribuicao(t5GramParser.CmdAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitCmdAtribuicao(t5GramParser.CmdAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t5GramParser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void enterCmdChamada(t5GramParser.CmdChamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void exitCmdChamada(t5GramParser.CmdChamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link t5GramParser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void enterCmdRetorne(t5GramParser.CmdRetorneContext ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void exitCmdRetorne(t5GramParser.CmdRetorneContext ctx);
	/**
	 * Enter a parse tree produced by {@link t5GramParser#selecao}.
	 * @param ctx the parse tree
	 */
	void enterSelecao(t5GramParser.SelecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#selecao}.
	 * @param ctx the parse tree
	 */
	void exitSelecao(t5GramParser.SelecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t5GramParser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void enterItem_selecao(t5GramParser.Item_selecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void exitItem_selecao(t5GramParser.Item_selecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t5GramParser#constantes}.
	 * @param ctx the parse tree
	 */
	void enterConstantes(t5GramParser.ConstantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#constantes}.
	 * @param ctx the parse tree
	 */
	void exitConstantes(t5GramParser.ConstantesContext ctx);
	/**
	 * Enter a parse tree produced by {@link t5GramParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void enterNumero_intervalo(t5GramParser.Numero_intervaloContext ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void exitNumero_intervalo(t5GramParser.Numero_intervaloContext ctx);
	/**
	 * Enter a parse tree produced by {@link t5GramParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void enterOp_unario(t5GramParser.Op_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void exitOp_unario(t5GramParser.Op_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link t5GramParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExp_aritmetica(t5GramParser.Exp_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExp_aritmetica(t5GramParser.Exp_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link t5GramParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(t5GramParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(t5GramParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t5GramParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(t5GramParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(t5GramParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link t5GramParser#op1}.
	 * @param ctx the parse tree
	 */
	void enterOp1(t5GramParser.Op1Context ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#op1}.
	 * @param ctx the parse tree
	 */
	void exitOp1(t5GramParser.Op1Context ctx);
	/**
	 * Enter a parse tree produced by {@link t5GramParser#op2}.
	 * @param ctx the parse tree
	 */
	void enterOp2(t5GramParser.Op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#op2}.
	 * @param ctx the parse tree
	 */
	void exitOp2(t5GramParser.Op2Context ctx);
	/**
	 * Enter a parse tree produced by {@link t5GramParser#op3}.
	 * @param ctx the parse tree
	 */
	void enterOp3(t5GramParser.Op3Context ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#op3}.
	 * @param ctx the parse tree
	 */
	void exitOp3(t5GramParser.Op3Context ctx);
	/**
	 * Enter a parse tree produced by {@link t5GramParser#parcela}.
	 * @param ctx the parse tree
	 */
	void enterParcela(t5GramParser.ParcelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#parcela}.
	 * @param ctx the parse tree
	 */
	void exitParcela(t5GramParser.ParcelaContext ctx);
	/**
	 * Enter a parse tree produced by {@link t5GramParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_unario(t5GramParser.Parcela_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_unario(t5GramParser.Parcela_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link t5GramParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_nao_unario(t5GramParser.Parcela_nao_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_nao_unario(t5GramParser.Parcela_nao_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link t5GramParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExp_relacional(t5GramParser.Exp_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExp_relacional(t5GramParser.Exp_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link t5GramParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOp_relacional(t5GramParser.Op_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOp_relacional(t5GramParser.Op_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link t5GramParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(t5GramParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(t5GramParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t5GramParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void enterTermo_logico(t5GramParser.Termo_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void exitTermo_logico(t5GramParser.Termo_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t5GramParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void enterFator_logico(t5GramParser.Fator_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void exitFator_logico(t5GramParser.Fator_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t5GramParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void enterParcela_logica(t5GramParser.Parcela_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void exitParcela_logica(t5GramParser.Parcela_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link t5GramParser#op_logico_1}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico_1(t5GramParser.Op_logico_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#op_logico_1}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico_1(t5GramParser.Op_logico_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link t5GramParser#op_logico_2}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico_2(t5GramParser.Op_logico_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link t5GramParser#op_logico_2}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico_2(t5GramParser.Op_logico_2Context ctx);
}