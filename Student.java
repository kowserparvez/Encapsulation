package encapsulation;

public class Student {

		private int stID;
		private String SSN;
		private String DOB;
		private String stName;
		
		public String getStName() {
			return stName;
		}
		public void setStName(String stName) {
			this.stName = stName;
		}
		public int getStID() {
			return stID;
		}
		public void setStID(int stID) {
			this.stID = stID;
		}
		public String getSSN() {
			return SSN;
		}
		public void setSSN(String sSN) {
			SSN = sSN;
		}
		public String getDOB() {
			return DOB;
		}
		public void setDOB(String dOB) {
			DOB = dOB;
		}
		
		
}
