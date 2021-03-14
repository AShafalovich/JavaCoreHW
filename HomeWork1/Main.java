package com.company;

public class Main {

    public static void main(String[] args) {

//        Задание 1
//
//        Есть некоторый массив, состоящий из целых чисел, также есть некоторое число
//        "n". Суть задания посчитать сумму всех элементов массива, однако если в массиве
//        встречается число "n" то в сумму его включать не нужно.

        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum1 = 0;
        int n1 = 5;

        for (int i = 0; i < array1.length; i++){

            if (array1[i] != n1){
                sum1 += array1[i];
            }
        }
        System.out.println("Задание 1 " + "Сумма: " + sum1);

//        Задание 2
//        Суть задания найти сумму всех четных чисел в последовательности Фибоначи, до
//        определенного индекса "n".
//                Например:
//        Последовательность: 0, 1, 1, 2, 3, 5, 8, 13, 21
//        n = 7
//        Сумма всех четных до 7го.  равна 2 + 8 = 10.

        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum2 = 0;
        int n2 = 7;

        for (int i = 0; i < array2.length; i++){

            if (array2[i] % 2 == 0 && i != n2){
                sum2 += array2[i];
            }
        }
        System.out.println("Задание 2 " + "Сумма: " + sum2);

//        Задание 3
//        Дан некоторый массив, суть задания инвертировать его.

        int[] array3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int b = 0;

        System.out.print("Задание 3: Заданный массив - ");
        for (int i = 0, k = 1; i < array3.length; i++, k++) {

            System.out.print(array3[i] + " ");
        }

        for (int i = 0, k = 1; i < array3.length/2; i++, k++){

            b = array3[i];
            array3[i] = array3[array3.length - k];
            array3[array3.length - k] = b;

        }

        System.out.print("Инверсированный массив - ");
        for (int i = 0, k = 1; i < array3.length; i++, k++) {

            System.out.print(array3[i] + " ");
        }
        System.out.println(" ");

//        Задание 4
//        Дан некоторый двумерный массив. Нужно определить каких чисел в нем больше,
//                положительных или отрицательных.

        int [][] matrix4 = {{1, -2, 3},
                            {4, -5, 0},
                            {7, -8, 9} };

        int positiveNum = 0, negativeNum = 0, zeroNum = 0;

        for (int i = 0; i < matrix4.length; i++){

            for (int j = 0; j < matrix4[i].length; j++){

                if (matrix4[i][j] == 0) zeroNum++;
                if (matrix4[i][j] < 0) negativeNum++;
                if (matrix4[i][j] > 0) positiveNum++;

            }
        }
        System.out.println("Задание 4 " + "Нулевых значений: " + zeroNum + " "
                                    + "Отрицательных значений: " + negativeNum + " "
                                    + "Положительных значений: " + positiveNum);

//        Задание 5
//        Дан некоторый двумерный массив. Нужно определить является ли он нижней
//        треугольной матрицей или же нет.

        int [][] matrica = {{8, 4, 6, 2, 8, 5, 1, 3, 7},
                            {0, 5, 9, 6, 3, 1, 5, 4, 4},
                            {0, 0, 4, 0, 7, 1, 4, 9, 5},
                            {0, 0, 0, 9, 1, 8, 7, 1, 4},
                            {0, 0, 0, 0, 2, 9, 9, 6, 1},
                            {0, 0, 0, 0, 0, 6, 0, 8, 4},
                            {0, 0, 0, 0, 0, 0, 1, 1, 5},
                            {0, 0, 0, 0, 0, 0, 0, 7, 2},
                            {0, 0, 0, 0, 0, 0, 0, 0, 3}};

        boolean triangular = true;

        System.out.print("Задание 5: Является ли данная матрица нижнетреугольной? - ");

        for (int i = 0; i < matrica.length; i++){

            for (int j = 0; j < matrica[i].length; j++){

              if (matrica[i][j] != 0 && i > j) {

                  triangular = false;
                  break;
              }

            }
        }
        System.out.println(triangular == true?"ДА":"НЕТ");

//        Задание 6
//        Даны две квадратные матрицы. Необходимо написать программу которая посчитает их
//        сумму и разности.

        int [][] matrix61 = {{9, 8},
                            {7, 6}};
        int [][] matrix62 = {{1, 2},
                            {3, 4}};
        int[][] matrix63 = new int[2][2];
        int[][] matrix64 = new int[2][2];

        System.out.println("Задание 6 Заданные матрицы: ");
        for (int i = 0; i < matrix61.length; i++){

            for (int j = 0; j < matrix61[i].length; j++){

                matrix63[i][j] = matrix61[i][j] + matrix62 [i][j];
                matrix64[i][j] = matrix61[i][j] - matrix62 [i][j];

                System.out.print(matrix61[i][j] + " ");
                System.out.print(matrix62[i][j] + " ");
                System.out.println(" ");
            }
            System.out.println(" ");

        }
        System.out.println("Задание 6 Сумма матриц: ");

        for (int i = 0; i < matrix63.length; i++){

            for (int j = 0; j < matrix63[i].length; j++){

                System.out.print(matrix63[i][j] + " ");

            }
            System.out.println(" ");
        }
        System.out.println("Задание 6 Разность матриц: ");

        for (int i = 0; i < matrix64.length; i++){

            for (int j = 0; j < matrix64[i].length; j++){

                System.out.print(matrix64[i][j] + " ");

            }
            System.out.println(" ");
        }

//        Задание *
//                Есть некоторый массив из целых положительних чисел. [1, 0, 4, 8, 9, 1]
//        Необходимо написать программу которая посчитает максимально возможную сумму
//        которую можно получить из данного массива, с условием что элементы включенные в
//        сумму не должны стоять на соседних индексах (должен быть минимум один елемент
//                между ними).

        int[] arrayPlus1 = {1, 2, 1, 3, 4, 1, 5, 3, 2};
        int sumNeChet = 0;
        int sumChet = 0;

        System.out.println("Задание 1*: ");
        System.out.print("Заданный массив: ");
        for (int i = 0; i < arrayPlus1.length; i++ ){
            if (i % 2 != 0) sumNeChet += arrayPlus1[i];
                    else sumChet += arrayPlus1[i];

            System.out.print(arrayPlus1[i] + " ");
        }

        if (sumNeChet > sumChet) System.out.println("Максимально возможная сумма: " + sumNeChet);
            else if (sumChet > sumNeChet) System.out.println("Максимально возможная сумма: " + sumChet);
                else System.out.println("Суммы одинаковы и равны: " + sumChet);

//        Задание *
//                N студентов стоят в очереди за стипендией. Каждый студент имеет учебный рейтинг.
//                Деканат должен выдать стипендию таким образом, чтобы: каждый студент получил хотя
//        бы 1 рубль, студенты с более высоким рейтингом получили больше рублей, чем их
//        соседи в очереди. Копеек в деканате нет. Какое минимальное количество рублей
//        должно быть у деканата? На вход подаётся массив из N элементов, содержащий
//        рейтинги для каждого студента. На выходе ожидается число, обозначающее минимальное
//        количество рублей, которых должно хватить студентам.
//                Пример:
//        Вход: [1, 2, 3, 4, 5, 3, 2, 1, 2, 6, 5, 4, 3, 3, 2, 1, 1, 3, 3, 3, 4, 2]
//        Выход: 47

        int[] arrayPlus2 = {1, 2, 3, 4, 5, 3, 2, 1, 2, 6, 5, 4, 3, 3, 2, 1, 1, 3, 3, 3, 4, 2};
        int pay = 1;
        int fullPay = 0;

        System.out.println("Задание 2*: ");
        System.out.print("Заданный массив: ");

        for (int i = 0; i < arrayPlus2.length; i++){

            if (i == 0) fullPay += pay;

            if (i < arrayPlus2.length - 1 && i != 0) {
                if (arrayPlus2[i] < arrayPlus2[i+1]) fullPay += ++pay;

                if (arrayPlus2[i] > arrayPlus2[i+1]) {
                    if (pay >= 2) fullPay += --pay;
                    else fullPay++;
                }

                if (arrayPlus2[i] == arrayPlus2[i+1]) fullPay += ++pay;
            }

            if (i == arrayPlus2.length - 1) {
                if (arrayPlus2[i] < arrayPlus2[i-1]) fullPay += --pay;

                if (arrayPlus2[i] > arrayPlus2[i-1]) {
                    if (pay >= 2) fullPay += ++pay;
                    else fullPay++;
                }

                if (arrayPlus2[i] == arrayPlus2[i-1]) fullPay += ++pay;
            }


            System.out.print(arrayPlus2[i] + " ");
        }
        System.out.println("У деканата должно быть минимум " + fullPay + " рублей");

        //Оказалось, что нужно не так(((
        //Исправлю логику завтра :) А.Шафалович

    }
}
