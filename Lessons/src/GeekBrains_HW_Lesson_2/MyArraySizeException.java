package GeekBrains_HW_Lesson_2;

public class MyArraySizeException extends RuntimeException{
    public MyArraySizeException() {
        super("В данном примере размерность массива должна быть строго 4*4. Исключение MyArraySizeException отработано!");
    }
}
