package eu.dg.grow.q1.math;


/**
 * Created by doki on 7/24/20.
 */
public class PowerOf2 {

    private static final int MATRIX_LENGTH = 10;
    private static final int[] MATRIX = new int[] {1,2,4,8,16,32,64,128,256,512,1024};// 2^0 - 2^10

    public int pow2(int n) {
        if (n != 0)
            return (2 * pow2(n - 1));
        else
            return 1;
    }


    /**
     *  2^36 =  2^10 * 2^10 * 2^10 *2^6
     * */
    public long pow2matrix(int n){
        long result = 1l;
        if( 0 == n ) return result;
        if ( MATRIX_LENGTH > n ) return MATRIX[n];
        for(int x = 0; x < n / MATRIX_LENGTH; x++ ){
            result = result * MATRIX[MATRIX_LENGTH];
        }
        return  result * MATRIX[(n % MATRIX_LENGTH)];
    }


//    public long pow2Iterate(int n) {
//        long result = 1l;
//        if(0 == n ) return result;
//        for (int i=1; i < n; i++){
//            result = result*2;
//        }
//        return result;
//    }


//    public long pow2Shift(int n) {
//        return (1 << n) ;
//    }

}