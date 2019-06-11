package firsttask.entity;

import java.util.Optional;
import java.util.stream.Stream;

public enum FoodType implements Guiding {
    MEAT ("Meat"),
    FISH ("Fish"),
    VEGETABLES ("Vegetables"),
    FRUITS ("Fruits"),
    EGGS ("Eggs");

    private final String name;

    private FoodType(String s) {
        name = s;
    }

    public boolean equalsName(String otherName) {

        return name.equals(otherName);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
