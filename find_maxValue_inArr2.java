import java.util.Scanner;

public class find_maxValue_inArr2 {
    public static void main(String[] args) {
        int sizeWidth;
        int sizeHeight;
        int[][] arr;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input width size :");
        sizeWidth = scanner.nextInt();
        System.out.println("Input height size :");
        sizeHeight = scanner.nextInt();
        arr = new int[sizeHeight][sizeWidth];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Input value "+(i+1)+""+(j+1)+" :");
                arr[i][j] = scanner.nextInt();
            }
        }
        int max = 0;
        int maxW = 0;
        int maxH = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]){
                    max = arr[i][j];
                    maxW = j + 1;
                    maxH = i + 1;
                }
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println(" ");
        }

        System.out.println("Max value : "+max);
        System.out.println("Width size : "+maxW);
        System.out.println("Height size : "+maxH);
    }
}
