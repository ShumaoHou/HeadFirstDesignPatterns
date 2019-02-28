package factory;

/**
 * @author Shumao
 * @date 2019/2/28 13:43
 */
public abstract class BasePizza {
    String name;
    Dough mDough;
    Sauce mSauce;

    abstract void prepare();

    public void bake() {
        System.out.println("Bake " + name);
    }

    public void cut() {
        System.out.println("Cut " + name);
    }

    public void box() {
        System.out.println("Box " + name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
