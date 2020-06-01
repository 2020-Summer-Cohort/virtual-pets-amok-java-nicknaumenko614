package pets_amok;

public class OrganicDog extends OrganicPet implements Dog {

    private Integer cageSoilLevel;

    public OrganicDog(String petName, Integer healthLevel, Integer happinessLevel, Integer hungerLevel, Integer thirstLevel, Integer wasteLevel, Integer cageSoilLevel) {
        super(petName, healthLevel, happinessLevel, hungerLevel, thirstLevel, wasteLevel);
        this.cageSoilLevel = cageSoilLevel;
    }

    @Override
    public void walk() {
        cageSoilLevel = cageSoilLevel - 3;
        healthLevel = healthLevel + 2;
        happinessLevel = happinessLevel + 5;
        wasteLevel = wasteLevel - 5;
    }

    @Override
    protected boolean areNeedsTooHigh() {
        return getCageSoilLevel() > 50 && super.areNeedsTooHigh();
    }

    protected void cleanOrganicDogCage() {
        cageSoilLevel = cageSoilLevel - 5;
    }

    public void tick() {
        cageSoilLevel++;
        super.tick();
    }

    public Integer getCageSoilLevel() {
        return cageSoilLevel;
    }
}
