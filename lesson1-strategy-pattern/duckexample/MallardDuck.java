public class MallardDuck extends Duck{

    public MallardDuck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour){
        this.flyBehaviour=flyBehaviour;
        this.quackBehaviour=quackBehaviour;
    }

    public void display(){
        System.out.println("I am a mallard duck");
    }


}