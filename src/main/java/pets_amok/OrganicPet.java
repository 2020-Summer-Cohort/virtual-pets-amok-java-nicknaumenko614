package pets_amok;

public abstract class OrganicPet extends VirtualPet {

    private Integer hungerLevel;
    private Integer thirstLevel;
    protected Integer wasteLevel;

    public OrganicPet(String petName, Integer healthLevel, Integer happinessLevel, Integer hungerLevel, Integer thirstLevel, Integer wasteLevel) {
        super(petName, healthLevel, happinessLevel);
        this.hungerLevel = hungerLevel;
        this.thirstLevel = thirstLevel;
        this.wasteLevel = wasteLevel;
    }

    public Integer getHungerLevel() {
        return hungerLevel;
    }

    public Integer getThirstLevel() {
        return thirstLevel;
    }

    public Integer getWasteLevel() {
        return wasteLevel;
    }

    public void feedPet() {
        hungerLevel = hungerLevel - 3;
        happinessLevel++;
        wasteLevel++;
        healthLevel++;
    }

    public void givePetWater() {
        thirstLevel = thirstLevel - 3;
        wasteLevel++;
        happinessLevel++;
        healthLevel++;
    }

    @Override
    public void playWithPet() {
        super.playWithPet();
        hungerLevel++;
        thirstLevel++;
        healthLevel++;
    }

    @Override
    protected boolean areNeedsTooHigh() {
        return getHungerLevel() < 50 && getThirstLevel() < 50 && getWasteLevel() < 50 && super.areNeedsTooHigh();


    }

    public void givePetBathroomBreak() {
        wasteLevel = wasteLevel - 3;
        happinessLevel++;
        healthLevel++;
    }

    public void tick() {
        hungerLevel++;
        thirstLevel++;
        wasteLevel++;
        super.tick();
    }
}
