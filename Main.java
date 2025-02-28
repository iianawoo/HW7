package HW7;

public class Main {
    public static void main(String[] args) {
        Hero[] heroes = new Hero[3];
        heroes[0] = new Magic();
        heroes[1] = new Medic();
        heroes[2] = new Warrior();

        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility();
            if (heroes[i] instanceof Medic) {
                Medic medic = (Medic) heroes[i];
                medic.increaseExperience();
            }
        }
    }
}


