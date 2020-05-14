package MenuPrint;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenuIterator implements Iterator<MenuComponent> {
  ArrayList<MenuComponent> menuItems;
  int position = 0;

  public PancakeHouseMenuIterator(ArrayList<MenuComponent> menuItems) {
    this.menuItems = menuItems;
  }

  public boolean hasNext() {
    return (position < menuItems.size());
  }

  public MenuComponent next() {
    var ret = menuItems.get(position);
    position += 1;
    return ret;
  }
}
