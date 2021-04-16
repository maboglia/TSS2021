package logica;

public class MCD {

	public static void main(String[] args) {
		int mcd = mcd(12,21);//3
	}

	private static int mcd(int i, int j) {
		
		if(i == j)
			return i;
		else if (i > j)
			return mcd(i-j,j);
		else
			return mcd(i, j-i);
		
	}
	
	
}
