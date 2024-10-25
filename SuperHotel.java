public class SuperHotel {
    static int x[];


    public void reserver(){

        try{
            x[0] = 1;
        }catch(Exception e){
            System.out.println("Erreur: " + e.getMessage());

        }
    }

    public static void main(String args[]) {

        SuperHotel s = new SuperHotel();
        s.reserver();
    }
}

