import java.util.Scanner;

public class Max_Two_Dimensional_Array {
    public static void main(String[] args) {
        // khai bao số dòng  số  cột
        int row ,column;
        Scanner sc =new Scanner(System.in);
        System.out.println("nhập số  dòng");
        row =sc.nextInt();
        System.out.println("nhập số  cột");
        column =sc.nextInt();
        //khai báo  cấp phát bộ nhớ cho mảng
        int [][] array=  new int[row][column];
        //nhập giá trị  các phân tử  cho mảng;
        for(int i =0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.println("Nhập  phần tủ thứ [ "+i+","+j+"]:");
                array [i][j] =sc.nextInt();
            }
        }

        System.out.println("mảng  vừa nhập");
        for(int i=0 ;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(array[i][j]+"\t");

            }
            System.out.println("\n");
        }
      int max = max_Array(array);
        System.out.println(max);


    }
    public static  int max_Array(int[][] array){

        int max =array[0][0];
        for (int i =0 ;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                    if(max <array[i][j]){
                        max =array[i][j];
                        System.out.println("vi trí của phần tử  max :["+i+","+j+"]");
                    }
            }
        }
        return max;
    }
}
