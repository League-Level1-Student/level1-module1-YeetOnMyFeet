package _05_vault;

public class Vault {

	private int secret = 0;
	Vault(int variable){
		secret = variable;
	}
	boolean tryCode(int combination) {
		if (combination == secret) {
			return true;
		}
		
			return false;
		
	}
	 

}

