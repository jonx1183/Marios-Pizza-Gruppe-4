package Pizza;

public class ID {

    private String pizzaID;
    private String orderID;
    private int estimation;

    ID(){

    }

    public ID(String pizzaID, String orderID, int estimation){
        this.orderID = orderID;
        this.estimation = estimation;
        this.pizzaID = pizzaID;
    }
    public String getOrderID(){
        return orderID;
    }

    public String getPizzaID(){
        return pizzaID;
    }

    public int getEstimation(){
        return estimation;
    }

    public void setPizzaID(String pizzaID){
        this.pizzaID = pizzaID;
    }

    public void setOrderID(String orderID){
        this.orderID = orderID;
    }
    public void setEstimation(int estimation){
        this.estimation = estimation;
    }
}
