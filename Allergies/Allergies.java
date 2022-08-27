import java.util.*;

class Allergies {
    private List<Allergen> allergens = new ArrayList<>();

    public Allergies (int score) {
        for(Allergen allergen: Allergen.values()){
            if((score & allergen.getScore()) != 0){
                allergens.add(allergen);
            }
        }
    }

    public boolean isAllergicTo(Allergen allergen) {
        return allergens.contains(allergen);
    }

    public List<Allergen> getList() {
        return allergens;
    }

}
