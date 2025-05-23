package Lektion18;

import java.io.*;

public class Studiengangssplitter {
    // a)BufferedReader; readLine
    //  BufferedInputStreamReader

    public void splitStudiengaenge(String dateiname) throws MatrikelNummerException {

        try (BufferedReader br = new BufferedReader(new FileReader(dateiname));
             BufferedWriter bwWI = new BufferedWriter(new FileWriter("WInfNr.txt"));
             BufferedWriter bwINF = new BufferedWriter(new FileWriter("InfNr.txt"));
             BufferedWriter bwWEC = new BufferedWriter(new FileWriter("ECNr.txt"))
        ) {

            String line = null;
            while (true) {
                line = br.readLine();
                if (line == null) break;
                char[] czeil = line.toCharArray();

                if (czeil.length != 7 && (czeil[0] != '5' && czeil[0] != '6') || (czeil[1] != '1' && czeil[1] != '0')){
                    throw new MatrikelNummerException();

                } else{

                    if (czeil[0] == '5' && czeil[1] == '0') {
                        bwWI.write(line + "\n");
                    } else if (czeil[0] == '5' && czeil[1] == '1') {
                        bwINF.write(line + "\n");
                    } else if (czeil[0] == '6' && czeil[1] == '1') {
                        bwWEC.write(line + "\n");
                    }
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}


