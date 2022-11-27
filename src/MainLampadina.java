import java.util.Scanner;

public class MainLampadina {

     static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        String stateBuilb;

        boolean state;
        int choise, switchBulb, MaxSwitchBuilb, repetition;

        repetition = 1;
        switchBulb = 0;
        MaxSwitchBuilb = 5;

        FunctionLampadina builb = new FunctionLampadina();

        while(repetition == 1 && switchBulb < MaxSwitchBuilb)
        {
            System.out.println(" [1] stato lampadina \n [2] cambia lo stato lampadina");
            choise = input.nextInt();

            switch (choise){
                case 1:
                    stateBuilb = builb.state();
                    System.out.println(stateBuilb);
                    break;

                case 2:
                    state = builb.click();
                    stateBuilb = builb.state();

                    switchBulb++;

                    if (switchBulb == MaxSwitchBuilb) {
                        builb.broke();
                    }
                    break;

            }

        }




    }
}