package Assets;

public class Weapon {
    private String weaponName;
    private float weaponDamage;
    private String weaponModel;

    public Weapon() {
    }

    public Weapon(String weaponName, float weaponDamage, String weaponModel) {
        this.weaponName = weaponName;
        this.weaponDamage = weaponDamage;
        this.weaponModel = weaponModel;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public float getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(float weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    public String getWeaponModel() {
        return weaponModel;
    }

    public void setWeaponModel(String weaponModel) {
        this.weaponModel = weaponModel;
    }
}
