package telefonomeucci;

import java.util.Scanner;

public class TelefonoMeucci {

	static int count = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String entrada = "";
		
		while (sc.hasNext()) {
			count = 0;
			entrada = sc.next();
			if (!entrada.contains("I") && !entrada.contains("V"))
				count++;
			else
				buscar(entrada);
			System.out.println(count);
		}
	}

    private static void buscar(String f) {
        String[] taula = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        boolean trobat = false;
        String res = "";

        for (int i = 1; i < 5 && i <= f.length(); i++) {
            trobat = false;
            for (int j = 0; j < 10; j++) {
                if (f.substring(0, i).equals(taula[j])) {
                    trobat = true;
                }
            }
            if (trobat) {
                res = f.substring(i, f.length());
                if (res.length() > 0) {
                    buscar(res);
                } else if (res.length() == 0) {
                    count++;
                    return;
                }
            }
        }
    }

}
