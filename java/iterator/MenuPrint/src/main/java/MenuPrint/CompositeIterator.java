package MenuPrint;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<MenuComponent> {
  Stack<Iterator<MenuComponent>> stack = new Stack<>();

  public CompositeIterator(Iterator<MenuComponent> iter) {
    stack.push(iter);
  }

  public boolean hasNext() {
    if (stack.isEmpty()) {
      return false;
    }

    var iter = stack.peek();
    if (!iter.hasNext()) {
      stack.pop();
      return hasNext();
    }
    return true;
  }

  public MenuComponent next() {
    if (hasNext()) {
      var iter = stack.peek();
      var comp = iter.next();
      if (comp instanceof Menu) {
        var menu = (Menu) comp;
        stack.push(menu.createIterator());
      }
      return comp;
    }

    return null;
  }
}
