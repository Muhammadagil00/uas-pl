public class luas {
    double base1 ;
    double base2 ;
    double tinggi ;

    luas(String base1, String base2, String tinggi ){
        this.base1 = Double.parseDouble(base1);
        this.base2 = Double.parseDouble(base2);
        this.tinggi = Double.parseDouble(tinggi);
    }

     public double HitungLuas() {
         return ((base1 + base2) *tinggi / 2);
     }
     public  double  Keliling() {
         return (base1 + base2 + base1 + base2 );
     }
}
