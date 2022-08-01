package CarOng.CarCha.CarCon;

import CarOng.CarCha.CarCha;


    public class CarCon extends CarCha {
        String nameCar = "camry";
        //// tọa phương thức hiển thị  các đặc tính của classs con và thùa kế từ cha và ông
        public String display (){
            return "thông tin xe: " + " xe " + nameCar +"\n" + "giá xe: " + price + "VND" +
                    "\n" + "loại xe " + carType + "\n" + " hãng xe " + carCompany;
        }
}
