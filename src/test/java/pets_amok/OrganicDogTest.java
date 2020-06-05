package pets_amok;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrganicDogTest {

    private OrganicDog underTest;

    @BeforeEach
    void setUp() {
        underTest = new OrganicDog("Test", 20, 20, 20, 20, 20, 20);
    }

    @Test
    public void shouldHaveNameAndAttributesOnCreation() {

        String name = underTest.getPetName();
        assertEquals("Test", name);
        int health = underTest.getHealthLevel();
        assertEquals(20, health);
        int happiness = underTest.getHappinessLevel();
        assertEquals(20, happiness);
    }

    @Test
    public void cageSoilShouldBe17AfterWalking() {
        underTest.walk();
        int cageSoilLevel = underTest.getCageSoilLevel();
        assertEquals(17, cageSoilLevel);
    }

    @Test
    public void healthLevelShouldBe22AfterWalking() {
        underTest.walk();
        int healthLevel = underTest.getHealthLevel();
        assertEquals(22, healthLevel);
    }

    @Test
    public void happinessLevelShouldBe25AfterWalking() {
        underTest.walk();
        int happyLevel = underTest.getHappinessLevel();
        assertEquals(25, happyLevel);
    }

    @Test
    public void wasteLevelShouldBe15AfterWalking() {
        underTest.walk();
        int wasteLevel = underTest.getWasteLevel();
        assertEquals(15, wasteLevel);
    }

    @Test
    public void cageSoilLevelShouldBe15AfterCageCleaning() {
        underTest.cleanOrganicDogCage();
        int cageSoilLevel = underTest.getCageSoilLevel();
        assertEquals(15, cageSoilLevel);
    }

    @Test
    public void tickShouldIncreaseCageSoilBy1() {
        underTest.tick();
        int cageSoilLevel = underTest.getCageSoilLevel();
        assertEquals(21, cageSoilLevel);

    }
}
