package GeekBrains_HW_Lesson_2;

public class MyArrayDataException extends RuntimeException{
    public MyArrayDataException() {
        super("Складывать можно только числовые значения. Исключение MyArrayDataException отработано!");
    }
}
