package org.longvuong.sqlite;

public class Student {
    private  String id;
    private String hoten;
    private String diachi;
    private String sdt;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Getter and Setter for hoten
    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    // Getter and Setter for diachi
    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    // Getter and Setter for sdt
    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
    public Student(String id, String hoten, String diachi, String sdt) {
        this.id = id;
        this.hoten = hoten;
        this.diachi = diachi;
        this.sdt = sdt;
    }
    public Student(){

    }
}
