import java.util.Comparator;

public class compare_base implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		if(o1.compareToIgnoreCase(o2) < 0) {
			return -1;
		}else if(o2.compareToIgnoreCase(o1) > 0) {
			return 1;
		}else {
			return 0;
		}
	}
	

}
