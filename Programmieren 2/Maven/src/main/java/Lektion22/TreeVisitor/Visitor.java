package Lektion22.TreeVisitor;

public interface Visitor<T> {
    void visit(Baum.Knoten<T> current);
}
