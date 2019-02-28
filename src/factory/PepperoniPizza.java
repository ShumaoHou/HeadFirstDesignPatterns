package factory;

/**
 * @author Shumao
 * @date 2019/2/28 13:49
 */
public class PepperoniPizza extends BasePizza {
    PizzaIngredientFactory mIngredientFactory;

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.mIngredientFactory = ingredientFactory;
    }
    @Override
    void prepare() {
        System.out.println("Prepare " + name);
        mDough = mIngredientFactory.createDough();
        mSauce = mIngredientFactory.createSauce();
    }
}
