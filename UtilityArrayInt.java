import java.util.Random;
import java.util.Arrays;

public class UtilityArrayInt {	
	
	static	int [] expansion (int[] rezult ){
		int [] newrezult = new int [rezult.length+1];
		for(int sizeNamber = 0; sizeNamber < newrezult.length; sizeNamber++ ){
			newrezult[sizeNamber] = rezult[sizeNamber];
		}
		return newrezult;	
	}
	
	static	int [] truncation (int[] rezult){
		int [] newrezult = new int [rezult.length-1];
		for(int sizeNamber = 0; sizeNamber < newrezult.length; sizeNamber++ ){
			newrezult[sizeNamber] = rezult[sizeNamber];
		}
		return newrezult;		
	}
	
	static boolean arraycompase(int[] rezult, int[] str ){
		if(Arrays.equals(rezult, str)){
			return true;			
		}
		else
			return false;
	}
	
	static int [] randomArray(int[] rezult ){
		
		Random random = new Random();
		int memoryrandom = 0;
		int memoryelement = 0;
		for (int sizeNamber = 0; sizeNamber < rezult.length; sizeNamber++ ){
			memoryrandom = random.nextInt(rezult.length);
			memoryelement = rezult[sizeNamber];
			rezult[sizeNamber] = rezult[memoryrandom];
			rezult[memoryrandom] = memoryelement;
		}
		
		return rezult;
	}

	public static void main(String[] args) {
		int one [] = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6};
		int str [] = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6};
		int [] rezult;
		int j = 0;
		rezult = UtilityArrayInt.randomArray(one);
		for(int i = 0; i < rezult.length; i++){
			j++;
			System.out.print("Elemt namber " + j);
			System.out.println(":     " +rezult[i] );
		}
	}

}
