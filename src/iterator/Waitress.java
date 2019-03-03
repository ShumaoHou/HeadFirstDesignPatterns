package iterator;

import java.util.Iterator;

/**
 * @author Shumao
 * @date 2019/3/3 10:39
 */
public class Waitress {
    Menu mDinerMenu;
    Menu mPancakeMenu;

    public Waitress(Menu dinerMenu, Menu pancakeMenu) {
        mDinerMenu = dinerMenu;
        mPancakeMenu = pancakeMenu;
    }

    public void printMenu() {
        Iterator pancakeIterator = mPancakeMenu.createIterator();
        Iterator dinerIterator = mDinerMenu.createIterator();
        printMenu(dinerIterator);
        printMenu(pancakeIterator);
    }

    public void printMenu(Iterator iterator){
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.println(menuItem.getName() + " " + menuItem.getDescription() + " " + menuItem.getPrice());
        }
    }
}
