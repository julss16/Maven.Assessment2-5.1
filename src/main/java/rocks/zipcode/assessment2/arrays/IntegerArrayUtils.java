package rocks.zipcode.assessment2.arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * @author leon on 28/11/2018.
 */
public class IntegerArrayUtils {
    /**
     * @param integerArray - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(integerArray));

            list.add(valueToBeAdded);


        Integer[] list1 = new Integer[list.size()];
        list.toArray(list1);


        return list1;
    }

    /**
     * @param integerArray - array to be manipulated
     * @param indexToInsertAt - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(integerArray));

        list.set(indexToInsertAt, valueToBeInserted);

        Integer[] list1= new Integer[list.size()];
        list.toArray(list1);

        return list1;
    }

    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(integerArray));




        return  list.get(indexToFetch);
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {

        //ArrayList<Integer> list = new ArrayList<>(Arrays.asList(integerArray));

        for(int i =0; i < integerArray.length; i++){
            if ( integerArray[i] % 2 ==0) {
                integerArray[i]= integerArray[i] +1 ;

            } else if (integerArray[i] %2 != 0){
                integerArray[i]= integerArray[i] - 1 ;

            }

        }

        return integerArray;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {

        for(int i =0; i < integerArray.length; i++){
            if (integerArray[i] %2 ==0){
                integerArray[i]= integerArray[i] +1;
            }
        }


        return integerArray;
    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {

        for(int i =0; i < input.length; i++){
            if(input[i] %2 !=0){
                input[i]= input[i] - 1;
            }
        }

        return input;
    }
}
