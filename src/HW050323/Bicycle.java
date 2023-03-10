package HW050323;

public class Bicycle extends Transport {
   public Bicycle (String modelName, int wheelsCount){
       super(modelName,wheelsCount);



    }
@Override
    public void service() {
       if (this != null){
        this.updateTyreOnTransport();
}
}
}