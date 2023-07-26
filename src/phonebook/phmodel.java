package phonebook;

public class phmodel {
		String ph;
		String name;
		String mail;
		public phmodel(String name,String ph,String mail)
		{
			this.name=name;
			this.ph=ph;
			this.mail=mail;
		}
		public String getPh() {
			return ph;
		}
		public void setPh(String ph) {
			this.ph = ph;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getMail() {
			return mail;
		}
		public void setMail(String mail) {
			this.mail = mail;
		}

	}


