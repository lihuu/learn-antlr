import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main{
    public static void main(String[] args) throws Exception{
        //这个可以用来学习编译原理呀
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        ArrayInitLexer lexer = new ArrayInitLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ArrayInitParser parser = new ArrayInitParser(tokens);
        ParseTree tree = parser.init();
        System.out.println(tree.toStringTree(parser));
        ParseTreeWalker walker = new ParseTreeWalker();
        //这里
        walker.walk(new ShortToUnicodeString(),tree);
        System.out.println();
    }
}
