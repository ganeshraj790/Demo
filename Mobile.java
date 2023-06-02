package defaultjava;

public class Mobile implements ElectricItems{
	public String findWorkingState(boolean isOnOff) {
		if(isOnOff==true) {
			return "It is working but display fault";
		}
		else {
			return "not working";
		}
	}
}
