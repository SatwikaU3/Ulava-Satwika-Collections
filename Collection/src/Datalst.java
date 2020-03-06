import java.util.Arrays;

public class Datalst <lis> {
	private int size=0;
	private static final int CAPTY=10;
	private Object element[];
	public Datalst()
	{
        element = new Object[CAPTY];
    }
	public void add(lis data)
	{
		if (size == element.length) {
            ensure();
        }
		element[size++]=data;
	}
	public int size()
	{
		return size;
	}
	public lis remove(int i)
	{
		if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
		 Object list_item = element[i];
	        int num_elemt = element.length - ( i + 1 ) ;
	        System.arraycopy( element, i + 1, element, i, num_elemt ) ;
	        size--;
	        return (lis) list_item;
	}
	public lis get(int i) {
		if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (lis) element[i];
    }
	public String toString() 
    {
         StringBuilder sb = new StringBuilder();
         sb.append('[');
         for(int i = 0; i < size ;i++) {
             sb.append(element[i].toString());
             if(i<size-1){
                 sb.append(",");
             }
         }
         sb.append(']');
         return sb.toString();
    }
	private void ensure() {
        int newSize = element.length * 2;
        element = Arrays.copyOf(element, newSize);
    }
}
