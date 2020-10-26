public class Client{

    public static void main(String[]args){

        Duck mDuck = new MallardDuck(new FlyHigh(), new QuackShrill());

        mDuck.quack();
        mDuck.fly();

        Duck plastickDuck =new PlasticDuck(new FlyWithNoWings(), new SoftQuack());
        plastickDuck.fly();
        plastickDuck.quack();

    }

}