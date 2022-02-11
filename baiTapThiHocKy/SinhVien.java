package baiTapThiHocKy;

public class SinhVien {
    private static int count = 0;
    private int mssv,age,nienKhoa;
    private String name,chuyenNganh;

    public SinhVien(String name, String chuyenNganh, int age, int nienKhoa){
        this.mssv = count++;
        this.name = name;
        this.chuyenNganh = chuyenNganh;
        this.age = age;
        this.nienKhoa = nienKhoa;
    }
    public static void setCount(int count)throws Exception{
        if(Integer.toString(count).matches("\\d{7}") == false)
            throw new Exception("MSSV la so nguyen co 7 so");
        SinhVien.count = count;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){this.age = age;}
    public void setMssv(int mssv){this.mssv = mssv;}
    public void setNienKhoa(int nienKhoa){this.nienKhoa = nienKhoa;}
    public void setChuyenNganh(String chuyenNganh){this.chuyenNganh = chuyenNganh;}

    public int getMssv(){
        return mssv;
    }
    public String getChuyenNganh(){
        return chuyenNganh;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "mssv=" + mssv +
                ", age=" + age +
                ", nienKhoa=" + nienKhoa +
                ", name='" + name + '\'' +
                ", chuyenNganh='" + chuyenNganh + '\'' +
                '}';
    }
}
