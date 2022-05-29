
/**
 *
 * @author Mehmet
 */
public class Gelismis_Abone {
    
    private String isim;
    private int bakiye=120;
    private String sehir;
    public Gelismis_Abone(String isim, int bakiye, String sehir) {
        this.isim = isim;
      
        if ( bakiye >= 0 && bakiye<=120) {
            this.bakiye=bakiye;
            
        }
       
        this.sehir=sehir;
        
    }
    
    public void dogalgaz_kullan(int miktar){
    if(this.bakiye - miktar<0){
        System.out.println("Yeterli bakiye yok");
    }
    else{
    this.bakiye-=miktar;
        if (this.bakiye <=0) {
            System.out.println("Bakiyeniz bitmiştir,kredi yükleyin.En düşük kredi =120 tl");
            
            
        }else{System.out.println("bakiye : "+bakiye);}
    }
    
    
    
    }
    public void bakiye_ogren(){
        System.out.println("bakiye : "+this.bakiye);}
    
}
