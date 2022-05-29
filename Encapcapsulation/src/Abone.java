
/**
 *
 * @author Mehmet
 */
public class Abone {
    public String isim;
    public int bakiye;
    public String sehir;
    
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
        System.out.println("bakiye : "+bakiye);}
    
}
