//
// Generated by JTB 1.1.2
//

package jtb.cparser.syntaxtree;

/**
 * Grammar production:
 * f0 -> ShiftExpression()
 * f1 -> [ ( "<" | ">" | "<=" | ">=" ) RelationalExpression() ]
 */
public class RelationalExpression implements Node {
  static final long serialVersionUID = 20050923L;

   public ShiftExpression f0;
   public NodeOptional f1;

   public RelationalExpression(ShiftExpression n0, NodeOptional n1) {
      f0 = n0;
      f1 = n1;
   }

   public void accept(jtb.cparser.visitor.Visitor v) {
      v.visit(this);
   }
}
