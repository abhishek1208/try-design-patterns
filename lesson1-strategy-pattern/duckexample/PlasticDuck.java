public class PlasticDuck extends Duck{

    PlasticDuck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour){
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
    }

    public void display(){
        System.out.println("What exactly is the function of a rubber duck, Harry?");
    }

}