package zenmobile.beans.vo;

public class AccountDTO {
   private String acctName;
   private String acctNbr;
   private String acctType;
   private String acctAmt;
   private int accountId;
   


   public AccountDTO() {
	   
   }
  
    public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	
	public String getAcctName() {
		return acctName;
	}
	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}
	public String getAcctNbr() {
		return acctNbr;
	}
	public void setAcctNbr(String acctNbr) {
		this.acctNbr = acctNbr;
	}
	public String getAcctType() {
		return acctType;
	}
	public void setAcctType(String acctType) {
		this.acctType = acctType;
	}
	public String getAcctAmt() {
		return acctAmt;
	}
	public void setAcctAmt(String acctAmt) {
		this.acctAmt = acctAmt;
	}
   
}
