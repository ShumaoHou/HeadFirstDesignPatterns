package factory;

/**
 * @author Shumao
 * @date 2019/2/28 13:48
 */
public class CheesePizza extends BasePizza {
    PizzaIngredientFactory mIngredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.mIngredientFactory = ingredientFactory;
    }
    @Override
    void prepare() {
        System.out.println("Prepare " + name);
        mDough = mIngredientFactory.createDough();
        mSauce = mIngredientFactory.createSauce();
    }
}
