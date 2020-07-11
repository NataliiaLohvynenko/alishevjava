package enumpackage;



public class Test {
    public static void main(String[] args) {
       Seasons seasons = Seasons.SUMMER;
       Animal animal =Animal.CAT;
        System.out.println(seasons.name());


        Animal cat = Animal.valueOf("CAT");
        System.out.println(cat.getTranslation());
        System.out.println(cat.ordinal());

    }
}
