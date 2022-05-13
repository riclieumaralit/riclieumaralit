
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Wizard (Chuo) Vs. Warlock (Akai)");


        Wizard Chuo = new Wizard("Chuo");
        Warlock Akai = new Warlock("Akai");
        Character ch = new Character();

        System.out.println("Wizard");
        ch.intcharacter("Chuo");

        System.out.println("\nWarlock");
        ch.intcharacter("Akai");

        System.out.println("\n");
        Chuo.jeetkunedo(Akai);
        Akai.status(100, 200);
        Chuo.status(100, 170);

        Akai. thunderspeed (Chuo);
        Akai.status(59, 165);
        Chuo.status(69, 160);
        Akai.restore(Akai, 40, 40);
        Akai.status(79, 200);
        Chuo.status(70, 170);

        Chuo.demonkick(Akai);
        Akai.status(30, 185);
        Chuo.status(65, 110);
        Akai.thunderstorm(Chuo);
        Akai.status(30, 135);
        Chuo.status(15, 110);
        Chuo.jeetkunedo(Akai);
        Akai.status(0, 120);
        Chuo.status(15, 70);

        System.out.println("The winner is Wizard Chuo");
        System.out.println("Wizard Chuo will level up++++!!");
        System.out.println("Level 1 to Level =  "+ch.levelUp(1));


    }
}