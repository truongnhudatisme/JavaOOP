package LopPair;


public class Pair<K,V> {
    private final K a;
    private final V b;

    public Pair(K a, V b) {
        this.a = a;
        this.b = b;
    }

    public boolean isPrime(){
        if(checkPrime(a) && checkPrime(b))
            return true;
        return false;
    }

    private boolean checkPrime(Object k){
        if((int) k < 2)
            return false;
        for(int i = 2; i*i <= (int) k; i++)
            if((int)k%i==0)
                return false;
        return true;
    }

    @Override
    public String toString() {
        return  a + " " + b ;
    }
    
    
}
