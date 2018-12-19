package windowBuilderProject;

public class Start1 {
	Login login;
	Test1 test1;

	public static void main(String[] args) {
		Start1 main = new Start1();
		main.login = new Login();
		main.login.setMain(main); 
	}
	
	public void showMainFrame() {
		login.dispose();
		this.test1 = new Test1();
	} 
}