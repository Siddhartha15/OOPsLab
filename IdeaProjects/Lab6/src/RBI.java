public class RBI {
    float getRateOfInterest(){
        return 8.0f;
    }
}

class SBI extends RBI {
    float getRateOfInterest() {
        return 9.5f;
    }
}

class ICICI extends RBI {
    float getRateOfInterest() {
        return 9.9f;
    }
}

class PNB extends RBI {

}

class Customer extends RBI{

}

class Acount extends RBI{

}

class Polymorphism{

    public static void main(String [] args){
        RBI sbi = new SBI();
        RBI icici = new ICICI();
        RBI pnb = new PNB();

        System.out.println("SBI Rate of Interest : "+sbi.getRateOfInterest());
        System.out.println("ICICI Rate of Interest : "+icici.getRateOfInterest());
        System.out.println("PNB Rate of Interest : "+pnb.getRateOfInterest());
    }
}
