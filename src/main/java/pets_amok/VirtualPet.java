package pets_amok;

public abstract class VirtualPet {

    private String petName;

    protected Integer healthLevel;
    protected Integer happinessLevel;

    public VirtualPet(String petName, Integer healthLevel, Integer happinessLevel) {
        this.petName = petName;
        this.healthLevel = healthLevel;
        this.happinessLevel = happinessLevel;

    }

    public String getPetName() {
        return petName;
    }

    public Integer getHealthLevel() {
        return healthLevel;
    }

    public Integer getHappinessLevel() {
        return happinessLevel;
    }

    public void playWithPet() {
        happinessLevel = happinessLevel + 3;
        healthLevel++;
    }

    protected boolean areNeedsTooHigh() {
        return getHealthLevel() > 0 && getHappinessLevel() > 0;


    }


    public void tick() {
        healthLevel--;
        happinessLevel--;

    }
}
