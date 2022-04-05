public class Car{
    // MEMBER VARIABLES or ATTRIBUTES
    private String suspension;
    private int cylinder;
    private boolean automatic;
    private String color;
    // METHODS

    // CONSTRUCTOR METHODS
    // EMPTY CONSTRUCTOR
    public Car(){
        System.out.println("DOWN PAYMENT PAID ON CAR, WAITING FOR OPTIONS");
        this.suspension = "DEFAULT SUSPESION";
        this.cylinder = 4;
        this.automatic = true;
        this.color = "BLACK";
    }
    // FULL CONSTRUCTOR
    public Car(String suspension, int cylinder, boolean automatic, String color){
        System.out.println("YOUR CAR IS BEING MADE");
        this.suspension = suspension;
        this.cylinder = cylinder;
        this.automatic = automatic;
        this.color = color;
    }

    // OTHER METHODS
    public void drive(){
        if(this.cylinder == 4){
            System.out.println("Car can go upto 80");
        }
        
    }

    // GETTERS AND SETTERS
    // SUSPENSION
    public String getSuspension(){
        return this.suspension;
    }
    public void setSuspension(String newSuspension){
        this.suspension = newSuspension;
    }
    // CYLINDER
    public int getCylinder(){
        return this.cylinder;
    }
    public void setCyclinder(int newCylinder){
        if(newCylinder >= 0){
            this.cylinder = newCylinder;
        }
        else{
            System.out.println("GO GET SOMEONE WHO KNOWS WHAT THEY'RE DOING");
        }
    }
    // AUTOMATIC
    public boolean getAutomatic(){
        return this.automatic;
    }
    public void setAutomatic(boolean newAuto){
        this.automatic = newAuto;
    }
    // COLOR
    public String getColor(){
        return this.color;
    }
    public void setColor(String newColor){
        this.color = newColor;
    }


}