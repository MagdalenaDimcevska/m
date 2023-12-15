package jasiti;
public class Student_3novaklasa {
int index;
String ime;
static String fakultet="ITS";
Student_3novaklasa(int i,String n){
	index=i;
	ime=n;
}
void display() {
	System.out.println(index+" "+ime+" "+fakultet);
}
}