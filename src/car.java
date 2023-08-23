public class car extends Vehical{
    protected String carName;

    public String getDetails(String carName){

        return carName + " " + super.getModel() +" " + getSpeed();
    }
}
