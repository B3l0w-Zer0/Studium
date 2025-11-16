package Lektion2;

public class ArrayListImpl {
    int[] array = new int[2];
    int size = 0;

    public static void main(String[] args){
        ArrayListImpl AAL = new ArrayListImpl();
        AAL.add(69);
        AAL.add(420);
        AAL.add(42);

        System.out.println(AAL.size());
        AAL.printArray();
        System.out.println(AAL.getLast());
        System.out.println(AAL.size());
    }

    public int size(){
        /*for(int i = 0; i < array.length; i++){
            if(array[i] == ){

            }
        }*/

    return size;
    }

    public void printArray(){
        for (int i = 0; i < size; i++){
            System.out.println(array[i]);
        }
    }

    public void add(int y){
        if(array.length == size) {
            int[] NewData = new int[array.length * 2];


            for (int i = 0; i < array.length; i++) {
                NewData[i] = array[i];
            }
            NewData[size] = y;
            array = NewData;
        }else {
            array[size] = y;
        }

        size++;
    }

    public int get(int i){
        return array[i];
    }

    public int getLast(){
        if (size == 0) {
            throw new IllegalStateException("Liste ist leer");
        }
        int last = array[size - 1];
        size--;
        return last;
    }
}
