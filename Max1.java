import java.util.Scanner;

class Max1 {
    static int r,c;
    public static int[][] ins() {
        int[][] arr;
        arr = new int[10][10];
        int i,j;int m;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number of rows:\t");
        r = obj.nextInt();
        System.out.println("Enter number of columns:\t");
        c = obj.nextInt();
        System.out.println("enter the data either 0 or 1");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                arr[i][j] = obj.nextInt();
            }
            System.out.println("");
        }
        System.out.println("\n");
        return arr;
    }
    public static void display(int[][] arr)
    {
        System.out.println("The matrix is:\n");
        int i,j=0;
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("");
        }

    }
    public static void rowcount(int[][] arr){
        int i=0,j=0;
        int[] row;
        row = new int[r];
        for(i=0;i<r;i++){
            row[i]=0;
            for(j=0;j<c;j++){
                if(arr[i][j]==1){
                    row[i]++;
                }
            }
        }
        System.out.println("The 1's in each row are:");
        for(i=0;i<r;i++){
            System.out.println(row[i]);
        }
        int max=row[0];
        int[] similar;
        similar = new int[10];
        for(i=0;i<r;i++){
            if(max<row[i]){
                max=row[i];
            }
        }
        System.out.println("The maximum number of 1's in a single row are:\t" + max + "\n row:\n");
        for(i=0;i<r;i++){
            if(max==row[i]){
                System.out.println(i+1);
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr;
        arr = new int[10][10];
        arr =ins();
        display(arr);
        rowcount(arr);
    }
}