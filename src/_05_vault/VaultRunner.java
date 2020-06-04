package _05_vault;

public class VaultRunner {
public static void main(String[] args) {
	
	
Vault safe = new Vault(999999);
jamesBond james = new jamesBond();
System.out.println(james.findCode(safe));
	
}
}
