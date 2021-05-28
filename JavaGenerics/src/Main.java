public class Main {
    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
        String[] stringArray = {"B","Y","E"};

        System.out.print("Integer Array: ");
        displayArray(intArray);
        System.out.println(firstIndex(intArray));

        System.out.print("Double Array: ");
        displayArray(doubleArray);
        System.out.println(firstIndex(doubleArray));

        System.out.print("Character Array: ");
        displayArray(charArray);
        System.out.println(firstIndex(charArray));

        System.out.print("String Array: ");
        displayArray(stringArray);
        System.out.println(firstIndex(charArray));

        //bounded types = 	you can create the objects of a generic class to have data
        //					of specific derived types ex.Number

        Genclass<Integer,Integer> myInt = new Genclass<>(1,9);
        Genclass<Double,Double> myDouble = new Genclass<>(3.14,1.01);
        //char and  String cannot be pass becasue they don't exptend number. this is called bounded parameter

        //Genclass<Character,Character> myChar = new Genclasss<>('@','$');
        //MyGenericClass<String,Character> myString = new MyGenericClass<>("Hello",'!');


        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        //System.out.println(myChar.getValue());
        //System.out.println(myString.getValue());




    }

    // Generic method
    public static <T> void displayArray(T[] array) {

        for(T x : array) {
            System.out.print(x+" ");
        }
        System.out.println();
    }

    // Generic method with generic return type
    public static <T> T firstIndex(T[] array) {

        return array[0];
    }
}