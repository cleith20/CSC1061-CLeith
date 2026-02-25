import java.util.Iterator;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		
		List<Integer> myArrList = new MyDoubleLinkedList<>();

		myArrList.add(1);
		myArrList.add(4);
		myArrList.add(9);
		myArrList.add(7);
		myArrList.add(9);
	
		System.out.println(myArrList.lastIndexOf(9));
		System.out.println(myArrList.indexOf(7));
		System.out.println(myArrList.contains(1));
		for(int i = 0; i < myArrList.size(); i++) {
			System.out.print(myArrList.get(i) + " ");
		}
//		System.out.println();
//		for(Integer num : myArrList) {
//			System.out.print(num + " ");
//		}
//		System.out.println();
//		
//		Iterator iter = myArrList.iterator();
//		while(iter.hasNext()) {
//			Integer ans = (Integer)iter.next();
//			System.out.print(ans + " ");
//		}
	}

}
