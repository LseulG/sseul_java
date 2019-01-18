package test6;

public class DramaArrayTest {

	public static void main(String[] args) {
		Drama drama[] = new Drama[4];
		drama[0] = new Drama("","");
		drama[1] = new Drama("","");
		drama[2] = new Drama("","");
		drama[3] = new Drama("","");

		for (int i = 1; i < drama.length+1; i++) {
			System.out.print(i + ". ");
			System.out.println(drama[i]);
		}
	}
}
