
public class TestaContaComExcecaoChecked {

	public static void main(String[] args) {

		Conta2 c = new Conta2();
		try {
			c.deposita();
		} catch (MinhaExcecao ex) {
			System.out.println("Tratamento.....");
		}
	}

}
