package animal;

import duclap.Edible;

public class Chicken extends Animal {
    @Override
    public String makeSound() {
        return "Chicken:cluck-cluck";
    }


    @Override
    public String howToEat() {
        return "lêu lêu";
    }
}
