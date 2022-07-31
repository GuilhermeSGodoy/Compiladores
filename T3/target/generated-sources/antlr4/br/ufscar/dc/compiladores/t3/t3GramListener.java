// Generated from br\u005Cufscar\dc\compiladores\t3\t3Gram.g4 by ANTLR 4.10.1
package br.ufscar.dc.compiladores.t3;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link t3GramParser}.
 */
public interface t3GramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link t3GramParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(t3GramParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(t3GramParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link t3GramParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(t3GramParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(t3GramParser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link t3GramParser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void enterDecl_local_global(t3GramParser.Decl_local_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void exitDecl_local_global(t3GramParser.Decl_local_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link t3GramParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_local(t3GramParser.Declaracao_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_local(t3GramParser.Declaracao_localContext ctx);
	/**
	 * Enter a parse tree produced by {@link t3GramParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(t3GramParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(t3GramParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link t3GramParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(t3GramParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(t3GramParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link t3GramParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void enterDimensao(t3GramParser.DimensaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void exitDimensao(t3GramParser.DimensaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t3GramParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(t3GramParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(t3GramParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t3GramParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico(t3GramParser.Tipo_basicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico(t3GramParser.Tipo_basicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t3GramParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico_ident(t3GramParser.Tipo_basico_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico_ident(t3GramParser.Tipo_basico_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link t3GramParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void enterTipo_estendido(t3GramParser.Tipo_estendidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void exitTipo_estendido(t3GramParser.Tipo_estendidoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t3GramParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void enterValor_constante(t3GramParser.Valor_constanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void exitValor_constante(t3GramParser.Valor_constanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link t3GramParser#registro}.
	 * @param ctx the parse tree
	 */
	void enterRegistro(t3GramParser.RegistroContext ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#registro}.
	 * @param ctx the parse tree
	 */
	void exitRegistro(t3GramParser.RegistroContext ctx);
	/**
	 * Enter a parse tree produced by {@link t3GramParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_global(t3GramParser.Declaracao_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_global(t3GramParser.Declaracao_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link t3GramParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(t3GramParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(t3GramParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link t3GramParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(t3GramParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(t3GramParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link t3GramParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(t3GramParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(t3GramParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t3GramParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(t3GramParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(t3GramParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link t3GramParser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void enterCmdLeia(t3GramParser.CmdLeiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void exitCmdLeia(t3GramParser.CmdLeiaContext ctx);
	/**
	 * Enter a parse tree produced by {@link t3GramParser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void enterCmdEscreva(t3GramParser.CmdEscrevaContext ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void exitCmdEscreva(t3GramParser.CmdEscrevaContext ctx);
	/**
	 * Enter a parse tree produced by {@link t3GramParser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void enterCmdSe(t3GramParser.CmdSeContext ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void exitCmdSe(t3GramParser.CmdSeContext ctx);
	/**
	 * Enter a parse tree produced by {@link t3GramParser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void enterCmdCaso(t3GramParser.CmdCasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void exitCmdCaso(t3GramParser.CmdCasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t3GramParser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void enterCmdPara(t3GramParser.CmdParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void exitCmdPara(t3GramParser.CmdParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link t3GramParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void enterCmdEnquanto(t3GramParser.CmdEnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void exitCmdEnquanto(t3GramParser.CmdEnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t3GramParser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void enterCmdFaca(t3GramParser.CmdFacaContext ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void exitCmdFaca(t3GramParser.CmdFacaContext ctx);
	/**
	 * Enter a parse tree produced by {@link t3GramParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterCmdAtribuicao(t3GramParser.CmdAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitCmdAtribuicao(t3GramParser.CmdAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t3GramParser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void enterCmdChamada(t3GramParser.CmdChamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void exitCmdChamada(t3GramParser.CmdChamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link t3GramParser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void enterCmdRetorne(t3GramParser.CmdRetorneContext ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void exitCmdRetorne(t3GramParser.CmdRetorneContext ctx);
	/**
	 * Enter a parse tree produced by {@link t3GramParser#selecao}.
	 * @param ctx the parse tree
	 */
	void enterSelecao(t3GramParser.SelecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#selecao}.
	 * @param ctx the parse tree
	 */
	void exitSelecao(t3GramParser.SelecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t3GramParser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void enterItem_selecao(t3GramParser.Item_selecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void exitItem_selecao(t3GramParser.Item_selecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t3GramParser#constantes}.
	 * @param ctx the parse tree
	 */
	void enterConstantes(t3GramParser.ConstantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#constantes}.
	 * @param ctx the parse tree
	 */
	void exitConstantes(t3GramParser.ConstantesContext ctx);
	/**
	 * Enter a parse tree produced by {@link t3GramParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void enterNumero_intervalo(t3GramParser.Numero_intervaloContext ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void exitNumero_intervalo(t3GramParser.Numero_intervaloContext ctx);
	/**
	 * Enter a parse tree produced by {@link t3GramParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void enterOp_unario(t3GramParser.Op_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void exitOp_unario(t3GramParser.Op_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link t3GramParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExp_aritmetica(t3GramParser.Exp_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExp_aritmetica(t3GramParser.Exp_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link t3GramParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(t3GramParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(t3GramParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t3GramParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(t3GramParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(t3GramParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link t3GramParser#op1}.
	 * @param ctx the parse tree
	 */
	void enterOp1(t3GramParser.Op1Context ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#op1}.
	 * @param ctx the parse tree
	 */
	void exitOp1(t3GramParser.Op1Context ctx);
	/**
	 * Enter a parse tree produced by {@link t3GramParser#op2}.
	 * @param ctx the parse tree
	 */
	void enterOp2(t3GramParser.Op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#op2}.
	 * @param ctx the parse tree
	 */
	void exitOp2(t3GramParser.Op2Context ctx);
	/**
	 * Enter a parse tree produced by {@link t3GramParser#op3}.
	 * @param ctx the parse tree
	 */
	void enterOp3(t3GramParser.Op3Context ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#op3}.
	 * @param ctx the parse tree
	 */
	void exitOp3(t3GramParser.Op3Context ctx);
	/**
	 * Enter a parse tree produced by {@link t3GramParser#parcela}.
	 * @param ctx the parse tree
	 */
	void enterParcela(t3GramParser.ParcelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#parcela}.
	 * @param ctx the parse tree
	 */
	void exitParcela(t3GramParser.ParcelaContext ctx);
	/**
	 * Enter a parse tree produced by {@link t3GramParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_unario(t3GramParser.Parcela_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_unario(t3GramParser.Parcela_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link t3GramParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_nao_unario(t3GramParser.Parcela_nao_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_nao_unario(t3GramParser.Parcela_nao_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link t3GramParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExp_relacional(t3GramParser.Exp_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExp_relacional(t3GramParser.Exp_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link t3GramParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOp_relacional(t3GramParser.Op_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOp_relacional(t3GramParser.Op_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link t3GramParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(t3GramParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(t3GramParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t3GramParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void enterTermo_logico(t3GramParser.Termo_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void exitTermo_logico(t3GramParser.Termo_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t3GramParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void enterFator_logico(t3GramParser.Fator_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void exitFator_logico(t3GramParser.Fator_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link t3GramParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void enterParcela_logica(t3GramParser.Parcela_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void exitParcela_logica(t3GramParser.Parcela_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link t3GramParser#op_logico_1}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico_1(t3GramParser.Op_logico_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#op_logico_1}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico_1(t3GramParser.Op_logico_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link t3GramParser#op_logico_2}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico_2(t3GramParser.Op_logico_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link t3GramParser#op_logico_2}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico_2(t3GramParser.Op_logico_2Context ctx);
}