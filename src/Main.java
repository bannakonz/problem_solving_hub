public class Main {
    public static void main(String[] args) {

        final double VAT_RATE = 1.07;

        double tvPrice = 10000;
        double dvdPrice = 600;
        double cdPrice = 200;

        double totalTVPrice = tvPrice * VAT_RATE;
        double totalDVDPrice = dvdPrice * VAT_RATE;
        double totalCDPrice = cdPrice * VAT_RATE;

        System.out.print("TV Price include VAT is : ");
        System.out.println(totalTVPrice);

        System.out.print("DVD Price include VAT is : ");
        System.out.println(totalDVDPrice);

        System.out.print("CD Price include VAT is : ");
        System.out.println(totalCDPrice);


//        double tvPrice = 10000;
//        double dvdPrice = 600;
//        double cdPrice = 200;
//
//        double totalTVPrice = tvPrice + (tvPrice * 0.07);
//        double totalDVDPrice = dvdPrice + (dvdPrice * 0.07);
//        double totalCDPrice = cdPrice + (cdPrice * 0.07);
//
//        System.out.print("TV Price include VAT is : ");
//        System.out.println(totalTVPrice);
//
//        System.out.print("DVD Price include VAT is : ");
//        System.out.println(totalDVDPrice);
//
//        System.out.print("CD Price include VAT is : ");
//        System.out.println(totalCDPrice);


        // NOTE:
        // = a + ( a * 0.07 )
        // = a (1+(1 * 0.07))
        // = a (1+(0.07))
        // = a * 1.07

    }
}