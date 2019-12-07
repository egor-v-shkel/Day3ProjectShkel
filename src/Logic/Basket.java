package Logic;

import Exceptions.NoSuchBallException;
import Exceptions.SetBasketSizeException;

public class Basket {

    private Ball[] basket;
    private static final int DEFAULT_CAPACITY = 10;
    private int currentPosition = 0;

    public Basket() {
        basket = new Ball[DEFAULT_CAPACITY];
    }

    public Basket(int size) {
        if (size > 0) basket = new Ball[size];
        else throw new SetBasketSizeException("Wrong basket size: " + size);
    }

    public boolean putBall(Ball someBall) {

        if (currentPosition >= basket.length || someBall == null ||
                hasUndefinedFields(someBall)) return false;

        basket[currentPosition] = someBall;
        currentPosition++;
        return true;
    }

    private boolean hasUndefinedFields(Ball ball) {
        return (ball.getColor() == null || ball.getWeight() <= 0);
    }

    public Ball getBall(Ball.Color color) throws NoSuchBallException {
        Ball foundBall = null;
        int index = 0;

        for (int i = 0; i < currentPosition; i++) {
            Ball currentBall = basket[i];
            if (currentBall.getColor().equals(color)) {
                foundBall = currentBall;
                index = i;
                break;
            }
        }

        if (foundBall == null)
            throw new NoSuchBallException(String.format("Can't find ball with color: %s.", color));

        trimSize(index);

        return foundBall;
    }

    private void trimSize(int index){
        int numMoved = basket.length - index - 1;
        System.arraycopy(basket, index+1, basket, index, numMoved);
        basket[--currentPosition] = null;
    }

    public void flipOver(){
        basket = new Ball[basket.length];
        currentPosition = 0;
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
