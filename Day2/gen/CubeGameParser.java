// Generated from D:/java/projects/Advent2023/src/main/antlr/CubeGameParser.g4 by ANTLR 4.13.1
package net.theprism.advent2023.day2.antlr
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CubeGameParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMA=1, COLON=2, SEMI=3, GAME=4, RED=5, GREEN=6, BLUE=7, INT=8, WS=9;
	public static final int
		RULE_program = 0, RULE_game = 1, RULE_turn = 2, RULE_pull = 3, RULE_pullred = 4, 
		RULE_pullgreen = 5, RULE_pullblue = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "game", "turn", "pull", "pullred", "pullgreen", "pullblue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "':'", "';'", "'Game'", "'red'", "'green'", "'blue'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMA", "COLON", "SEMI", "GAME", "RED", "GREEN", "BLUE", "INT", 
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
	public String getGrammarFileName() { return "CubeGameParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CubeGameParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CubeGameParser.EOF, 0); }
		public List<GameContext> game() {
			return getRuleContexts(GameContext.class);
		}
		public GameContext game(int i) {
			return getRuleContext(GameContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubeGameParserListener ) ((CubeGameParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubeGameParserListener ) ((CubeGameParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CubeGameParserVisitor ) return ((CubeGameParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14);
				game();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==GAME );
			setState(19);
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

	@SuppressWarnings("CheckReturnValue")
	public static class GameContext extends ParserRuleContext {
		public TerminalNode GAME() { return getToken(CubeGameParser.GAME, 0); }
		public TerminalNode INT() { return getToken(CubeGameParser.INT, 0); }
		public TerminalNode COLON() { return getToken(CubeGameParser.COLON, 0); }
		public List<TurnContext> turn() {
			return getRuleContexts(TurnContext.class);
		}
		public TurnContext turn(int i) {
			return getRuleContext(TurnContext.class,i);
		}
		public GameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_game; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubeGameParserListener ) ((CubeGameParserListener)listener).enterGame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubeGameParserListener ) ((CubeGameParserListener)listener).exitGame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CubeGameParserVisitor ) return ((CubeGameParserVisitor<? extends T>)visitor).visitGame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GameContext game() throws RecognitionException {
		GameContext _localctx = new GameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_game);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(GAME);
			setState(22);
			match(INT);
			setState(23);
			match(COLON);
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				turn();
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INT );
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

	@SuppressWarnings("CheckReturnValue")
	public static class TurnContext extends ParserRuleContext {
		public List<PullContext> pull() {
			return getRuleContexts(PullContext.class);
		}
		public PullContext pull(int i) {
			return getRuleContext(PullContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(CubeGameParser.SEMI, 0); }
		public TurnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubeGameParserListener ) ((CubeGameParserListener)listener).enterTurn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubeGameParserListener ) ((CubeGameParserListener)listener).exitTurn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CubeGameParserVisitor ) return ((CubeGameParserVisitor<? extends T>)visitor).visitTurn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TurnContext turn() throws RecognitionException {
		TurnContext _localctx = new TurnContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_turn);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(30); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(29);
					pull();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(32); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(34);
				match(SEMI);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class PullContext extends ParserRuleContext {
		public PullredContext pullred() {
			return getRuleContext(PullredContext.class,0);
		}
		public PullgreenContext pullgreen() {
			return getRuleContext(PullgreenContext.class,0);
		}
		public PullblueContext pullblue() {
			return getRuleContext(PullblueContext.class,0);
		}
		public PullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pull; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubeGameParserListener ) ((CubeGameParserListener)listener).enterPull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubeGameParserListener ) ((CubeGameParserListener)listener).exitPull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CubeGameParserVisitor ) return ((CubeGameParserVisitor<? extends T>)visitor).visitPull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PullContext pull() throws RecognitionException {
		PullContext _localctx = new PullContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pull);
		try {
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				pullred();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				pullgreen();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				pullblue();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PullredContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CubeGameParser.INT, 0); }
		public TerminalNode RED() { return getToken(CubeGameParser.RED, 0); }
		public TerminalNode COMMA() { return getToken(CubeGameParser.COMMA, 0); }
		public PullredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pullred; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubeGameParserListener ) ((CubeGameParserListener)listener).enterPullred(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubeGameParserListener ) ((CubeGameParserListener)listener).exitPullred(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CubeGameParserVisitor ) return ((CubeGameParserVisitor<? extends T>)visitor).visitPullred(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PullredContext pullred() throws RecognitionException {
		PullredContext _localctx = new PullredContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pullred);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(INT);
			setState(43);
			match(RED);
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(44);
				match(COMMA);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class PullgreenContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CubeGameParser.INT, 0); }
		public TerminalNode GREEN() { return getToken(CubeGameParser.GREEN, 0); }
		public TerminalNode COMMA() { return getToken(CubeGameParser.COMMA, 0); }
		public PullgreenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pullgreen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubeGameParserListener ) ((CubeGameParserListener)listener).enterPullgreen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubeGameParserListener ) ((CubeGameParserListener)listener).exitPullgreen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CubeGameParserVisitor ) return ((CubeGameParserVisitor<? extends T>)visitor).visitPullgreen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PullgreenContext pullgreen() throws RecognitionException {
		PullgreenContext _localctx = new PullgreenContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pullgreen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(INT);
			setState(48);
			match(GREEN);
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(49);
				match(COMMA);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class PullblueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CubeGameParser.INT, 0); }
		public TerminalNode BLUE() { return getToken(CubeGameParser.BLUE, 0); }
		public TerminalNode COMMA() { return getToken(CubeGameParser.COMMA, 0); }
		public PullblueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pullblue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CubeGameParserListener ) ((CubeGameParserListener)listener).enterPullblue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CubeGameParserListener ) ((CubeGameParserListener)listener).exitPullblue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CubeGameParserVisitor ) return ((CubeGameParserVisitor<? extends T>)visitor).visitPullblue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PullblueContext pullblue() throws RecognitionException {
		PullblueContext _localctx = new PullblueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pullblue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(INT);
			setState(53);
			match(BLUE);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(54);
				match(COMMA);
				}
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

	public static final String _serializedATN =
		"\u0004\u0001\t:\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0004\u0000\u0010"+
		"\b\u0000\u000b\u0000\f\u0000\u0011\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0004\u0001\u001a\b\u0001\u000b\u0001"+
		"\f\u0001\u001b\u0001\u0002\u0004\u0002\u001f\b\u0002\u000b\u0002\f\u0002"+
		" \u0001\u0002\u0003\u0002$\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003)\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		".\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u00053\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u00068\b\u0006\u0001\u0006\u0000"+
		"\u0000\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000\u0000;\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0002\u0015\u0001\u0000\u0000\u0000\u0004\u001e\u0001"+
		"\u0000\u0000\u0000\u0006(\u0001\u0000\u0000\u0000\b*\u0001\u0000\u0000"+
		"\u0000\n/\u0001\u0000\u0000\u0000\f4\u0001\u0000\u0000\u0000\u000e\u0010"+
		"\u0003\u0002\u0001\u0000\u000f\u000e\u0001\u0000\u0000\u0000\u0010\u0011"+
		"\u0001\u0000\u0000\u0000\u0011\u000f\u0001\u0000\u0000\u0000\u0011\u0012"+
		"\u0001\u0000\u0000\u0000\u0012\u0013\u0001\u0000\u0000\u0000\u0013\u0014"+
		"\u0005\u0000\u0000\u0001\u0014\u0001\u0001\u0000\u0000\u0000\u0015\u0016"+
		"\u0005\u0004\u0000\u0000\u0016\u0017\u0005\b\u0000\u0000\u0017\u0019\u0005"+
		"\u0002\u0000\u0000\u0018\u001a\u0003\u0004\u0002\u0000\u0019\u0018\u0001"+
		"\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b\u0019\u0001"+
		"\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u0003\u0001"+
		"\u0000\u0000\u0000\u001d\u001f\u0003\u0006\u0003\u0000\u001e\u001d\u0001"+
		"\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000"+
		"\u0000 !\u0001\u0000\u0000\u0000!#\u0001\u0000\u0000\u0000\"$\u0005\u0003"+
		"\u0000\u0000#\"\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$\u0005"+
		"\u0001\u0000\u0000\u0000%)\u0003\b\u0004\u0000&)\u0003\n\u0005\u0000\'"+
		")\u0003\f\u0006\u0000(%\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000"+
		"(\'\u0001\u0000\u0000\u0000)\u0007\u0001\u0000\u0000\u0000*+\u0005\b\u0000"+
		"\u0000+-\u0005\u0005\u0000\u0000,.\u0005\u0001\u0000\u0000-,\u0001\u0000"+
		"\u0000\u0000-.\u0001\u0000\u0000\u0000.\t\u0001\u0000\u0000\u0000/0\u0005"+
		"\b\u0000\u000002\u0005\u0006\u0000\u000013\u0005\u0001\u0000\u000021\u0001"+
		"\u0000\u0000\u000023\u0001\u0000\u0000\u00003\u000b\u0001\u0000\u0000"+
		"\u000045\u0005\b\u0000\u000057\u0005\u0007\u0000\u000068\u0005\u0001\u0000"+
		"\u000076\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u00008\r\u0001\u0000"+
		"\u0000\u0000\b\u0011\u001b #(-27";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}