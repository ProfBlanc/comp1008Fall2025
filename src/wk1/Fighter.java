package wk1;

//javadoc => java documentation
/**
 * This is our Fighter class. I know that fighting is not cool. But this example is cool
 * @author Ben
 * @since 2025-09-04
 *
 */

public class Fighter {

    /** This is the name of the Fighter */
    private String name = "Batman";
    private int health, strength;

    public String getName() {
        return name;
    }

    /**
     * Enforces the restriction of name needing to be 3 characters or more.
     * @param name the name of the Fighter
     */
    public void setName(String name) {
        if(name.length() >= 3)
            this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void attack(Fighter victim){}
}
