public class Myparent {
    private int p;

    public final int myfunction() {
        return p * p;
    }
    public int getP(){
        return p;
    }
    public void set_p(int Q) {
        p = Q;
    }
    public Myparent(int K){
        p=K;
    }
    public Myparent(){

    }
}

