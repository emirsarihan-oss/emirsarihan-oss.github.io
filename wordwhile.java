/*
Büyük küçük
Küçük büyük
Ad soyad küçğk büyük eşit
Sesli sessiz harf karşılaştırma
*/
public class MyProgram {
    public static void main(String[] args) {
    String nam1 = "RIDCAN";
    String surname = "ORTAHAN";

    int isimNum = nam1.length();
    int soyisimNum = surname.length();

    int harfSirasi = 0;
    //declarelamayı unuttuk int le (Hata)

    while (harfSirasi < isimNum) {
    int harfTekrari = 0;
    while (harfTekrari <= harfSirasi) {
    System.out.print(nam1.charAt(harfSirasi));
    harfTekrari++;
    }
    System.out.println();
    harfSirasi++;
    }

    System.out.println();

    harfSirasi = 0;
    int harfSirasi2 = soyisimNum;

    while (harfSirasi < soyisimNum) {
    int harfTekrari = 0;
    while (harfTekrari < harfSirasi2) {
    System.out.print(surname.charAt(harfSirasi));
    harfTekrari++;
    }
    System.out.println();
    harfSirasi2--;
    harfSirasi++;
        }
     
    }
}



