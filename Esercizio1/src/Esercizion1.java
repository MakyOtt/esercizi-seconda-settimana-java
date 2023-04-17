import java.util.ArrayList;
import java.util.Arrays;

public class Esercizion1 {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    //1: Add 8 random integers to the array list <p>
    //Print out the first item <p>
    //Remove the first 3 items <p>
    //The print out the first remaining item
    public static void exercise1() {
        System.out.println("Exercise 1:");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(74);
        numbers.add(57);
        numbers.add(85);
        numbers.add(32);
        numbers.add(95);
        numbers.add(54);
        numbers.add(75);
        numbers.add(97);

        numbers.remove(0);
        numbers.remove(0);
        numbers.remove(0);
        System.out.println(numbers.get(0));
    }

    //2: Create 2 Array Lists,<p>
    //A list of strings called 'menuItems'<p>
    //And a list of Doubles called 'menuPrices'<p>
    //The indexes of these two lists correspond to eachother <p>
    //Create a print statement to output the name and price of each menu item correspond
    public static void exercise2() {
        System.out.println("Exercise 2:");
        ArrayList<String> menuItems = new ArrayList<>();
        ArrayList<Double> menuPrices = new ArrayList<>();

        menuItems.add("antipasto");
        menuItems.add("pizza");
        menuItems.add("bibita");

        menuPrices.add(2.50);
        menuPrices.add(5.00);
        menuPrices.add(1.50);

        System.out.println(menuItems.get(0)+" "+menuPrices.get(0));
        System.out.println(menuItems.get(1)+" "+menuPrices.get(1));
        System.out.println(menuItems.get(2)+" "+menuPrices.get(2));
    }

    //3: I changed this to an int array after recording! <p>
    // You'll still need to find the total but using [index] instead of .get(index) <p>
    //Find the total sum of all items in the ArrayList below. <p>
    //Use the + operator print the total
    public static void exercise3() {
        System.out.println("Exercise 3:");
        int[] items = new int[]{5, 10404, -234348, -53, 9, 91, 92, 34534, 12334, 1435};

            System.out.println(Arrays.stream(items).sum());
    }
}
