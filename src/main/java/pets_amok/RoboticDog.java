package pets_amok;

public class RoboticDog extends RoboticPet implements Dog {


    public RoboticDog(String petName, Integer healthLevel, Integer happinessLevel, Integer maintenanceNeedLevel) {
        super(petName, healthLevel, happinessLevel, maintenanceNeedLevel);
    }

    @Override
    public void walk() {
        happinessLevel = happinessLevel + 5;
        healthLevel = healthLevel - 1;

    }
}
