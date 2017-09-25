package ru.itpark;

public class Main {

    public static void main(String[] args) {
        // мы создали массив - структура данных
        // ограниченного размера, представляющая
        // собой набор элементов с доступом по индексу(номеру)

        // в данном случае массив имеет размерность 5
        // нумерация 0..4
	    int array[] = new int[5];
	    array[0] = 7;
	    array[1] = 2;
	    array[2] = -3;
	    array[3] = 1;
	    array[4] = 5;

	    // для теситрования - явная инициализация
        int arrayInPlaceInitialized[] =
                {7, 3, -3, 1, 5};

        int i = 0;
        // пока i меньше пяти
        while (i < 5) {
            // печатаем a[i]
            System.out.print(array[i] + " ");
            // увеличиваем i
            i = i + 1; // i++ - инкремент
        }
        // System.out.print('\n');
        System.out.println();
        // 1 шаг цикла - итерация
        i = 4;
        while (i >= 0) {
            System.out.print(array[i] + " ");
            i = i - 1; // i-- - декремент
        }
    }
}
