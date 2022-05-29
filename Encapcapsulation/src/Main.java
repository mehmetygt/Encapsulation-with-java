
/**
 *
 * @author Mehmet
 */
public class Main {
    public static void main(String[] args) {
    Abone abone= new Abone();
    abone.isim= "mehmet";
    abone.bakiye=200;  //Kredi limiti 120 olduğu halde 200 atayabildik
    //encapsulation yapmadığımızdan doğrudan erişip müdahale deebiliiyoruz
    //yine büyük bir projede böle tekk tek yazmak ve sonra değiştirmek çok zor olur
    
    abone.sehir="elazıg";
    abone.dogalgaz_kullan(200);

    //Encapsulation kullandığımız ikinci klas için özellikleri tek tek, ve ayrı ayrı girmiyoruz
    //bir özellik eksik yada yanlış gireresek java hata verip gösterir.
    //Doğrudan erişime kapalı olduğundan isteğimiz şarta uymayan özellikler değişmiyor 
    //örneğin bakiye negatif yada 120 üstü olamaıyor.
     Gelismis_Abone G_abone=new Gelismis_Abone("mehmet",3000,"elazığ");
     G_abone.bakiye_ogren();
    
    
    
    
    }
   
    
}
