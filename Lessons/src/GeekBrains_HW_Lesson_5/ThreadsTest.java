package GeekBrains_HW_Lesson_5;

import java.util.stream.IntStream;

public class ThreadsTest{

    static final int arrOneSize = 1000000;
    static final int arrTwoSize = arrOneSize / 2;

    static void first(){
        float[] arrayOne = new float[arrOneSize];
        for (int i = 1; i < arrayOne.length; i++)
            arrayOne[i] = 1;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arrayOne.length; i++)
            arrayOne[i] = (float) (arrayOne[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        System.currentTimeMillis();
        System.out.println(System.currentTimeMillis() - startTime);
    }

    static void second(){
        float[] arrayTwo = new float[arrTwoSize];
        for (int i = 1; i < arrayTwo.length; i++)
            arrayTwo[i] = 1;
        long startTime = System.currentTimeMillis();
        System.currentTimeMillis();
        float[] part1 = new float[arrTwoSize/2];
        float[] part2 = new float[arrTwoSize-part1.length];
        System.arraycopy(arrayTwo, 0, part1, 0, part1.length);
        System.arraycopy(arrayTwo, part1.length, part2, 0, part2.length);

        new Thread(() -> {
            for (int i = 0; i < part1.length; i++)
                part1[i] = (float) (part1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }).start();

        new Thread(() -> {
            for (int i = 0; i < part2.length; i++)
                part2[i] = (float) (part2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }).start();

        System.arraycopy(part1, 0, arrayTwo, 0, part1.length);
        System.arraycopy(part2, 0, arrayTwo, part1.length, part2.length);
        System.out.println(System.currentTimeMillis() - startTime);
        //for (float v : arrayTwo) System.out.println(v);
    }

    public static void main(String[] args) {
        first();
        second();
    }
}

//     \1. Необходимо написать два метода, которые делают следующее:
//        1) Создают одномерный длинный массив, например:
//              static final int size = 10000000;
//              static final int h = size / 2;
//              float[] arr = new float[size];
//        2) Заполняют этот массив единицами;
//        3) Засекают время выполнения: long a = System.currentTimeMillis();
//        4) Проходят по всему массиву и для каждой ячейки считают новое значение по формуле:
//              arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
//        5) Проверяется время окончания метода System.currentTimeMillis();
//        6) В консоль выводится время работы: System.out.println(System.currentTimeMillis() - a);
//              Отличие первого метода от второго:
//              Первый просто бежит по массиву и вычисляет значения.
//        Второй разбивает массив на два массива, в двух потоках высчитывает новые значения и потом склеивает эти массивы обратно в один.
//
//        Пример деления одного массива на два:
//          System.arraycopy(arr, 0, a1, 0, h);
//          System.arraycopy(arr, h, a2, 0, h);
//
//        Пример обратной склейки:
//          System.arraycopy(a1, 0, arr, 0, h);
//          System.arraycopy(a2, 0, arr, h, h);
//
//        Примечание:
//          System.arraycopy() копирует данные из одного массива в другой:
//          System.arraycopy(массив-источник, откуда начинаем брать данные из массива-источника, массив-назначение, откуда начинаем записывать данные в массив-назначение, сколько ячеек копируем)
//        По замерам времени:
//          Для первого метода надо считать время только на цикл расчета:
//          for (int i = 0; i < size; i++) {
//          arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
//          }
//        Для второго метода замеряете время разбивки массива на 2, просчета каждого из двух массивов и склейки.
//