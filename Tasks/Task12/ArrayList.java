public class ArrayList {
    private Object objects[];
    private int count;


    public ArrayList() {
        this.objects = new Object[10];
        this.count = 0;
    }


    public void add(Object object) {
        objects[count] = object;
        count++;
    }

    public int find(Object object) {
        for (int i = 0; i < count; i++) {
            if (object.equals(objects[i])) {
                return i;
            }
        }
        return -1;
    }


}
