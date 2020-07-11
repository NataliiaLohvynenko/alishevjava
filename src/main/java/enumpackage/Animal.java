package enumpackage;

public enum Animal {

    DOG("собака"),
    CAT("кошка"),
    FROG("лягушка");

    Animal(){}

    private String translation;
    Animal(String translation){
       this.translation=translation;
    }

    public String getTranslation() {
        return translation;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "translation='" + translation + '\'' +
                '}';
    }
}
