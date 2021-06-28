package Arrays2;

public class lowarray {

	private long[] a;
	
	public lowarray(int size) {
		this.a = new long[size];
	}
	
	public void setElem(int j, long value) { //j is the index
		this.a[j] = value;
	}

	public long getElem(int j) {
		return this.a[j];
	}
	
	
}
