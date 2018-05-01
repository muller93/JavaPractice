public class Ryzen implements CPU{
    int freq;
    int cores;

    public Ryzen(int freq, int cores) {
        this.freq = freq;
        this.cores = cores;
    }

    @Override
    public int getFreq() {
        return freq;
    }

    public void setFreq(int freq) {
        this.freq = freq;
    }

    @Override
    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }
}
