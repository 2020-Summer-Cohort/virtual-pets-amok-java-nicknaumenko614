package pets_amok;

public abstract class RoboticPet extends VirtualPet {

    private Integer maintenanceNeedLevel;

    public RoboticPet(String petName, Integer healthLevel, Integer happinessLevel, Integer maintenanceNeedLevel) {
        super(petName, healthLevel, happinessLevel);
        this.maintenanceNeedLevel = maintenanceNeedLevel;
    }

    public Integer getMaintenanceNeedLevel() {
        return maintenanceNeedLevel;
    }

    protected void oilPet() {
        maintenanceNeedLevel = maintenanceNeedLevel - 5;
        healthLevel = healthLevel + 5;
        happinessLevel = happinessLevel + 5;
    }

    protected boolean areNeedsTooHigh() {
        return getMaintenanceNeedLevel() < 50 && super.areNeedsTooHigh();


    }

    public void tick() {
        maintenanceNeedLevel++;
        super.tick();

    }

}
