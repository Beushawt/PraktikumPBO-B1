/*Nama : Sarah Teguh Kinanti Situmeang
  NIM  : 24060122120032
 */

 package latihanMedium;
 public class Senjata {
     private String bunyi;
     public int peluru;
     private boolean menusuk;
     
     public Senjata(String bunyi){
         this.bunyi = bunyi;
         this.peluru = peluru; //this.peluru = peluru;
     }
     public String getBunyi(){
         return bunyi;
     }
     public int getPeluru(){
         return peluru;
     }
     public boolean isMenusuk(){
         return menusuk;
     }
     public void setBunyi(String bunyi){
         this.bunyi = bunyi;
     }
     public void setMenusuk(boolean menusuk){
         this.menusuk = menusuk;
     }
     public void setPeluru(int peluru){
         this.peluru = peluru;
     }
     
 }
 