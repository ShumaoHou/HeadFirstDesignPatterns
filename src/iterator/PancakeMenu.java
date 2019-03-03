package iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Shumao
 * @date 2019/3/3 10:40
 */
public class PancakeMenu implements Menu{
    ArrayList mMenuItems;

    public PancakeMenu() {
        mMenuItems = new ArrayList();

        addItem("K&B", "",true,2.99);
        addItem("regular", "",false,2.99);
        addItem("blueberry", "",false,3.29);
        addItem("Waffle", "",false,3.05);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian,price);
        mMenuItems.add(menuItem);
    }

    @Override
    public Iterator createIterator() {
        return mMenuItems.iterator();
    }
} 
