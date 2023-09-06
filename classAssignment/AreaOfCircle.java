class AreaOfCircle{
    private float radius;

    public void setRadius(float radius){
        this.radius=radius;
    }
    public float getRadius(){
        return radius;
    }

    void area(float radius){
        double area=3.14*radius*radius;
        System.out.println("Area Of Circle"+area);

    }

}