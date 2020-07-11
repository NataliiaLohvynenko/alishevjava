package animals;

public abstract class Anima {
    String name;

    public Anima(int id, String name) {

        this.name = name;
    }

    public Anima() {

    }


    public void go(){
        System.out.println("go");
    }

    public abstract void say();

    @Override
    public String toString() {
        return "Anima{" +
                "name='" + name + '\'' +
                '}';
    }
}
