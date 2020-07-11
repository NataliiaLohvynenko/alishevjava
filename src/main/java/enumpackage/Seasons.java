package enumpackage;



public enum Seasons {
    SUMMER(20),
    WINTER(0),
    AUTUMN(5),
    SPRING(10);

    private int temp;

    Seasons(int temp) {
 this.temp=temp;
    }

    public int getTemp(){
        return temp;
    }
}
