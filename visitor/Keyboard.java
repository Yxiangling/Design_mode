package visitor;

/**
 * Created by 110 on 2016/7/6.
 */
public class Keyboard implements ComputerPart{

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
