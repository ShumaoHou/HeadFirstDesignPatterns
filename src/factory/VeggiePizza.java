package factory;

/**
 * @author Shumao
 * @date 2019/2/28 13:50
 */
public class VeggiePizza extends BasePizza {
    PizzaIngredientFactory mIngredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.mIngredientFactory = ingredientFactory;
    }
    @Override
    void prepare() {
        System.out.println("Prepare " + name);
        mDough = mIngredientFactory.createDough();
        mSauce = mIngredientFactory.createSauce();
    }
}
