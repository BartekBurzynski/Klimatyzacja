public class Room {
    int metr;
    int temp;
    boolean klima;

    Room(int metr, int temp, boolean klima) {
        this.metr = metr;
        this.temp = temp;
        this.klima = klima;
    }

    int tempMinus(int temp) {
        if (this.klima = true)
            return this.temp - 1;
        else if  (this.temp <= 14)
            return 0;
        else {
            return 0;
        }
    }
}