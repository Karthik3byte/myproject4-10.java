package accsesmod1;
import accesmod1.sameclass;
public class diff1 extends  sameclass{
    void method()
    {
                                //System.out.println( noMod_a )	;  		// Yes
				//System.out.println( pri_b )	;		// Yes
				System.out.println( pro_c )	;		// Yes
				System.out.println( pub_d )	;
    }
    public static void main(String [] args)
    {
        diff1 d = new diff1();
        d.method();
    }
}
