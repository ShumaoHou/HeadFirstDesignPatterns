import adapter.Duck;
import adapter.TurkeyAdapter;
import adapter.WildTurkey;
import command.*;
import decorator.*;
import facade.DvdPlayer;
import facade.HomeTheaterFacade;
import facade.Screen;
import factory.BasePizza;
import factory.BasePizzaStore;
import factory.NYPizzaStore;
import observer.CurrentConditionsDisplay;
import observer.CurrentConditionsDisplayJava;
import observer.WeatherData;
import observer.WeatherDataJava;
import singleton.Singleton;
import strategy.BaseDuck;
import strategy.FlyRocketPowered;
import strategy.MallardDuck;
import strategy.ModelDuck;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

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

        System.out.println("\n*** observer-LowerCaseInputStream ***");
        int c;
        try {
            InputStream in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("src\\decorator\\test.txt")));
            while ((c = in.read()) >= 0) {
                System.out.print((char)c);
            }
            System.out.println();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
        singleton
         */
        System.out.println("\n*** singleton ***");
        Singleton singleton = Singleton.getInstance();
        singleton.print();

        /*
        factory-Pizza
         */
        System.out.println("\n*** factory-Pizza ***");
        BasePizzaStore nyStore = new NYPizzaStore();

        BasePizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Order a " + pizza.getName());

        /*
        command-simple
         */
        System.out.println("\n*** command-simple ***");
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        GarageDoor door = new GarageDoor();
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorOpenCommand doorOpen = new GarageDoorOpenCommand(door);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(doorOpen);
        remote.buttonWasPressed();
        /*
        command-remote
         */
        System.out.println("\n*** command-remote ***");
        RemoteControl remoteControl = new RemoteControl();

        LightOffCommnad lightOff = new LightOffCommnad(light);
        remoteControl.setCommand(0, lightOn, lightOff);
        System.out.println(remoteControl);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);

        remoteControl.undoButtonWasPressed();

        /*
        adapter-turkey
         */
        System.out.println("\n*** adapter-turkey ***");
        adapter.MallardDuck mallardDuck = new adapter.MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The turkey says:");
        turkey.gobble();
        turkey.fly();
        System.out.println("The duck says:");
        mallardDuck.quack();
        mallardDuck.fly();
        System.out.println("The turkeyAdapter says:");
        turkeyAdapter.quack();
        turkeyAdapter.fly();

        /*
        facade-movie
         */
        System.out.println("\n*** facade-movie ***");
        DvdPlayer dvdPlayer = new DvdPlayer();
        Screen screen = new Screen();
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(dvdPlayer, screen);
        homeTheaterFacade.watchMovie();
        homeTheaterFacade.endMovie();
        
    }
}
