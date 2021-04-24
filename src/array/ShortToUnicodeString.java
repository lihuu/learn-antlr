package array;
public class ShortToUnicodeString extends array.ArrayInitBaseListener {

    @Override 
    public void enterInit(array.ArrayInitParser.InitContext ctx) {
        System.out.print('"');
    }

    @Override
    public void exitInit(array.ArrayInitParser.InitContext ctx){
        System.out.print('"');
    }

    @Override
    public void enterValue(array.ArrayInitParser.ValueContext ctx){
        int value = Integer.parseInt(ctx.INT().getText());
        System.out.printf("\\u%04x",value);
    }

}
