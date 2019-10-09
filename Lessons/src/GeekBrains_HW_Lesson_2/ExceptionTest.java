package GeekBrains_HW_Lesson_2;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.util.Arrays;

public class ExceptionTest {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Создаем двумерный массив!");
        System.out.println("Введите количество строк: "); //rows
        int rows = Integer.parseInt(reader.readLine());
        System.out.println("Введите количество столбцов: "); //columns
        int columns = Integer.parseInt(reader.readLine());
        try {
            createArray(rows, columns);
        } catch (MyArraySizeException | MyArrayDataException e){
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }
    }

    private static void createArray(int rows, int columns) throws IOException{
        if (rows != 4 | columns != 4) {
            throw new MyArraySizeException();
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[][] array = new String[rows][columns];
        int[][] intArray = new int[rows][columns];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Введите элемент [" + i + "]" + "[" + j + "]");
                array[i][j] = reader.readLine();
                try {
                    intArray[i][j] = Integer.parseInt(array[i][j]);
                    sum = sum + intArray[i][j];
                }catch (NumberFormatException e){
                    //e.printStackTrace();
                    System.out.println("В массиве под индексом [" + i + "][" + j + "] - не число!");
                    throw new MyArrayDataException();
                }
            }
        }
        System.out.println("Сумма: " + sum);
    }
}

//1. Напишите метод, на вход которого подается двумерный строковый массив размером 4х4,
//при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
//2. Далее метод должен пройтись по всем элементам массива, преобразовать в int,
//и просуммировать. Если в каком-то элементе массива преобразование не удалось
//(например, в ячейке лежит символ или текст вместо числа), должно быть брошено
//исключение MyArrayDataException – с детализацией, в какой именно ячейке лежат неверные данные.
//3. В методе main() вызвать полученный метод, обработать возможные исключения
//MySizeArrayException и MyArrayDataException и вывести результат расчета.