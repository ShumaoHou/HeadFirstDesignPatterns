package factory;

/**
 * @author Shumao
 * @date 2019/2/28 15:53
 */
public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();

}
