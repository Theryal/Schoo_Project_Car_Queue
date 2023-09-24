import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {

        System.out.println("*************** KOLEJKA FIFO ***************");

        Deque<Pojazd> Pojazd = new ArrayDeque<>();

        Pojazd.add(new Pojazd("Volvo", "2002", "czerwony"));
        Pojazd.add(new Pojazd("Skoda", "1998", "biały"));
        Pojazd.add(new Pojazd("Fiat", "1995", "niebieski"));
        Pojazd.add(new Pojazd("MBW", "2004", "szary"));
        Pojazd.add(new Pojazd("Kia", "2004", "zielony"));
        Pojazd.add(new Pojazd("Audi", "2004", "czarny"));
        Pojazd.add(new Pojazd("MBW", "1989", "żółty"));
        Pojazd.add(new Pojazd("Skoda", "2000", "czarny"));
        Pojazd.add(new Pojazd("Ford", "1999", "szary"));
        Pojazd.add(new Pojazd("Kia", "2001", "granatowy"));

        System.out.println(Pojazd);
        Pojazd.pop();
        System.out.println("*************** PIERWSZE AUTO ZOSTAŁO OBSŁUŻONE ***************");
        System.out.println(Pojazd);

        System.out.println("*************** KOLEJKA LIFO ***************");

        Deque<Pojazd> Pojazdy = new ArrayDeque<>();

        Pojazdy.push(new Pojazd("Volvo", "2002", "czerwony"));
        Pojazdy.push(new Pojazd("Skoda", "1998", "biały"));
        Pojazdy.push(new Pojazd("Fiat", "1995", "niebieski"));
        Pojazdy.push(new Pojazd("MBW", "2004", "szary"));
        Pojazdy.push(new Pojazd("Kia", "2004", "zielony"));
        Pojazdy.push(new Pojazd("Audi", "2004", "czarny"));
        Pojazdy.push(new Pojazd("MBW", "1989", "żółty"));
        Pojazdy.push(new Pojazd("Skoda", "2000", "czarny"));
        Pojazdy.push(new Pojazd("Ford", "1999", "szary"));
        Pojazdy.push(new Pojazd("Kia", "2001", "granatowy"));

        System.out.println(Pojazdy);
        Pojazdy.pop();
        System.out.println("*************** PIERWSZE AUTO ZOSTAŁO OBSŁUŻONE ***************");
        System.out.println(Pojazdy);
    }
}
