package gen;// Generated from C:/Users/poipo/OneDrive/scuola/linglab/progetto/havefun/src\HaveFun.g4 by ANTLR 4.9
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HaveFunLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NAT=1, BOOL=2, PLUS=3, MINUS=4, MUL=5, DIV=6, MOD=7, POW=8, AND=9, OR=10, 
		EQQ=11, NEQ=12, LEQ=13, GEQ=14, LT=15, GT=16, NOT=17, IF=18, THEN=19, 
		ELSE=20, WHILE=21, SKIPP=22, ASSIGN=23, COMMA=24, OUT=25, FUN=26, RETURN=27, 
		LPAR=28, RPAR=29, LBRACE=30, RBRACE=31, SEMICOLON=32, ID=33, BLOCKCOMMENT=34, 
		WS=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NAT", "BOOL", "PLUS", "MINUS", "MUL", "DIV", "MOD", "POW", "AND", "OR", 
			"EQQ", "NEQ", "LEQ", "GEQ", "LT", "GT", "NOT", "IF", "THEN", "ELSE", 
			"WHILE", "SKIPP", "ASSIGN", "COMMA", "OUT", "FUN", "RETURN", "LPAR", 
			"RPAR", "LBRACE", "RBRACE", "SEMICOLON", "ID", "BLOCKCOMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'+'", "'-'", "'*'", "'/'", "'mod'", "'^'", "'&'", 
			"'|'", "'=='", "'!='", "'<='", "'>='", "'<'", "'>'", "'!'", "'if'", "'then'", 
			"'else'", "'while'", "'skip'", "'='", "','", "'out'", "'fun'", "'return'", 
			"'('", "')'", "'{'", "'}'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NAT", "BOOL", "PLUS", "MINUS", "MUL", "DIV", "MOD", "POW", "AND", 
			"OR", "EQQ", "NEQ", "LEQ", "GEQ", "LT", "GT", "NOT", "IF", "THEN", "ELSE", 
			"WHILE", "SKIPP", "ASSIGN", "COMMA", "OUT", "FUN", "RETURN", "LPAR", 
			"RPAR", "LBRACE", "RBRACE", "SEMICOLON", "ID", "BLOCKCOMMENT", "WS"
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


	public HaveFunLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HaveFun.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u00d1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\7\2M\n\2\f\2\16\2P\13\2\5\2R\n\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3]\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\6\"\u00b9\n\"\r\"\16\"\u00ba"+
		"\3#\3#\3#\3#\7#\u00c1\n#\f#\16#\u00c4\13#\3#\3#\3#\3#\3#\3$\6$\u00cc\n"+
		"$\r$\16$\u00cd\3$\3$\3\u00c2\2%\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%\3\2\6\3\2\63;\3\2\62;\3"+
		"\2c|\5\2\13\f\17\17\"\"\2\u00d6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\3Q\3\2\2\2\5\\\3\2\2\2\7^\3\2\2\2\t"+
		"`\3\2\2\2\13b\3\2\2\2\rd\3\2\2\2\17f\3\2\2\2\21j\3\2\2\2\23l\3\2\2\2\25"+
		"n\3\2\2\2\27p\3\2\2\2\31s\3\2\2\2\33v\3\2\2\2\35y\3\2\2\2\37|\3\2\2\2"+
		"!~\3\2\2\2#\u0080\3\2\2\2%\u0082\3\2\2\2\'\u0085\3\2\2\2)\u008a\3\2\2"+
		"\2+\u008f\3\2\2\2-\u0095\3\2\2\2/\u009a\3\2\2\2\61\u009c\3\2\2\2\63\u009e"+
		"\3\2\2\2\65\u00a2\3\2\2\2\67\u00a6\3\2\2\29\u00ad\3\2\2\2;\u00af\3\2\2"+
		"\2=\u00b1\3\2\2\2?\u00b3\3\2\2\2A\u00b5\3\2\2\2C\u00b8\3\2\2\2E\u00bc"+
		"\3\2\2\2G\u00cb\3\2\2\2IR\7\62\2\2JN\t\2\2\2KM\t\3\2\2LK\3\2\2\2MP\3\2"+
		"\2\2NL\3\2\2\2NO\3\2\2\2OR\3\2\2\2PN\3\2\2\2QI\3\2\2\2QJ\3\2\2\2R\4\3"+
		"\2\2\2ST\7v\2\2TU\7t\2\2UV\7w\2\2V]\7g\2\2WX\7h\2\2XY\7c\2\2YZ\7n\2\2"+
		"Z[\7u\2\2[]\7g\2\2\\S\3\2\2\2\\W\3\2\2\2]\6\3\2\2\2^_\7-\2\2_\b\3\2\2"+
		"\2`a\7/\2\2a\n\3\2\2\2bc\7,\2\2c\f\3\2\2\2de\7\61\2\2e\16\3\2\2\2fg\7"+
		"o\2\2gh\7q\2\2hi\7f\2\2i\20\3\2\2\2jk\7`\2\2k\22\3\2\2\2lm\7(\2\2m\24"+
		"\3\2\2\2no\7~\2\2o\26\3\2\2\2pq\7?\2\2qr\7?\2\2r\30\3\2\2\2st\7#\2\2t"+
		"u\7?\2\2u\32\3\2\2\2vw\7>\2\2wx\7?\2\2x\34\3\2\2\2yz\7@\2\2z{\7?\2\2{"+
		"\36\3\2\2\2|}\7>\2\2} \3\2\2\2~\177\7@\2\2\177\"\3\2\2\2\u0080\u0081\7"+
		"#\2\2\u0081$\3\2\2\2\u0082\u0083\7k\2\2\u0083\u0084\7h\2\2\u0084&\3\2"+
		"\2\2\u0085\u0086\7v\2\2\u0086\u0087\7j\2\2\u0087\u0088\7g\2\2\u0088\u0089"+
		"\7p\2\2\u0089(\3\2\2\2\u008a\u008b\7g\2\2\u008b\u008c\7n\2\2\u008c\u008d"+
		"\7u\2\2\u008d\u008e\7g\2\2\u008e*\3\2\2\2\u008f\u0090\7y\2\2\u0090\u0091"+
		"\7j\2\2\u0091\u0092\7k\2\2\u0092\u0093\7n\2\2\u0093\u0094\7g\2\2\u0094"+
		",\3\2\2\2\u0095\u0096\7u\2\2\u0096\u0097\7m\2\2\u0097\u0098\7k\2\2\u0098"+
		"\u0099\7r\2\2\u0099.\3\2\2\2\u009a\u009b\7?\2\2\u009b\60\3\2\2\2\u009c"+
		"\u009d\7.\2\2\u009d\62\3\2\2\2\u009e\u009f\7q\2\2\u009f\u00a0\7w\2\2\u00a0"+
		"\u00a1\7v\2\2\u00a1\64\3\2\2\2\u00a2\u00a3\7h\2\2\u00a3\u00a4\7w\2\2\u00a4"+
		"\u00a5\7p\2\2\u00a5\66\3\2\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8\7g\2\2\u00a8"+
		"\u00a9\7v\2\2\u00a9\u00aa\7w\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7p\2\2"+
		"\u00ac8\3\2\2\2\u00ad\u00ae\7*\2\2\u00ae:\3\2\2\2\u00af\u00b0\7+\2\2\u00b0"+
		"<\3\2\2\2\u00b1\u00b2\7}\2\2\u00b2>\3\2\2\2\u00b3\u00b4\7\177\2\2\u00b4"+
		"@\3\2\2\2\u00b5\u00b6\7=\2\2\u00b6B\3\2\2\2\u00b7\u00b9\t\4\2\2\u00b8"+
		"\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2"+
		"\2\2\u00bbD\3\2\2\2\u00bc\u00bd\7\61\2\2\u00bd\u00be\7,\2\2\u00be\u00c2"+
		"\3\2\2\2\u00bf\u00c1\13\2\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2"+
		"\u00c2\u00c3\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2"+
		"\3\2\2\2\u00c5\u00c6\7,\2\2\u00c6\u00c7\7\61\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00c9\b#\2\2\u00c9F\3\2\2\2\u00ca\u00cc\t\5\2\2\u00cb\u00ca\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2"+
		"\2\2\u00cf\u00d0\b$\2\2\u00d0H\3\2\2\2\t\2NQ\\\u00ba\u00c2\u00cd\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}