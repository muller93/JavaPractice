public class Group {
     private Animals[] animals;
        private int numOfGroup;
        private int jelenlegiLetszam;
        public Group(int csordaLetszam) {
            this.numOfGroup = csordaLetszam;
            this.jelenlegiLetszam = 0;
            animals = new Animals[csordaLetszam];
        }
        public boolean csordabaFogad(Animals ki) {
            if (animals[0] instanceof WaterAnimals){

            }
            if (jelenlegiLetszam < numOfGroup) {
                animals[jelenlegiLetszam] = ki;
                jelenlegiLetszam++;
                return true;
            }
            return false;
        }
        @Override
        public String toString() {
            String str = "A csordaban vannak:";
            for (int i = 0; i < jelenlegiLetszam; i++) {
                str += animals[i].toString();
            }
            return str;

}
}
