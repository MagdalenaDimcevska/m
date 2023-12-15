package jasiti;
public class Student {
int ib;
String ime;
int s;
Student(int i, String n){
	ib=i;
	ime=n;
}
	Student(int ib, String ime, int s) {
	this.ib = ib;
	this.ime = ime;
	this.s = s;
}
	public String toString() {
		return "Student [ib=" + ib + ", ime=" + ime + ", s=" + s + "]";
	}
}