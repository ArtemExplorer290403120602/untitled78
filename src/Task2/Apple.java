package Task2;

public class Apple {
    private   String color;
    public String newcolor;

    public Apple(String color){
        this.color=color;
    }

    public boolean getColor(){
        if(color=="Green"){
            newcolor="Red";
            System.out.println(newcolor);
        }
        else{
            newcolor="Green";
            System.out.println(newcolor);
        }
        return true;
    }
}
