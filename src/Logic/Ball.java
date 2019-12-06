package Logic;

public class Ball {

    private int weight;
    private Color color;

    @SuppressWarnings("unused")
    public enum Color {
        RED,
        ORANGE,
        YELLOW,
        GREEN,
        BLUE,
        VIOLET,
        WHITE,
        BLACK
    }

    public Ball() {
    }

    public Ball(int weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) throws IllegalArgumentException {
        if(color == null)
            throw new IllegalArgumentException("Require not null parameter for set method.");
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball otherBall = (Ball) o;
        return weight == otherBall.weight &&
                color == otherBall.color;
    }

    @Override
    public int hashCode() {
        Object[] fields = new Object[]{weight, color};

        int result = 1;
        for (Object field : fields)
            result = 31 * result + (field == null ? 0 : field.hashCode());

        return result;
    }

    @Override
    public String toString() {
        return getClass().getName() +
                "@weight=" + weight +
                ", color=" + color;
    }
}

