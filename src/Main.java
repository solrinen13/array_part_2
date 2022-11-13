
public class Main {


    public static int[] generateRandomArray()
    {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = random.nextInt(50_000) + 50_000;
        }
        return arr;
    }

    public static void main(String[] args) {

        System.out.println("Задача 1");

        int sumSalary=0;
        int[] arr = generateRandomArray();
        {
            int i = 0;
            while (i < arr.length) {
                sumSalary +=arr[i];
                i++;
            }
        }

        System.out.println("Сумма трат за месяц составила " +  sumSalary + " рублей");

        System.out.println("задача 2");

        int minSum=arr[0];
        int maxSum=0;
        {
            int i = 0;
            while (i < arr.length) {
                if (arr[i]> maxSum)
                {
                    maxSum = arr [i];
                }
                if (minSum > arr [i])
                 {
                    minSum = arr [i];
                 }
                i++;
            }
        }

        System.out.println("Максимальная сумма трат за день составляет: " + maxSum + " рублей");
        System.out.println("Минимальная сумма трат за день составляет: " + minSum + " рублей");

        System.out.println("Задача 3");

        int averageCosts = sumSalary / 30;
        System.out.println("Средняя сумма трат за месяц составила " + averageCosts + " рублей в день");

        System.out.println("Задача 4");


        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1 ;i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }







    }

}