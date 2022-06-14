package exemplos;
import java.util.Scanner;
import java.util.Arrays;

public class agenda {

		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);

			int i = 0, j = 0, k = 0, linhas = 5, colunas = 5;
			String m[][] = new String[linhas][colunas];
			String x;

			for (i = 0; i < linhas; i++) {
				System.out.printf("Pessoa %d\n", (i + 1));
				System.out.print("Digite seu nome: ");
				m[i][0] = ler.nextLine();
				System.out.print("Digite seu endereco: ");
				m[i][1] = ler.nextLine();
				System.out.print("Digite seu codigo postal: ");
				m[i][2] = ler.nextLine();
				System.out.print("Digite seu bairro: ");
				m[i][3] = ler.nextLine();
				System.out.print("Digite seu telefone: ");
				m[i][4] = ler.nextLine();
				System.out.printf("\n");
			}

			for (i = 0; i < linhas; i++) {
				for (j = 0; j < linhas; j++) {

					if (m[i][0].compareTo(m[j][0]) < 0) {

						for (k = 0; k < 5; k++) {
							x = m[i][k];
							m[i][k] = m[j][k];
							m[j][k] = x;

						}
					}
				}
			}

			for (i = 0; i < linhas; i++) {
				for (j = 0; j < 1; j++) {
					System.out.printf("Pessoa %d\n", (i + 1));
					System.out.printf("Nome: %s\n", m[i][0]);
					System.out.printf("Endereco: %s\n", m[i][1]);
					System.out.printf("Codigo Postal: %s\n", m[i][2]);
					System.out.printf("Bairro: %s\n", m[i][3]);
					System.out.printf("Telefone: %s\n", m[i][4]);
					System.out.printf("\n");
				}
			}
		}
	}
