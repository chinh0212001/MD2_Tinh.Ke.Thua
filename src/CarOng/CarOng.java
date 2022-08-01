package CarOng;

    public class CarOng {
        // các đặc tính của class ông
        protected String carCompany = "toyota";
        protected String carType = "4 chỗ";
        ///// contructer
        public CarOng() {
        }
        ////contructer đầy  đủ
        public CarOng(String carCompany, String carType) {
            this.carCompany = carCompany;
            this.carType = carType;
        }

        public String getCarCompany() {
            return carCompany;
        }

        public void setCarCompany(String carCompany) {
            this.carCompany = carCompany;
        }

        public String getCarType() {
            return carType;
        }

        public void setCarType(String carType) {
            this.carType = carType;
        }

    }

