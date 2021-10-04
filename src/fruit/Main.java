package fruit;

public class Main {
    public static void main(String[] args) {
        Fruit [] fruit = new Fruit[2];
        fruit[0] = new Apple();
        fruit[1] = new Orange();
        for (Fruit a:fruit
             ) {
            System.out.println(a.howToEat());
        }
    }
}
