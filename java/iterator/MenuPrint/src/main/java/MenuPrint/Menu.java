package MenuPrint;

import java.util.Iterator;

public interface Menu {
  public Iterator<MenuComponent> createIterator();
}
