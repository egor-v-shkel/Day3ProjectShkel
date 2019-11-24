package Logic;

public class Ball {

    private int weight;
    private Color color;

    public enum Color {
        RED,
        ORANGE,
        YELLOW,
        GREEN,
        BLUE,
        VIOLET
    }

    public Ball(int weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "weight=" + weight +
                ", color=" + color +
                '}';
    }
}

