public class Main {
    public static void main(String[] args) {


// 10 + 0.0 * 20 = 0; = 10;
// 10 + 0.99 * (20 - 10) = 10; = 20;
// random skaicius nuo iki
        int min = 10;
        int max = 20;
        System.out.println(min + Math.round(Math.random() * (max - min)));
        System.out.println("<" + 5 + ">");

// uzduotys 03.13

        String manovardas = "Vaida";
        String pavarde = "Ziuraitiene";
        int gimimometai = 1985;
        int metai = 2024;

        System.out.println(" as esu " + manovardas + " " + pavarde + " man yra " + (metai - gimimometai) + " metu ");

// 2kintamieji. su Math.random priskirti reiksmes nuo 0 iki 4.
// didesne pdalinti is mazesnes.
// atspaudinti rez suapvalinta iki 2sk po kablelio

        int rndNum = (int) Math.round(Math.random() * 4);
        int rndNum1 = (int) Math.round(Math.random() * 4);
        rndNum = 3;
        rndNum1 = 4;

        System.out.println(rndNum + " " + rndNum1);
        if (rndNum != 0 && rndNum1 != 0) {
            if (rndNum < rndNum1) {
                System.out.println(Math.round((double) rndNum1 / rndNum * 200) / 200.0);
            } else {
                System.out.println(rndNum1 / rndNum);
            }
        } else {
            System.out.println(" / 0 no no");
        }

        int n1 = (int) Math.round(Math.random() * 25); //10 5
        int n2 = (int) Math.round(Math.random() * 25); //9  9
        int n3 = (int) Math.round(Math.random() * 25);// 5  10
        n1 = 50;
        n2 = 50;
        n3 = 50;
        System.out.println(n1 + " " + n2 + " " + n3 + " ");
        if ((n1 > n2 && n2 > n3) || (n1 < n2 && n2 < n3)) {
            System.out.println(n2 + " yra vidurinis");
        }
        if ((n2 > n1 && n1 > n3) || (n2 < n1 && n1 < n3)) {
            System.out.println(n1 + " yra vidurinis");
        }
        if ((n2 > n3 && n3 > n1) || (n2 < n3 && n3 < n1)) {
            System.out.println(n3 + " yra vidurinis");
        }
        if ((n1 == n2 || n2 == n3 || n1 == n3)) {
            System.out.println("vidurinio nera");
        }


// 4.a uzduotis. trikampis.
        min = 1;
        max = 10;
        System.out.println();
        int a = (int) (min + Math.round(Math.random() * (max - min)));
        int b = (int) (min + Math.round(Math.random() * (max - min)));
        int c = (int) (min + Math.round(Math.random() * (max - min)));
        System.out.println(a + " " + b + " " + c);
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("trikampis");
        } else {
            System.out.println("ne trikampis");
        }


//5.  uzduotis
        min = 0;
        max = 2;
        System.out.println();
        int a1 = (int) (min + Math.round(Math.random() * (max - min))); //012
        int b1 = (int) (min + Math.round(Math.random() * (max - min)));//012
        int c1 = (int) (min + Math.round(Math.random() * (max - min)));//012
        int d1 = (int) (min + Math.round(Math.random() * (max - min)));//012

        int countZeros = 0;
        int countOnes = 0;
        int countTwos = 0;

//        countZeros = countZeros + 1;
//        countZeros = countZeros + 1;
//        countZeros = countZeros + 10;
//        countZeros = countZeros - 8;

//        countZeros = countZeros + 5;
//        countZeros += 5;
//        countZeros -= 5;
//        countZeros *= 5;
//        countZeros /= 5;
//        countZeros++;
//        countZeros++;
//        countZeros--;

        if (a1 == 0) {
            countZeros++;
        }
        if (b1 == 0) {
            countZeros++;
        }
        if (c1 == 0) {
            countZeros++;
        }
        if (d1 == 0) {
            countZeros++;
        }
        if (a1 == 1) {
            countOnes++;
        }
        if (b1 == 1) {
            countOnes++;
        }
        if (c1 == 1) {
            countOnes++;
        }
        if (d1 == 1) {
            countOnes++;
        }
        if (a1 == 2) {
            countTwos++;
        }
        if (b1 == 2) {
            countTwos++;
        }
        if (c1 == 2) {
            countTwos++;
        }
        if (d1 == 2) {
            countTwos++;
        }
        System.out.println(countZeros + " " + countOnes + " " + countTwos);
//6a uzduotis
        // Naudokite funkcija Math.random(). Sukurkite ir atspausdinkite 3 skaičius nuo -10 iki 10.
        // Skaičiai mažesni už 0 turi būti  laužtiniuose skliaustuose [], 0 -  (), didesni už 0 {}.   [-4],  (0),  {7}

        min = -10;
        max = 10;

        double A = (min + Math.random() * (max - min));
        double B = (min + Math.random() * (max - min));
        double C = (min + Math.random() * (max - min));
        int sveikasA = (int) Math.round((min + Math.random() * (max - min)));
        int sveikasB = (int) Math.round(B);
        int sveikasC = (int) Math.round(C);


        funkcija(sveikasA);
        funkcija(sveikasB);
        funkcija(sveikasC);

////        System.out.println( "MANO KINTAMASISYRA" + sveikasA );
//        if (sveikasA < 0 ) {
//            System.out.println("[" + sveikasA + "]");
//        } else if (sveikasA==0) {
//            System.out.println("(" + sveikasA + ")");
//        }
//        else {
//            System.out.println("{" + sveikasA + "}");
//        }

//7.a
        min = 5;
        max = 3000;
        int kaina = 1;
        int nuolaida = 0;
        int zvakes = (int) (min + Math.random() * (max - min));

        if (zvakes > 1000 && zvakes <= 2000) {
            nuolaida = 3;
        }
        if (zvakes > 2000) {
            nuolaida = 4;
        }
        System.out.println("perkamu zvakiu kiekis " + zvakes + ". Kaina:" + zvakes * kaina * ((100 - nuolaida) / 100.0));

//8as
        min = 0;
        max = 100;
        int pirmas = (int) Math.round(Math.random() * 100);
        int antras = (int) Math.round(Math.random() * 100);
        int trecias = (int) Math.round(Math.random() * 100);

        System.out.println(pirmas);
        System.out.println(antras);
        System.out.println(trecias);

        System.out.println("vidurkis" + Math.round((pirmas + antras + trecias) / 3.0));

        if(pirmas>=10 && pirmas <=90){

        }


//        --global user.name "vaiziu"
//        --global uzer.email "vaida.ziuraitiene@gmail.com"
        
//

//
//
// if(){}
// else(){}
// for(){}
// while(){}
// function(){}
// switch(){}

    }


    public static void funkcija(int skaicius) {
        System.out.println("MANO KINTAMASISYRA" + skaicius);
        if (skaicius < 0) {
            System.out.println("[" + skaicius + "]");
        } else if (skaicius == 0) {
            System.out.println("(" + skaicius + ")");
        } else {
            System.out.println("{" + skaicius + "}");
        }


    }
}