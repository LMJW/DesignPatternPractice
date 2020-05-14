package MenuPrint;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuComponent> {
  MenuComponent[] items;
  int position = 0;

  public DinerMenuIterator(MenuComponent[] items) {
    this.items = items;
  }

  public MenuComponent next() {
    var ret = items[position];
    position += 1;
    return ret;
  }

  public boolean hasNext() {
    return (position < items.length) && (items[position] != null);
  }
}
