//
// Generated by JTB 1.1.2
//

package jtb.cparser.syntaxtree;

/**
 * Grammar production:
 * f0 -> ParameterDeclaration()
 * f1 -> ( "," ParameterDeclaration() )*
 */
public class ParameterList implements Node {
  static final long serialVersionUID = 20050923L;

   public ParameterDeclaration f0;
   public NodeListOptional f1;

   public ParameterList(ParameterDeclaration n0, NodeListOptional n1) {
      f0 = n0;
      f1 = n1;
   }

   public void accept(jtb.cparser.visitor.Visitor v) {
      v.visit(this);
   }
}
