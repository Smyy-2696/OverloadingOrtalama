package w3resourcecomsorularivecozumleri;

public class OverloadingOrtalama {
    public static void main(String[] args) {
        //Üç sayıyı girdi olarak alan ve sayıların ortalamasını hesaplayan ve yazdıran bir Java programı yazınız.


        ortalama(3,4,5);
        ortalama(6,9,8);
        ortalama(1,3.8,4);
        ortalama(3.7,9.7,7.7);
        System.out.println("ortalama = " +ortalama(3.7, 9.7, 7.7));


    }
    private static void ortalama(double a,double b,int c) {
        System.out.println("ortalama = " + (a+b+c)/3);
    }
    public static void ortalama(int a,int b,double c){
        System.out.println("ortalama = " + (a+b+c)/3);

    }
    public static void ortalama(int a,int b, int c){
        System.out.println("ortalama = " + (a+b+c)/3);
    }
    private static double ortalama(double a,double b,double c){
        return (a+b+c)/3;
    }

}
