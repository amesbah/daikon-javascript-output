//
// Generated by JTB 1.1.2
//

package jtb.cparser.syntaxtree;

/**
 * Represents a grammar choice, e.g. ( A | B )
 */
public class NodeChoice implements Node {
  static final long serialVersionUID = 20050923L;

   public NodeChoice(Node node) {
      this(node, -1);
   }

   public NodeChoice(Node node, int whichChoice) {
      choice = node;
      which = whichChoice;
   }

   public void accept(jtb.cparser.visitor.Visitor v) {
      choice.accept(v);
   }

   public Node choice;
   public int which;
}
