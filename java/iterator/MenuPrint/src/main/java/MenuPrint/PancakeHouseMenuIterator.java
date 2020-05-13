package MenuPrint;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
  ArrayList<MenuItem> menuItems;
  int position = 0;

  public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems) {
    this.menuItems = menuItems;
  }

  public boolean hasNext() {
    return (position < menuItems.size());
  }

  public Object next() {
    var ret = menuItems.get(position);
    position += 1;
    return ret;
  }
}
