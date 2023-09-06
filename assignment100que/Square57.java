class Square57
{
    private float length;

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    float calculateArea(float length){
        this.length=length;
        float area=length*length;
        System.out.println(area);
        return area;
    }
}