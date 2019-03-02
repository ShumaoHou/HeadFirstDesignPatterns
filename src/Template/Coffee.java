package Template;

/**
 * @author Shumao
 * @date 2019/3/2 10:55
 */
public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Add sugar and milk");
    }
}
