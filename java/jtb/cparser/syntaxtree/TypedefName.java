//
// Generated by JTB 1.1.2
//

package jtb.cparser.syntaxtree;

/**
 * Grammar production:
 * f0 -> <IDENTIFIER>
 */
public class TypedefName implements Node {
  static final long serialVersionUID = 20050923L;

   public NodeToken f0;

   public TypedefName(NodeToken n0) {
      f0 = n0;
   }

   public void accept(jtb.cparser.visitor.Visitor v) {
      v.visit(this);
   }
}
