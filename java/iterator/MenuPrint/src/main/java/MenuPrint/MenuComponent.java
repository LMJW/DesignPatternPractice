package MenuPrint;

public abstract class MenuComponent implements Menu {
  public void add(MenuComponent menuComponent) throws UnsupportedOperationException {
    throw new UnsupportedOperationException();
  }

  public void remove(MenuComponent menuComponent) throws UnsupportedOperationException {
    throw new UnsupportedOperationException();
  }

  public MenuComponent getChild(int i) throws UnsupportedOperationException {
    throw new UnsupportedOperationException();
  }

  public abstract String getName();

  public abstract String getDescription();

  public double getPrice() throws UnsupportedOperationException {
    throw new UnsupportedOperationException();
  }

  public void print() {
    System.out.println(getName());
    System.out.println(getDescription());
    System.out.println("--------------\n");
    var iter = createIterator();
    while (iter.hasNext()) {
      iter.next().print();
    }
  }
}
