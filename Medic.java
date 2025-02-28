package HW7;

public class Medic extends Hero {
    int healPoints;

    void increaseExperience() {
        healPoints += healPoints * 0.1;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил супер способность HEALING");
    }
}

