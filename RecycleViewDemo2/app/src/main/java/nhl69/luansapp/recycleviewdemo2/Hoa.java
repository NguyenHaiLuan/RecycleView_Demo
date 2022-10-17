package nhl69.luansapp.recycleviewdemo2;

public class Hoa {
    private String ten, mau;
    private int hinh;

    public Hoa(String ten, String mau, int hinh) {
        this.ten = ten;
        this.mau = mau;
        this.hinh = hinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
