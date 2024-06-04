import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswa = new HashMap<>();
        mahasiswa.put("24060122120003", "Adi");
        mahasiswa.put("24060122120009", "Bambang");
        mahasiswa.put("24060122130070", "Cici");
        mahasiswa.put("24060122140145", "Didi");

        mahasiswa.forEach((nim, nama)->{
            System.out.println("NIM: " + nim + "|" + "Nama: " + nama);
        });
    }
}

