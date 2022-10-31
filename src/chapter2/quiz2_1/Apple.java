package chapter2.quiz2_1;

// 사과 클래스
class Apple {

    private int weight;
    private String color;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String  color) {
        this.color = color;
    }

    Apple(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }
}
