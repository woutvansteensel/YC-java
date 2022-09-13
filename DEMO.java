import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;


public class DEMO {
    //static int aantale = 0;

    public static void main(String[] args) {
       /* String zinnetje = "Er was eens een hele grote heks met een hele kleine neus en iedereen was van zo jij hebt een kleine neus en toen moest ze op de brandstapel, eind.";
           for(int x = 0; x < zinnetje.length();x++ ){
               if(zinnetje.charAt(x) == 'e'|| zinnetje.charAt(x) =='E'){
                   aantale++;
               }
        }
        System.out.println(aantale);*/
       /* int totaal =0;
        int[] optel = {23, 10, 5, 9};
            for(int x = 0; x < optel.length; x++){
                totaal += optel[x];
            }
        System.out.println(totaal);

        */

        /*
        ArrayList<Integer> lijst = new ArrayList<Integer>();
            lijst.add(23);
            lijst.add(54);
            lijst.add(12);
            lijst.add(64);
            lijst.add(234);
            lijst.add(654);
            lijst.add(27);
            lijst.add(243);
            lijst.add(546);
            lijst.add(123);
            lijst.add(0);
        int temp;
       for(int x = 0; x < 10; x++){
            if(lijst.get(x+1) < lijst.get(x)){
                temp = lijst.get(x);
                lijst.set(x , lijst.get(x+1));
                lijst.set(x + 1 , temp);
                x = 0;
            }
        }
        for (int i : lijst) {
            System.out.println(i);
        }
        */


        /*
            muziekant patrick = new trompetist();
            patrick.instrument = "trompet";
            patrick.naam = "patrick";
            patrick.speelt();
            patrick.wisselvaninsturment("fluit");
        patrick.speelt();
 */

/*
        Monteur dirk = new Monteur(new Auto(true, false, false, false));
        dirk.repareert();
*/
        /*
        Scanner myObj = new Scanner(System.in);
        System.out.println("Let me sort your next line alphebaticly");
        String userName = myObj.nextLine();
        System.out.println(userName);
        char charArray[] = userName.toCharArray();
        Arrays.sort(charArray);
        System.out.println(new String(charArray));
*/

/*
        System.out.println("===================================================================================");
        System.out.println("Welkom bij wout's mega vette lingo!");
        System.out.println("krijg je een '2' dan zit de letter op de juiste plek!");
        System.out.println("krijg je een '1' dan zit de letter in het woord maar op de verkeerde plek");
        System.out.println("krijg je een '0' dan zit de letter helaas niet in het woord");
        System.out.println("===================================================================================");
        System.out.println("Typ hier je mega coole poging tot het juiste lingo woord:");
        Lingo a = new Lingo();
        a.lingo();
        */

        }
        }



        /*
        class Lingo{
            String lingoWoord = "stoom";
            ArrayList<Integer> check = new ArrayList<Integer>();

            int[] uitslag = {0,0,0,0,0};
            char charArray[] = lingoWoord.toCharArray();
            Scanner myObj = new Scanner(System.in);
            void lingo() {
                check.add(0);
                check.add(0);
                check.add(0);
                check.add(0);
                check.add(0);
                String gebruikersInput = myObj.nextLine();
                char charArray2[] = gebruikersInput.toCharArray();
                for (int x = 0; x < charArray.length; x++) {
                        if (charArray[x] == charArray2[x]) {
                            uitslag[x] = 2;
                            System.out.print(2);
                        }
                         else {
                                for (int y = 0; y < charArray2.length; y++){
                                    if (charArray[y] == charArray2[x]) {
                                        check.set(y, 1);
                                    } else {
                                        check.set(y, 0);
                                    }
                            }
                            if (check.contains(1)){
                                uitslag[x] = 1;
                                System.out.print(1);
                            }
                            else {
                                uitslag[x] = 0;
                                System.out.print(0);
                            }
                    }
                }
                if(uitslag[0] !=2 || uitslag[1] !=2 || uitslag[2] !=2 || uitslag[3] !=2 || uitslag[4] !=2 ) {
                    System.out.println();
                    lingo();
                }
            }
        }
        */
/*
        class Monteur{
            int kosten;
            String naam;
            Auto auto;
                Monteur(Auto auto){
                    this.auto = auto;
                }
            void repareert(){
                if(!auto.motor){
                    auto.motor = true;
                    kosten +=25;
                }
                if(!auto.voorruit ){
                    auto.voorruit = true;
                    kosten +=25;
                }
                if(!auto.deur){
                    auto.deur = true;
                    kosten +=25;
                }
                if(!auto.uitlaat){
                    auto.uitlaat = true;
                    kosten +=25;
                }
                System.out.println(kosten);
                }

            }

        class Auto {
    boolean motor;
    boolean deur;
    boolean voorruit;
    boolean uitlaat;
            Auto(boolean motor, boolean deur, boolean voorruit, boolean uitlaat){
                this.motor = motor;
                this.deur = deur;
                this.voorruit = voorruit;
                this.uitlaat = uitlaat;

            }
        }
*/


        /*
         class muziekant{
            String instrument;
            String naam;
            void speelt(){
                System.out.println(naam + " speelt: doem dome doem badaaaaaaa pwoaahah. op zijn " + instrument);

            }
            void wisselvaninsturment(String nieuwInstrument){
                instrument = nieuwInstrument;
            }
        }

        class trompetist extends muziekant{
            void wisselvaninsturment(String nieuwInstrument){
                System.out.println("de trompetist wisseld");
                instrument = nieuwInstrument;

         */




