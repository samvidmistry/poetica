// Generated from /run/media/samvidmistry/Data/GitHub/poetica/src/poetica.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class poeticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T_INT=36, T_FLOAT=37, T_VOID=38, 
		ID=39, INT=40, FLOAT=41, STRING=42, WS=43, SLC=44, MLC=45, DIGIT=46;
	public static final int
		RULE_prog = 0, RULE_error = 1, RULE_imports = 2, RULE_vardeclaration = 3, 
		RULE_type = 4, RULE_function = 5, RULE_formalargs = 6, RULE_arg = 7, RULE_expr = 8, 
		RULE_exprList = 9, RULE_funblock = 10, RULE_block = 11, RULE_stat = 12;
	public static final String[] ruleNames = {
		"prog", "error", "imports", "vardeclaration", "type", "function", "formalargs", 
		"arg", "expr", "exprList", "funblock", "block", "stat"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'include '", "'='", "','", "';'", "'('", "')'", "'*'", "'/'", "'+'", 
		"'-'", "'%'", "'++'", "'--'", "'&&'", "'||'", "'!'", "'?'", "':'", "'=='", 
		"'!='", "'>'", "'<'", "'>='", "'<='", "'{'", "'}'", "'if'", "'else'", 
		"'for'", "'while'", "'do'", "'break'", "'continue'", "'goto'", "'return'", 
		"'int'", "'float'", "'void'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"T_INT", "T_FLOAT", "T_VOID", "ID", "INT", "FLOAT", "STRING", "WS", "SLC", 
		"MLC", "DIGIT"
	};
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
	public String getGrammarFileName() { return "poetica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public poeticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public ImportsContext imports() {
			return getRuleContext(ImportsContext.class,0);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public List<VardeclarationContext> vardeclaration() {
			return getRuleContexts(VardeclarationContext.class);
		}
		public VardeclarationContext vardeclaration(int i) {
			return getRuleContext(VardeclarationContext.class,i);
		}
		public List<ErrorContext> error() {
			return getRuleContexts(ErrorContext.class);
		}
		public ErrorContext error(int i) {
			return getRuleContext(ErrorContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(26);
				imports();
				}
			}

			setState(32); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(32);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(29);
					function();
					}
					break;
				case 2:
					{
					setState(30);
					vardeclaration();
					}
					break;
				case 3:
					{
					setState(31);
					error();
					}
					break;
				}
				}
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_INT) | (1L << T_FLOAT) | (1L << T_VOID) | (1L << ID))) != 0) );
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

	public static class ErrorContext extends ParserRuleContext {
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
	 
		public ErrorContext() { }
		public void copyFrom(ErrorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ErrorIdContext extends ErrorContext {
		public TerminalNode ID() { return getToken(poeticaParser.ID, 0); }
		public ErrorIdContext(ErrorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).enterErrorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).exitErrorId(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_error);
		try {
			_localctx = new ErrorIdContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(ID);
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

	public static class ImportsContext extends ParserRuleContext {
		public ImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports; }
	 
		public ImportsContext() { }
		public void copyFrom(ImportsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ImportSectionContext extends ImportsContext {
		public TerminalNode STRING() { return getToken(poeticaParser.STRING, 0); }
		public ImportSectionContext(ImportsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).enterImportSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).exitImportSection(this);
		}
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_imports);
		try {
			_localctx = new ImportSectionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(T__0);
			setState(39);
			match(STRING);
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

	public static class VardeclarationContext extends ParserRuleContext {
		public VardeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardeclaration; }
	 
		public VardeclarationContext() { }
		public void copyFrom(VardeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariableDeclarationContext extends VardeclarationContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(poeticaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(poeticaParser.ID, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public VariableDeclarationContext(VardeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VardeclarationContext vardeclaration() throws RecognitionException {
		VardeclarationContext _localctx = new VardeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vardeclaration);
		int _la;
		try {
			_localctx = new VariableDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			type();
			setState(42);
			match(ID);
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(43);
				match(T__1);
				setState(44);
				expr(0);
				}
			}

			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(47);
				match(T__2);
				setState(48);
				match(ID);
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(49);
					match(T__1);
					setState(50);
					expr(0);
					}
				}

				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
			match(T__3);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode T_INT() { return getToken(poeticaParser.T_INT, 0); }
		public TerminalNode T_FLOAT() { return getToken(poeticaParser.T_FLOAT, 0); }
		public TerminalNode T_VOID() { return getToken(poeticaParser.T_VOID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_INT) | (1L << T_FLOAT) | (1L << T_VOID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class FunctionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(poeticaParser.ID, 0); }
		public FunblockContext funblock() {
			return getRuleContext(FunblockContext.class,0);
		}
		public FormalargsContext formalargs() {
			return getRuleContext(FormalargsContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			type();
			setState(63);
			match(ID);
			setState(64);
			match(T__4);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_INT) | (1L << T_FLOAT) | (1L << T_VOID))) != 0)) {
				{
				setState(65);
				formalargs();
				}
			}

			setState(68);
			match(T__5);
			setState(69);
			funblock();
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

	public static class FormalargsContext extends ParserRuleContext {
		public FormalargsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalargs; }
	 
		public FormalargsContext() { }
		public void copyFrom(FormalargsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArgumentsContext extends FormalargsContext {
		public List<ArgContext> arg() {
			return getRuleContexts(ArgContext.class);
		}
		public ArgContext arg(int i) {
			return getRuleContext(ArgContext.class,i);
		}
		public ArgumentsContext(FormalargsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).exitArguments(this);
		}
	}

	public final FormalargsContext formalargs() throws RecognitionException {
		FormalargsContext _localctx = new FormalargsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_formalargs);
		int _la;
		try {
			_localctx = new ArgumentsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			arg();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(72);
				match(T__2);
				setState(73);
				arg();
				}
				}
				setState(78);
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

	public static class ArgContext extends ParserRuleContext {
		public ArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg; }
	 
		public ArgContext() { }
		public void copyFrom(ArgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArgumentContext extends ArgContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(poeticaParser.ID, 0); }
		public ArgumentContext(ArgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).exitArgument(this);
		}
	}

	public final ArgContext arg() throws RecognitionException {
		ArgContext _localctx = new ArgContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_arg);
		try {
			_localctx = new ArgumentContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			type();
			setState(80);
			match(ID);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TerneryContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerneryContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).enterTernery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).exitTernery(this);
		}
	}
	public static class RelativeContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RelativeContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).enterRelative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).exitRelative(this);
		}
	}
	public static class ModContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ModContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).enterMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).exitMod(this);
		}
	}
	public static class StringContext extends ExprContext {
		public TerminalNode STRING() { return getToken(poeticaParser.STRING, 0); }
		public StringContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).exitString(this);
		}
	}
	public static class AddSubContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).exitAddSub(this);
		}
	}
	public static class ParanthesesContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParanthesesContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).enterParantheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).exitParantheses(this);
		}
	}
	public static class ShorthandContext extends ExprContext {
		public TerminalNode ID() { return getToken(poeticaParser.ID, 0); }
		public ShorthandContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).enterShorthand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).exitShorthand(this);
		}
	}
	public static class FloatContext extends ExprContext {
		public TerminalNode FLOAT() { return getToken(poeticaParser.FLOAT, 0); }
		public FloatContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).exitFloat(this);
		}
	}
	public static class FunCallContext extends ExprContext {
		public TerminalNode ID() { return getToken(poeticaParser.ID, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public FunCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).enterFunCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).exitFunCall(this);
		}
	}
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(poeticaParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).exitInt(this);
		}
	}
	public static class NotContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).exitNot(this);
		}
	}
	public static class MulSubContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MulSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).enterMulSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).exitMulSub(this);
		}
	}
	public static class VariableContext extends ExprContext {
		public TerminalNode ID() { return getToken(poeticaParser.ID, 0); }
		public VariableContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).exitVariable(this);
		}
	}
	public static class AndOrContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AndOrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).enterAndOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).exitAndOr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new FunCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(83);
				match(ID);
				setState(84);
				match(T__4);
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__15) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
					{
					setState(85);
					exprList();
					}
				}

				setState(88);
				match(T__5);
				}
				break;
			case 2:
				{
				_localctx = new ShorthandContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(89);
				match(ID);
				setState(90);
				_la = _input.LA(1);
				if ( !(_la==T__11 || _la==T__12) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				match(T__15);
				setState(92);
				expr(8);
				}
				break;
			case 4:
				{
				_localctx = new TerneryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93);
				match(T__4);
				setState(94);
				expr(0);
				setState(95);
				match(T__5);
				setState(96);
				match(T__16);
				setState(97);
				expr(0);
				setState(98);
				match(T__17);
				setState(99);
				expr(7);
				}
				break;
			case 5:
				{
				_localctx = new ParanthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(101);
				match(T__4);
				setState(102);
				expr(0);
				setState(103);
				match(T__5);
				}
				break;
			case 6:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(105);
				match(ID);
				}
				break;
			case 7:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(106);
				match(STRING);
				}
				break;
			case 8:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107);
				match(INT);
				}
				break;
			case 9:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(108);
				match(FLOAT);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(126);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new MulSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(111);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(112);
						_la = _input.LA(1);
						if ( !(_la==T__6 || _la==T__7) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(113);
						expr(14);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(114);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(115);
						_la = _input.LA(1);
						if ( !(_la==T__8 || _la==T__9) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(116);
						expr(13);
						}
						break;
					case 3:
						{
						_localctx = new ModContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(117);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(118);
						match(T__10);
						setState(119);
						expr(12);
						}
						break;
					case 4:
						{
						_localctx = new AndOrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(120);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(121);
						_la = _input.LA(1);
						if ( !(_la==T__13 || _la==T__14) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(122);
						expr(10);
						}
						break;
					case 5:
						{
						_localctx = new RelativeContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(123);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(124);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(125);
						expr(7);
						}
						break;
					}
					} 
				}
				setState(130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).exitExprList(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			expr(0);
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(132);
				match(T__2);
				setState(133);
				expr(0);
				}
				}
				setState(138);
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

	public static class FunblockContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public FunblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).enterFunblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).exitFunblock(this);
		}
	}

	public final FunblockContext funblock() throws RecognitionException {
		FunblockContext _localctx = new FunblockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(T__24);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__15) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T_INT) | (1L << T_FLOAT) | (1L << T_VOID) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				{
				setState(140);
				stat();
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
			match(T__25);
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_block);
		int _la;
		try {
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(T__24);
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__15) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T_INT) | (1L << T_FLOAT) | (1L << T_VOID) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
					{
					{
					setState(149);
					stat();
					}
					}
					setState(154);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(155);
				match(T__25);
				}
				break;
			case T__4:
			case T__15:
			case T__26:
			case T__28:
			case T__29:
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T_INT:
			case T_FLOAT:
			case T_VOID:
			case ID:
			case INT:
			case FLOAT:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				stat();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DowhileContext extends StatContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DowhileContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).enterDowhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).exitDowhile(this);
		}
	}
	public static class GotoContext extends StatContext {
		public TerminalNode ID() { return getToken(poeticaParser.ID, 0); }
		public GotoContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).enterGoto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).exitGoto(this);
		}
	}
	public static class ExpressionStatContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExpressionStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).enterExpressionStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).exitExpressionStat(this);
		}
	}
	public static class BreakContext extends StatContext {
		public BreakContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).enterBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).exitBreak(this);
		}
	}
	public static class AssignmentContext extends StatContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AssignmentContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).exitAssignment(this);
		}
	}
	public static class ContinueContext extends StatContext {
		public ContinueContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).enterContinue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).exitContinue(this);
		}
	}
	public static class VariableDeclarationStatContext extends StatContext {
		public VardeclarationContext vardeclaration() {
			return getRuleContext(VardeclarationContext.class,0);
		}
		public VariableDeclarationStatContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).enterVariableDeclarationStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).exitVariableDeclarationStat(this);
		}
	}
	public static class ForContext extends StatContext {
		public VardeclarationContext vardeclaration() {
			return getRuleContext(VardeclarationContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).exitFor(this);
		}
	}
	public static class LabelContext extends StatContext {
		public TerminalNode ID() { return getToken(poeticaParser.ID, 0); }
		public LabelContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).enterLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).exitLabel(this);
		}
	}
	public static class WhileContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).exitWhile(this);
		}
	}
	public static class IfContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).exitIf(this);
		}
	}
	public static class ReturnContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof poeticaListener ) ((poeticaListener)listener).exitReturn(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stat);
		int _la;
		try {
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new VariableDeclarationStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				vardeclaration();
				}
				break;
			case 2:
				_localctx = new ExpressionStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				expr(0);
				setState(161);
				match(T__3);
				}
				break;
			case 3:
				_localctx = new LabelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
				match(ID);
				setState(164);
				match(T__17);
				}
				break;
			case 4:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(165);
				match(T__26);
				setState(166);
				match(T__4);
				setState(167);
				expr(0);
				setState(168);
				match(T__5);
				setState(169);
				block();
				setState(172);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(170);
					match(T__27);
					setState(171);
					block();
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(174);
				match(T__28);
				setState(175);
				match(T__4);
				setState(176);
				vardeclaration();
				setState(177);
				expr(0);
				setState(178);
				match(T__3);
				setState(179);
				expr(0);
				setState(180);
				match(T__5);
				setState(181);
				block();
				}
				break;
			case 6:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(183);
				match(T__29);
				setState(184);
				match(T__4);
				setState(185);
				expr(0);
				setState(186);
				match(T__5);
				setState(187);
				block();
				}
				break;
			case 7:
				_localctx = new DowhileContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(189);
				match(T__30);
				setState(190);
				match(T__24);
				setState(191);
				block();
				setState(192);
				match(T__25);
				setState(193);
				match(T__29);
				setState(194);
				match(T__4);
				setState(195);
				expr(0);
				setState(196);
				match(T__5);
				setState(197);
				match(T__3);
				}
				break;
			case 8:
				_localctx = new AssignmentContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(199);
				expr(0);
				setState(202); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(200);
					match(T__1);
					setState(201);
					expr(0);
					}
					}
					setState(204); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__1 );
				setState(206);
				match(T__3);
				}
				break;
			case 9:
				_localctx = new BreakContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(208);
				match(T__31);
				setState(209);
				match(T__3);
				}
				break;
			case 10:
				_localctx = new ContinueContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(210);
				match(T__32);
				setState(211);
				match(T__3);
				}
				break;
			case 11:
				_localctx = new GotoContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(212);
				match(T__33);
				setState(213);
				match(ID);
				setState(214);
				match(T__3);
				}
				break;
			case 12:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(215);
				match(T__34);
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__15) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
					{
					setState(216);
					expr(0);
					}
				}

				setState(219);
				match(T__3);
				}
				break;
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u00e1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\5\2\36\n\2\3\2\3\2\3\2\6\2#\n\2\r"+
		"\2\16\2$\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5\60\n\5\3\5\3\5\3\5\3"+
		"\5\5\5\66\n\5\7\58\n\5\f\5\16\5;\13\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\5\7E\n\7\3\7\3\7\3\7\3\b\3\b\3\b\7\bM\n\b\f\b\16\bP\13\b\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\5\nY\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\np\n\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u0081\n\n\f\n\16\n\u0084"+
		"\13\n\3\13\3\13\3\13\7\13\u0089\n\13\f\13\16\13\u008c\13\13\3\f\3\f\7"+
		"\f\u0090\n\f\f\f\16\f\u0093\13\f\3\f\3\f\3\r\3\r\7\r\u0099\n\r\f\r\16"+
		"\r\u009c\13\r\3\r\3\r\5\r\u00a0\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00af\n\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\6\16\u00cd\n\16\r\16\16"+
		"\16\u00ce\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u00dc\n\16\3\16\5\16\u00df\n\16\3\16\2\3\22\17\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\2\b\3\2&(\3\2\16\17\3\2\t\n\3\2\13\f\3\2\20\21\3\2\25\32\2\u00fc"+
		"\2\35\3\2\2\2\4&\3\2\2\2\6(\3\2\2\2\b+\3\2\2\2\n>\3\2\2\2\f@\3\2\2\2\16"+
		"I\3\2\2\2\20Q\3\2\2\2\22o\3\2\2\2\24\u0085\3\2\2\2\26\u008d\3\2\2\2\30"+
		"\u009f\3\2\2\2\32\u00de\3\2\2\2\34\36\5\6\4\2\35\34\3\2\2\2\35\36\3\2"+
		"\2\2\36\"\3\2\2\2\37#\5\f\7\2 #\5\b\5\2!#\5\4\3\2\"\37\3\2\2\2\" \3\2"+
		"\2\2\"!\3\2\2\2#$\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\3\3\2\2\2&\'\7)\2\2\'"+
		"\5\3\2\2\2()\7\3\2\2)*\7,\2\2*\7\3\2\2\2+,\5\n\6\2,/\7)\2\2-.\7\4\2\2"+
		".\60\5\22\n\2/-\3\2\2\2/\60\3\2\2\2\609\3\2\2\2\61\62\7\5\2\2\62\65\7"+
		")\2\2\63\64\7\4\2\2\64\66\5\22\n\2\65\63\3\2\2\2\65\66\3\2\2\2\668\3\2"+
		"\2\2\67\61\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2"+
		"<=\7\6\2\2=\t\3\2\2\2>?\t\2\2\2?\13\3\2\2\2@A\5\n\6\2AB\7)\2\2BD\7\7\2"+
		"\2CE\5\16\b\2DC\3\2\2\2DE\3\2\2\2EF\3\2\2\2FG\7\b\2\2GH\5\26\f\2H\r\3"+
		"\2\2\2IN\5\20\t\2JK\7\5\2\2KM\5\20\t\2LJ\3\2\2\2MP\3\2\2\2NL\3\2\2\2N"+
		"O\3\2\2\2O\17\3\2\2\2PN\3\2\2\2QR\5\n\6\2RS\7)\2\2S\21\3\2\2\2TU\b\n\1"+
		"\2UV\7)\2\2VX\7\7\2\2WY\5\24\13\2XW\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Zp\7\b"+
		"\2\2[\\\7)\2\2\\p\t\3\2\2]^\7\22\2\2^p\5\22\n\n_`\7\7\2\2`a\5\22\n\2a"+
		"b\7\b\2\2bc\7\23\2\2cd\5\22\n\2de\7\24\2\2ef\5\22\n\tfp\3\2\2\2gh\7\7"+
		"\2\2hi\5\22\n\2ij\7\b\2\2jp\3\2\2\2kp\7)\2\2lp\7,\2\2mp\7*\2\2np\7+\2"+
		"\2oT\3\2\2\2o[\3\2\2\2o]\3\2\2\2o_\3\2\2\2og\3\2\2\2ok\3\2\2\2ol\3\2\2"+
		"\2om\3\2\2\2on\3\2\2\2p\u0082\3\2\2\2qr\f\17\2\2rs\t\4\2\2s\u0081\5\22"+
		"\n\20tu\f\16\2\2uv\t\5\2\2v\u0081\5\22\n\17wx\f\r\2\2xy\7\r\2\2y\u0081"+
		"\5\22\n\16z{\f\13\2\2{|\t\6\2\2|\u0081\5\22\n\f}~\f\b\2\2~\177\t\7\2\2"+
		"\177\u0081\5\22\n\t\u0080q\3\2\2\2\u0080t\3\2\2\2\u0080w\3\2\2\2\u0080"+
		"z\3\2\2\2\u0080}\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\23\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u008a\5\22\n"+
		"\2\u0086\u0087\7\5\2\2\u0087\u0089\5\22\n\2\u0088\u0086\3\2\2\2\u0089"+
		"\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\25\3\2\2"+
		"\2\u008c\u008a\3\2\2\2\u008d\u0091\7\33\2\2\u008e\u0090\5\32\16\2\u008f"+
		"\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2"+
		"\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\7\34\2\2\u0095"+
		"\27\3\2\2\2\u0096\u009a\7\33\2\2\u0097\u0099\5\32\16\2\u0098\u0097\3\2"+
		"\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u00a0\7\34\2\2\u009e\u00a0\5"+
		"\32\16\2\u009f\u0096\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\31\3\2\2\2\u00a1"+
		"\u00df\5\b\5\2\u00a2\u00a3\5\22\n\2\u00a3\u00a4\7\6\2\2\u00a4\u00df\3"+
		"\2\2\2\u00a5\u00a6\7)\2\2\u00a6\u00df\7\24\2\2\u00a7\u00a8\7\35\2\2\u00a8"+
		"\u00a9\7\7\2\2\u00a9\u00aa\5\22\n\2\u00aa\u00ab\7\b\2\2\u00ab\u00ae\5"+
		"\30\r\2\u00ac\u00ad\7\36\2\2\u00ad\u00af\5\30\r\2\u00ae\u00ac\3\2\2\2"+
		"\u00ae\u00af\3\2\2\2\u00af\u00df\3\2\2\2\u00b0\u00b1\7\37\2\2\u00b1\u00b2"+
		"\7\7\2\2\u00b2\u00b3\5\b\5\2\u00b3\u00b4\5\22\n\2\u00b4\u00b5\7\6\2\2"+
		"\u00b5\u00b6\5\22\n\2\u00b6\u00b7\7\b\2\2\u00b7\u00b8\5\30\r\2\u00b8\u00df"+
		"\3\2\2\2\u00b9\u00ba\7 \2\2\u00ba\u00bb\7\7\2\2\u00bb\u00bc\5\22\n\2\u00bc"+
		"\u00bd\7\b\2\2\u00bd\u00be\5\30\r\2\u00be\u00df\3\2\2\2\u00bf\u00c0\7"+
		"!\2\2\u00c0\u00c1\7\33\2\2\u00c1\u00c2\5\30\r\2\u00c2\u00c3\7\34\2\2\u00c3"+
		"\u00c4\7 \2\2\u00c4\u00c5\7\7\2\2\u00c5\u00c6\5\22\n\2\u00c6\u00c7\7\b"+
		"\2\2\u00c7\u00c8\7\6\2\2\u00c8\u00df\3\2\2\2\u00c9\u00cc\5\22\n\2\u00ca"+
		"\u00cb\7\4\2\2\u00cb\u00cd\5\22\n\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\3"+
		"\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00d1\7\6\2\2\u00d1\u00df\3\2\2\2\u00d2\u00d3\7\"\2\2\u00d3\u00df\7\6"+
		"\2\2\u00d4\u00d5\7#\2\2\u00d5\u00df\7\6\2\2\u00d6\u00d7\7$\2\2\u00d7\u00d8"+
		"\7)\2\2\u00d8\u00df\7\6\2\2\u00d9\u00db\7%\2\2\u00da\u00dc\5\22\n\2\u00db"+
		"\u00da\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\7\6"+
		"\2\2\u00de\u00a1\3\2\2\2\u00de\u00a2\3\2\2\2\u00de\u00a5\3\2\2\2\u00de"+
		"\u00a7\3\2\2\2\u00de\u00b0\3\2\2\2\u00de\u00b9\3\2\2\2\u00de\u00bf\3\2"+
		"\2\2\u00de\u00c9\3\2\2\2\u00de\u00d2\3\2\2\2\u00de\u00d4\3\2\2\2\u00de"+
		"\u00d6\3\2\2\2\u00de\u00d9\3\2\2\2\u00df\33\3\2\2\2\26\35\"$/\659DNXo"+
		"\u0080\u0082\u008a\u0091\u009a\u009f\u00ae\u00ce\u00db\u00de";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}