package TH_tuan_1;

import java.util.Scanner;

public class bai3 {

    public void drawToConsole(int row,int column){
        for(int r = 0; r < row; r++){
            int temp = row - r;
            for(int col = 0;col < column;col++){
                if(r == 0 || r == row-1){
                    System.out.print("# ");
                }
                else if(( (col == 0) || (col == column-1) )){
                    System.out.print("# ");
                }
                else if(r == col || col == temp-1){
                    System.out.print("# ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        bai3 dtc = new bai3();
//        Scanner s = new Scanner(System.in);
//        int row = Integer.parseInt(s.next());
//        int column = Integer.parseInt(s.next());
        dtc.drawToConsole(7,7);
    }
}
