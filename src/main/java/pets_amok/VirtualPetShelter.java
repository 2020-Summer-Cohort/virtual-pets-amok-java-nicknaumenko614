package pets_amok;

import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    private static VirtualPet organicCat1 = new OrganicCat("Salem", 20, 20, 20, 20, 20);
    private static VirtualPet organicCat2 = new OrganicCat("Koozya", 20, 20, 20, 20, 20);
    private static VirtualPet roboticCat1 = new RoboticCat("Cyber", 20, 20, 20);
    private static VirtualPet roboticCat2 = new RoboticCat("Maxx", 20, 20, 20);
    private static VirtualPet roboticDog1 = new RoboticDog("Henry", 20, 20, 20);
    private static VirtualPet roboticDog2 = new RoboticDog("Charger", 20, 20, 20);
    private static VirtualPet organicDog1 = new OrganicDog("Angel", 20, 20, 20, 20, 20, 20);
    private static VirtualPet organicDog2 = new OrganicDog("Beast", 20, 20, 20, 20, 20, 20);

    private static Map<String, VirtualPet> allPetsInShelter = new HashMap<>();

    protected void addInitialPetsToShelter() {
        allPetsInShelter.put(organicCat1.getPetName().toLowerCase(), organicCat1);
        allPetsInShelter.put(organicCat2.getPetName().toLowerCase(), organicCat2);
        allPetsInShelter.put(roboticCat1.getPetName().toLowerCase(), roboticCat1);
        allPetsInShelter.put(roboticCat2.getPetName().toLowerCase(), roboticCat2);
        allPetsInShelter.put(organicDog1.getPetName().toLowerCase(), organicDog1);
        allPetsInShelter.put(organicDog2.getPetName().toLowerCase(), organicDog2);
        allPetsInShelter.put(roboticDog1.getPetName().toLowerCase(), roboticDog1);
        allPetsInShelter.put(roboticDog2.getPetName().toLowerCase(), roboticDog2);

    }

    protected Map <String, VirtualPet> getAllPetsInShelter(){
        return allPetsInShelter;
    }


    protected void listAllPetsInShelter() {

        for (Map.Entry<String, VirtualPet> mapEntry : getAllPetsInShelter().entrySet()) {
            VirtualPet pet = mapEntry.getValue();

            if (pet instanceof OrganicCat) {
                System.out.println("Organic Cat " + pet.getPetName()
                        + " : Health Level " + pet.getHealthLevel()
                        + " \tHappiness Level " + pet.getHappinessLevel()
                        + " \tHunger Level " + ((OrganicCat) pet).getHungerLevel()
                        + " \tThirst Level " + ((OrganicCat) pet).getThirstLevel()
                        + " \tWaste Level " + ((OrganicCat) pet).getWasteLevel());

            } else if (pet instanceof OrganicDog) {
                System.out.println("Organic Dog " + pet.getPetName()
                        + " : Health Level " + pet.getHealthLevel()
                        + " \tHappiness Level " + pet.getHappinessLevel()
                        + " \tHunger Level " + ((OrganicDog) pet).getHungerLevel()
                        + " \tThirst Level " + ((OrganicDog) pet).getThirstLevel()
                        + " \tWaste Level " + ((OrganicDog) pet).getWasteLevel()
                        + " \tCage Soil level " + ((OrganicDog) pet).getCageSoilLevel());

            } else if (pet instanceof RoboticCat) {
                System.out.println("Robotic Cat " + pet.getPetName()
                        + " : Health Level " + pet.getHealthLevel()
                        + " \tHappiness Level " + pet.getHappinessLevel()
                        + " \tMaintenance Level " + ((RoboticCat) pet).getMaintenanceNeedLevel());

            } else if (pet instanceof RoboticDog) {
                System.out.println("Robotic Dog " + pet.getPetName()
                        + " : Health Level " + pet.getHealthLevel()
                        + " \tHappiness Level " + pet.getHappinessLevel()
                        + " \tMaintenance Level " + ((RoboticDog) pet).getMaintenanceNeedLevel());
            }

        }

    }

    protected void listAllPetNamesInShelter() {
        for (Map.Entry<String, VirtualPet> mapEntry : getAllPetsInShelter().entrySet()) {
            VirtualPet pet = mapEntry.getValue();
            System.out.println(pet.getPetName());
        }

    }

    protected VirtualPet retrievePetByName(String requestedPetName) {
        VirtualPet pet = null;
        for (Map.Entry<String, VirtualPet> mapEntry : getAllPetsInShelter().entrySet()) {
            String petName = mapEntry.getKey();
            if (requestedPetName.equalsIgnoreCase(petName)) {
                pet = mapEntry.getValue();
            }

        }
        return pet;
    }

    protected void addHomelessPetToShelter(VirtualPet homelessPet) {
        allPetsInShelter.put(homelessPet.getPetName().toLowerCase(), homelessPet);

    }

    protected void giveUpPetForAdoption(String petNameToBeAdopted) {

        allPetsInShelter.remove(petNameToBeAdopted.toLowerCase());
        if (allPetsInShelter.isEmpty()) {
            System.out.println("Mission accomplished! All pets have been adopted");
            System.exit(0);
        }
    }

    protected Map<String, OrganicPet> getAllOrganicPets() {
        Map<String, OrganicPet> allOrganicPets = new HashMap<>();
        for (Map.Entry<String, VirtualPet> mapEntry : getAllPetsInShelter().entrySet()) {
            VirtualPet pet = mapEntry.getValue();
            if (pet instanceof OrganicDog || pet instanceof OrganicCat) {
                allOrganicPets.put(pet.getPetName(), (OrganicPet) pet);
            }
        }
        return allOrganicPets;
    }

    protected Map<String, RoboticPet> getAllRoboticPets() {
        Map<String, RoboticPet> allRoboticPets = new HashMap<>();
        for (Map.Entry<String, VirtualPet> mapEntry : getAllPetsInShelter().entrySet()) {
            VirtualPet pet = mapEntry.getValue();
            if (pet instanceof RoboticDog || pet instanceof RoboticCat) {
                allRoboticPets.put(pet.getPetName(), (RoboticPet) pet);
            }
        }
        return allRoboticPets;
    }

    protected Map<String, OrganicDog> getAllOrganicDogs() {
        Map<String, OrganicDog> allOrganicDogs = new HashMap<>();
        for (Map.Entry<String, VirtualPet> mapEntry : getAllPetsInShelter().entrySet()) {
            VirtualPet pet = mapEntry.getValue();
            if (pet instanceof OrganicDog) {
                allOrganicDogs.put(pet.getPetName(), (OrganicDog) pet);
            }
        }
        return allOrganicDogs;
    }

    protected Map<String, Dog> getAllDogs() {
        Map<String, Dog> allDogs = new HashMap<>();
        for (Map.Entry<String, VirtualPet> mapEntry : getAllPetsInShelter().entrySet()) {
            VirtualPet pet = mapEntry.getValue();
            if (pet instanceof RoboticDog || pet instanceof OrganicDog) {
                allDogs.put(pet.getPetName(), (Dog) pet);
            }
        }
        return allDogs;
    }

    protected void walkAllDogs() {
        for (Map.Entry<String, Dog> mapEntry : getAllDogs().entrySet()) {
            Dog pet = mapEntry.getValue();
            pet.walk();
        }
    }

    protected void cleanCagesForAllOrganicDogs() {
        for (Map.Entry<String, OrganicDog> mapEntry : getAllOrganicDogs().entrySet()) {
            OrganicDog pet = mapEntry.getValue();
            pet.cleanOrganicDogCage();
        }
    }

    protected void oilAllRoboticPets() {
        for (Map.Entry<String, RoboticPet> mapEntry : getAllRoboticPets().entrySet()) {
            RoboticPet pet = mapEntry.getValue();
            pet.oilPet();
        }
    }

    protected void feedAllOrganicPets() {
        for (Map.Entry<String, OrganicPet> mapEntry : getAllOrganicPets().entrySet()) {
            OrganicPet pet = mapEntry.getValue();
            pet.feedPet();
        }
    }

    protected void waterAllOrganicPets() {
        for (Map.Entry<String, OrganicPet> mapEntry : getAllOrganicPets().entrySet()) {
            OrganicPet pet = mapEntry.getValue();
            pet.givePetWater();
        }
    }

    protected void bathroomBreakAllOrganicPets() {
        for (Map.Entry<String, OrganicPet> mapEntry : getAllOrganicPets().entrySet()) {
            OrganicPet pet = mapEntry.getValue();
            pet.givePetBathroomBreak();
        }
    }

    protected void playWithPet(String requestedPetName) {
        VirtualPet pet = retrievePetByName(requestedPetName);
        pet.playWithPet();
    }

    protected void tickAllPets() {
        for (Map.Entry<String, VirtualPet> mapEntry : getAllPetsInShelter().entrySet()) {
            VirtualPet pet = mapEntry.getValue();
            pet.tick();
        }
    }

    protected boolean areNeedsTooHighForAnyPet() {
        boolean areNeedsTooHighForAnyPet = true;
        for (Map.Entry<String, VirtualPet> mapEntry : getAllPetsInShelter().entrySet()) {
            VirtualPet pet = mapEntry.getValue();
            if (pet.areNeedsTooHigh()) {
                areNeedsTooHighForAnyPet = false;
                break;

            }
        }
        return areNeedsTooHighForAnyPet;
    }


}
