package iterator;

import java.util.Iterator;

/**
 * @author Shumao
 * @date 2019/3/3 10:32
 */
public class DinerMenu implements Menu{
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] mMenuItems;

    public DinerMenu() {
        mMenuItems = new MenuItem[MAX_ITEMS];

        addItem("vegetarian BLT", "",true,2.99);
        addItem("BLT", "",false,2.99);
        addItem("soup", "",false,3.29);
        addItem("Hotdog", "",false,3.05);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian,price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("菜单已满");
        } else {
            mMenuItems[numberOfItems] = menuItem;
            numberOfItems ++;
        }
    }

    @Override
    public Iterator createIterator() {
        return new DinerMenuIterator(mMenuItems);
    }
}
