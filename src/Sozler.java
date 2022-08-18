
import java.util.HashMap;


public class Sozler {
    HashMap<Integer, String> sozler=new HashMap<>();
String secilen_soz;
    public Sozler() {
    sozler.put(1, "Alma");  sozler.put(2, "Armud");  sozler.put(3, "Maşın");
     sozler.put(4, "Mekteb");  
     sozler.put(5, "Qara");  
     sozler.put(6, "Kitab");  
      sozler.put(7, "meyve");  
      sozler.put(8, "sinif");  
      sozler.put(9, "proqram");  
       sozler.put(10, "ağac");  
        sozler.put(11, "bulud");  
         sozler.put(12, "açar");  
          sozler.put(13, "oyun");  
           sozler.put(14, "mahnı");  
            sozler.put(15, "düyme");  
             sozler.put(16, "ekran");  
              sozler.put(17, "qazet");  
               sozler.put(18, "cümle");  
                sozler.put(19, "yağış");  
                 sozler.put(20, "payız");  
                  sozler.put(21, "iyul");  
                   sozler.put(22, "iyun");  
                    sozler.put(23, "telefon");  
                     sozler.put(24, "stadion");  
                      sozler.put(25, "üzüm");  
                       sozler.put(26, "ağlamaq");  
                        sozler.put(27, "fransa");  
                         sozler.put(28, "avropa");  
                          sozler.put(29, "yaşıl");  
                           sozler.put(30, "işıq");  
                            sozler.put(31, "Kağız");  
                             sozler.put(32, "bakı");  
                              sozler.put(33, "yemek");  
                               sozler.put(34, "kuryer");  
                                sozler.put(35, "taksi");  
                         
                                 
               
     
    int rand=(int) (Math.random()*sozler.size()+1);
    secilen_soz=sozler.get(rand);
    }
    
}
