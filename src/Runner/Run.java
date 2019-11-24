package Runner;

import Logic.Ball;
import Logic.Basket;

import static Logic.Ball.Color.*;

public class Run {
    public static void main(String[] args) {
        Basket basket = new Basket(3);

        Ball[] ballQueue = new Ball[4];

        ballQueue[0] = new Ball(12, BLUE);
        ballQueue[1] = new Ball(16, GREEN);
        ballQueue[2] = new Ball(3, BLUE);
        ballQueue[3] = new Ball(99, BLUE);

        for (int i = 0; i < 2; i++) {
            basket.putBall(ballQueue[i]);
        }

        int basketWeight = basket.getBasketWeight();
        System.out.println("All balls weight = " + basketWeight);

        int blueNum = basket.getSpecificBallQuantity(BLUE);
        System.out.println("Blue balls number = " + blueNum);

    }
}
