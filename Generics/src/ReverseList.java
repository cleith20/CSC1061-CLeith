import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReverseList<E> {

	// list of generics
	private List<E> list = new LinkedList<E>();
	
	public void add(E input) {
		list.add(0, input);
	}
	
	public List<E> getList(){
		return list;
	}
}
