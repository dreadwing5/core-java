import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {

    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return this.weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return this.hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return this.strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    // Write to the memory
    @Override
    public List<String> write() {
        List<String> result = new ArrayList<>();
        result.add(0, this.name);
        result.add(1, this.weapon);
        result.add(2, "" + this.hitPoints);
        result.add(3, " " + this.strength);

        return result;
    }

    // Read from the memory
    @Override
    public void read(List<String> savedValues) {
        if (savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.weapon = savedValues.get(1);
            this.hitPoints = Integer.parseInt(savedValues.get(2));
            this.strength = Integer.parseInt(savedValues.get(3));
        }
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", weapon=" + weapon + ", hitPoints=" + hitPoints + ", strength=" + strength
                + '}';

    }
}
