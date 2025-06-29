package Lektion22.TreeVisitor;

public class CountVisitor<T> implements Visitor<T> {
    private int count = 0;

    @Override
    public void visit(Baum.Knoten<T> current) {
        count++;
    }

    public int getCount() {
        return count;
    }
}