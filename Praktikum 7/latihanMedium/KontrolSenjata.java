/*Nama : Sarah Teguh Kinanti Situmeang
  NIM  : 24060122120032
 */

 package latihanMedium;
 public class KontrolSenjata {
     public Senjata senjata;
     
     public KontrolSenjata(Senjata s){
         this.senjata = s;
     }
     public boolean isAdaPeluru(){
         return senjata.getPeluru()>0;
     }
     public void isiPeluru(int peluru){
         senjata.setPeluru(senjata.getPeluru() + peluru);
         System.out.println(">>Peluru berhasil ditambah: " + peluru);
        
     }
     public void menembak(int jumlah){
         System.out.println(">>Siap menembak " + jumlah + " kali");
         //senjata.setPeluru(senjata.getPeluru()+jumlah);
         if (isAdaPeluru()){
         //if (isAdaPeluru()){
             for(int i = 0; i < jumlah; i++){
                 if (isAdaPeluru()){
                     System.out.print(senjata.getBunyi()+ " ");
                     senjata.setPeluru(senjata.getPeluru()-1);
                 }
                 else{
                     System.out.println("Gagal tembak, peluru habis");
                 }
                 System.out.println(" ");
             }
             
             System.out.println(">>Peluru sisa: " + senjata.getPeluru()); 
         }       
         else{           
             System.out.println("Peluru Habis");
         }
 }
     
     public String menusuk(){
         senjata.setMenusuk(true);
         return "Jleb!";
     }
     public void pasangBayonet(){
         System.out.println("Bayonet Terpasang");
     }
 }
 