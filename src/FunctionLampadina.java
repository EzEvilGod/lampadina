import java.util.Scanner;

public class FunctionLampadina {
    boolean stateBuilb, broke;

    Scanner input = new Scanner(System.in);

    public FunctionLampadina() {
        stateBuilb = false;
        broke = false;
    }

    public boolean click() {
        int choise;

        if (stateBuilb == false) {
            stateBuilb = true;
            System.out.println("Mi sono accesa");
        } else {
            stateBuilb = false;
            System.out.println("Mi sono spenta");
        }

        return stateBuilb;
    }

    public String state() {
        String state;

        if (stateBuilb == false) {
            state = "La lampadina è spenta";
        } else {
            state = "La lampadina è accesa";
        }

        return state;
    }

    public void broke() {
        System.out.println("OPS, MI SONO ROTTA");
    }
}


