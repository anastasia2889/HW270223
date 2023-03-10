package HW050323;

public class Car extends Transport implements EngineCheckable{
    public Car (String modelName, int wheelsCount){

        super(modelName, wheelsCount);
    }



    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    @Override
    public void service(){
        if(this != null){
            this.updateTyreOnTransport();
            this.checkEngine();
        }
    }
}

