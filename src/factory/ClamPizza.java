package factory;

/**
 * @author Shumao
 * @date 2019/2/28 13:49
 */
public class ClamPizza extends BasePizza {
    PizzaIngredientFactory mIngredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.mIngredientFactory = ingredientFactory;
    }
    @Override
    void prepare() {
        System.out.println("Prepare " + name);
        mDough = mIngredientFactory.createDough();
        mSauce = mIngredientFactory.createSauce();
    }
}
