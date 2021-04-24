package array;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main{
    public static void main(String[] args) throws Exception{
        //这个可以用来学习编译原理呀
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        array.ArrayInitLexer lexer = new array.ArrayInitLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        array.ArrayInitParser parser = new array.ArrayInitParser(tokens);
        ParseTree tree = parser.init();
        System.out.println(tree.toStringTree(parser));
        ParseTreeWalker walker = new ParseTreeWalker();
        //这里
        walker.walk(new array.ShortToUnicodeString(),tree);
        System.out.println();
    }
}
