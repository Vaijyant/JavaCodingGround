package Singleton;

public class SingletonMain {
    public static void main (String[] args){

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        s1.n += 10;

        System.out.println("Value of s1.n: " + s1.n);
        System.out.println("Value of s2.n: " + s2.n);

        Singleton sC1 = new Singleton(8);
        System.out.println("Value of sC1.n: " + sC1.n);
        System.out.println("Value of s2n: " + s2.n);

        Singleton s23 = sC1.getInstance();
        System.out.println("Value of s23: " + s23.n);

    }
}
