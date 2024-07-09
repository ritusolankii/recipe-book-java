import java.util.ArrayList;

class Recipe {
    private String name;
    private ArrayList<String> ingredients;
    private ArrayList<String> instructions;

    public Recipe(String name) {
        this.name = name;
        this.ingredients = new ArrayList<>();
        this.instructions = new ArrayList<>();
    }
}