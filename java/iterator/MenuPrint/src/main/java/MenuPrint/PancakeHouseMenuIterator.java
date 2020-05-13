package MenuPrint;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenuIterator implements Iterator<MenuItem> {
  ArrayList<MenuItem> menuItems;
  int position = 0;

  public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems) {
    this.menuItems = menuItems;
  }

  public boolean hasNext() {
    return (position < menuItems.size());
  }

  public MenuItem next() {
    var ret = menuItems.get(position);
    position += 1;
    return ret;
  }
}
