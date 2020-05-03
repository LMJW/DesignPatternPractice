package rpgGame;

public abstract class Character {
  WeaponBehavior weapon;

  public void attack() {
    System.out.println(this.getClass().getSimpleName());
    weapon.attack();
  }

  public void setWeapon(WeaponBehavior wp) {
    weapon = wp;
  }
}
