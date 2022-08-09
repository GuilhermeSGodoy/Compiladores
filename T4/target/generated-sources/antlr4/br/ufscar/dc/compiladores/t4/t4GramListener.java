// Generated from br\u005Cufscar\dc\compiladores\t4\t4Gram.g4 by ANTLR 4.10.1
package br.ufscar.dc.compiladores.t4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link t4GramParser}.
 */
public interface t4GramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link t4GramParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(t4GramParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(t4GramParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link t4GramParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(t4GramParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(t4GramParser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link t4GramParser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void enterDecl_local_global(t4GramParser.Decl_local_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void exitDecl_local_global(t4GramParser.Decl_local_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link t4GramParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_local(t4GramParser.Declaracao_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_local(t4GramParser.Declaracao_localContext ctx);
	/**
	 * Enter a parse tree produced by {@link t4GramParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(t4GramParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(t4GramParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link t4GramParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(t4GramParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(t4GramParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link t4GramParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void enterDimensao(t4GramParser.DimensaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void exitDimensao(t4GramParser.DimensaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t4GramParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(t4GramParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(t4GramParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t4GramParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico(t4GramParser.Tipo_basicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico(t4GramParser.Tipo_basicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t4GramParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico_ident(t4GramParser.Tipo_basico_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico_ident(t4GramParser.Tipo_basico_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link t4GramParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void enterTipo_estendido(t4GramParser.Tipo_estendidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void exitTipo_estendido(t4GramParser.Tipo_estendidoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t4GramParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void enterValor_constante(t4GramParser.Valor_constanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void exitValor_constante(t4GramParser.Valor_constanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link t4GramParser#registro}.
	 * @param ctx the parse tree
	 */
	void enterRegistro(t4GramParser.RegistroContext ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#registro}.
	 * @param ctx the parse tree
	 */
	void exitRegistro(t4GramParser.RegistroContext ctx);
	/**
	 * Enter a parse tree produced by {@link t4GramParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_global(t4GramParser.Declaracao_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_global(t4GramParser.Declaracao_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link t4GramParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(t4GramParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(t4GramParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link t4GramParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(t4GramParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(t4GramParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link t4GramParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(t4GramParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(t4GramParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t4GramParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(t4GramParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(t4GramParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link t4GramParser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void enterCmdLeia(t4GramParser.CmdLeiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void exitCmdLeia(t4GramParser.CmdLeiaContext ctx);
	/**
	 * Enter a parse tree produced by {@link t4GramParser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void enterCmdEscreva(t4GramParser.CmdEscrevaContext ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void exitCmdEscreva(t4GramParser.CmdEscrevaContext ctx);
	/**
	 * Enter a parse tree produced by {@link t4GramParser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void enterCmdSe(t4GramParser.CmdSeContext ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void exitCmdSe(t4GramParser.CmdSeContext ctx);
	/**
	 * Enter a parse tree produced by {@link t4GramParser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void enterCmdCaso(t4GramParser.CmdCasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void exitCmdCaso(t4GramParser.CmdCasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t4GramParser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void enterCmdPara(t4GramParser.CmdParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void exitCmdPara(t4GramParser.CmdParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link t4GramParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void enterCmdEnquanto(t4GramParser.CmdEnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void exitCmdEnquanto(t4GramParser.CmdEnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t4GramParser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void enterCmdFaca(t4GramParser.CmdFacaContext ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void exitCmdFaca(t4GramParser.CmdFacaContext ctx);
	/**
	 * Enter a parse tree produced by {@link t4GramParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterCmdAtribuicao(t4GramParser.CmdAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitCmdAtribuicao(t4GramParser.CmdAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t4GramParser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void enterCmdChamada(t4GramParser.CmdChamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void exitCmdChamada(t4GramParser.CmdChamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link t4GramParser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void enterCmdRetorne(t4GramParser.CmdRetorneContext ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void exitCmdRetorne(t4GramParser.CmdRetorneContext ctx);
	/**
	 * Enter a parse tree produced by {@link t4GramParser#selecao}.
	 * @param ctx the parse tree
	 */
	void enterSelecao(t4GramParser.SelecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#selecao}.
	 * @param ctx the parse tree
	 */
	void exitSelecao(t4GramParser.SelecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t4GramParser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void enterItem_selecao(t4GramParser.Item_selecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void exitItem_selecao(t4GramParser.Item_selecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t4GramParser#constantes}.
	 * @param ctx the parse tree
	 */
	void enterConstantes(t4GramParser.ConstantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#constantes}.
	 * @param ctx the parse tree
	 */
	void exitConstantes(t4GramParser.ConstantesContext ctx);
	/**
	 * Enter a parse tree produced by {@link t4GramParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void enterNumero_intervalo(t4GramParser.Numero_intervaloContext ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void exitNumero_intervalo(t4GramParser.Numero_intervaloContext ctx);
	/**
	 * Enter a parse tree produced by {@link t4GramParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void enterOp_unario(t4GramParser.Op_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void exitOp_unario(t4GramParser.Op_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link t4GramParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExp_aritmetica(t4GramParser.Exp_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExp_aritmetica(t4GramParser.Exp_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link t4GramParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(t4GramParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(t4GramParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t4GramParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(t4GramParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(t4GramParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link t4GramParser#op1}.
	 * @param ctx the parse tree
	 */
	void enterOp1(t4GramParser.Op1Context ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#op1}.
	 * @param ctx the parse tree
	 */
	void exitOp1(t4GramParser.Op1Context ctx);
	/**
	 * Enter a parse tree produced by {@link t4GramParser#op2}.
	 * @param ctx the parse tree
	 */
	void enterOp2(t4GramParser.Op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#op2}.
	 * @param ctx the parse tree
	 */
	void exitOp2(t4GramParser.Op2Context ctx);
	/**
	 * Enter a parse tree produced by {@link t4GramParser#op3}.
	 * @param ctx the parse tree
	 */
	void enterOp3(t4GramParser.Op3Context ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#op3}.
	 * @param ctx the parse tree
	 */
	void exitOp3(t4GramParser.Op3Context ctx);
	/**
	 * Enter a parse tree produced by {@link t4GramParser#parcela}.
	 * @param ctx the parse tree
	 */
	void enterParcela(t4GramParser.ParcelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#parcela}.
	 * @param ctx the parse tree
	 */
	void exitParcela(t4GramParser.ParcelaContext ctx);
	/**
	 * Enter a parse tree produced by {@link t4GramParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_unario(t4GramParser.Parcela_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_unario(t4GramParser.Parcela_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link t4GramParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_nao_unario(t4GramParser.Parcela_nao_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_nao_unario(t4GramParser.Parcela_nao_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link t4GramParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExp_relacional(t4GramParser.Exp_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExp_relacional(t4GramParser.Exp_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link t4GramParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOp_relacional(t4GramParser.Op_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOp_relacional(t4GramParser.Op_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link t4GramParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(t4GramParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(t4GramParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t4GramParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void enterTermo_logico(t4GramParser.Termo_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void exitTermo_logico(t4GramParser.Termo_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t4GramParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void enterFator_logico(t4GramParser.Fator_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void exitFator_logico(t4GramParser.Fator_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t4GramParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void enterParcela_logica(t4GramParser.Parcela_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void exitParcela_logica(t4GramParser.Parcela_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link t4GramParser#op_logico_1}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico_1(t4GramParser.Op_logico_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#op_logico_1}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico_1(t4GramParser.Op_logico_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link t4GramParser#op_logico_2}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico_2(t4GramParser.Op_logico_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link t4GramParser#op_logico_2}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico_2(t4GramParser.Op_logico_2Context ctx);
}