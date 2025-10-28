package Troisieme_Seance.TP2_OOP;
// EX1

    class Toto{ int toto =0;Toto(){
        toto = toto +1;
    }
    public static void main(String[] args) {
  
        Toto t1 = new Toto();
        Toto t2 = new Toto();
        System.out.println("Toto : "+t1.toto);
    }

    }