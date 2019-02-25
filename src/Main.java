import StrategyPattern.Duck;
import StrategyPattern.FlyRocketPowered;
import StrategyPattern.MallardDuck;
import StrategyPattern.ModelDuck;

public class Main {
    public static void main(String[] args) {
        /*
        StrategyPattern-Duck
         */
        System.out.println("*** StrategyPattern-MallardDuck ***");
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        mallard.display();
        mallard.swim();
        System.out.println("*** StrategyPattern-ModelDuck ***");
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
