public class implementation {

	public static void main(String[] args) {
		Datalst<Integer> list = new Datalst<>();
		    list.add(1);
	        list.add(2);
	        list.add(3);
	        list.add(4);
	        list.add(5);
	        System.out.println(list);
	        list.remove(2);
	        System.out.println(list);
	        list.remove(3);
	        System.out.println( list.get(0) );
	        System.out.println( list.get(1) );
	        System.out.println(list.size());
	}

}