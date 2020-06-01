package pets_amok;

public class OrganicCat extends OrganicPet implements Cat {


    public OrganicCat(String petName, Integer healthLevel, Integer happinessLevel, Integer hungerLevel, Integer thirstLevel, Integer wasteLevel) {
        super(petName, healthLevel, happinessLevel, hungerLevel, thirstLevel, wasteLevel);
    }
}
