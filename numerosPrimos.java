/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		function(1);
	}
	public static void function(int n) {
		System.out.println(sumaPrimos(10));
	}
	public static int sumaPrimos(int n){
	    int total = 0;
	    if (n != 0){
	        if (esPrimo(n)){
	        total = n+sumaPrimos(n-1);
	        }else{
	        total = sumaPrimos(n-1);
	        }
	    }
	    return total;
	}
	public static boolean esPrimo(int n){
	    boolean esPrimobool = true;
	    if (n<2){
	        esPrimobool = true;
	        if (n == 1) esPrimobool = false;
	    }else{
	        int raiz = (int) Math.sqrt(n);
	        for (int i = 2;i <= raiz ;i++){
	            if (n % i == 0){
	                esPrimobool=false;
	                i = raiz + 1;
	            }
	        }
	    }
	    return esPrimobool;
	}
}