package for_paractice;

public class Qu_1 {
	protected int Start ;
	protected int Count ;
	public Qu_1(int value) {
		this.Start = this.Count = value;
	    
	}
	public void increment () {
		Count++;
	}
	public void reset () {
		Count = Start;
	}
	public String toString () {
		return "("+Count+")";
	}
	public class AdvancedCounter extends Qu_1{
		private int amount;
		public AdvancedCounter (int value , int amount) {
			super(value);
			this.amount = amount ;
		}
		public void increment () {
			Count +=amount;
		}
	}

}
