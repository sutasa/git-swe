package scm;

public class A {
	double sarary;
	double sale;
	double result =0;
	
	public A(double salary, double com) {
		this.sarary=salary;
		this.sale =com;
	}
	public double find() {
		if(this.sale>100000) {
			this.result=(this.sale*(0.03))+this.sarary;
		}else if(this.sale>50000) {
			this.result=(this.sale*(0.02))+this.sarary;
		}else
		{
			this.result=(this.sale*(0.01))+this.sarary;
		}
		if(this.sarary < 15000 && this.sale > 100000)
		{
			this.result += 3000;
		}
		return this.result;
	}
}
