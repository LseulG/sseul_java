package test5;

public class SonataArrayTest {

	public static void main(String[] args) {
		String arry[][] = { { "���", "5000", "NF", "�¿�" }, { "����", "7000", "Brilliant", "����" },
				{ "��ȫ��", "4000", "EF", "�ý�" }, { "������", "6000", "Hybrid", "�¿�" } };

		for (int i = 0; i < arry.length; i++) {
			Sonata sona = new Sonata(arry[i][0], Integer.parseInt(arry[i][1]), arry[i][2], arry[i][3]);
			System.out.println(sona.toString());
		}

	}

}
