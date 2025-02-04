package Lektion9;

import Lektion10.Studenten;

public class Üb03RoomConstructor {
        private final String name;
        private final int plaetze;
        private boolean belegt;
        public Studenten[] studenten;

        public Üb03RoomConstructor(String name, int plaetze, boolean belegt) {
            this.name = name;
            this.plaetze = plaetze;
            this.belegt = belegt;
            this.studenten = new Studenten[plaetze];
        }


        public boolean getBelegt() {
            return this.belegt;
        }
        public void setBelegt(boolean belegt) {
            this.belegt = belegt;
        }

        public int getPlaetze() {
            return plaetze;
        }

        public String getName() {
            return name;
        }
    }

