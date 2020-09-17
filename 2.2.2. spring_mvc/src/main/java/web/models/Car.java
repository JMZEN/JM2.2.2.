package web.models;


public class Car {

    private Long carId;

    private String manufacturerName;

    private String modelName;

    public Car() {
    }

    public Car(Long carId, String manufacturerName, String modelName) {
        this.carId = carId;
        this.manufacturerName = manufacturerName;
        this.modelName = modelName;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", manufacturerName='" + manufacturerName + '\'' +
                ", modelName='" + modelName + '\'' +
                '}';
    }
}
