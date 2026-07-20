package Practice;

final public class BankAccountInfo {
    private final String accountHolderName;
    private final long accountNumber;
    private final String branchName;

    public BankAccountInfo(String accountHolderName,long accountNumber,String branchName){
        if(accountHolderName==null || accountHolderName.isBlank()){
            throw new IllegalArgumentException("account name cannot be empty.");

        }
        if (accountNumber<=0){
            throw new IllegalArgumentException("account number must be positive");
        }
        if(branchName==null || branchName.isBlank()){
            throw new IllegalArgumentException("Branch name cannot be empty.");
        }
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        this.branchName=branchName;
    }
public String getAccountHolderName(){
      return accountHolderName;
}
public long getAccountNumber(){
        return accountNumber;
}
public String getBranchName(){
        return branchName;
}
}
