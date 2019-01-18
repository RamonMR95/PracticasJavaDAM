package practica4;
//TODO
public class BusquedaBinRec {
public static int buscarBinariaRec(int[]vec, int num) {
	int n = vec.length;
	int inf = 1;
	int sup = n-1;
	int med = (inf+sup)/2;
	
	if(inf>sup) {
		return -1;
	}else {
		if(num==vec[med]) {
			return med;
		}else if(num<vec[med]){
				med = med-1;
				return buscarBinariaRec(vec, num);
			}else {
				med = med+1;
				return buscarBinariaRec(vec, num);
			}
		}
	}
	

	public static void main(String[] args) {
		int[]vector= {1,2,3,4,5};
		buscarBinariaRec(vector, 5);

	}

}
