package Interface;

public class InterfaceTest {
	
	public static void main(String[]args) {
		
	}
	
}
//interface具public 的存取權限，所有方法皆為public 實踐出來需要宣告public
interface JavaProgramer{
	void OCJP();
}
interface LinuxLPIC{
	void LPIC101();
	void LPIC102();
}
//implement interface
class SuperProgramer implements JavaProgramer, LinuxLPIC{
 public	void OCJP() {};
 public	void LPIC101() {};
 public	void LPIC102() {};
}