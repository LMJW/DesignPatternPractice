package MenuPrint;

public class DinerMenuIterator implements Iterator {
  MenuItem[] items;
  int position = 0;

  public DinerMenuIterator(MenuItem[] items) {
    this.items = items;
  }

  public Object next() {
    var ret = items[position];
    position += 1;
    return ret;
  }

  public boolean hasNext() {
    return (position < items.length) && (items[position] != null);
  }
}
