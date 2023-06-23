public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Boss Horse = new Boss();
        Horse.setDamage(200);
        Horse.setHealth(800);
        Horse.setBlack(WeaponType.BOMB,"Bazzuka");
        System.out.println("Boss information");
        System.out.println("boss health:" + Horse.getHealth() +
                "\nboss damage:" + Horse.getDamage()+ "\nweapontype:" +
                Horse.getWeaponType() + "\nweapon name:  " + Horse.getWeaponName() );


    }
}