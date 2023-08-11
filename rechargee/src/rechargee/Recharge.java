package rechargee;

public class Recharge {
	
	    int customerId;
	    float amount;
	    String validDate;
		public Recharge(int customerId, float amount, String validDate) {
			super();
			this.customerId = customerId;
			this.amount = amount;
			this.validDate = validDate;
		}
		public int getCustomerId() {
			return customerId;
		}
		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}
		public float getAmount() {
			return amount;
		}
		public void setAmount(float amount) {
			this.amount = amount;
		}
		public String getValidDate() {
			return validDate;
		}
		public void setValidDate(String validDate) {
			this.validDate = validDate;
		}

	    
		public String toString(){
			return "details=customerId="+customerId+",Amount="+amount+",validDate="+validDate+"";
		}

}
