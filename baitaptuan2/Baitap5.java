package baitaptuan2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
public class Baitap5 {
//quach vo anh khoa
//18200147
//hcmus

	public static void main(String[] args) {
		Scanner fileIn = null ; // initializes fileIn to empty
		try
		{
		// Attempt to open the file
		fileIn = new Scanner( new FileInputStream("C:\\Users\\QUÁCHVÕANHKHOA\\Documents\\HK1-nam4\\Java\\Project\\Baitap\\src\\adc.txt"));
		String arr[];
		String text = "";
		while(fileIn.hasNext())
		{
			text+=fileIn.nextLine()+" ";
		}
		// chuyen du lieu qua mang de thao tac
		arr = text.split(" ");

		double ADC1,ADC2,ADC3;
		ADC1=ADC2=ADC3 = 0;
		int count1,count2,count3;
		 count1=count2=count3=0;
		for(int i = 0; i<arr.length;i++) {
			// 13:45,ADC1,1.465 i=0
			// chuyen ve dang string de check dau # va ------
 			String txtTemp = "";
			txtTemp+=arr[i]+" ";
			// gap ------ thi reset adc de tinh toan du lieu moi cho ngay hom sau
			if(txtTemp.contains("----------------")) {
				ADC1=ADC2=ADC3 = 0;
				count1=count2=count3=0;
				continue;
				//break;
			}
			// neu gap dau # thi thuc hien tong ket adc trong ngay sau do nhay den vong lap
			// ke tiep va tinh toan cho ngay hom sau
			if(txtTemp.contains("#"))
			{
				txtTemp = txtTemp.substring(0,9).replaceAll("#","");
				if(ADC1!=0) {
					ADC1 = (ADC1/count1);
					System.out.printf("ADC1 %3.4f %s \n",ADC1,txtTemp);
				}
				if(ADC2!=0) {
					ADC2 = (ADC2/count2);
					System.out.printf("ADC2 %3.4f %s \n",ADC2,txtTemp);
				}
				if(ADC3!=0) {
					ADC3 = (ADC3/count3);
					System.out.printf("ADC3 %3.4f %s \n",ADC3,txtTemp);
				}		
				
				continue;
				//break;
				
			}
			// ket thuc check
				text = "";
				int dem = 0;
				text+=arr[i];
				for (char ch: text.toCharArray()) {
					
					if(Character.compare(ch, 'A')==0) {					
						break;
					}
					dem++;
				}
				text="";
				text+=arr[i].substring(dem)+" "; // loc bo so gio ADC1,1.465 i=0
				//System.out.printf(text);
				String temp[] = text.split(",");
				String chu = temp[0]; // ADC1			
				String so = temp[1]; // 1.465
				//System.out.printf(text);
				if(chu.contains("ADC1")) {
					count1++;
					ADC1+= Double.parseDouble(temp[1]);
					
				}
				if(chu.contains("ADC2")){
					count2++;
					ADC2+= Double.parseDouble(temp[1]);
					
				}
				if(chu.contains("ADC3")){
					count3++;
					ADC3+= Double.parseDouble(temp[1]);
					
				}
				
		}
		
		fileIn.close();
		}
		catch (FileNotFoundException e)
		{
		// If the file could not be found, this code is executed
		// and then the program exits
		System.out.println("File not found.");
		System.exit(0);
		}
	}

}


