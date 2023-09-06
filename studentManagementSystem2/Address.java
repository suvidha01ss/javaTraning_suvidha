class Address{
    private int houseNum;
    private String apartmentName;
    private String landmark;
    private String tahsil;
    private String district;
    private String state;
    private int pincode;

    public int getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }

    public String getApartmentName() {
        return apartmentName;
    }

    public void setApartmentName(String apartmentName) {
        this.apartmentName = apartmentName;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getTahsil() {
        return tahsil;
    }

    public void setTahsil(String tahsil) {
        this.tahsil = tahsil;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    void displayAddress(){
        System.out.println(getHouseNum()+"\t"+getApartmentName()+"\t"+getLandmark()+
                "\t"+getTahsil()+"\t"+getDistrict()+"\t"+getState()+"\t"+getPincode());
    }
}