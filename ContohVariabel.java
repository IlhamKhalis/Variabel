public class ContohVariabel{
    public static void main(String args[]) {

        String hobi = "Bermain petak umpet";
        boolean p = true;
        char jk = 'L';
        byte umur = 20;
        double $ipk = 3.23, tinggi = 1.78;
    
        System.out.println(hobi);
        System.out.println("Apakah pandai? " + p);
        System.out.println("Jenis Kelamin   : " + jk);
        System.out.println("Umurku Saat Ini : " + umur);
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", $ipk, tinggi));
    }
}
