public class OshoFreePromoEngine{





public static int cartPromo(int price){

 return 4000;




}

public static double cartPriceDiscount(int cart, String code){

    double discount=0;
    String Ucode= code.toUpperCase();

    if (cart < 5000 && Ucode.equals("STARTER10")){

      discount= cart;
    return discount;

    }  else if ((cart >= 5000 && cart<=14999) && Ucode.equals("STARTER10")){

      discount= cart-(0.10*cart);
    return discount;

    }else if ((cart >= 15000 && cart<=29999) && Ucode.equals("BIGBOY20")){

      discount= cart-(0.20*cart);
    return discount;

    }else if ((cart >= 30000) && Ucode.equals("OSHOFREE35")){

      discount= cart-(0.35*cart);
    return discount;
   }
 else{
        System.out.print("Invalid promo code");
        return cart;
}


}












}
