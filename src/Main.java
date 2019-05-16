public class Main {
    public static void main(String[] args) {
        Room room = new Room(40, 19,true);
        room.tempMinus(room.temp);
        System.out.println(room.tempMinus(room.temp));
    }
}
