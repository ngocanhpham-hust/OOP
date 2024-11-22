package hust.soict.dsai.lab01;

public class Section66 {
    public static void main(String[] args){
        int[][] mat1 = {{55, 12, 83, 26},
                        {36, 70, 22, 91},
                        {95, 6, 47, 63}},
                mat2 = {{88, 18, 71, 42},
                        {3, 60, 54, 79},
                        {13, 40, 77, 98}}
        ;

        for (int i = 0; i < mat1.length; i++){
            for (int j = 0; j < mat1[0].length; j++){
                mat1[i][j] += mat2[i][j];
            }
        }

        System.out.print("The sum of 2 matrices is:\n");
        for (int i = 0; i < mat1.length; i++){
            for (int j = 0; j < mat1[0].length; j++){
                System.out.print(mat1[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
