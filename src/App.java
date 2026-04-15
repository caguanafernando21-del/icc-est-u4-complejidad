public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("hola mundo!");
        
        int[] array = new int[] {7,9,2,3,5};
        System.out.println(array[0]);
        System.out.println(array);
        // for normal posiciones

        for (int i=0; i < array.length; i++) {
            System.out.println(array[i]);

        }
        

        // for each elementos 
        for(int i : array) {
            System.out.println(i);

        }
    }

}
