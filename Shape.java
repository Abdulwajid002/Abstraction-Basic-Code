public abstract class Shape {

    private String Name;

    public Shape(String Name){
        this.setName(Name);
    }

    public abstract double area();

    public void setName(String name){
        Name = name;
    }

    public String getName(){
        return Name;
    }


}
