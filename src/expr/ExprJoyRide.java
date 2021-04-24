package expr;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by lihu on 2021/4/24.
 *
 * @author lihu
 * @date 2021/4/24
 */
public class ExprJoyRide {
    public static void main(String[] args) throws IOException {
        String inputFile = null;
        if (args.length > 0) {
            inputFile = args[0];
        }
        InputStream in;
        if (inputFile != null) {
            in = new FileInputStream(inputFile);
        }else{
            in = System.in;
        }
        ANTLRInputStream input = new ANTLRInputStream(in);
        ExprLexer lexer = new ExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser exprParser = new ExprParser(tokens);
        ParseTree tree = exprParser.prog();
        System.out.println(tree.toStringTree(exprParser));
    }
}
