public class CompanyEmpWage {
    public String Company;
    public int empRatePerHour;
    public int numOfWorkingDays;
    public int maxHoursPeMonth;
    private int totalEmpWage;

    public void CompanyEmpWageWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPeMonth) {
        this.Company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPeMonth = maxHoursPeMonth;
    }

    public void EmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPeMonth) {
        this.Company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPeMonth = maxHoursPeMonth;
    }

    public CompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPeMonth) {
        Company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPeMonth = maxHoursPeMonth;
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

    @Override
    public String toString() {

        return "Total Emp Wage for Company: " + Company + " is: " + totalEmpWage;
    }
}
