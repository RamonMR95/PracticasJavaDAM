package practica3;

import java.util.*;

/**
 * BannerLetraParametro.java 
 * Ejercicio 20 violeta 
 * Funcion que pide un parametro de tipo char y devuelve una cadena de caracteres
 * @author Ramon Moñino Rubio 
 * 2018.09.28
 */

public class BannerLetraParametro {

	public static void main(String[] args) {
		System.out.println("Introduce una letra:  ");
		System.out.println("\n"+bannerLetra(pedirLetra()));

	}

	public static String bannerLetra(char caracter) {
		String cadena = null;

		switch (caracter) {
		case 'A':
			cadena = "AAAAAAA\nA     A\nA     A\nAAAAAAA\nA     A\nA     A\nA     A\n";
			break;
		case 'B':
			cadena = "BBBBBB \n" + "B     B\n" + "BBBBBB\n" + "BBBBBB\n" + "B     B\n" + "BBBBBB \n";
			break;
		case 'C':
			cadena = "CCCCCCC\n" + "C\n" + "C\n" + "C\n" + "C\n" + "C\n" + "CCCCCCC\n";
			break;
		case 'D':
			cadena = "D \n" + "D  D\n" + "D    D\n" + "D     D\n" + "D    D\n" + "D  D\n" + "D ";
			break;
		case 'E':
			cadena = "EEEEEEE\n" + "E\n" + "E\n" + "EEEEEEE\n" + "E\n" + "E\n" + "EEEEEEE";
			break;
		case 'F':
			cadena = "FFFFFFF\n" + "F\n" + "F\n" + "FFFFFFF\n" + "F\n" + "F\n" + "F\n";
			break;
		case 'G':
			cadena = "GGGGGGG\n" + "G     G\n" + "G\n" + "G   GGG\n" + "G  G  G\n" + "G     G\n" + "GGGGGGG";
			break;
		case 'H':
			cadena = "H     H\n" + "H     H\n" + "H     H\n" + "HHHHHHH\n" + "H     H\n" + "H     H\n" + "H     H\n";
			break;
		case 'I':
			cadena = "  III  \n" + "   I\n" + "   I\n" + "   I\n" + "   I\n" + "   I\n" + "  III  \n";
			break;
		case 'J':
			cadena = "      J\n" + "      J\n" + "      J\n" + "      J\n" + "     J \n" + " JJJ  \n";
			break;
		case 'K':
			cadena = "K     K\n" + "K    K\n" + "K  K\n" + "K K\n" + "K  K\n" + "K    K\n" + "K     K\n";
			break;
		case 'L':
			cadena = "L\n" + "L\n" + "L\n" + "L\n" + "L\n" + "L\n" + "LLLLLLL";
			break;
		case 'M':
			cadena = "M     M\n" + "MM   MM\n" + "M M M M\n" + "M  M  M\n" + "M     M\n" + "M     M\n" + "M     M\n";
			break;
		case 'N':
			cadena = "N     N\n" + "NN    N\n" + "N N   N\n" + "N  N  N\n" + "N   N N\n" + "N    NN\n" + "N     N\n";
			break;
		case 'Ñ':
			cadena = "  ÑÑÑ  \n" + "ÑÑ    Ñ\n" + "Ñ Ñ   Ñ\n" + "Ñ  Ñ  Ñ\n" + "Ñ   Ñ Ñ\n" + "Ñ    ÑÑ\n" + "Ñ     Ñ\n";
			break;
		case 'O':
			cadena = " OOOOO \n" + "O     O\n" + "O     O\n" + "O     O\n" + "O     O\n" + "O     O\n" + " OOOOO \n";
			break;
		case 'P':
			cadena = "PPPPPPP\n" + "P     P\n" + "P     P\n" + "PPPPPPP\n" + "P\n" + "P\n" + "P\n";
			break;
		case 'R':
			cadena = "RRRRRRR\n" + "R     R\n" + "R     R\n" + "RRRRRRR\n" + "R R\n" + "R  R\n" + "R    R\n";
			break;
		case 'S':
			cadena = " SSSSSS\n" + "SS\n" + "S\n" + "SSSSSSS\n" + "      S\n" + "     S \n" + "SSSSS  \n";
			break;
		case 'T':
			cadena = "TTTTTTT\n" + "   T\n" + "   T\n" + "   T\n" + "   T\n" + "   T\n" + "   T\n";
			break;
		case 'U':
			cadena = "U     U\n" + "U     U\n" + "U     U\n" + "U     U\n" + "U     U\n" + "U     U\n" + " UUUUU \n";
			break;
		case 'V':
			cadena = "V     V\n" + "V     V\n" + "V     V\n" + "V     V\n" + " V   V \n" + "  V V  \n" + "   V   \n";
			break;
		case 'W':
			cadena = "W     W\n" + "W     W\n" + "W     W\n" + "W  W  W\n" + "W W W W\n" + "WW   WW\n" + "W     W\n";
			break;
		case 'X':
			cadena = "X     X\n" + " X   X \n" + "  X X  \n" + "   X   \n" + "  X X  \n" + " X   X \n" + "X     X\n";
			break;
		case 'Y':
			cadena = "Y     Y\n" + " Y   Y \n" + "  Y Y  \n" + "   Y   \n" + "   Y   \n" + "   Y   \n" + "   Y   \n";
			break;
		case 'Z':
			cadena = "ZZZZZZZ\n" + "     Z \n" + "    Z  \n" + "   Z   \n" + "  Z    \n" + " Z     \n" + "ZZZZZZZ\n";
			break;

		}
		return cadena;
	}

	public static char pedirLetra() {
		return new Scanner(System.in).next().toUpperCase().charAt(0);
	}

}
