package Logic;

public class Basket {

    private Ball[] basket;
    private static final int DEFAULT_CAPACITY = 10;
    private int currentPosition = 0;

    public Basket() {
        basket = new Ball[DEFAULT_CAPACITY];
    }

    public Basket(int size) {
        if (size > 0) basket = new Ball[size];
        else throw new IllegalArgumentException("Wrong basket size.");
    }

    public boolean putBall(Ball someBall){

        if (currentPosition >= basket.length || someBall == null) return false;

        basket[currentPosition] = someBall;
        currentPosition++;
        return true;
    }

    public int getBasketWeight(){
        int weight = 0;
        for (int i = 0; i < currentPosition; i++) {
            weight += basket[i].getWeight();
        }
        return weight;
    }

    public int getSpecificBallsQuantity(Ball.Color specificColor){
        int quantity = 0;
        for (int i = 0; i < currentPosition; i++) {
           if (basket[i].getColor() == specificColor) quantity++;
        }
        return quantity;
    }
}
