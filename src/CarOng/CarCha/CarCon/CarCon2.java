package CarOng.CarCha.CarCon;

import CarOng.CarCha.CarCha;

public class CarCon2 extends CarCha {
    private String nameCar2 = "vios";
    private double price = 3000000;
    private String engine = "Xe số sàn";

    public String display2() {
        return "thông tin xe 2: " + " tên: " + nameCar2 + " \n " + " giá xe: " + price + " VND " + "\n" + "loại xe " + carType + "\n" + " hãng xe " + carCompany + "\n" + "Xe: " + engine;
    }
}
