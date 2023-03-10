package HW050323;

public class Truck extends Transport implements EngineCheckable{
    public Truck(String modelName, int wheelsCount){
        super(modelName, wheelsCount);
    }




    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
    @Override
    public void service() {
        if (this != null) {
            this.updateTyreOnTransport();
            this.checkEngine();
            this.checkTrailer();
}
    }
}
