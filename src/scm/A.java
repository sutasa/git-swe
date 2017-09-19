package scm;

public class A {
	double sarary;
	double sale;
	double result;
	public A(double sarary,double sale) {
		this.sarary=sarary;
		this.sale =sale;
	}
	public double find() {
		if(this.sale>50000) {
			this.result=(this.sale*(0.03))+this.sarary;
		}else if(this.sale>25000) {
			this.result=(this.sale*(0.02))+this.sarary;
		}else
		{
			this.result=(this.sale*(0.01))+this.sarary;
		}
		return this.result;
	}
}
