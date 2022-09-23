public class Fighther {

    String name;
    int damage;
    int specialAbilityDamage;
    int health;
    int blockChance;

    Fighther(String name, int damage, int specialAbilityDamage, int health, int blockChance) {

        this.name = name;
        this.damage = damage;
        this.blockChance = blockChance;
        this.health = health;
        this.specialAbilityDamage = specialAbilityDamage;

    }

    void hit(Fighther enemy) {
        System.out.println(this.name + " => " + enemy.name + "'e " + this.damage + "vurdu");
        this.health -= enemy.damage;
    }

    void fighterInfo() {
        System.out.println("Name: "+ this.name);
        System.out.println("damage: "+ this.damage);
        System.out.println("Health: "+ this.health);
        System.out.println("Special Ability Damage: "+ this.specialAbilityDamage);
        System.out.println("Block Chance: " + this.blockChance + "%");
    }
}
