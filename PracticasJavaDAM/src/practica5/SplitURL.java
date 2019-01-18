package practica5;

public class SplitURL {
	private static String URL = "http://www.devbg.org/forum/index.php";

	public static void main(String[] args) {
		separarURL(URL);
	}

	public static void separarURL(String URL) {
		String[] resultado = URL.split("(://)|(?=/)", 3);
		for (String url : resultado) {
			System.out.println(url);
		}
	}

}
