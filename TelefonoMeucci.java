/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telefonomeucci;

/**
 *
 * @author pau
 */
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


}