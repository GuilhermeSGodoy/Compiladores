// Generated from br\u005Cufscar\dc\compiladores\descritura\gramatica.g4 by ANTLR 4.10.1
package br.ufscar.dc.compiladores.descritura;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, IDENTIFICADOR=17, 
		CADEIA=18, COMENTARIO=19, WS=20;
	public static final int
		RULE_programa = 0, RULE_delim = 1, RULE_estrutura = 2, RULE_nome = 3, 
		RULE_arquetipos = 4, RULE_elementos = 5, RULE_historia = 6, RULE_nomeAutor = 7, 
		RULE_sinopse = 8, RULE_versaoRascunho = 9, RULE_data = 10, RULE_declaracaoGlobal = 11, 
		RULE_personagem = 12, RULE_arquetipo = 13, RULE_capitulo = 14, RULE_elemento = 15, 
		RULE_personagens = 16, RULE_personagemDec = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "delim", "estrutura", "nome", "arquetipos", "elementos", 
			"historia", "nomeAutor", "sinopse", "versaoRascunho", "data", "declaracaoGlobal", 
			"personagem", "arquetipo", "capitulo", "elemento", "personagens", "personagemDec"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'estrutura'", "'nome'", "'arquetipos'", "','", "'elementos'", 
			"'historia'", "'autor'", "'sinopse'", "'versao'", "'data'", "'personagem'", 
			"'arquetipo'", "'capitulo'", "'elemento'", "'personagens'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "IDENTIFICADOR", "CADEIA", "COMENTARIO", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public EstruturaContext estrutura() {
			return getRuleContext(EstruturaContext.class,0);
		}
		public HistoriaContext historia() {
			return getRuleContext(HistoriaContext.class,0);
		}
		public TerminalNode EOF() { return getToken(gramaticaParser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			estrutura();
			setState(37);
			historia();
			setState(38);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DelimContext extends ParserRuleContext {
		public DelimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDelim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDelim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDelim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DelimContext delim() throws RecognitionException {
		DelimContext _localctx = new DelimContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_delim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EstruturaContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(gramaticaParser.IDENTIFICADOR, 0); }
		public DelimContext delim() {
			return getRuleContext(DelimContext.class,0);
		}
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
		}
		public ArquetiposContext arquetipos() {
			return getRuleContext(ArquetiposContext.class,0);
		}
		public ElementosContext elementos() {
			return getRuleContext(ElementosContext.class,0);
		}
		public EstruturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estrutura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterEstrutura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitEstrutura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitEstrutura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EstruturaContext estrutura() throws RecognitionException {
		EstruturaContext _localctx = new EstruturaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_estrutura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__1);
			setState(43);
			match(IDENTIFICADOR);
			setState(44);
			delim();
			setState(45);
			nome();
			setState(46);
			arquetipos();
			setState(47);
			elementos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NomeContext extends ParserRuleContext {
		public DelimContext delim() {
			return getRuleContext(DelimContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(gramaticaParser.CADEIA, 0); }
		public NomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterNome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitNome(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitNome(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NomeContext nome() throws RecognitionException {
		NomeContext _localctx = new NomeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_nome);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(T__2);
			setState(50);
			delim();
			setState(51);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArquetiposContext extends ParserRuleContext {
		public DelimContext delim() {
			return getRuleContext(DelimContext.class,0);
		}
		public List<TerminalNode> CADEIA() { return getTokens(gramaticaParser.CADEIA); }
		public TerminalNode CADEIA(int i) {
			return getToken(gramaticaParser.CADEIA, i);
		}
		public ArquetiposContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arquetipos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterArquetipos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitArquetipos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitArquetipos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArquetiposContext arquetipos() throws RecognitionException {
		ArquetiposContext _localctx = new ArquetiposContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_arquetipos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(T__3);
			setState(54);
			delim();
			setState(55);
			match(CADEIA);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(56);
				match(T__4);
				setState(57);
				match(CADEIA);
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementosContext extends ParserRuleContext {
		public DelimContext delim() {
			return getRuleContext(DelimContext.class,0);
		}
		public List<TerminalNode> CADEIA() { return getTokens(gramaticaParser.CADEIA); }
		public TerminalNode CADEIA(int i) {
			return getToken(gramaticaParser.CADEIA, i);
		}
		public ElementosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterElementos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitElementos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitElementos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementosContext elementos() throws RecognitionException {
		ElementosContext _localctx = new ElementosContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_elementos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__5);
			setState(64);
			delim();
			setState(65);
			match(CADEIA);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(66);
				match(T__4);
				setState(67);
				match(CADEIA);
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HistoriaContext extends ParserRuleContext {
		public DelimContext delim() {
			return getRuleContext(DelimContext.class,0);
		}
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
		}
		public List<NomeAutorContext> nomeAutor() {
			return getRuleContexts(NomeAutorContext.class);
		}
		public NomeAutorContext nomeAutor(int i) {
			return getRuleContext(NomeAutorContext.class,i);
		}
		public SinopseContext sinopse() {
			return getRuleContext(SinopseContext.class,0);
		}
		public VersaoRascunhoContext versaoRascunho() {
			return getRuleContext(VersaoRascunhoContext.class,0);
		}
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public List<DeclaracaoGlobalContext> declaracaoGlobal() {
			return getRuleContexts(DeclaracaoGlobalContext.class);
		}
		public DeclaracaoGlobalContext declaracaoGlobal(int i) {
			return getRuleContext(DeclaracaoGlobalContext.class,i);
		}
		public List<CapituloContext> capitulo() {
			return getRuleContexts(CapituloContext.class);
		}
		public CapituloContext capitulo(int i) {
			return getRuleContext(CapituloContext.class,i);
		}
		public HistoriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_historia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterHistoria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitHistoria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitHistoria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HistoriaContext historia() throws RecognitionException {
		HistoriaContext _localctx = new HistoriaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_historia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__6);
			setState(74);
			delim();
			setState(75);
			nome();
			setState(76);
			nomeAutor();
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(77);
				match(T__4);
				setState(78);
				nomeAutor();
				}
				}
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(84);
			sinopse();
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(85);
				versaoRascunho();
				}
			}

			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(88);
				data();
				}
			}

			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(91);
				declaracaoGlobal();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(97);
				capitulo();
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NomeAutorContext extends ParserRuleContext {
		public DelimContext delim() {
			return getRuleContext(DelimContext.class,0);
		}
		public List<TerminalNode> CADEIA() { return getTokens(gramaticaParser.CADEIA); }
		public TerminalNode CADEIA(int i) {
			return getToken(gramaticaParser.CADEIA, i);
		}
		public NomeAutorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomeAutor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterNomeAutor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitNomeAutor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitNomeAutor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NomeAutorContext nomeAutor() throws RecognitionException {
		NomeAutorContext _localctx = new NomeAutorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_nomeAutor);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__7);
			setState(104);
			delim();
			setState(105);
			match(CADEIA);
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(106);
					match(T__4);
					setState(107);
					match(CADEIA);
					}
					} 
				}
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SinopseContext extends ParserRuleContext {
		public DelimContext delim() {
			return getRuleContext(DelimContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(gramaticaParser.CADEIA, 0); }
		public SinopseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sinopse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterSinopse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitSinopse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitSinopse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinopseContext sinopse() throws RecognitionException {
		SinopseContext _localctx = new SinopseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sinopse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__8);
			setState(114);
			delim();
			setState(115);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VersaoRascunhoContext extends ParserRuleContext {
		public DelimContext delim() {
			return getRuleContext(DelimContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(gramaticaParser.CADEIA, 0); }
		public VersaoRascunhoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_versaoRascunho; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterVersaoRascunho(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitVersaoRascunho(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitVersaoRascunho(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VersaoRascunhoContext versaoRascunho() throws RecognitionException {
		VersaoRascunhoContext _localctx = new VersaoRascunhoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_versaoRascunho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__9);
			setState(118);
			delim();
			setState(119);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataContext extends ParserRuleContext {
		public DelimContext delim() {
			return getRuleContext(DelimContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(gramaticaParser.CADEIA, 0); }
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_data);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__10);
			setState(122);
			delim();
			setState(123);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracaoGlobalContext extends ParserRuleContext {
		public PersonagemContext personagem() {
			return getRuleContext(PersonagemContext.class,0);
		}
		public DeclaracaoGlobalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracaoGlobal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterDeclaracaoGlobal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitDeclaracaoGlobal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitDeclaracaoGlobal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoGlobalContext declaracaoGlobal() throws RecognitionException {
		DeclaracaoGlobalContext _localctx = new DeclaracaoGlobalContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declaracaoGlobal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			personagem();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PersonagemContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(gramaticaParser.IDENTIFICADOR, 0); }
		public DelimContext delim() {
			return getRuleContext(DelimContext.class,0);
		}
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
		}
		public ArquetipoContext arquetipo() {
			return getRuleContext(ArquetipoContext.class,0);
		}
		public PersonagemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_personagem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterPersonagem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitPersonagem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitPersonagem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PersonagemContext personagem() throws RecognitionException {
		PersonagemContext _localctx = new PersonagemContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_personagem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__11);
			setState(128);
			match(IDENTIFICADOR);
			setState(129);
			delim();
			setState(130);
			nome();
			setState(131);
			arquetipo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArquetipoContext extends ParserRuleContext {
		public DelimContext delim() {
			return getRuleContext(DelimContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(gramaticaParser.CADEIA, 0); }
		public ArquetipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arquetipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterArquetipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitArquetipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitArquetipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArquetipoContext arquetipo() throws RecognitionException {
		ArquetipoContext _localctx = new ArquetipoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arquetipo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__12);
			setState(134);
			delim();
			setState(135);
			match(CADEIA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CapituloContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(gramaticaParser.IDENTIFICADOR, 0); }
		public DelimContext delim() {
			return getRuleContext(DelimContext.class,0);
		}
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
		}
		public SinopseContext sinopse() {
			return getRuleContext(SinopseContext.class,0);
		}
		public ElementoContext elemento() {
			return getRuleContext(ElementoContext.class,0);
		}
		public PersonagensContext personagens() {
			return getRuleContext(PersonagensContext.class,0);
		}
		public CapituloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_capitulo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterCapitulo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitCapitulo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitCapitulo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CapituloContext capitulo() throws RecognitionException {
		CapituloContext _localctx = new CapituloContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_capitulo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(T__13);
			setState(138);
			match(IDENTIFICADOR);
			setState(139);
			delim();
			setState(140);
			nome();
			setState(141);
			sinopse();
			setState(142);
			elemento();
			setState(143);
			personagens();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementoContext extends ParserRuleContext {
		public DelimContext delim() {
			return getRuleContext(DelimContext.class,0);
		}
		public List<TerminalNode> CADEIA() { return getTokens(gramaticaParser.CADEIA); }
		public TerminalNode CADEIA(int i) {
			return getToken(gramaticaParser.CADEIA, i);
		}
		public ElementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elemento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterElemento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitElemento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitElemento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementoContext elemento() throws RecognitionException {
		ElementoContext _localctx = new ElementoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_elemento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(T__14);
			setState(146);
			delim();
			setState(147);
			match(CADEIA);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(148);
				match(T__4);
				setState(149);
				match(CADEIA);
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PersonagensContext extends ParserRuleContext {
		public DelimContext delim() {
			return getRuleContext(DelimContext.class,0);
		}
		public List<PersonagemDecContext> personagemDec() {
			return getRuleContexts(PersonagemDecContext.class);
		}
		public PersonagemDecContext personagemDec(int i) {
			return getRuleContext(PersonagemDecContext.class,i);
		}
		public PersonagensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_personagens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterPersonagens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitPersonagens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitPersonagens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PersonagensContext personagens() throws RecognitionException {
		PersonagensContext _localctx = new PersonagensContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_personagens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__15);
			setState(156);
			delim();
			setState(157);
			personagemDec();
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(158);
				match(T__4);
				setState(159);
				personagemDec();
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PersonagemDecContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(gramaticaParser.IDENTIFICADOR, 0); }
		public PersonagemDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_personagemDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).enterPersonagemDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof gramaticaListener ) ((gramaticaListener)listener).exitPersonagemDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof gramaticaVisitor ) return ((gramaticaVisitor<? extends T>)visitor).visitPersonagemDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PersonagemDecContext personagemDec() throws RecognitionException {
		PersonagemDecContext _localctx = new PersonagemDecContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_personagemDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(IDENTIFICADOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0014\u00a8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004;\b\u0004\n\u0004\f\u0004>\t"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005E\b\u0005\n\u0005\f\u0005H\t\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006P\b\u0006\n\u0006"+
		"\f\u0006S\t\u0006\u0001\u0006\u0001\u0006\u0003\u0006W\b\u0006\u0001\u0006"+
		"\u0003\u0006Z\b\u0006\u0001\u0006\u0005\u0006]\b\u0006\n\u0006\f\u0006"+
		"`\t\u0006\u0001\u0006\u0005\u0006c\b\u0006\n\u0006\f\u0006f\t\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007m\b"+
		"\u0007\n\u0007\f\u0007p\t\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0097\b\u000f\n\u000f\f\u000f"+
		"\u009a\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u00a1\b\u0010\n\u0010\f\u0010\u00a4\t\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0000\u0000\u0012\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"\u0000\u0000\u009f"+
		"\u0000$\u0001\u0000\u0000\u0000\u0002(\u0001\u0000\u0000\u0000\u0004*"+
		"\u0001\u0000\u0000\u0000\u00061\u0001\u0000\u0000\u0000\b5\u0001\u0000"+
		"\u0000\u0000\n?\u0001\u0000\u0000\u0000\fI\u0001\u0000\u0000\u0000\u000e"+
		"g\u0001\u0000\u0000\u0000\u0010q\u0001\u0000\u0000\u0000\u0012u\u0001"+
		"\u0000\u0000\u0000\u0014y\u0001\u0000\u0000\u0000\u0016}\u0001\u0000\u0000"+
		"\u0000\u0018\u007f\u0001\u0000\u0000\u0000\u001a\u0085\u0001\u0000\u0000"+
		"\u0000\u001c\u0089\u0001\u0000\u0000\u0000\u001e\u0091\u0001\u0000\u0000"+
		"\u0000 \u009b\u0001\u0000\u0000\u0000\"\u00a5\u0001\u0000\u0000\u0000"+
		"$%\u0003\u0004\u0002\u0000%&\u0003\f\u0006\u0000&\'\u0005\u0000\u0000"+
		"\u0001\'\u0001\u0001\u0000\u0000\u0000()\u0005\u0001\u0000\u0000)\u0003"+
		"\u0001\u0000\u0000\u0000*+\u0005\u0002\u0000\u0000+,\u0005\u0011\u0000"+
		"\u0000,-\u0003\u0002\u0001\u0000-.\u0003\u0006\u0003\u0000./\u0003\b\u0004"+
		"\u0000/0\u0003\n\u0005\u00000\u0005\u0001\u0000\u0000\u000012\u0005\u0003"+
		"\u0000\u000023\u0003\u0002\u0001\u000034\u0005\u0012\u0000\u00004\u0007"+
		"\u0001\u0000\u0000\u000056\u0005\u0004\u0000\u000067\u0003\u0002\u0001"+
		"\u00007<\u0005\u0012\u0000\u000089\u0005\u0005\u0000\u00009;\u0005\u0012"+
		"\u0000\u0000:8\u0001\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001"+
		"\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=\t\u0001\u0000\u0000\u0000"+
		"><\u0001\u0000\u0000\u0000?@\u0005\u0006\u0000\u0000@A\u0003\u0002\u0001"+
		"\u0000AF\u0005\u0012\u0000\u0000BC\u0005\u0005\u0000\u0000CE\u0005\u0012"+
		"\u0000\u0000DB\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000\u0000FD\u0001"+
		"\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000G\u000b\u0001\u0000\u0000"+
		"\u0000HF\u0001\u0000\u0000\u0000IJ\u0005\u0007\u0000\u0000JK\u0003\u0002"+
		"\u0001\u0000KL\u0003\u0006\u0003\u0000LQ\u0003\u000e\u0007\u0000MN\u0005"+
		"\u0005\u0000\u0000NP\u0003\u000e\u0007\u0000OM\u0001\u0000\u0000\u0000"+
		"PS\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000"+
		"\u0000RT\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000TV\u0003\u0010"+
		"\b\u0000UW\u0003\u0012\t\u0000VU\u0001\u0000\u0000\u0000VW\u0001\u0000"+
		"\u0000\u0000WY\u0001\u0000\u0000\u0000XZ\u0003\u0014\n\u0000YX\u0001\u0000"+
		"\u0000\u0000YZ\u0001\u0000\u0000\u0000Z^\u0001\u0000\u0000\u0000[]\u0003"+
		"\u0016\u000b\u0000\\[\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000"+
		"^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_d\u0001\u0000\u0000"+
		"\u0000`^\u0001\u0000\u0000\u0000ac\u0003\u001c\u000e\u0000ba\u0001\u0000"+
		"\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001"+
		"\u0000\u0000\u0000e\r\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000"+
		"gh\u0005\b\u0000\u0000hi\u0003\u0002\u0001\u0000in\u0005\u0012\u0000\u0000"+
		"jk\u0005\u0005\u0000\u0000km\u0005\u0012\u0000\u0000lj\u0001\u0000\u0000"+
		"\u0000mp\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001\u0000"+
		"\u0000\u0000o\u000f\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000"+
		"qr\u0005\t\u0000\u0000rs\u0003\u0002\u0001\u0000st\u0005\u0012\u0000\u0000"+
		"t\u0011\u0001\u0000\u0000\u0000uv\u0005\n\u0000\u0000vw\u0003\u0002\u0001"+
		"\u0000wx\u0005\u0012\u0000\u0000x\u0013\u0001\u0000\u0000\u0000yz\u0005"+
		"\u000b\u0000\u0000z{\u0003\u0002\u0001\u0000{|\u0005\u0012\u0000\u0000"+
		"|\u0015\u0001\u0000\u0000\u0000}~\u0003\u0018\f\u0000~\u0017\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0005\f\u0000\u0000\u0080\u0081\u0005\u0011\u0000"+
		"\u0000\u0081\u0082\u0003\u0002\u0001\u0000\u0082\u0083\u0003\u0006\u0003"+
		"\u0000\u0083\u0084\u0003\u001a\r\u0000\u0084\u0019\u0001\u0000\u0000\u0000"+
		"\u0085\u0086\u0005\r\u0000\u0000\u0086\u0087\u0003\u0002\u0001\u0000\u0087"+
		"\u0088\u0005\u0012\u0000\u0000\u0088\u001b\u0001\u0000\u0000\u0000\u0089"+
		"\u008a\u0005\u000e\u0000\u0000\u008a\u008b\u0005\u0011\u0000\u0000\u008b"+
		"\u008c\u0003\u0002\u0001\u0000\u008c\u008d\u0003\u0006\u0003\u0000\u008d"+
		"\u008e\u0003\u0010\b\u0000\u008e\u008f\u0003\u001e\u000f\u0000\u008f\u0090"+
		"\u0003 \u0010\u0000\u0090\u001d\u0001\u0000\u0000\u0000\u0091\u0092\u0005"+
		"\u000f\u0000\u0000\u0092\u0093\u0003\u0002\u0001\u0000\u0093\u0098\u0005"+
		"\u0012\u0000\u0000\u0094\u0095\u0005\u0005\u0000\u0000\u0095\u0097\u0005"+
		"\u0012\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0097\u009a\u0001"+
		"\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001"+
		"\u0000\u0000\u0000\u0099\u001f\u0001\u0000\u0000\u0000\u009a\u0098\u0001"+
		"\u0000\u0000\u0000\u009b\u009c\u0005\u0010\u0000\u0000\u009c\u009d\u0003"+
		"\u0002\u0001\u0000\u009d\u00a2\u0003\"\u0011\u0000\u009e\u009f\u0005\u0005"+
		"\u0000\u0000\u009f\u00a1\u0003\"\u0011\u0000\u00a0\u009e\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3!\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\u0011\u0000\u0000"+
		"\u00a6#\u0001\u0000\u0000\u0000\n<FQVY^dn\u0098\u00a2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}