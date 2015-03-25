/* The following code was generated by JFlex 1.5.0-SNAPSHOT */


/* --------------------------Codigo de Usuario----------------------- */
package ejemplocup;

import java_cup.runtime.*;
import java.io.Reader;
      

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.5.0-SNAPSHOT
 * from the specification file <tt>alexico.flex</tt>
 */
class AnalizadorLexico implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\17\1\12\1\13\1\13\1\12\22\0\1\5\1\32\1\4"+
    "\1\0\1\15\1\62\1\43\1\14\1\22\1\16\1\11\1\33\1\25"+
    "\1\3\1\7\1\10\12\2\1\0\1\26\1\30\1\31\1\27\1\50"+
    "\1\0\32\6\1\23\1\0\1\24\1\0\1\1\1\0\1\40\1\45"+
    "\1\35\1\51\1\34\1\54\1\6\1\36\1\53\1\6\1\46\1\52"+
    "\1\6\1\55\1\37\1\61\1\6\1\41\1\47\1\57\1\60\1\6"+
    "\1\56\1\6\1\42\1\6\1\20\1\44\1\21\7\0\1\13\u1fa2\0"+
    "\1\13\1\13\udfd6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\1\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\1"+
    "\1\26\4\2\2\1\2\2\1\1\5\2\1\27\1\30"+
    "\1\31\1\0\1\32\1\6\2\0\1\33\1\34\1\35"+
    "\2\36\1\37\1\40\1\41\6\2\1\42\1\43\3\2"+
    "\1\44\1\45\1\46\5\2\1\30\1\47\1\30\1\0"+
    "\1\50\1\33\1\0\1\51\1\52\12\2\1\53\3\2"+
    "\1\6\1\0\1\54\1\55\4\2\1\56\13\2\1\57"+
    "\2\2\1\60\1\2\1\61\4\2\1\62\1\63\1\64"+
    "\1\2\1\65\1\2\1\66\1\67\1\70\4\2\1\71"+
    "\2\2\1\72\1\73\1\74";

  private static int [] zzUnpackAction() {
    int [] result = new int[146];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\63\0\146\0\231\0\314\0\377\0\63\0\63"+
    "\0\u0132\0\63\0\u0165\0\u0198\0\63\0\63\0\63\0\63"+
    "\0\63\0\63\0\63\0\63\0\u01cb\0\u01fe\0\u0231\0\u0264"+
    "\0\u0297\0\u02ca\0\u02fd\0\u0330\0\u0363\0\u0396\0\u03c9\0\u03fc"+
    "\0\u042f\0\u0462\0\u0495\0\u04c8\0\u04fb\0\u052e\0\u0561\0\u0594"+
    "\0\u05c7\0\63\0\377\0\63\0\u05fa\0\u062d\0\u0660\0\u0693"+
    "\0\63\0\63\0\u06c6\0\63\0\u06f9\0\u072c\0\63\0\u075f"+
    "\0\u0792\0\u07c5\0\u07f8\0\u082b\0\u085e\0\63\0\63\0\u0891"+
    "\0\u08c4\0\u08f7\0\63\0\146\0\146\0\u092a\0\u095d\0\u0990"+
    "\0\u09c3\0\u09f6\0\u0a29\0\u0a5c\0\u0a8f\0\u0ac2\0\63\0\u0af5"+
    "\0\u0b28\0\63\0\63\0\u0b5b\0\u0b8e\0\u0bc1\0\u0bf4\0\u0c27"+
    "\0\u0c5a\0\u0c8d\0\u0cc0\0\u0cf3\0\u0d26\0\146\0\u0d59\0\u0d8c"+
    "\0\u0dbf\0\u062d\0\u0df2\0\146\0\u0e25\0\u0e58\0\u0e8b\0\u0ebe"+
    "\0\u0ef1\0\146\0\u0f24\0\u0f57\0\u0f8a\0\u0fbd\0\u0ff0\0\u1023"+
    "\0\u1056\0\u1089\0\u10bc\0\u10ef\0\u1122\0\146\0\u1155\0\u1188"+
    "\0\146\0\u11bb\0\146\0\u11ee\0\u1221\0\u1254\0\u1287\0\146"+
    "\0\146\0\146\0\u12ba\0\146\0\u12ed\0\146\0\146\0\146"+
    "\0\u1320\0\u1353\0\u1386\0\u13b9\0\146\0\u13ec\0\u141f\0\146"+
    "\0\146\0\146";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[146];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\3\1\10"+
    "\1\11\1\12\1\7\1\2\1\13\1\14\1\15\1\7"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\2\3\1\34"+
    "\1\35\1\3\1\36\1\37\1\40\1\3\1\41\1\42"+
    "\1\43\1\3\1\44\1\45\1\3\1\46\2\3\1\47"+
    "\1\2\64\0\2\3\3\0\1\3\25\0\7\3\2\0"+
    "\3\3\1\0\11\3\2\0\1\50\1\4\3\0\1\50"+
    "\1\51\24\0\7\50\2\0\3\50\1\0\11\50\3\0"+
    "\1\4\1\52\61\0\1\53\1\0\1\54\2\53\25\0"+
    "\7\53\2\0\3\53\1\0\11\53\11\0\1\55\1\56"+
    "\53\0\1\57\3\0\1\57\25\0\7\57\2\0\3\57"+
    "\1\0\11\57\2\0\1\60\4\0\1\60\25\0\7\60"+
    "\2\0\3\60\1\0\11\60\32\0\1\61\62\0\1\62"+
    "\16\0\1\63\11\0\1\64\31\0\1\65\62\0\1\66"+
    "\33\0\1\4\30\0\1\67\30\0\2\3\3\0\1\3"+
    "\25\0\1\3\1\70\5\3\2\0\3\3\1\0\1\3"+
    "\1\71\2\3\1\72\4\3\2\0\2\3\3\0\1\3"+
    "\25\0\4\3\1\73\2\3\2\0\3\3\1\0\11\3"+
    "\2\0\2\3\3\0\1\3\25\0\5\3\1\74\1\3"+
    "\2\0\3\3\1\0\11\3\2\0\2\3\3\0\1\3"+
    "\25\0\1\75\6\3\2\0\3\3\1\0\11\3\44\0"+
    "\1\76\63\0\1\77\17\0\2\3\3\0\1\3\25\0"+
    "\5\3\1\100\1\3\2\0\3\3\1\0\11\3\2\0"+
    "\2\3\3\0\1\3\25\0\7\3\2\0\3\3\1\0"+
    "\5\3\1\101\1\102\2\3\30\0\1\103\34\0\2\3"+
    "\3\0\1\3\25\0\3\3\1\104\3\3\2\0\3\3"+
    "\1\0\11\3\2\0\2\3\3\0\1\3\25\0\7\3"+
    "\2\0\3\3\1\0\3\3\1\105\1\106\4\3\2\0"+
    "\2\3\3\0\1\3\25\0\3\3\1\107\3\3\2\0"+
    "\3\3\1\0\7\3\1\110\1\3\2\0\2\3\3\0"+
    "\1\3\25\0\2\3\1\111\4\3\2\0\3\3\1\0"+
    "\11\3\2\0\2\3\3\0\1\3\25\0\5\3\1\112"+
    "\1\3\2\0\3\3\1\0\11\3\3\0\1\50\61\0"+
    "\1\113\1\114\3\0\1\113\1\115\24\0\7\113\2\0"+
    "\3\113\1\0\11\113\1\0\12\55\2\0\47\55\11\56"+
    "\1\116\2\0\47\56\14\0\1\117\47\0\1\60\1\120"+
    "\3\0\1\60\25\0\7\60\2\0\3\60\1\0\11\60"+
    "\62\0\1\121\32\0\1\122\62\0\1\123\32\0\2\3"+
    "\3\0\1\3\25\0\2\3\1\124\4\3\2\0\3\3"+
    "\1\0\11\3\2\0\2\3\3\0\1\3\25\0\7\3"+
    "\2\0\2\3\1\125\1\0\11\3\2\0\2\3\3\0"+
    "\1\3\25\0\7\3\2\0\3\3\1\0\1\126\10\3"+
    "\2\0\2\3\3\0\1\3\25\0\7\3\2\0\2\3"+
    "\1\127\1\0\11\3\2\0\2\3\3\0\1\3\25\0"+
    "\5\3\1\130\1\3\2\0\3\3\1\0\11\3\2\0"+
    "\2\3\3\0\1\3\25\0\7\3\2\0\3\3\1\0"+
    "\6\3\1\131\2\3\2\0\2\3\3\0\1\3\25\0"+
    "\1\132\6\3\2\0\3\3\1\0\11\3\2\0\2\3"+
    "\3\0\1\3\25\0\7\3\2\0\3\3\1\0\2\3"+
    "\1\133\6\3\2\0\2\3\3\0\1\3\25\0\4\3"+
    "\1\134\2\3\2\0\3\3\1\0\11\3\2\0\2\3"+
    "\3\0\1\3\25\0\1\3\1\135\5\3\2\0\3\3"+
    "\1\0\11\3\2\0\2\3\3\0\1\3\25\0\5\3"+
    "\1\136\1\3\2\0\3\3\1\0\11\3\2\0\2\3"+
    "\3\0\1\3\25\0\7\3\2\0\3\3\1\0\4\3"+
    "\1\137\4\3\2\0\2\3\3\0\1\3\25\0\7\3"+
    "\2\0\3\3\1\0\2\3\1\140\6\3\2\0\2\3"+
    "\3\0\1\3\25\0\7\3\2\0\3\3\1\0\2\3"+
    "\1\141\6\3\2\0\2\113\3\0\1\113\25\0\7\113"+
    "\2\0\3\113\1\0\11\113\2\0\1\113\1\114\3\0"+
    "\1\113\25\0\7\113\2\0\3\113\1\0\11\113\2\0"+
    "\2\113\3\0\1\113\1\115\24\0\7\113\2\0\3\113"+
    "\1\0\11\113\1\0\10\56\1\142\1\116\2\0\47\56"+
    "\2\0\1\120\116\0\1\143\25\0\2\3\3\0\1\3"+
    "\25\0\3\3\1\144\3\3\2\0\3\3\1\0\11\3"+
    "\2\0\2\3\3\0\1\3\25\0\1\145\6\3\2\0"+
    "\3\3\1\0\11\3\2\0\2\3\3\0\1\3\25\0"+
    "\7\3\2\0\2\3\1\146\1\0\2\3\1\147\1\150"+
    "\1\3\1\151\3\3\2\0\2\3\3\0\1\3\25\0"+
    "\1\152\6\3\2\0\3\3\1\0\11\3\2\0\2\3"+
    "\3\0\1\3\25\0\4\3\1\153\2\3\2\0\3\3"+
    "\1\0\11\3\2\0\2\3\3\0\1\3\25\0\7\3"+
    "\2\0\3\3\1\0\7\3\1\154\1\3\2\0\2\3"+
    "\3\0\1\3\25\0\4\3\1\155\2\3\2\0\3\3"+
    "\1\0\11\3\2\0\2\3\3\0\1\3\25\0\7\3"+
    "\2\0\3\3\1\0\6\3\1\156\2\3\2\0\2\3"+
    "\3\0\1\3\25\0\7\3\2\0\3\3\1\0\6\3"+
    "\1\157\2\3\2\0\2\3\3\0\1\3\25\0\7\3"+
    "\2\0\3\3\1\0\1\3\1\160\7\3\2\0\2\3"+
    "\3\0\1\3\25\0\1\3\1\161\5\3\2\0\3\3"+
    "\1\0\11\3\2\0\2\3\3\0\1\3\25\0\7\3"+
    "\2\0\3\3\1\0\1\3\1\162\7\3\2\0\2\3"+
    "\3\0\1\3\25\0\7\3\2\0\3\3\1\0\4\3"+
    "\1\163\4\3\62\0\1\64\2\0\2\3\3\0\1\3"+
    "\25\0\7\3\2\0\3\3\1\0\2\3\1\164\6\3"+
    "\2\0\2\3\3\0\1\3\25\0\7\3\2\0\3\3"+
    "\1\0\5\3\1\165\3\3\2\0\2\3\3\0\1\3"+
    "\25\0\7\3\2\0\3\3\1\0\3\3\1\166\5\3"+
    "\2\0\2\3\3\0\1\3\25\0\3\3\1\167\3\3"+
    "\2\0\3\3\1\0\11\3\2\0\2\3\3\0\1\3"+
    "\25\0\2\3\1\170\4\3\2\0\3\3\1\0\11\3"+
    "\2\0\2\3\3\0\1\3\25\0\6\3\1\171\2\0"+
    "\3\3\1\0\11\3\2\0\2\3\3\0\1\3\25\0"+
    "\5\3\1\172\1\3\2\0\3\3\1\0\11\3\2\0"+
    "\2\3\3\0\1\3\25\0\7\3\2\0\1\3\1\173"+
    "\1\3\1\0\11\3\2\0\2\3\3\0\1\3\25\0"+
    "\1\3\1\174\5\3\2\0\3\3\1\0\11\3\2\0"+
    "\2\3\3\0\1\3\25\0\7\3\2\0\3\3\1\0"+
    "\2\3\1\175\6\3\2\0\2\3\3\0\1\3\25\0"+
    "\7\3\2\0\3\3\1\0\7\3\1\176\1\3\2\0"+
    "\2\3\3\0\1\3\25\0\7\3\2\0\3\3\1\0"+
    "\6\3\1\177\2\3\2\0\2\3\3\0\1\3\25\0"+
    "\1\200\6\3\2\0\3\3\1\0\11\3\2\0\2\3"+
    "\3\0\1\3\25\0\7\3\2\0\3\3\1\0\6\3"+
    "\1\201\2\3\2\0\2\3\3\0\1\3\25\0\7\3"+
    "\2\0\3\3\1\0\3\3\1\202\5\3\2\0\2\3"+
    "\3\0\1\3\25\0\7\3\2\0\3\3\1\0\2\3"+
    "\1\203\6\3\2\0\2\3\3\0\1\3\25\0\5\3"+
    "\1\204\1\3\2\0\3\3\1\0\11\3\2\0\2\3"+
    "\3\0\1\3\25\0\7\3\2\0\3\3\1\0\2\3"+
    "\1\205\6\3\2\0\2\3\3\0\1\3\25\0\7\3"+
    "\2\0\3\3\1\0\4\3\1\206\4\3\2\0\2\3"+
    "\3\0\1\3\25\0\2\3\1\207\4\3\2\0\3\3"+
    "\1\0\11\3\2\0\2\3\3\0\1\3\25\0\1\3"+
    "\1\210\5\3\2\0\3\3\1\0\11\3\2\0\2\3"+
    "\3\0\1\3\25\0\7\3\2\0\3\3\1\0\1\211"+
    "\10\3\2\0\2\3\3\0\1\3\25\0\7\3\2\0"+
    "\3\3\1\0\2\3\1\212\6\3\2\0\2\3\3\0"+
    "\1\3\25\0\7\3\2\0\3\3\1\0\6\3\1\213"+
    "\2\3\2\0\2\3\3\0\1\3\25\0\7\3\2\0"+
    "\3\3\1\0\1\3\1\214\7\3\2\0\2\3\3\0"+
    "\1\3\25\0\1\215\6\3\2\0\3\3\1\0\11\3"+
    "\2\0\2\3\3\0\1\3\25\0\3\3\1\216\3\3"+
    "\2\0\3\3\1\0\11\3\2\0\2\3\3\0\1\3"+
    "\25\0\1\3\1\217\5\3\2\0\3\3\1\0\11\3"+
    "\2\0\2\3\3\0\1\3\25\0\1\220\6\3\2\0"+
    "\3\3\1\0\11\3\2\0\2\3\3\0\1\3\25\0"+
    "\7\3\2\0\3\3\1\0\4\3\1\221\4\3\2\0"+
    "\2\3\3\0\1\3\25\0\2\3\1\222\4\3\2\0"+
    "\3\3\1\0\11\3\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5202];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\4\1\2\11\1\1\1\11\2\1\10\11"+
    "\25\1\1\11\1\0\1\11\1\1\2\0\1\1\2\11"+
    "\1\1\1\11\2\1\1\11\6\1\2\11\3\1\1\11"+
    "\12\1\1\0\1\11\1\1\1\0\2\11\17\1\1\0"+
    "\57\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[146];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    /*  Generamos un java_cup.Symbol para guardar el tipo de token 
        encontrado */
    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn);
    }
    
    /* Generamos un Symbol para el tipo de token encontrado 
       junto con su valor */
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  AnalizadorLexico(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  AnalizadorLexico(java.io.InputStream in) {
    this(new java.io.InputStreamReader
             (in, java.nio.charset.Charset.forName("UTF-8")));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 146) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

    // numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 1: 
          { throw new Error("Caracter ilegal <"+yytext()+">");
          }
        case 61: break;
        case 2: 
          { System.out.print(yytext()); return symbol(sym.LETRA);
          }
        case 62: break;
        case 3: 
          { System.out.print(yytext()); return symbol(sym.DIGITO);
          }
        case 63: break;
        case 4: 
          { System.out.print(yytext()); return symbol(sym.MENOS);
          }
        case 64: break;
        case 5: 
          { System.out.print(yytext()); return symbol(sym.COMILLADOBLE);
          }
        case 65: break;
        case 6: 
          { /*Ignore*/
          }
        case 66: break;
        case 7: 
          { System.out.print(yytext()); return symbol(sym.PUNTO);
          }
        case 67: break;
        case 8: 
          { System.out.print(yytext()); return symbol(sym.DIVISION);
          }
        case 68: break;
        case 9: 
          { System.out.print(yytext()); return symbol(sym.MULTIPLICACION);
          }
        case 69: break;
        case 10: 
          { System.out.print(yytext()); return symbol(sym.COMILLASIMPLE);
          }
        case 70: break;
        case 11: 
          { System.out.print(yytext()); return symbol(sym.PARENTESISDER);
          }
        case 71: break;
        case 12: 
          { System.out.print(yytext()); return symbol(sym.LLAVEIZQ);
          }
        case 72: break;
        case 13: 
          { System.out.print(yytext()); return symbol(sym.LLAVEDER);
          }
        case 73: break;
        case 14: 
          { System.out.print(yytext()); return symbol(sym.PARENTESISIZQ);
          }
        case 74: break;
        case 15: 
          { System.out.print(yytext()); return symbol(sym.CORCHETEIZQ);
          }
        case 75: break;
        case 16: 
          { System.out.print(yytext()); return symbol(sym.CORCHETEDER);
          }
        case 76: break;
        case 17: 
          { System.out.print(yytext()); return symbol(sym.COMA);
          }
        case 77: break;
        case 18: 
          { System.out.print(yytext()); return symbol(sym.PUNTOYCOMA);
          }
        case 78: break;
        case 19: 
          { System.out.print(yytext()); return symbol(sym.MAYOR);
          }
        case 79: break;
        case 20: 
          { System.out.print(yytext()); return symbol(sym.MENOR);
          }
        case 80: break;
        case 21: 
          { System.out.print(yytext()); return symbol(sym.ASIGNACION);
          }
        case 81: break;
        case 22: 
          { System.out.print(yytext()); return symbol(sym.MAS);
          }
        case 82: break;
        case 23: 
          { System.out.print(yytext()); return symbol(sym.MD);
          }
        case 83: break;
        case 24: 
          { System.out.print(yytext()); return symbol(sym.MF);
          }
        case 84: break;
        case 25: 
          { System.out.print(yytext()); return symbol(sym.DECREMENTO);
          }
        case 85: break;
        case 26: 
          { System.out.print(yytext()); return symbol(sym.CADENA);
          }
        case 86: break;
        case 27: 
          { System.out.print(yytext()); return symbol(sym.VARIABLE);
          }
        case 87: break;
        case 28: 
          { System.out.print(yytext()); return symbol(sym.MAYORIGUAL);
          }
        case 88: break;
        case 29: 
          { System.out.print(yytext()); return symbol(sym.MENORIGUAL);
          }
        case 89: break;
        case 30: 
          { System.out.print(yytext()); return symbol(sym.INICIO);
          }
        case 90: break;
        case 31: 
          { System.out.print(yytext()); return symbol(sym.IGUAL);
          }
        case 91: break;
        case 32: 
          { System.out.print(yytext()); return symbol(sym.DIFERENTE);
          }
        case 92: break;
        case 33: 
          { System.out.print(yytext()); return symbol(sym.INCREMENTO);
          }
        case 93: break;
        case 34: 
          { System.out.print(yytext()); return symbol(sym.AND);
          }
        case 94: break;
        case 35: 
          { System.out.print(yytext()); return symbol(sym.OR);
          }
        case 95: break;
        case 36: 
          { System.out.print(yytext()); return symbol(sym.FINAL);
          }
        case 96: break;
        case 37: 
          { System.out.print(yytext()); return symbol(sym.DO);
          }
        case 97: break;
        case 38: 
          { System.out.print(yytext()); return symbol(sym.IF);
          }
        case 98: break;
        case 39: 
          { System.out.print(yytext()); return symbol(sym.FLOAT);
          }
        case 99: break;
        case 40: 
          { System.out.print(yytext()); return symbol(sym.CARACTER);
          }
        case 100: break;
        case 41: 
          { System.out.print(yytext()); return symbol(sym.IDENTICO);
          }
        case 101: break;
        case 42: 
          { System.out.print(yytext()); return symbol(sym.NOIDENTICO);
          }
        case 102: break;
        case 43: 
          { System.out.print(yytext()); return symbol(sym.FOR);
          }
        case 103: break;
        case 44: 
          { System.out.print(yytext()); return symbol(sym.ECHO);
          }
        case 104: break;
        case 45: 
          { System.out.print(yytext()); return symbol(sym.ELSE);
          }
        case 105: break;
        case 46: 
          { System.out.print(yytext()); return symbol(sym.CASE);
          }
        case 106: break;
        case 47: 
          { System.out.print(yytext()); return symbol(sym.ENDIF);
          }
        case 107: break;
        case 48: 
          { System.out.print(yytext()); return symbol(sym.ARRAY);
          }
        case 108: break;
        case 49: 
          { System.out.print(yytext()); return symbol(sym.BREAK);
          }
        case 109: break;
        case 50: 
          { System.out.print(yytext()); return symbol(sym.WHILE);
          }
        case 110: break;
        case 51: 
          { System.out.print(yytext()); return symbol(sym.PRINT);
          }
        case 111: break;
        case 52: 
          { System.out.print(yytext()); return symbol(sym.ELSEIF);
          }
        case 112: break;
        case 53: 
          { System.out.print(yytext()); return symbol(sym.ENDFOR);
          }
        case 113: break;
        case 54: 
          { System.out.print(yytext()); return symbol(sym.RETURN);
          }
        case 114: break;
        case 55: 
          { System.out.print(yytext()); return symbol(sym.SWITCH);
          }
        case 115: break;
        case 56: 
          { System.out.print(yytext()); return symbol(sym.STATIC);
          }
        case 116: break;
        case 57: 
          { System.out.print(yytext()); return symbol(sym.INCLUDE);
          }
        case 117: break;
        case 58: 
          { System.out.print(yytext()); return symbol(sym.ENDWHILE);
          }
        case 118: break;
        case 59: 
          { System.out.print(yytext()); return symbol(sym.FUNCTION);
          }
        case 119: break;
        case 60: 
          { System.out.print(yytext()); return symbol(sym.ENDSWITCH);
          }
        case 120: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
