import java.util.ArrayList;
import java.util.*;
interface Ingredient{
    String getName();
    double getQuantity();
}
class SolidIngredient implements Ingredient {
    private String _name;
    private double _quantity;
    public SolidIngredient(String n, double q){
        _name = n;
        _quantity = q;
    }
    public String getName(){
        return _name;
    }
    public double getQuantity(){
        return _quantity;
    }

}
class LiquidIngredient implements Ingredient {
    private String _name;
    private double _quantity;
    public LiquidIngredient(String n, double q){
        _name = n;
        _quantity = q;
    }
    public String getName(){
        return _name;
    }
    public double getQuantity(){
        return _quantity;
    }

}
class Recipe<T extends Ingredient>{
    private String _name;
    private String _instructions;
    private ArrayList<T> _ingredients;
    public Recipe(String n, String i, int size){
        _name = n;
        _instructions = i;
        _ingredients = new ArrayList<>(size);
    }
    public void addIngredient(T i){
        _ingredients.add(i);
    }
    public String printRecipe(){
        String ingredients = "";
        for(T t: _ingredients){
            ingredients += t;
        }
        return _name + _instructions + ingredients;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int option = keyboard.nextInt();
        System.out.println("Select an option below");
        System.out.println("Enter 1 to add an ingredient");
        System.out.println("Enter 2 to see the ingredients for a recipe");
        while(option != -1){
            if (option == 1){
                // allow user to add an ingredient

            }
            else{
                // allow user to see the ingredients

            }
        }
    }
}