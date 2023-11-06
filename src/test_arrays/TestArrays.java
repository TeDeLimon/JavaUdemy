package test_arrays;

//Definitions: This Class contains various methods for manipulating arrays (sorting, searching, etc)
import java.util.Arrays;

public class TestArrays {

    public static void main(String[] args) {

        //Definitions: enters array, size 3. Size must be declared, it is not dynamic
        //Default value for empty int array is Zero
        int[] ages = new int[3];
        
        //Definitions: Array.toString() converts an int[] to String
        System.out.println("ages = " + Arrays.toString(ages));

        //Para modificar un elemento del array, podemos hacerlo de la siguiente forma: ages[2] = 10;
        ages[2] = 10;

        //Obviamente no podemos acceder a una posición del array que no existe: ages[3] = 20; This can't be done

        for(int i = 0; i < ages.length; i++) {
            //Incrementamos en 1 el valor de cada elemento del array
            System.out.println("++ages[i] = " + ++ages[i]);
        }

        //Podemos definir un array en la declaración del mismo, sintaxis resumida
        String[] fruits = {"Manzana", "Melón", "Limón", "Uva"};

        //Iteramos para mostrar cada valor
        for(String fruit: fruits) {
            System.out.println("fruit = " + fruit);
        }

    }
}
