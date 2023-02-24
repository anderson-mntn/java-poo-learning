package caneta.src;

// Aula #05 - CEV 

public class BankAccount {
    public Integer accNumber;
    protected String accType;
    private String name;
    private long accBalance;
    private boolean status;

    public void Constructor() {
        accBalance = 0;
        status = false;
    }

    public void openAccount(String accType) {
        setAccType(accType);
        if (accType == "accType1") // accType1 earns 50 credits for open
            setAccBalance(50);
        if (accType == "accType2")
            setAccBalance(150); // accType2 earns 150 credits for open
        setStatus(true);
    };

    public void closeAccount() {
        if (getAccBalance() > 0) {
            System.out.println("Cannot Close Account, cause: Account with money.");
        } else if (getAccBalance() < 0) {
            System.out.println("Cannot Close Account, cause: Account with debits.");
        } else {
            System.out.println("Closing Account...");
            setStatus(false);
        }
    }

    public void deposit(long depositAmount) {
        long newAccBalance = accBalance + depositAmount;
        if (isStatus() == true) {
            setAccBalance(newAccBalance);
            System.out.println(
                    getName() + " Deposited: " + depositAmount + ", your account balance is now: " + getAccBalance());
        } else {
            System.out.println("Cannot close, cause: This account do not exists.");
        }
    };

    public void withdraw(long withdrawAmount) {
        if (isStatus() == true) {
            if (getAccBalance() == 0) {
                System.out.println("Could not draw, cause: Empty Balance.");
            } else {
                long newBalance = getAccBalance() - withdrawAmount;
                setAccBalance(newBalance);
                System.out.println(
                        getName() + " Withdrew : " + withdrawAmount + ", the balance is now: " + getAccBalance());
            }
        } else {
            System.out.println("Could not withdraw, cause: Account do not exists.");
        }
    };

    public void monthlyPayment() {
        int h = 0;
        if (getAccType() == "accType1")
            h = 12;
        if (getAccType() == "accType2")
            h = 20;
        setAccBalance(getAccBalance() - h);
        System.out.println(getName() + " Month Tax paid, your balance is now: " + getAccBalance());

    };

    // Constructor
    public BankAccount(Integer accNumber, String accType, String name, long accBalance, boolean status) {
        this.accNumber = accNumber;
        this.accType = accType;
        this.name = name;
        this.accBalance = accBalance;
        this.status = status;
    }

    public BankAccount(Integer accNumber, String name) {
        this.accNumber = accNumber;
        this.name = name;
    }

    // Getters and Setter
    public long getAccNumber() {
        return accNumber;
    }

    public void setaAccNumber(Integer accNumber) {
        this.accNumber = accNumber;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(long accBalance) {
        this.accBalance = accBalance;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // toString
    @Override
    public String toString() {
        return "Bank Accont [accNumber=" + accNumber + ", accType=" + accType + ", name=" + name + ", accBalance="
                + accBalance
                + ", status=" + status + "]";
    }
}
