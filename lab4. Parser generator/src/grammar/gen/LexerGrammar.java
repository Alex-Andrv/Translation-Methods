// Generated from D:/MT/lab4. Parser generator/src/grammar/antlr4\LexerGrammar.g4 by ANTLR 4.9.2

package grammar.gen;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LexerGrammar extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		GRAMMAR=1, HEADER=2, RETURNS=3, COMMA=4, EQUALS=5, COLON=6, OR=7, REGEX=8, 
		SEMICOLON=9, SPACES=10, OP=11, CP=12, FUNCTIONAL_ARROW=13, SKIP_=14, LOWER_CASE_INTEDEFICATION=15, 
		UPPER_CASE_INTEDEFICATION=16, OPENP=17, CODE_OPENP=18, CODE=19, CLOSEP=20;
	public static final int
		JAVA_CODE=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "JAVA_CODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"GRAMMAR", "HEADER", "RETURNS", "COMMA", "EQUALS", "COLON", "OR", "REGEX", 
			"SEMICOLON", "SPACES", "OP", "CP", "FUNCTIONAL_ARROW", "SKIP_", "LOWER_CASE_INTEDEFICATION", 
			"UPPER_CASE_INTEDEFICATION", "OPENP", "CODE_OPENP", "CODE", "CLOSEP"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'grammar'", "'@header'", "'returns'", "','", "'='", "':'", "'|'", 
			null, "';'", null, "'['", "']'", "'->'", "'skip'", null, null, null, 
			null, null, "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "GRAMMAR", "HEADER", "RETURNS", "COMMA", "EQUALS", "COLON", "OR", 
			"REGEX", "SEMICOLON", "SPACES", "OP", "CP", "FUNCTIONAL_ARROW", "SKIP_", 
			"LOWER_CASE_INTEDEFICATION", "UPPER_CASE_INTEDEFICATION", "OPENP", "CODE_OPENP", 
			"CODE", "CLOSEP"
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


	public LexerGrammar(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LexerGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u0089\b\1\b\1"+
		"\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t"+
		"\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
		"\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\7\tO\n\t\f\t\16\tR\13\t\3\t\3\t\3\n"+
		"\3\n\3\13\6\13Y\n\13\r\13\16\13Z\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\7\20m\n\20\f\20\16\20p\13\20\3"+
		"\21\3\21\7\21t\n\21\f\21\16\21w\13\21\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\24\6\24\u0082\n\24\r\24\16\24\u0083\3\25\3\25\3\25\3\25\2\2"+
		"\26\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24\13\26\f\30\r\32\16\34\17\36"+
		"\20 \21\"\22$\23&\24(\25*\26\4\2\3\b\3\2))\5\2\13\f\17\17\"\"\3\2c|\6"+
		"\2\62;C\\aac|\3\2C\\\4\2}}\177\177\2\u008c\2\4\3\2\2\2\2\6\3\2\2\2\2\b"+
		"\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22\3\2\2"+
		"\2\2\24\3\2\2\2\2\26\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2\34\3\2\2\2\2"+
		"\36\3\2\2\2\2 \3\2\2\2\2\"\3\2\2\2\2$\3\2\2\2\3&\3\2\2\2\3(\3\2\2\2\3"+
		"*\3\2\2\2\4,\3\2\2\2\6\64\3\2\2\2\b<\3\2\2\2\nD\3\2\2\2\fF\3\2\2\2\16"+
		"H\3\2\2\2\20J\3\2\2\2\22L\3\2\2\2\24U\3\2\2\2\26X\3\2\2\2\30^\3\2\2\2"+
		"\32`\3\2\2\2\34b\3\2\2\2\36e\3\2\2\2 j\3\2\2\2\"q\3\2\2\2$x\3\2\2\2&|"+
		"\3\2\2\2(\u0081\3\2\2\2*\u0085\3\2\2\2,-\7i\2\2-.\7t\2\2./\7c\2\2/\60"+
		"\7o\2\2\60\61\7o\2\2\61\62\7c\2\2\62\63\7t\2\2\63\5\3\2\2\2\64\65\7B\2"+
		"\2\65\66\7j\2\2\66\67\7g\2\2\678\7c\2\289\7f\2\29:\7g\2\2:;\7t\2\2;\7"+
		"\3\2\2\2<=\7t\2\2=>\7g\2\2>?\7v\2\2?@\7w\2\2@A\7t\2\2AB\7p\2\2BC\7u\2"+
		"\2C\t\3\2\2\2DE\7.\2\2E\13\3\2\2\2FG\7?\2\2G\r\3\2\2\2HI\7<\2\2I\17\3"+
		"\2\2\2JK\7~\2\2K\21\3\2\2\2LP\7)\2\2MO\n\2\2\2NM\3\2\2\2OR\3\2\2\2PN\3"+
		"\2\2\2PQ\3\2\2\2QS\3\2\2\2RP\3\2\2\2ST\7)\2\2T\23\3\2\2\2UV\7=\2\2V\25"+
		"\3\2\2\2WY\t\3\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2"+
		"\\]\b\13\2\2]\27\3\2\2\2^_\7]\2\2_\31\3\2\2\2`a\7_\2\2a\33\3\2\2\2bc\7"+
		"/\2\2cd\7@\2\2d\35\3\2\2\2ef\7u\2\2fg\7m\2\2gh\7k\2\2hi\7r\2\2i\37\3\2"+
		"\2\2jn\t\4\2\2km\t\5\2\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o!\3\2"+
		"\2\2pn\3\2\2\2qu\t\6\2\2rt\t\5\2\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2"+
		"\2\2v#\3\2\2\2wu\3\2\2\2xy\7}\2\2yz\3\2\2\2z{\b\22\3\2{%\3\2\2\2|}\7}"+
		"\2\2}~\3\2\2\2~\177\b\23\3\2\177\'\3\2\2\2\u0080\u0082\n\7\2\2\u0081\u0080"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		")\3\2\2\2\u0085\u0086\7\177\2\2\u0086\u0087\3\2\2\2\u0087\u0088\b\25\4"+
		"\2\u0088+\3\2\2\2\t\2\3PZnu\u0083\5\b\2\2\7\3\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}