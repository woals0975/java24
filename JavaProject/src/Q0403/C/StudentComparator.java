package Q0403.C;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

	public int compare(Student a, Student b) {
		if (a.sno < b.sno)
			return -1;
		else if (a.sno == b.sno)
			return 0;
		else
			return 1;
	}

}
