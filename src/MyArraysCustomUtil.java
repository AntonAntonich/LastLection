/*
 *
 * 1) бегло повторим методы
 * 2) рассмотрим что такое методы с переменным числом параметров
 * 3) напишем несколько утилитных метдодов для работы с массивами
 * 4) сортировки: пузырьком, выбором
 * 5) калькутор
 *
 *
 * */

import java.util.Arrays;

public class MyArraysCustomUtil {
    public static void main(String[] args) {
        //                    STACK                                 HEAP
//        String [] programmingLanguages = new String[] {"Java", "JavaScript", "Python", "C++"};
//        String lastElementOfArray = pop(programmingLanguages);
//        String resultOfTest = testPop(lastElementOfArray) ? "success" : "failed";
//        System.out.println("result of test: " + resultOfTest);
//        printNumbers(1, 13, 100);
//        int [] array = {};
//        int n = maxArrayValue(array);
//        String resultOfTest = test() ?  "passed" : "failed";
//        System.out.println("result of test" + resultOfTest);
        int [] array = {9, 5, 4, -1};
        System.out.println(Arrays.toString(array));
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static boolean test() {
        return false;
    }

    public static String pop(String[] stringArray) {
        return stringArray[stringArray.length - 1];
    }

    public static boolean testPop(String actual) {
        String expected = "C++";
        return expected.equals(actual);
    }

    public static void printNumbers(int... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("[" + numbers[i] + "]");
        }
                // numbers[i]
        for (int number : numbers) {
            System.out.print("[" + number + "]");
        }
    }

    public static int peek(int [] arrays) {
        int result = 0;
        // записать в result первый элемент массива
        return result;
    }

    public static  int minArrayValue(int [] array) {
        int result = 0;
        // записать в резалт минимальный элемент массива
        return result;
    }

    public static  int maxArrayValue(int [] array) {
        int result = 0;
        // записать в резалт максимальный элемент массива
        return result;
    }

    public static  void bubbleSort(int [] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(array[j] > array[j + 1]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    public static int[] selectionSort(int...array) {
        for(int blackIndex = 0; blackIndex < array.length - 1; blackIndex++) {
            for(int redIndex = blackIndex + 1; redIndex < array.length; redIndex++) {
                if(array[redIndex] < array[blackIndex]) {
                    int tmp = array[blackIndex];
                    array[blackIndex] = array[redIndex];
                    array[redIndex] = tmp;
                }
            }
        }

        return array;
    }

}
