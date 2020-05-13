package MenuPrint;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {
  MenuItem[] items;
  int position = 0;

  public DinerMenuIterator(MenuItem[] items) {
    this.items = items;
  }

  public MenuItem next() {
    var ret = items[position];
    position += 1;
    return ret;
  }

  public boolean hasNext() {
    return (position < items.length) && (items[position] != null);
  }
}
