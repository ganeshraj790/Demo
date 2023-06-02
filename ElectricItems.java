package defaultjava;

public interface ElectricItems {	
	public default String findWorkingState(boolean isOnOff) {
		if(isOnOff==true) {
			return "It is working";
		}
		else {
			return "not working";
		}
	}

}
