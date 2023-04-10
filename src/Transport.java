  public abstract class Transport implements Diagnostable{
    private final String modelName;
    private final int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }



    public int getWheelsCount() {
        return wheelsCount;
    }

    private void updateTyre() {
        for (int i = 0; i < wheelsCount; i++) {
            System.out.println("Меняем покрышку");
        }
    }
    @Override
    public void service(){
        System.out.println("Обслуживаем " + modelName);
        updateTyre();
    }

}
