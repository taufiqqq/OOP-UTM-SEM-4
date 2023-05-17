public class Car {
    private Chasis chasis;
    private Engine engine;
    private Wheel[] wheel;
    
    public Car(){
        chasis = new Chasis();
        engine = new Engine();
        wheel = new Wheel[5];
    }
    public Car(Chasis c, Engine e , Wheel w[]){
        chasis = c;
        engine = e;
        wheel = w;

        //if destroy car, chasis engine and wheel still exist
    }
}
