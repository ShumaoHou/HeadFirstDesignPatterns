import decorator.*;
import observer.CurrentConditionsDisplay;
import observer.CurrentConditionsDisplayJava;
import observer.WeatherData;
import observer.WeatherDataJava;
import strategy.BaseDuck;
import strategy.FlyRocketPowered;
import strategy.MallardDuck;
import strategy.ModelDuck;

/**
 * Main测试程序
 * @author Shumao
 * @date 2019/2/26 10:00
 */
public class Main {
    public static void main(String[] args) {

        /*
        strategy-MallardDuck
         */
        System.out.println("\n*** strategy-MallardDuck ***");
        BaseDuck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        mallard.display();
        mallard.swim();

        /*
        strategy-ModelDuck
         */
        System.out.println("\n*** strategy-ModelDuck ***");
        BaseDuck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

        /*
        observer-CurrentConditionsDisplay
         */
        System.out.println("\n*** observer-CurrentConditionsDisplay ***");
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 30.0f);

        /*
        observer-CurrentConditionsDisplayJava
         */
        System.out.println("\n*** observer-CurrentConditionsDisplayJava ***");
        WeatherDataJava weatherDataJava = new WeatherDataJava();
        CurrentConditionsDisplayJava currentConditionsDisplayJava = new CurrentConditionsDisplayJava(weatherDataJava);
        weatherDataJava.setMeasurements(80, 65, 30.4f);
        weatherDataJava.setMeasurements(82, 70, 29.2f);
        weatherDataJava.setMeasurements(78, 90, 30.0f);

        /*
        decorator-Beverage
         */
        System.out.println("\n*** observer-BeverageEspresso ***");
        BaseBeverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        beverage = new Soy(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        System.out.println("\n*** observer-BeverageHouseBlend ***");
        BaseBeverage beverage1 = new HouseBlend();
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
        beverage1 = new Soy(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
    }
}
