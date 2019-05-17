public class Room {
    int metr;
    int temp;
    boolean klima;

    Room(int metr, int temp, boolean klima) {
        this.metr = metr;
        this.temp = temp;
        this.klima = klima;
    }

    boolean tempMinus() {
        if (this.klima  && this.temp > 14) {
            this.temp = this.temp - 1;
            return true;
        } else {
            return false;
        }
    }

    void showInfo(){
        System.out.println(temp +" "+  metr +" "+ klima);
    }

}