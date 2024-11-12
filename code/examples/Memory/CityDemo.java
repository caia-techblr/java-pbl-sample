class City {
    private String mName;
    private String mId;
    private static int count = 0; // Static variable

    City(String name,String id) {
        mName = name;
        mId = id;
        count++;
    }

    public void print() {
        System.out.println("This bird flies");
    }

    public static int getCount() { // Static method to access static variable
        return count;
    }

    public String name() {
        return mName;
    }
    public String id() {
        get mId;
    }
}

public class CityDemo {
    public static void main(String args[]) {
        City c1 = new City("Bengaluru",101);
        City c2 = new City("Delhi",105);
        City c3 = new City("Mumabi",103);

        City c4 = c1;
        c1 = null;
        c2 = null;
        
    }
}