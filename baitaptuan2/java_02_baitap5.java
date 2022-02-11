package baitaptuan2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class java_02_baitap5 {
    public static void main(String[] args){
        Scanner file = null;
        try{
            ArrayList<String> time_al = new ArrayList<>();
            ArrayList<String> ADC_name_al = new ArrayList<>();
            ArrayList<Float> ADC_al = new ArrayList<>();
            String time,ADC_name,ADC,date,ADC_num;
            int line;
            file = new Scanner(new FileInputStream("dienthe.txt"));
            ArrayList<String> day = new ArrayList<>();
            file.useDelimiter("\r\n----------------\r\n");
            while(file.hasNext()){
                day.add(file.next()); // tách ra từng ngày, mỗi ngày dược cách nhau bởi --------------------------
            }
            for(int size_day = 0;size_day < day.size();size_day++) {
                Scanner s = new Scanner(day.get(size_day));
                //đọc ngày, số dòng , số ADC trước dựa theo tách kí tự #
                s.useDelimiter("#");
                String total = s.next();
                date = s.next();
                line = s.nextInt();
                s.useDelimiter("\r\n");
                ADC_num = s.next();
                ADC_num = ADC_num.charAt(1) + "";
                // các phần trước # đầu tiên thì lưu vào biến total để lát tách thành từng thành phần dựa theo
                // kí tự ","
                Scanner sc = new Scanner(total);
                ArrayList<String> line_al = new ArrayList<>();
                int i = 0;
                // tách từng dòng ra
                sc.useDelimiter("\r\n");
                while (sc.hasNext() && i < line) {
                    line_al.add(sc.next());
                    Scanner readLine = new Scanner(line_al.get(i));
                    // tách từng thành phần dựa trên kí tự ","
                    readLine.useDelimiter(",");
                    time = readLine.next();
                    ADC_name = readLine.next();
                    ADC = readLine.next();
                    // Đưa các giá trị này vào các arrayList tương ứng
                    time_al.add(time);
                    ADC_name_al.add(ADC_name);
                    ADC_al.add(Float.parseFloat(ADC));
                    i++;
                }
                // tính toán giá trị điện thế trung bình và xuất ra màn hình
                for (int adc_num = 1; adc_num <= Integer.parseInt(ADC_num); adc_num++) {
                    float avr_vol = 0;
                    int temp = 0;
                    String adc = "ADC" + adc_num;
                    for (int l = 0; l < line; l++) {
                        if (ADC_name_al.get(l).equals(adc)) {
                            avr_vol += ADC_al.get(l);
                            temp++;
                        }
                    }
                    avr_vol = avr_vol / temp;
                    System.out.println("ADC" + (adc_num) + " " + avr_vol + " " + date);
                }
                line_al.clear();
                time_al.clear();
                ADC_name_al.clear();
                ADC_al.clear();
            }
            file.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
