package fileHandler;

import java.io.*;
import java.util.Scanner;

public class workWithFile {
    private static File f = new File("input.txt"); // pathname chứa tên file muốn lưu các object vào

    public static void createFile(){
        try { // tao 1 file
            File file = new File("input.txt");
            if (file.createNewFile()) { // kiem tra xem file da duoc tao hay chua
                System.out.println("File creaeted: " + file.getName());
            } else {
                System.out.println("file already existed");
            }
        }
        catch(IOException e){ // xu li ngoai le
            System.out.println("An error occurred");
            e.printStackTrace(); // hiện xem lỗi ở đâu
        }
    }
    public static void writeToFile(){
        try{
            FileWriter mw = new FileWriter("input.txt");
            for(int i = 0;i < 5;i++)
            mw.write(i + " "); // ghi vào File
            mw.close();
            System.out.println("Successfully wrote to the file");

        }
        catch(IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
    public static void readFile(){
        try{
            File rf = new File("input.txt");
            Scanner s = new Scanner(rf); // Scanner đọc dữ liệu từ file (rf)
            while(s.hasNextLine()){ // trong file còn dữ liệu để đọc => TRUE, hết dữ liệu đọc => False
                String data = s.nextLine(); // gán giá trị đọc/String đọc được vào String data
                System.out.println(data);
            }
            System.out.println(rf.getAbsolutePath());
            s.close(); // khi sử dụng xong file phải đóng file lại
        }
        catch(FileNotFoundException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
    /*
    public static void fileFunction(){
        File myObj = new File("filename.txt");
        if (myObj.exists()) {
            System.out.println("File name: " + myObj.getName()); // trả về tên của filee
            System.out.println("Absolute path: " + myObj.getAbsolutePath()); // trả về đường dẫn chính xác của file
            System.out.println("Writeable: " + myObj.canWrite()); // trả về trạng thái có thể ghi vào file
            System.out.println("Readable " + myObj.canRead()); // trả về trạng thái có thể đọc vô file
            System.out.println("File size in bytes " + myObj.length()); // trả về độ dài của file theo byte
        } else {
            System.out.println("The file does not exist.");
        }
    }
    */


    /*
    Cách đọc 1 file chứa các object, đọc theo từng object, file có định dạng là .DAT
     */
    public void ReadFromFile(String fileName){
        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            while(fis.available() > 0) {
                Object obj = ois.readObject();
                System.out.println(obj); // ở đây gọi method toString của object để in ra console các thoongg tin của object, nên ghi đè(override) method toString
            }
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    /*
    Ghi hàng loạt các object vào file sử dụng hàm này, để vào vòng for sẽ có được method ghi hàng loạt object vào file .DAT
    Dùng method ReadFromFile ở trên thì sẽ đọc được ngược lại các object trong file
     */
    public void WriteToFile(Object object){ // object ở đây có thể thay bằng các class/object truyền vào tương ứng
        try {

            FileInputStream fis = new FileInputStream(f);
            if(fis.available() == 0){ // file chua co du lieu
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
                oos.writeObject(object);
                oos.close();
            }
            else{ // file da co du lieu thì tiep tuc ghhi vao cuoi file chứ k ghi đè lên từ đầu
                AppendableObjectOutputStream aoos = new AppendableObjectOutputStream(new FileOutputStream(f,true)); // set append = true để ghi vào cuối
                aoos.writeObject(object);
                aoos.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        User[] User = new User[5];
        User[0] = new User("Loc",21);
        User[1] = new User("Hieu",21);
        User[2] = new User("Khoa",21);
        User[3] = new User("Khang",21);
        User[4] = new User("Bao",21);
        workWithFile workWithFile = new workWithFile();
        for(int i = 0;i<User.length;i++){
            workWithFile.WriteToFile(User[i]); // sử dụng method này yêu cầu class phải implements Serializable để các thuộc tính được sắp xếp ko bị xáo trộn nhau
                                                // trong quá trình truyền dữ liệu
        }
        workWithFile.ReadFromFile("input.txt");
    }

}
