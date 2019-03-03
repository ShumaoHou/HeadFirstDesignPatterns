package iterator;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 * @author Shumao
 * @date 2019/3/3 10:27
 */
public class DinerMenuIterator implements Iterator {
    MenuItem[] mItems;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        mItems = items;
    }

    @Override
    public void remove() {
        if (position <= 0){
            throw new IllegalStateException();
        }
        if (mItems[position - 1] != null) {
            for (int i = position - 1; i < mItems.length - 1; i ++) {
                mItems[i] = mItems[i + 1];
            }
            mItems[mItems.length - 1] = null;
        }
    }

    @Override
    public void forEachRemaining(Consumer action) {

    }

    @Override
    public boolean hasNext() {
        return position < mItems.length && mItems[position] != null;
    }

    @Override
    public Object next() {
        MenuItem menuItem = mItems[position];
        position ++;
        return menuItem;
    }
}
