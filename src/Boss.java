public class Boss extends GameEntity {
    Weapon black = new Weapon();
public WeaponType getWeaponType(){
    return black.getAtack();
}
public String getWeaponName() {
    return black.getName();
}
    public void setBlack(WeaponType BlackType, String blackName) {
       this.black.setAtack(BlackType);
       this.black.setName(blackName);

    }
        public String getName(){
            return black.getName();
        }
        public void setName(String name){
        black.setName(name);
        }
    }

