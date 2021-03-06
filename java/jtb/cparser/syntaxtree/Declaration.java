//
// Generated by JTB 1.1.2
//

package jtb.cparser.syntaxtree;

/**
 * Grammar production:
 * f0 -> DeclarationSpecifiers()
 * f1 -> [ InitDeclaratorList() ]
 * f2 -> ";"
 */
public class Declaration implements Node {
  static final long serialVersionUID = 20050923L;

   public DeclarationSpecifiers f0;
   public NodeOptional f1;
   public NodeToken f2;

   public Declaration(DeclarationSpecifiers n0, NodeOptional n1, NodeToken n2) {
      f0 = n0;
      f1 = n1;
      f2 = n2;
   }

   public Declaration(DeclarationSpecifiers n0, NodeOptional n1) {
      f0 = n0;
      f1 = n1;
      f2 = new NodeToken(";");
   }

   public void accept(jtb.cparser.visitor.Visitor v) {
      v.visit(this);
   }
}
