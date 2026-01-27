package tema4;

public class Reloj {
    private int hr;
    private int min;
    private int sg;
    public static final int timeDf = 0;

    //constructor vacío
    public Reloj() {
        hr = timeDf;
        min = timeDf;
        sg = timeDf;
    }
    //constructor 3 parámetros
    public Reloj(int hr, int min, int sg) {
        this.hr = hr;
        this.min = min;
        this.sg = sg;
    }

    //get
    public int getHr() {return hr;}
    public int getMin() {return min;}
    public int getSg() {return sg;}
    //set
    public void setHr(int hr) {
        if (hr >=0 && hr < 24) {
            this.hr = hr;
        }
    }
    public void setMin(int min) {
        if (min >= 0 && min <= 60) {
            this.min = min;
        }
    }
    public void setSg(int sg) {
        if (sg >= 0 && sg <= 60) {
            this.sg = sg;
        }
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hr, min, sg);
    }
    public void showTime() {
        System.out.println(this.toString());
    }
}
