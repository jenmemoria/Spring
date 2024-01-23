package p2;

public class BatteryAA implements Battery {
	private int energy;
	
	public BatteryAA() {
		// TODO Auto-generated constructor stub
	}
	public BatteryAA(int energy) {	// 얘는 생성자잖어
		this.energy = energy;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {	// property
		this.energy = energy;
	}
	public void useEnergy() {
		this.energy -= 10;
	}
	
	
	
}
