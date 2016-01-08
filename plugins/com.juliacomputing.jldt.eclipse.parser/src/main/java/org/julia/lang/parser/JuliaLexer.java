// Generated from /Users/snefru/JuliaDT/plugins/com.juliacomputing.jldt.eclipse.parser/src/antlr4/org/julia/lang/JuliaLexer.g4 by ANTLR 4.5.1

package org.julia.lang.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JuliaLexer extends Lexer {
	public static final int
			ARROW = 1, AT = 2, DOT = 3, SEMI_COLON = 4, IS = 5, EQUALS = 6, NOT_EQUAL = 7, GREATER_THAN = 8,
			LESS_THAN = 9, GREATER_THAN_OR_EQ = 10, LESS_THAN_OR_EQ = 11, MINUS = 12, EXPONENT = 13,
			FRACTION = 14, TIMES = 15, DIVIDE = 16, PLUS = 17, ELM_EQUALS = 18, ELM_NOT_EQUAL = 19,
			ELM_GREATER_THAN = 20, ELM_LESS_THAN = 21, ELM_GREATER_THAN_OR_EQ = 22, ELM_LESS_THAN_OR_EQ = 23,
			ELM_MINUS = 24, ELM_EXPONENT = 25, ELM_FRACTION = 26, ELM_TIMES = 27, ELM_DIVIDE = 28,
			ELM_PLUS = 29, RAPP = 30, EQ = 31, DOUBLE_ARROW = 32, ADD_ASGN = 33, SUB_ASGN = 34,
			TIMES_ASGN = 35, DIVIDE_ASGN = 36, INV_DIVIDE_ASGN = 37, REMAINDER_ASGN = 38,
			REM = 39, POWER_ASGN = 40, BITWISE_AND_ASGN = 41, BITWISE_OR_ASGN = 42, BITWISE_XOR_ASGN = 43,
			LSR_ASGN = 44, ASR_ASGN = 45, ELLIPSE = 46, ASL_ASGN = 47, QUESTION_MARK = 48, WHILE = 49,
			BEGIN = 50, RETURN = 51, IN = 52, IF = 53, ELSE_IF = 54, ELSE = 55, FOR = 56, CONST = 57,
			USING = 58, IMPORT = 59, INSTANCE_OF = 60, COLON = 61, COMMA = 62, DO = 63, IMPORT_ALL = 64,
			EXPORT = 65, MODULE = 66, LET = 67, END = 68, END_LITERAL = 69, BAREMODULE = 70, INF16 = 71,
			INF32 = 72, INF = 73, MINUS_INF16 = 74, MINUS_INF32 = 75, MINUS_INF = 76, NAN16 = 77,
			NAN32 = 78, NAN = 79, NOT = 80, AND = 81, BITWISE_AND = 82, OR = 83, BITWISE_OR = 84,
			LEFT_BRACKET = 85, RIGHT_BRACKET = 86, TRUE = 87, FALSE = 88, ABSTRACT = 89, SUB_TYPE = 90,
			BITS_TYPE = 91, TYPE_ALIAS = 92, TYPE = 93, IMMUTABLE = 94, UNION = 95, FUNCTION = 96,
			LEFT_CURLY = 97, RIGHT_CURLY = 98, LEFT_SQUARE = 99, RIGHT_SQUARE = 100, INT8 = 101,
			UINT8 = 102, INT16 = 103, UINT16 = 104, INT32 = 105, UINT32 = 106, INT64 = 107, UINT64 = 108,
			INT128 = 109, UINT128 = 110, BOOL = 111, CHAR = 112, FLOAT16 = 113, FLOAT32 = 114,
			FLOAT64 = 115, REGEX = 116, INT = 117, BINARY = 118, OCTAL = 119, HEX = 120, FLOAT32_LITERAL = 121,
			EXP32 = 122, FLOAT64_LITERAL = 123, EXP64 = 124, FQN = 125, ID = 126, CHARACTER_LITERAL = 127,
			STRING = 128, WS = 129, COMMENT = 130, LINE_COMMENT = 131, SIZE = 132;
	public static final String[] ruleNames = {
			"ARROW", "AT", "DOT", "SEMI_COLON", "IS", "EQUALS", "NOT_EQUAL", "GREATER_THAN",
			"LESS_THAN", "GREATER_THAN_OR_EQ", "LESS_THAN_OR_EQ", "MINUS", "EXPONENT",
			"FRACTION", "TIMES", "DIVIDE", "PLUS", "ELM_EQUALS", "ELM_NOT_EQUAL",
			"ELM_GREATER_THAN", "ELM_LESS_THAN", "ELM_GREATER_THAN_OR_EQ", "ELM_LESS_THAN_OR_EQ",
			"ELM_MINUS", "ELM_EXPONENT", "ELM_FRACTION", "ELM_TIMES", "ELM_DIVIDE",
			"ELM_PLUS", "RAPP", "EQ", "DOUBLE_ARROW", "ADD_ASGN", "SUB_ASGN", "TIMES_ASGN",
			"DIVIDE_ASGN", "INV_DIVIDE_ASGN", "REMAINDER_ASGN", "REM", "POWER_ASGN",
			"BITWISE_AND_ASGN", "BITWISE_OR_ASGN", "BITWISE_XOR_ASGN", "LSR_ASGN",
			"ASR_ASGN", "ELLIPSE", "ASL_ASGN", "QUESTION_MARK", "WHILE", "BEGIN",
			"RETURN", "IN", "IF", "ELSE_IF", "ELSE", "FOR", "CONST", "USING", "IMPORT",
			"INSTANCE_OF", "COLON", "COMMA", "DO", "IMPORT_ALL", "EXPORT", "MODULE",
			"LET", "END", "END_LITERAL", "BAREMODULE", "INF16", "INF32", "INF", "MINUS_INF16",
			"MINUS_INF32", "MINUS_INF", "NAN16", "NAN32", "NAN", "NOT", "AND", "BITWISE_AND",
			"OR", "BITWISE_OR", "LEFT_BRACKET", "RIGHT_BRACKET", "TRUE", "FALSE",
			"ABSTRACT", "SUB_TYPE", "BITS_TYPE", "TYPE_ALIAS", "TYPE", "IMMUTABLE",
			"UNION", "FUNCTION", "LEFT_CURLY", "RIGHT_CURLY", "LEFT_SQUARE", "RIGHT_SQUARE",
			"INT8", "UINT8", "INT16", "UINT16", "INT32", "UINT32", "INT64", "UINT64",
			"INT128", "UINT128", "BOOL", "CHAR", "FLOAT16", "FLOAT32", "FLOAT64",
			"REGEX", "INT", "BINARY", "OCTAL", "HEX", "FLOAT32_LITERAL", "EXP32",
			"FLOAT64_LITERAL", "EXP64", "FQN", "ID", "CHARACTER_LITERAL", "STRING",
			"WS", "COMMENT", "LINE_COMMENT", "Identifier", "DEC_DGT", "BIN_DGT", "OCT_DGT",
			"HEX_DGT", "SIZE", "UNi"
	};
	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	public static final String _serializedATN =
			"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\u0086\u0400\b\1\4" +
					"\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n" +
					"\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22" +
					"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31" +
					"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t" +
					" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t" +
					"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64" +
					"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t" +
					"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4" +
					"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\t" +
					"T\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_" +
					"\4`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k" +
					"\tk\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv" +
					"\4w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t" +
					"\u0080\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084" +
					"\4\u0085\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089" +
					"\t\u0089\4\u008a\t\u008a\4\u008b\t\u008b\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3" +
					"\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\5\b\u012b\n\b\3\t\3\t\3" +
					"\n\3\n\3\13\3\13\3\13\5\13\u0134\n\13\3\f\3\f\3\f\5\f\u0139\n\f\3\r\3" +
					"\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3" +
					"\23\3\23\3\24\3\24\3\24\3\24\3\24\5\24\u0151\n\24\3\25\3\25\3\25\3\26" +
					"\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\5\30\u0161\n\30\3\31" +
					"\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35" +
					"\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3" +
					"#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3)\3*\3*\3*\3+\3" +
					"+\3+\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3" +
					"\60\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3" +
					"\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3" +
					"\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\39\39\39\39\3:\3:\3:" +
					"\3:\3:\3:\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3>\3>\3?\3?" +
					"\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C" +
					"\3C\3C\3C\3C\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3G\3G\3G" +
					"\3G\3G\3G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3J\3J\3J" +
					"\3J\3K\3K\3K\3K\3K\3K\3K\3L\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3N\3N\3N" +
					"\3N\3N\3N\3O\3O\3O\3O\3O\3O\3P\3P\3P\3P\3Q\3Q\3R\3R\3R\3S\3S\3T\3T\3T" +
					"\3U\3U\3V\3V\3V\3W\3W\3W\3X\3X\3X\3X\3X\3Y\3Y\3Y\3Y\3Y\3Y\3Z\3Z\3Z\3Z" +
					"\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3]\3]\3]" +
					"\3]\3]\3]\3]\3]\3]\3]\3^\3^\3^\3^\3^\3_\3_\3_\3_\3_\3_\3_\3_\3_\3_\3`" +
					"\3`\3`\3`\3`\3`\3a\3a\3a\3a\3a\3a\3a\3a\3a\3b\3b\3b\3c\3c\3c\3d\3d\3d" +
					"\3e\3e\3e\3f\3f\3f\3f\3f\3g\3g\3g\3g\3g\3g\3h\3h\3h\3h\3h\3h\3i\3i\3i" +
					"\3i\3i\3i\3i\3j\3j\3j\3j\3j\3j\3k\3k\3k\3k\3k\3k\3k\3l\3l\3l\3l\3l\3l" +
					"\3m\3m\3m\3m\3m\3m\3m\3n\3n\3n\3n\3n\3n\3n\3o\3o\3o\3o\3o\3o\3o\3o\3p" +
					"\3p\3p\3p\3p\3q\3q\3q\3q\3q\3r\3r\3r\3r\3r\3r\3r\3r\3s\3s\3s\3s\3s\3s" +
					"\3s\3s\3t\3t\3t\3t\3t\3t\3t\3t\3u\3u\3u\3v\6v\u032a\nv\rv\16v\u032b\3" +
					"w\3w\3w\3w\6w\u0332\nw\rw\16w\u0333\3x\3x\3x\3x\6x\u033a\nx\rx\16x\u033b" +
					"\3y\3y\3y\3y\6y\u0342\ny\ry\16y\u0343\3z\6z\u0347\nz\rz\16z\u0348\3z\3" +
					"z\7z\u034d\nz\fz\16z\u0350\13z\3z\5z\u0353\nz\3z\3z\7z\u0357\nz\fz\16" +
					"z\u035a\13z\3z\5z\u035d\nz\5z\u035f\nz\3{\3{\5{\u0363\n{\3{\6{\u0366\n" +
					"{\r{\16{\u0367\3|\6|\u036b\n|\r|\16|\u036c\3|\3|\7|\u0371\n|\f|\16|\u0374" +
					"\13|\3|\5|\u0377\n|\3|\3|\7|\u037b\n|\f|\16|\u037e\13|\3|\5|\u0381\n|" +
					"\5|\u0383\n|\3}\3}\5}\u0387\n}\3}\6}\u038a\n}\r}\16}\u038b\3~\3~\3~\3" +
					"~\6~\u0392\n~\r~\16~\u0393\3~\3~\3\177\3\177\5\177\u039a\n\177\3\177\3" +
					"\177\3\177\7\177\u039f\n\177\f\177\16\177\u03a2\13\177\3\177\5\177\u03a5" +
					"\n\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080\5\u0080" +
					"\u03ae\n\u0080\3\u0081\3\u0081\3\u0081\3\u0081\7\u0081\u03b4\n\u0081\f" +
					"\u0081\16\u0081\u03b7\13\u0081\3\u0081\3\u0081\3\u0082\6\u0082\u03bc\n" +
					"\u0082\r\u0082\16\u0082\u03bd\3\u0082\3\u0082\3\u0083\3\u0083\3\u0083" +
					"\3\u0083\7\u0083\u03c6\n\u0083\f\u0083\16\u0083\u03c9\13\u0083\3\u0083" +
					"\3\u0083\3\u0083\3\u0083\3\u0083\3\u0084\3\u0084\7\u0084\u03d2\n\u0084" +
					"\f\u0084\16\u0084\u03d5\13\u0084\3\u0084\3\u0084\3\u0085\3\u0085\5\u0085" +
					"\u03db\n\u0085\3\u0085\3\u0085\3\u0085\7\u0085\u03e0\n\u0085\f\u0085\16" +
					"\u0085\u03e3\13\u0085\3\u0086\3\u0086\3\u0087\3\u0087\3\u0088\3\u0088" +
					"\3\u0089\3\u0089\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a" +
					"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a" +
					"\5\u008a\u03fd\n\u008a\3\u008b\3\u008b\3\u03c7\2\u008c\3\3\5\4\7\5\t\6" +
					"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24" +
					"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K" +
					"\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177" +
					"A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093" +
					"K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5T\u00a7" +
					"U\u00a9V\u00abW\u00adX\u00afY\u00b1Z\u00b3[\u00b5\\\u00b7]\u00b9^\u00bb" +
					"_\u00bd`\u00bfa\u00c1b\u00c3c\u00c5d\u00c7e\u00c9f\u00cbg\u00cdh\u00cf" +
					"i\u00d1j\u00d3k\u00d5l\u00d7m\u00d9n\u00dbo\u00ddp\u00dfq\u00e1r\u00e3" +
					"s\u00e5t\u00e7u\u00e9v\u00ebw\u00edx\u00efy\u00f1z\u00f3{\u00f5|\u00f7" +
					"}\u00f9~\u00fb\177\u00fd\u0080\u00ff\u0081\u0101\u0082\u0103\u0083\u0105" +
					"\u0084\u0107\u0085\u0109\2\u010b\2\u010d\2\u010f\2\u0111\2\u0113\u0086" +
					"\u0115\2\3\2\17\4\2\60\60^^\3\2hh\4\2--//\3\2gg\3\2))\3\2$$\5\2\13\f\17" +
					"\17\"\"\4\2\f\f\17\17\3\2\62;\3\2\62\63\3\2\629\4\2\62;CH\17\2C\\c|\u00c2" +
					"\u00d8\u00da\u00f8\u00fa\u0301\u0372\u037f\u0381\u2001\u200e\u200f\u2072" +
					"\u2191\u2c02\u2ff1\u3003\ud801\uf902\ufdd1\ufdf2\uffff\u0428\2\3\3\2\2" +
					"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3" +
					"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2" +
					"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2" +
					"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2" +
					"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3" +
					"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2" +
					"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2" +
					"W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3" +
					"\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2" +
					"\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2" +
					"}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2" +
					"\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f" +
					"\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2" +
					"\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1" +
					"\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2" +
					"\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3" +
					"\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2" +
					"\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5" +
					"\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2" +
					"\2\2\u00cf\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2\2\2\u00d7" +
					"\3\2\2\2\2\u00d9\3\2\2\2\2\u00db\3\2\2\2\2\u00dd\3\2\2\2\2\u00df\3\2\2" +
					"\2\2\u00e1\3\2\2\2\2\u00e3\3\2\2\2\2\u00e5\3\2\2\2\2\u00e7\3\2\2\2\2\u00e9" +
					"\3\2\2\2\2\u00eb\3\2\2\2\2\u00ed\3\2\2\2\2\u00ef\3\2\2\2\2\u00f1\3\2\2" +
					"\2\2\u00f3\3\2\2\2\2\u00f5\3\2\2\2\2\u00f7\3\2\2\2\2\u00f9\3\2\2\2\2\u00fb" +
					"\3\2\2\2\2\u00fd\3\2\2\2\2\u00ff\3\2\2\2\2\u0101\3\2\2\2\2\u0103\3\2\2" +
					"\2\2\u0105\3\2\2\2\2\u0107\3\2\2\2\2\u0113\3\2\2\2\3\u0117\3\2\2\2\5\u011a" +
					"\3\2\2\2\7\u011c\3\2\2\2\t\u011e\3\2\2\2\13\u0120\3\2\2\2\r\u0124\3\2" +
					"\2\2\17\u012a\3\2\2\2\21\u012c\3\2\2\2\23\u012e\3\2\2\2\25\u0133\3\2\2" +
					"\2\27\u0138\3\2\2\2\31\u013a\3\2\2\2\33\u013c\3\2\2\2\35\u013e\3\2\2\2" +
					"\37\u0141\3\2\2\2!\u0143\3\2\2\2#\u0145\3\2\2\2%\u0147\3\2\2\2\'\u0150" +
					"\3\2\2\2)\u0152\3\2\2\2+\u0155\3\2\2\2-\u0158\3\2\2\2/\u0160\3\2\2\2\61" +
					"\u0162\3\2\2\2\63\u0165\3\2\2\2\65\u0168\3\2\2\2\67\u016c\3\2\2\29\u016f" +
					"\3\2\2\2;\u0172\3\2\2\2=\u0175\3\2\2\2?\u0178\3\2\2\2A\u017a\3\2\2\2C" +
					"\u017d\3\2\2\2E\u0180\3\2\2\2G\u0183\3\2\2\2I\u0186\3\2\2\2K\u0189\3\2" +
					"\2\2M\u018c\3\2\2\2O\u018f\3\2\2\2Q\u0191\3\2\2\2S\u0194\3\2\2\2U\u0197" +
					"\3\2\2\2W\u019a\3\2\2\2Y\u019d\3\2\2\2[\u01a2\3\2\2\2]\u01a6\3\2\2\2_" +
					"\u01aa\3\2\2\2a\u01ae\3\2\2\2c\u01b0\3\2\2\2e\u01b6\3\2\2\2g\u01bc\3\2" +
					"\2\2i\u01c3\3\2\2\2k\u01c6\3\2\2\2m\u01c9\3\2\2\2o\u01d0\3\2\2\2q\u01d5" +
					"\3\2\2\2s\u01d9\3\2\2\2u\u01df\3\2\2\2w\u01e5\3\2\2\2y\u01ec\3\2\2\2{" +
					"\u01ef\3\2\2\2}\u01f1\3\2\2\2\177\u01f3\3\2\2\2\u0081\u01f6\3\2\2\2\u0083" +
					"\u0200\3\2\2\2\u0085\u0207\3\2\2\2\u0087\u020e\3\2\2\2\u0089\u0212\3\2" +
					"\2\2\u008b\u0218\3\2\2\2\u008d\u021e\3\2\2\2\u008f\u0229\3\2\2\2\u0091" +
					"\u022f\3\2\2\2\u0093\u0235\3\2\2\2\u0095\u0239\3\2\2\2\u0097\u0240\3\2" +
					"\2\2\u0099\u0247\3\2\2\2\u009b\u024c\3\2\2\2\u009d\u0252\3\2\2\2\u009f" +
					"\u0258\3\2\2\2\u00a1\u025c\3\2\2\2\u00a3\u025e\3\2\2\2\u00a5\u0261\3\2" +
					"\2\2\u00a7\u0263\3\2\2\2\u00a9\u0266\3\2\2\2\u00ab\u0268\3\2\2\2\u00ad" +
					"\u026b\3\2\2\2\u00af\u026e\3\2\2\2\u00b1\u0273\3\2\2\2\u00b3\u0279\3\2" +
					"\2\2\u00b5\u0282\3\2\2\2\u00b7\u0285\3\2\2\2\u00b9\u028e\3\2\2\2\u00bb" +
					"\u0298\3\2\2\2\u00bd\u029d\3\2\2\2\u00bf\u02a7\3\2\2\2\u00c1\u02ad\3\2" +
					"\2\2\u00c3\u02b6\3\2\2\2\u00c5\u02b9\3\2\2\2\u00c7\u02bc\3\2\2\2\u00c9" +
					"\u02bf\3\2\2\2\u00cb\u02c2\3\2\2\2\u00cd\u02c7\3\2\2\2\u00cf\u02cd\3\2" +
					"\2\2\u00d1\u02d3\3\2\2\2\u00d3\u02da\3\2\2\2\u00d5\u02e0\3\2\2\2\u00d7" +
					"\u02e7\3\2\2\2\u00d9\u02ed\3\2\2\2\u00db\u02f4\3\2\2\2\u00dd\u02fb\3\2" +
					"\2\2\u00df\u0303\3\2\2\2\u00e1\u0308\3\2\2\2\u00e3\u030d\3\2\2\2\u00e5" +
					"\u0315\3\2\2\2\u00e7\u031d\3\2\2\2\u00e9\u0325\3\2\2\2\u00eb\u0329\3\2" +
					"\2\2\u00ed\u032d\3\2\2\2\u00ef\u0335\3\2\2\2\u00f1\u033d\3\2\2\2\u00f3" +
					"\u035e\3\2\2\2\u00f5\u0360\3\2\2\2\u00f7\u0382\3\2\2\2\u00f9\u0384\3\2" +
					"\2\2\u00fb\u0391\3\2\2\2\u00fd\u0399\3\2\2\2\u00ff\u03ad\3\2\2\2\u0101" +
					"\u03af\3\2\2\2\u0103\u03bb\3\2\2\2\u0105\u03c1\3\2\2\2\u0107\u03cf\3\2" +
					"\2\2\u0109\u03da\3\2\2\2\u010b\u03e4\3\2\2\2\u010d\u03e6\3\2\2\2\u010f" +
					"\u03e8\3\2\2\2\u0111\u03ea\3\2\2\2\u0113\u03fc\3\2\2\2\u0115\u03fe\3\2" +
					"\2\2\u0117\u0118\7/\2\2\u0118\u0119\7@\2\2\u0119\4\3\2\2\2\u011a\u011b" +
					"\7B\2\2\u011b\6\3\2\2\2\u011c\u011d\7\60\2\2\u011d\b\3\2\2\2\u011e\u011f" +
					"\7=\2\2\u011f\n\3\2\2\2\u0120\u0121\7?\2\2\u0121\u0122\7?\2\2\u0122\u0123" +
					"\7?\2\2\u0123\f\3\2\2\2\u0124\u0125\7?\2\2\u0125\u0126\7?\2\2\u0126\16" +
					"\3\2\2\2\u0127\u0128\7#\2\2\u0128\u012b\7?\2\2\u0129\u012b\7\u2262\2\2" +
					"\u012a\u0127\3\2\2\2\u012a\u0129\3\2\2\2\u012b\20\3\2\2\2\u012c\u012d" +
					"\7@\2\2\u012d\22\3\2\2\2\u012e\u012f\7>\2\2\u012f\24\3\2\2\2\u0130\u0131" +
					"\7@\2\2\u0131\u0134\7?\2\2\u0132\u0134\7\u2267\2\2\u0133\u0130\3\2\2\2" +
					"\u0133\u0132\3\2\2\2\u0134\26\3\2\2\2\u0135\u0136\7>\2\2\u0136\u0139\7" +
					"?\2\2\u0137\u0139\7\u2266\2\2\u0138\u0135\3\2\2\2\u0138\u0137\3\2\2\2" +
					"\u0139\30\3\2\2\2\u013a\u013b\7/\2\2\u013b\32\3\2\2\2\u013c\u013d\7`\2" +
					"\2\u013d\34\3\2\2\2\u013e\u013f\7\61\2\2\u013f\u0140\7\61\2\2\u0140\36" +
					"\3\2\2\2\u0141\u0142\7,\2\2\u0142 \3\2\2\2\u0143\u0144\7\61\2\2\u0144" +
					"\"\3\2\2\2\u0145\u0146\7-\2\2\u0146$\3\2\2\2\u0147\u0148\7\60\2\2\u0148" +
					"\u0149\7?\2\2\u0149\u014a\7?\2\2\u014a&\3\2\2\2\u014b\u014c\7\60\2\2\u014c" +
					"\u014d\7#\2\2\u014d\u0151\7?\2\2\u014e\u014f\13\2\2\2\u014f\u0151\7\u2262" +
					"\2\2\u0150\u014b\3\2\2\2\u0150\u014e\3\2\2\2\u0151(\3\2\2\2\u0152\u0153" +
					"\7\60\2\2\u0153\u0154\7@\2\2\u0154*\3\2\2\2\u0155\u0156\7\60\2\2\u0156" +
					"\u0157\7>\2\2\u0157,\3\2\2\2\u0158\u0159\7\60\2\2\u0159\u015a\7@\2\2\u015a" +
					"\u015b\7?\2\2\u015b.\3\2\2\2\u015c\u015d\7\60\2\2\u015d\u015e\7>\2\2\u015e" +
					"\u0161\7?\2\2\u015f\u0161\7\u2266\2\2\u0160\u015c\3\2\2\2\u0160\u015f" +
					"\3\2\2\2\u0161\60\3\2\2\2\u0162\u0163\7\60\2\2\u0163\u0164\7/\2\2\u0164" +
					"\62\3\2\2\2\u0165\u0166\7\60\2\2\u0166\u0167\7`\2\2\u0167\64\3\2\2\2\u0168" +
					"\u0169\7\60\2\2\u0169\u016a\7\61\2\2\u016a\u016b\7\61\2\2\u016b\66\3\2" +
					"\2\2\u016c\u016d\7\60\2\2\u016d\u016e\7,\2\2\u016e8\3\2\2\2\u016f\u0170" +
					"\7\60\2\2\u0170\u0171\7\61\2\2\u0171:\3\2\2\2\u0172\u0173\7\60\2\2\u0173" +
					"\u0174\7-\2\2\u0174<\3\2\2\2\u0175\u0176\7~\2\2\u0176\u0177\7@\2\2\u0177" +
					">\3\2\2\2\u0178\u0179\7?\2\2\u0179@\3\2\2\2\u017a\u017b\7?\2\2\u017b\u017c" +
					"\7@\2\2\u017cB\3\2\2\2\u017d\u017e\7-\2\2\u017e\u017f\7?\2\2\u017fD\3" +
					"\2\2\2\u0180\u0181\7/\2\2\u0181\u0182\7?\2\2\u0182F\3\2\2\2\u0183\u0184" +
					"\7,\2\2\u0184\u0185\7?\2\2\u0185H\3\2\2\2\u0186\u0187\7\61\2\2\u0187\u0188" +
					"\7?\2\2\u0188J\3\2\2\2\u0189\u018a\7^\2\2\u018a\u018b\7?\2\2\u018bL\3" +
					"\2\2\2\u018c\u018d\7\'\2\2\u018d\u018e\7?\2\2\u018eN\3\2\2\2\u018f\u0190" +
					"\7\'\2\2\u0190P\3\2\2\2\u0191\u0192\7`\2\2\u0192\u0193\7?\2\2\u0193R\3" +
					"\2\2\2\u0194\u0195\7(\2\2\u0195\u0196\7?\2\2\u0196T\3\2\2\2\u0197\u0198" +
					"\7~\2\2\u0198\u0199\7?\2\2\u0199V\3\2\2\2\u019a\u019b\7&\2\2\u019b\u019c" +
					"\7?\2\2\u019cX\3\2\2\2\u019d\u019e\7@\2\2\u019e\u019f\7@\2\2\u019f\u01a0" +
					"\7@\2\2\u01a0\u01a1\7?\2\2\u01a1Z\3\2\2\2\u01a2\u01a3\7@\2\2\u01a3\u01a4" +
					"\7@\2\2\u01a4\u01a5\7?\2\2\u01a5\\\3\2\2\2\u01a6\u01a7\7\60\2\2\u01a7" +
					"\u01a8\7\60\2\2\u01a8\u01a9\7\60\2\2\u01a9^\3\2\2\2\u01aa\u01ab\7>\2\2" +
					"\u01ab\u01ac\7>\2\2\u01ac\u01ad\7?\2\2\u01ad`\3\2\2\2\u01ae\u01af\7A\2" +
					"\2\u01afb\3\2\2\2\u01b0\u01b1\7y\2\2\u01b1\u01b2\7j\2\2\u01b2\u01b3\7" +
					"k\2\2\u01b3\u01b4\7n\2\2\u01b4\u01b5\7g\2\2\u01b5d\3\2\2\2\u01b6\u01b7" +
					"\7d\2\2\u01b7\u01b8\7g\2\2\u01b8\u01b9\7i\2\2\u01b9\u01ba\7k\2\2\u01ba" +
					"\u01bb\7p\2\2\u01bbf\3\2\2\2\u01bc\u01bd\7t\2\2\u01bd\u01be\7g\2\2\u01be" +
					"\u01bf\7v\2\2\u01bf\u01c0\7w\2\2\u01c0\u01c1\7t\2\2\u01c1\u01c2\7p\2\2" +
					"\u01c2h\3\2\2\2\u01c3\u01c4\7k\2\2\u01c4\u01c5\7p\2\2\u01c5j\3\2\2\2\u01c6" +
					"\u01c7\7k\2\2\u01c7\u01c8\7h\2\2\u01c8l\3\2\2\2\u01c9\u01ca\7g\2\2\u01ca" +
					"\u01cb\7n\2\2\u01cb\u01cc\7u\2\2\u01cc\u01cd\7g\2\2\u01cd\u01ce\7k\2\2" +
					"\u01ce\u01cf\7h\2\2\u01cfn\3\2\2\2\u01d0\u01d1\7g\2\2\u01d1\u01d2\7n\2" +
					"\2\u01d2\u01d3\7u\2\2\u01d3\u01d4\7g\2\2\u01d4p\3\2\2\2\u01d5\u01d6\7" +
					"h\2\2\u01d6\u01d7\7q\2\2\u01d7\u01d8\7t\2\2\u01d8r\3\2\2\2\u01d9\u01da" +
					"\7e\2\2\u01da\u01db\7q\2\2\u01db\u01dc\7p\2\2\u01dc\u01dd\7u\2\2\u01dd" +
					"\u01de\7v\2\2\u01det\3\2\2\2\u01df\u01e0\7w\2\2\u01e0\u01e1\7u\2\2\u01e1" +
					"\u01e2\7k\2\2\u01e2\u01e3\7p\2\2\u01e3\u01e4\7i\2\2\u01e4v\3\2\2\2\u01e5" +
					"\u01e6\7k\2\2\u01e6\u01e7\7o\2\2\u01e7\u01e8\7r\2\2\u01e8\u01e9\7q\2\2" +
					"\u01e9\u01ea\7t\2\2\u01ea\u01eb\7v\2\2\u01ebx\3\2\2\2\u01ec\u01ed\7<\2" +
					"\2\u01ed\u01ee\7<\2\2\u01eez\3\2\2\2\u01ef\u01f0\7<\2\2\u01f0|\3\2\2\2" +
					"\u01f1\u01f2\7.\2\2\u01f2~\3\2\2\2\u01f3\u01f4\7f\2\2\u01f4\u01f5\7q\2" +
					"\2\u01f5\u0080\3\2\2\2\u01f6\u01f7\7k\2\2\u01f7\u01f8\7o\2\2\u01f8\u01f9" +
					"\7r\2\2\u01f9\u01fa\7q\2\2\u01fa\u01fb\7t\2\2\u01fb\u01fc\7v\2\2\u01fc" +
					"\u01fd\7c\2\2\u01fd\u01fe\7n\2\2\u01fe\u01ff\7n\2\2\u01ff\u0082\3\2\2" +
					"\2\u0200\u0201\7g\2\2\u0201\u0202\7z\2\2\u0202\u0203\7r\2\2\u0203\u0204" +
					"\7q\2\2\u0204\u0205\7t\2\2\u0205\u0206\7v\2\2\u0206\u0084\3\2\2\2\u0207" +
					"\u0208\7o\2\2\u0208\u0209\7q\2\2\u0209\u020a\7f\2\2\u020a\u020b\7w\2\2" +
					"\u020b\u020c\7n\2\2\u020c\u020d\7g\2\2\u020d\u0086\3\2\2\2\u020e\u020f" +
					"\7n\2\2\u020f\u0210\7g\2\2\u0210\u0211\7v\2\2\u0211\u0088\3\2\2\2\u0212" +
					"\u0213\7g\2\2\u0213\u0214\7p\2\2\u0214\u0215\7f\2\2\u0215\u0216\3\2\2" +
					"\2\u0216\u0217\6E\2\2\u0217\u008a\3\2\2\2\u0218\u0219\7g\2\2\u0219\u021a" +
					"\7p\2\2\u021a\u021b\7f\2\2\u021b\u021c\3\2\2\2\u021c\u021d\6F\3\2\u021d" +
					"\u008c\3\2\2\2\u021e\u021f\7d\2\2\u021f\u0220\7c\2\2\u0220\u0221\7t\2" +
					"\2\u0221\u0222\7g\2\2\u0222\u0223\7o\2\2\u0223\u0224\7q\2\2\u0224\u0225" +
					"\7f\2\2\u0225\u0226\7w\2\2\u0226\u0227\7n\2\2\u0227\u0228\7g\2\2\u0228" +
					"\u008e\3\2\2\2\u0229\u022a\7K\2\2\u022a\u022b\7p\2\2\u022b\u022c\7h\2" +
					"\2\u022c\u022d\7\63\2\2\u022d\u022e\78\2\2\u022e\u0090\3\2\2\2\u022f\u0230" +
					"\7K\2\2\u0230\u0231\7p\2\2\u0231\u0232\7h\2\2\u0232\u0233\7\65\2\2\u0233" +
					"\u0234\7\64\2\2\u0234\u0092\3\2\2\2\u0235\u0236\7K\2\2\u0236\u0237\7p" +
					"\2\2\u0237\u0238\7h\2\2\u0238\u0094\3\2\2\2\u0239\u023a\7/\2\2\u023a\u023b" +
					"\7K\2\2\u023b\u023c\7p\2\2\u023c\u023d\7h\2\2\u023d\u023e\7\63\2\2\u023e" +
					"\u023f\78\2\2\u023f\u0096\3\2\2\2\u0240\u0241\7/\2\2\u0241\u0242\7K\2" +
					"\2\u0242\u0243\7p\2\2\u0243\u0244\7h\2\2\u0244\u0245\7\65\2\2\u0245\u0246" +
					"\7\64\2\2\u0246\u0098\3\2\2\2\u0247\u0248\7/\2\2\u0248\u0249\7K\2\2\u0249" +
					"\u024a\7p\2\2\u024a\u024b\7h\2\2\u024b\u009a\3\2\2\2\u024c\u024d\7P\2" +
					"\2\u024d\u024e\7c\2\2\u024e\u024f\7P\2\2\u024f\u0250\7\63\2\2\u0250\u0251" +
					"\78\2\2\u0251\u009c\3\2\2\2\u0252\u0253\7P\2\2\u0253\u0254\7c\2\2\u0254" +
					"\u0255\7P\2\2\u0255\u0256\7\65\2\2\u0256\u0257\7\64\2\2\u0257\u009e\3" +
					"\2\2\2\u0258\u0259\7P\2\2\u0259\u025a\7c\2\2\u025a\u025b\7P\2\2\u025b" +
					"\u00a0\3\2\2\2\u025c\u025d\7#\2\2\u025d\u00a2\3\2\2\2\u025e\u025f\7(\2" +
					"\2\u025f\u0260\7(\2\2\u0260\u00a4\3\2\2\2\u0261\u0262\7(\2\2\u0262\u00a6" +
					"\3\2\2\2\u0263\u0264\7~\2\2\u0264\u0265\7~\2\2\u0265\u00a8\3\2\2\2\u0266" +
					"\u0267\7~\2\2\u0267\u00aa\3\2\2\2\u0268\u0269\7*\2\2\u0269\u026a\bV\2" +
					"\2\u026a\u00ac\3\2\2\2\u026b\u026c\7+\2\2\u026c\u026d\bW\3\2\u026d\u00ae" +
					"\3\2\2\2\u026e\u026f\7v\2\2\u026f\u0270\7t\2\2\u0270\u0271\7w\2\2\u0271" +
					"\u0272\7g\2\2\u0272\u00b0\3\2\2\2\u0273\u0274\7h\2\2\u0274\u0275\7c\2" +
					"\2\u0275\u0276\7n\2\2\u0276\u0277\7u\2\2\u0277\u0278\7g\2\2\u0278\u00b2" +
					"\3\2\2\2\u0279\u027a\7c\2\2\u027a\u027b\7d\2\2\u027b\u027c\7u\2\2\u027c" +
					"\u027d\7v\2\2\u027d\u027e\7t\2\2\u027e\u027f\7c\2\2\u027f\u0280\7e\2\2" +
					"\u0280\u0281\7v\2\2\u0281\u00b4\3\2\2\2\u0282\u0283\7>\2\2\u0283\u0284" +
					"\7<\2\2\u0284\u00b6\3\2\2\2\u0285\u0286\7d\2\2\u0286\u0287\7k\2\2\u0287" +
					"\u0288\7v\2\2\u0288\u0289\7u\2\2\u0289\u028a\7v\2\2\u028a\u028b\7{\2\2" +
					"\u028b\u028c\7r\2\2\u028c\u028d\7g\2\2\u028d\u00b8\3\2\2\2\u028e\u028f" +
					"\7v\2\2\u028f\u0290\7{\2\2\u0290\u0291\7r\2\2\u0291\u0292\7g\2\2\u0292" +
					"\u0293\7c\2\2\u0293\u0294\7n\2\2\u0294\u0295\7k\2\2\u0295\u0296\7c\2\2" +
					"\u0296\u0297\7u\2\2\u0297\u00ba\3\2\2\2\u0298\u0299\7v\2\2\u0299\u029a" +
					"\7{\2\2\u029a\u029b\7r\2\2\u029b\u029c\7g\2\2\u029c\u00bc\3\2\2\2\u029d" +
					"\u029e\7k\2\2\u029e\u029f\7o\2\2\u029f\u02a0\7o\2\2\u02a0\u02a1\7w\2\2" +
					"\u02a1\u02a2\7v\2\2\u02a2\u02a3\7c\2\2\u02a3\u02a4\7d\2\2\u02a4\u02a5" +
					"\7n\2\2\u02a5\u02a6\7g\2\2\u02a6\u00be\3\2\2\2\u02a7\u02a8\7W\2\2\u02a8" +
					"\u02a9\7p\2\2\u02a9\u02aa\7k\2\2\u02aa\u02ab\7q\2\2\u02ab\u02ac\7p\2\2" +
					"\u02ac\u00c0\3\2\2\2\u02ad\u02ae\7h\2\2\u02ae\u02af\7w\2\2\u02af\u02b0" +
					"\7p\2\2\u02b0\u02b1\7e\2\2\u02b1\u02b2\7v\2\2\u02b2\u02b3\7k\2\2\u02b3" +
					"\u02b4\7q\2\2\u02b4\u02b5\7p\2\2\u02b5\u00c2\3\2\2\2\u02b6\u02b7\7}\2" +
					"\2\u02b7\u02b8\bb\4\2\u02b8\u00c4\3\2\2\2\u02b9\u02ba\7\177\2\2\u02ba" +
					"\u02bb\bc\5\2\u02bb\u00c6\3\2\2\2\u02bc\u02bd\7]\2\2\u02bd\u02be\bd\6" +
					"\2\u02be\u00c8\3\2\2\2\u02bf\u02c0\7_\2\2\u02c0\u02c1\be\7\2\u02c1\u00ca" +
					"\3\2\2\2\u02c2\u02c3\7K\2\2\u02c3\u02c4\7p\2\2\u02c4\u02c5\7v\2\2\u02c5" +
					"\u02c6\7:\2\2\u02c6\u00cc\3\2\2\2\u02c7\u02c8\7W\2\2\u02c8\u02c9\7k\2" +
					"\2\u02c9\u02ca\7p\2\2\u02ca\u02cb\7v\2\2\u02cb\u02cc\7:\2\2\u02cc\u00ce" +
					"\3\2\2\2\u02cd\u02ce\7K\2\2\u02ce\u02cf\7p\2\2\u02cf\u02d0\7v\2\2\u02d0" +
					"\u02d1\7\63\2\2\u02d1\u02d2\78\2\2\u02d2\u00d0\3\2\2\2\u02d3\u02d4\7W" +
					"\2\2\u02d4\u02d5\7k\2\2\u02d5\u02d6\7p\2\2\u02d6\u02d7\7v\2\2\u02d7\u02d8" +
					"\7\63\2\2\u02d8\u02d9\78\2\2\u02d9\u00d2\3\2\2\2\u02da\u02db\7K\2\2\u02db" +
					"\u02dc\7p\2\2\u02dc\u02dd\7v\2\2\u02dd\u02de\7\65\2\2\u02de\u02df\7\64" +
					"\2\2\u02df\u00d4\3\2\2\2\u02e0\u02e1\7W\2\2\u02e1\u02e2\7k\2\2\u02e2\u02e3" +
					"\7p\2\2\u02e3\u02e4\7v\2\2\u02e4\u02e5\7\65\2\2\u02e5\u02e6\7\64\2\2\u02e6" +
					"\u00d6\3\2\2\2\u02e7\u02e8\7K\2\2\u02e8\u02e9\7p\2\2\u02e9\u02ea\7v\2" +
					"\2\u02ea\u02eb\78\2\2\u02eb\u02ec\7\66\2\2\u02ec\u00d8\3\2\2\2\u02ed\u02ee" +
					"\7W\2\2\u02ee\u02ef\7k\2\2\u02ef\u02f0\7p\2\2\u02f0\u02f1\7v\2\2\u02f1" +
					"\u02f2\78\2\2\u02f2\u02f3\7\66\2\2\u02f3\u00da\3\2\2\2\u02f4\u02f5\7K" +
					"\2\2\u02f5\u02f6\7p\2\2\u02f6\u02f7\7v\2\2\u02f7\u02f8\7\63\2\2\u02f8" +
					"\u02f9\7\64\2\2\u02f9\u02fa\7:\2\2\u02fa\u00dc\3\2\2\2\u02fb\u02fc\7W" +
					"\2\2\u02fc\u02fd\7k\2\2\u02fd\u02fe\7p\2\2\u02fe\u02ff\7v\2\2\u02ff\u0300" +
					"\7\63\2\2\u0300\u0301\7\64\2\2\u0301\u0302\7:\2\2\u0302\u00de\3\2\2\2" +
					"\u0303\u0304\7D\2\2\u0304\u0305\7q\2\2\u0305\u0306\7q\2\2\u0306\u0307" +
					"\7n\2\2\u0307\u00e0\3\2\2\2\u0308\u0309\7E\2\2\u0309\u030a\7j\2\2\u030a" +
					"\u030b\7c\2\2\u030b\u030c\7t\2\2\u030c\u00e2\3\2\2\2\u030d\u030e\7H\2" +
					"\2\u030e\u030f\7n\2\2\u030f\u0310\7q\2\2\u0310\u0311\7c\2\2\u0311\u0312" +
					"\7v\2\2\u0312\u0313\7\63\2\2\u0313\u0314\78\2\2\u0314\u00e4\3\2\2\2\u0315" +
					"\u0316\7H\2\2\u0316\u0317\7n\2\2\u0317\u0318\7q\2\2\u0318\u0319\7c\2\2" +
					"\u0319\u031a\7v\2\2\u031a\u031b\7\65\2\2\u031b\u031c\7\64\2\2\u031c\u00e6" +
					"\3\2\2\2\u031d\u031e\7H\2\2\u031e\u031f\7n\2\2\u031f\u0320\7q\2\2\u0320" +
					"\u0321\7c\2\2\u0321\u0322\7v\2\2\u0322\u0323\78\2\2\u0323\u0324\7\66\2" +
					"\2\u0324\u00e8\3\2\2\2\u0325\u0326\7t\2\2\u0326\u0327\5\u0101\u0081\2" +
					"\u0327\u00ea\3\2\2\2\u0328\u032a\5\u010b\u0086\2\u0329\u0328\3\2\2\2\u032a" +
					"\u032b\3\2\2\2\u032b\u0329\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u00ec\3\2" +
					"\2\2\u032d\u032e\7\62\2\2\u032e\u032f\7d\2\2\u032f\u0331\3\2\2\2\u0330" +
					"\u0332\5\u010d\u0087\2\u0331\u0330\3\2\2\2\u0332\u0333\3\2\2\2\u0333\u0331" +
					"\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u00ee\3\2\2\2\u0335\u0336\7\62\2\2" +
					"\u0336\u0337\7q\2\2\u0337\u0339\3\2\2\2\u0338\u033a\5\u010f\u0088\2\u0339" +
					"\u0338\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u0339\3\2\2\2\u033b\u033c\3\2" +
					"\2\2\u033c\u00f0\3\2\2\2\u033d\u033e\7\62\2\2\u033e\u033f\7z\2\2\u033f" +
					"\u0341\3\2\2\2\u0340\u0342\5\u0111\u0089\2\u0341\u0340\3\2\2\2\u0342\u0343" +
					"\3\2\2\2\u0343\u0341\3\2\2\2\u0343\u0344\3\2\2\2\u0344\u00f2\3\2\2\2\u0345" +
					"\u0347\5\u010b\u0086\2\u0346\u0345\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u0346" +
					"\3\2\2\2\u0348\u0349\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u034e\t\2\2\2\u034b" +
					"\u034d\5\u010b\u0086\2\u034c\u034b\3\2\2\2\u034d\u0350\3\2\2\2\u034e\u034c" +
					"\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0352\3\2\2\2\u0350\u034e\3\2\2\2\u0351" +
					"\u0353\5\u00f5{\2\u0352\u0351\3\2\2\2\u0352\u0353\3\2\2\2\u0353\u035f" +
					"\3\2\2\2\u0354\u0358\7\60\2\2\u0355\u0357\5\u010b\u0086\2\u0356\u0355" +
					"\3\2\2\2\u0357\u035a\3\2\2\2\u0358\u0356\3\2\2\2\u0358\u0359\3\2\2\2\u0359" +
					"\u035c\3\2\2\2\u035a\u0358\3\2\2\2\u035b\u035d\5\u00f5{\2\u035c\u035b" +
					"\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u035f\3\2\2\2\u035e\u0346\3\2\2\2\u035e" +
					"\u0354\3\2\2\2\u035f\u00f4\3\2\2\2\u0360\u0362\t\3\2\2\u0361\u0363\t\4" +
					"\2\2\u0362\u0361\3\2\2\2\u0362\u0363\3\2\2\2\u0363\u0365\3\2\2\2\u0364" +
					"\u0366\5\u010b\u0086\2\u0365\u0364\3\2\2\2\u0366\u0367\3\2\2\2\u0367\u0365" +
					"\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u00f6\3\2\2\2\u0369\u036b\5\u010b\u0086" +
					"\2\u036a\u0369\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u036a\3\2\2\2\u036c\u036d" +
					"\3\2\2\2\u036d\u036e\3\2\2\2\u036e\u0372\t\2\2\2\u036f\u0371\5\u010b\u0086" +
					"\2\u0370\u036f\3\2\2\2\u0371\u0374\3\2\2\2\u0372\u0370\3\2\2\2\u0372\u0373" +
					"\3\2\2\2\u0373\u0376\3\2\2\2\u0374\u0372\3\2\2\2\u0375\u0377\5\u00f9}" +
					"\2\u0376\u0375\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u0383\3\2\2\2\u0378\u037c" +
					"\7\60\2\2\u0379\u037b\5\u010b\u0086\2\u037a\u0379\3\2\2\2\u037b\u037e" +
					"\3\2\2\2\u037c\u037a\3\2\2\2\u037c\u037d\3\2\2\2\u037d\u0380\3\2\2\2\u037e" +
					"\u037c\3\2\2\2\u037f\u0381\5\u00f9}\2\u0380\u037f\3\2\2\2\u0380\u0381" +
					"\3\2\2\2\u0381\u0383\3\2\2\2\u0382\u036a\3\2\2\2\u0382\u0378\3\2\2\2\u0383" +
					"\u00f8\3\2\2\2\u0384\u0386\t\5\2\2\u0385\u0387\t\4\2\2\u0386\u0385\3\2" +
					"\2\2\u0386\u0387\3\2\2\2\u0387\u0389\3\2\2\2\u0388\u038a\5\u010b\u0086" +
					"\2\u0389\u0388\3\2\2\2\u038a\u038b\3\2\2\2\u038b\u0389\3\2\2\2\u038b\u038c" +
					"\3\2\2\2\u038c\u00fa\3\2\2\2\u038d\u038e\5\u0109\u0085\2\u038e\u038f\7" +
					"^\2\2\u038f\u0390\7\60\2\2\u0390\u0392\3\2\2\2\u0391\u038d\3\2\2\2\u0392" +
					"\u0393\3\2\2\2\u0393\u0391\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u0395\3\2" +
					"\2\2\u0395\u0396\5\u00fd\177\2\u0396\u00fc\3\2\2\2\u0397\u039a\7a\2\2" +
					"\u0398\u039a\5\u0115\u008b\2\u0399\u0397\3\2\2\2\u0399\u0398\3\2\2\2\u039a" +
					"\u03a0\3\2\2\2\u039b\u039f\7a\2\2\u039c\u039f\5\u0115\u008b\2\u039d\u039f" +
					"\5\u010b\u0086\2\u039e\u039b\3\2\2\2\u039e\u039c\3\2\2\2\u039e\u039d\3" +
					"\2\2\2\u039f\u03a2\3\2\2\2\u03a0\u039e\3\2\2\2\u03a0\u03a1\3\2\2\2\u03a1" +
					"\u03a4\3\2\2\2\u03a2\u03a0\3\2\2\2\u03a3\u03a5\7#\2\2\u03a4\u03a3\3\2" +
					"\2\2\u03a4\u03a5\3\2\2\2\u03a5\u00fe\3\2\2\2\u03a6\u03a7\7)\2\2\u03a7" +
					"\u03a8\n\6\2\2\u03a8\u03ae\7)\2\2\u03a9\u03aa\7)\2\2\u03aa\u03ab\7^\2" +
					"\2\u03ab\u03ac\13\2\2\2\u03ac\u03ae\7)\2\2\u03ad\u03a6\3\2\2\2\u03ad\u03a9" +
					"\3\2\2\2\u03ae\u0100\3\2\2\2\u03af\u03b5\7$\2\2\u03b0\u03b1\7^\2\2\u03b1" +
					"\u03b4\7$\2\2\u03b2\u03b4\n\7\2\2\u03b3\u03b0\3\2\2\2\u03b3\u03b2\3\2" +
					"\2\2\u03b4\u03b7\3\2\2\2\u03b5\u03b3\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6" +
					"\u03b8\3\2\2\2\u03b7\u03b5\3\2\2\2\u03b8\u03b9\7$\2\2\u03b9\u0102\3\2" +
					"\2\2\u03ba\u03bc\t\b\2\2\u03bb\u03ba\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd" +
					"\u03bb\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf\u03c0\b\u0082" +
					"\b\2\u03c0\u0104\3\2\2\2\u03c1\u03c2\7%\2\2\u03c2\u03c3\7?\2\2\u03c3\u03c7" +
					"\3\2\2\2\u03c4\u03c6\13\2\2\2\u03c5\u03c4\3\2\2\2\u03c6\u03c9\3\2\2\2" +
					"\u03c7\u03c8\3\2\2\2\u03c7\u03c5\3\2\2\2\u03c8\u03ca\3\2\2\2\u03c9\u03c7" +
					"\3\2\2\2\u03ca\u03cb\7?\2\2\u03cb\u03cc\7%\2\2\u03cc\u03cd\3\2\2\2\u03cd" +
					"\u03ce\b\u0083\b\2\u03ce\u0106\3\2\2\2\u03cf\u03d3\7%\2\2\u03d0\u03d2" +
					"\n\t\2\2\u03d1\u03d0\3\2\2\2\u03d2\u03d5\3\2\2\2\u03d3\u03d1\3\2\2\2\u03d3" +
					"\u03d4\3\2\2\2\u03d4\u03d6\3\2\2\2\u03d5\u03d3\3\2\2\2\u03d6\u03d7\b\u0084" +
					"\b\2\u03d7\u0108\3\2\2\2\u03d8\u03db\7a\2\2\u03d9\u03db\5\u0115\u008b" +
					"\2\u03da\u03d8\3\2\2\2\u03da\u03d9\3\2\2\2\u03db\u03e1\3\2\2\2\u03dc\u03e0" +
					"\7a\2\2\u03dd\u03e0\5\u0115\u008b\2\u03de\u03e0\5\u010b\u0086\2\u03df" +
					"\u03dc\3\2\2\2\u03df\u03dd\3\2\2\2\u03df\u03de\3\2\2\2\u03e0\u03e3\3\2" +
					"\2\2\u03e1\u03df\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2\u010a\3\2\2\2\u03e3" +
					"\u03e1\3\2\2\2\u03e4\u03e5\t\n\2\2\u03e5\u010c\3\2\2\2\u03e6\u03e7\t\13" +
					"\2\2\u03e7\u010e\3\2\2\2\u03e8\u03e9\t\f\2\2\u03e9\u0110\3\2\2\2\u03ea" +
					"\u03eb\t\r\2\2\u03eb\u0112\3\2\2\2\u03ec\u03fd\7:\2\2\u03ed\u03ee\7\63" +
					"\2\2\u03ee\u03fd\78\2\2\u03ef\u03f0\7\65\2\2\u03f0\u03fd\7\64\2\2\u03f1" +
					"\u03f2\78\2\2\u03f2\u03fd\7\66\2\2\u03f3\u03f4\7\63\2\2\u03f4\u03f5\7" +
					"\64\2\2\u03f5\u03fd\7:\2\2\u03f6\u03f7\7\64\2\2\u03f7\u03f8\7\67\2\2\u03f8" +
					"\u03fd\78\2\2\u03f9\u03fa\7\67\2\2\u03fa\u03fb\7\63\2\2\u03fb\u03fd\7" +
					"\64\2\2\u03fc\u03ec\3\2\2\2\u03fc\u03ed\3\2\2\2\u03fc\u03ef\3\2\2\2\u03fc" +
					"\u03f1\3\2\2\2\u03fc\u03f3\3\2\2\2\u03fc\u03f6\3\2\2\2\u03fc\u03f9\3\2" +
					"\2\2\u03fd\u0114\3\2\2\2\u03fe\u03ff\t\16\2\2\u03ff\u0116\3\2\2\2+\2\u012a" +
					"\u0133\u0138\u0150\u0160\u032b\u0333\u033b\u0343\u0348\u034e\u0352\u0358" +
					"\u035c\u035e\u0362\u0367\u036c\u0372\u0376\u037c\u0380\u0382\u0386\u038b" +
					"\u0393\u0399\u039e\u03a0\u03a4\u03ad\u03b3\u03b5\u03bd\u03c7\u03d3\u03da" +
					"\u03df\u03e1\u03fc\t\3V\2\3W\3\3b\4\3c\5\3d\6\3e\7\b\2\2";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
			new PredictionContextCache();
	private static final String[] _LITERAL_NAMES = {
			null, "'->'", "'@'", "'.'", "';'", "'==='", "'=='", null, "'>'", "'<'",
			null, null, "'-'", "'^'", "'//'", "'*'", "'/'", "'+'", "'.=='", null,
			"'.>'", "'.<'", "'.>='", null, "'.-'", "'.^'", "'.//'", "'.*'", "'./'",
			"'.+'", "'|>'", "'='", "'=>'", "'+='", "'-='", "'*='", "'/='", "'\\='",
			"'%='", "'%'", "'^='", "'&='", "'|='", "'$='", "'>>>='", "'>>='", "'...'",
			"'<<='", "'?'", "'while'", "'begin'", "'return'", "'in'", "'if'", "'elseif'",
			"'else'", "'for'", "'const'", "'using'", "'import'", "'::'", "':'", "','",
			"'do'", "'importall'", "'export'", "'module'", "'let'", null, null, "'baremodule'",
			"'Inf16'", "'Inf32'", "'Inf'", "'-Inf16'", "'-Inf32'", "'-Inf'", "'NaN16'",
			"'NaN32'", "'NaN'", "'!'", "'&&'", "'&'", "'||'", "'|'", "'('", "')'",
			"'true'", "'false'", "'abstract'", "'<:'", "'bitstype'", "'typealias'",
			"'type'", "'immutable'", "'Union'", "'function'", "'{'", "'}'", "'['",
			"']'", "'Int8'", "'Uint8'", "'Int16'", "'Uint16'", "'Int32'", "'Uint32'",
			"'Int64'", "'Uint64'", "'Int128'", "'Uint128'", "'Bool'", "'Char'", "'Float16'",
			"'Float32'", "'Float64'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
			null, "ARROW", "AT", "DOT", "SEMI_COLON", "IS", "EQUALS", "NOT_EQUAL",
			"GREATER_THAN", "LESS_THAN", "GREATER_THAN_OR_EQ", "LESS_THAN_OR_EQ",
			"MINUS", "EXPONENT", "FRACTION", "TIMES", "DIVIDE", "PLUS", "ELM_EQUALS",
			"ELM_NOT_EQUAL", "ELM_GREATER_THAN", "ELM_LESS_THAN", "ELM_GREATER_THAN_OR_EQ",
			"ELM_LESS_THAN_OR_EQ", "ELM_MINUS", "ELM_EXPONENT", "ELM_FRACTION", "ELM_TIMES",
			"ELM_DIVIDE", "ELM_PLUS", "RAPP", "EQ", "DOUBLE_ARROW", "ADD_ASGN", "SUB_ASGN",
			"TIMES_ASGN", "DIVIDE_ASGN", "INV_DIVIDE_ASGN", "REMAINDER_ASGN", "REM",
			"POWER_ASGN", "BITWISE_AND_ASGN", "BITWISE_OR_ASGN", "BITWISE_XOR_ASGN",
			"LSR_ASGN", "ASR_ASGN", "ELLIPSE", "ASL_ASGN", "QUESTION_MARK", "WHILE",
			"BEGIN", "RETURN", "IN", "IF", "ELSE_IF", "ELSE", "FOR", "CONST", "USING",
			"IMPORT", "INSTANCE_OF", "COLON", "COMMA", "DO", "IMPORT_ALL", "EXPORT",
			"MODULE", "LET", "END", "END_LITERAL", "BAREMODULE", "INF16", "INF32",
			"INF", "MINUS_INF16", "MINUS_INF32", "MINUS_INF", "NAN16", "NAN32", "NAN",
			"NOT", "AND", "BITWISE_AND", "OR", "BITWISE_OR", "LEFT_BRACKET", "RIGHT_BRACKET",
			"TRUE", "FALSE", "ABSTRACT", "SUB_TYPE", "BITS_TYPE", "TYPE_ALIAS", "TYPE",
			"IMMUTABLE", "UNION", "FUNCTION", "LEFT_CURLY", "RIGHT_CURLY", "LEFT_SQUARE",
			"RIGHT_SQUARE", "INT8", "UINT8", "INT16", "UINT16", "INT32", "UINT32",
			"INT64", "UINT64", "INT128", "UINT128", "BOOL", "CHAR", "FLOAT16", "FLOAT32",
			"FLOAT64", "REGEX", "INT", "BINARY", "OCTAL", "HEX", "FLOAT32_LITERAL",
			"EXP32", "FLOAT64_LITERAL", "EXP64", "FQN", "ID", "CHARACTER_LITERAL",
			"STRING", "WS", "COMMENT", "LINE_COMMENT", "SIZE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);
	public static String[] modeNames = {
			"DEFAULT_MODE"
	};

	static {
		RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION);
	}

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

	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}

	int nesting = 0;
	int squareNesting = 0;

	public JuliaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
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
	public String getGrammarFileName() { return "JuliaLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() {
		return _ATN;
	}

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
			case 84:
				LEFT_BRACKET_action((RuleContext) _localctx, actionIndex);
				break;
			case 85:
				RIGHT_BRACKET_action((RuleContext) _localctx, actionIndex);
				break;
			case 96:
				LEFT_CURLY_action((RuleContext) _localctx, actionIndex);
				break;
			case 97:
				RIGHT_CURLY_action((RuleContext) _localctx, actionIndex);
				break;
			case 98:
				LEFT_SQUARE_action((RuleContext) _localctx, actionIndex);
				break;
			case 99:
				RIGHT_SQUARE_action((RuleContext) _localctx, actionIndex);
				break;
		}
	}

	private void LEFT_BRACKET_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
			case 0:
				nesting++;
				break;
		}
	}

	private void RIGHT_BRACKET_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
			case 1:
				nesting--;
				break;
		}
	}

	private void LEFT_CURLY_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
			case 2:
				nesting++;
				break;
		}
	}

	private void RIGHT_CURLY_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
			case 3:
				nesting--;
				break;
		}
	}

	private void LEFT_SQUARE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
			case 4:
				nesting++;
				squareNesting++;
				break;
		}
	}

	private void RIGHT_SQUARE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
			case 5:
				nesting--;
				squareNesting--;
				break;
		}
	}

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
			case 67:
				return END_sempred((RuleContext) _localctx, predIndex);
			case 68:
				return END_LITERAL_sempred((RuleContext) _localctx, predIndex);
		}
		return true;
	}

	private boolean END_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
			case 0:
				return squareNesting == 0;
		}
		return true;
	}

	private boolean END_LITERAL_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
			case 1:
				return squareNesting > 0;
		}
		return true;
	}
}