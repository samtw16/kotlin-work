//COMP2850  Week 5
//StudentAccount class

package comp2850.banking

class StudentAccount(holder: String, overdraft: Int = 0) : BankAccount(holder) {
    var overdraft = 0
        set(value) {
            require(value in 0..100) { "Overdraft must be between 0 and 100" }
            field = value
        }

    init {
        //goes through the custom setter so the range check applies
        this.overdraft = overdraft
    }

    override fun withdraw(amount: Int) {
        require(amount > 0) { "Withdrawal amount must be greater than 0" }
        require(balance - amount >= -overdraft) { "Insufficient funds for withdrawal" }
        balance -= amount
    }

    //true if balance hasn't hit the bottom of the overdraft yet
    fun withdrawalsAllowed() = balance > -overdraft

    override fun toString() = "Account for $holder, balance = $balance (overdraft = $overdraft)"
}