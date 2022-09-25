package lista01.ex03;

public class Employee {
    private String name;
    private double grossSalary, tax;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getGrossSalary() {
        return grossSalary;
    }
    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }
    public double getTax() {
        return tax;
    }
    public void setTax(double tax) {
        this.tax = tax;
    }

    public double netSalary() {
        return getGrossSalary() - getTax();
    }

    public void increaseSalary(double percentage) {
        setGrossSalary(getGrossSalary() + (getGrossSalary() * (percentage / 100)));
    }

    @Override
    public String toString() {
        return String.format("%s, $ %.2f", getName(), this.netSalary());
    }
}
