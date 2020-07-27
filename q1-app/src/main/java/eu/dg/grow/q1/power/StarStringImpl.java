package eu.dg.grow.q1.power;

import eu.dg.grow.q1.math.PowerOf2;

/**
 * Created by doki on 7/24/20.
 */
public class StarStringImpl implements StarString {

    private static final char STAR ='*';
   /**
    * There is a bug in JDK7 and JDK8 and array can not be initialized with Integer.MAX_VALUE
    * Also this is very specific for the environment i.e Integer.MAX_VALUE - 2 might not works on some environments!
    * TODO It is good STRING_BUILDER_LIMIT = Integer.MAX_VALUE/2 or similar to guarantee execution on different env or diff algorithm should be apply bellow!
    * */
    private static final int STRING_BUILDER_LIMIT = Integer.MAX_VALUE - 2;

    @Override
    public String starString(int n) {
        String result = "";
        StringBuilder sb = new StringBuilder(STRING_BUILDER_LIMIT);
        PowerOf2 power = new PowerOf2();
        int powerOf2 = power.pow2(n);

        for(int i=0; i < powerOf2;  i++ ){
            if (sb.capacity()> sb.length()){
                sb.append(STAR);
            }else {
                result = result + sb.toString();
                sb.setLength(0);
                sb.trimToSize();
                sb.append(STAR);
            }
        }
        return result + sb.toString();
    }

}