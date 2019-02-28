package factory;

/**
 * @author Shumao
 * @date 2019/2/28 14:19
 */
public class NYPizzaStore extends BasePizzaStore {
    @Override
    protected BasePizza createPizza(String type) {
        BasePizza pizza= null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if("cheese".equals(type)) {
            pizza =  new CheesePizza(ingredientFactory);
            pizza.setName("NYCheesePizza");
        } else if("veggie".equals(type)) {
            pizza =  new VeggiePizza(ingredientFactory);
            pizza.setName("NYVeggiePizza");
        } else if("clam".equals(type)) {
            pizza =  new ClamPizza(ingredientFactory);
            pizza.setName("NYClamPizza");
        } else if("pepperoni".equals(type)) {
            pizza =  new PepperoniPizza(ingredientFactory);
            pizza.setName("NYPepperoniPizza");
        }
        return pizza;
    }
}
