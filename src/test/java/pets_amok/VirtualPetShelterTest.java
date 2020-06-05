package pets_amok;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest {

    @Test
    public void shouldBeAbleToAddHomelessPetToShelter() {
        VirtualPet testPet = new OrganicCat("Salem", 20, 20, 20, 20, 20);
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.addHomelessPetToShelter(testPet);
        Map<String, VirtualPet> actualResult = underTest.getAllPetsInShelter();
        assertEquals(1, actualResult.size());

    }

    @Test
    public void shouldBeAbleToRetrievePetByName() {
        String expectedPetName = "Salem";
        VirtualPet testPet = new OrganicCat(expectedPetName, 20, 20, 20, 20, 20);
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.addHomelessPetToShelter(testPet);
        VirtualPet actualResult = underTest.retrievePetByName(expectedPetName);
        assertEquals(expectedPetName, actualResult.getPetName());

    }
}
