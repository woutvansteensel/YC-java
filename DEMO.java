import java.lang.reflect.Array;

public class DEMO {
    //static int aantale = 0;
    public static void main(String[] args){
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
        int lijstplek = 0;
        int[] lijst = {23,54,12,64,234,654,27,243,546,123};
        int[] lijstsort;
        int temp;
        for(int x = 0; x < lijst.length; x++){
            if(lijst[x] < lijst[x+1]){
                temp = lijst[x-1];
                Array.set(lijst, lijst[x], lijst[x-1]);
                Array.set(lijst, temp, lijst[x]);
                x = 0;
            }
        }
        System.out.println(lijst);

         */
            muziekant patrick = new trompetist();
            patrick.instrument = "trompet";
            patrick.naam = "patrick";
            patrick.speelt();
            patrick.wisselvaninsturment("fluit");
        patrick.speelt();
            }
        }
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
            }
            }



