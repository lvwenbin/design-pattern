package Iterator;

public class MyIterator implements Iterator{
 private Collection collection;
 private int index=-1;
 
 public MyIterator(Collection collection)
 {
	 this.collection=collection;
 }
	public Object previous() {
	if(index>0)
	{index--;
		
	}
		return collection.get(index);
	}

	public Object next() {
		if(collection.size()-1>index)
		{index++;
			
		}
		return collection.get(index);
	}

	public boolean hasNext() {
		if(collection.size()-1>index){
		
		return true;
	}
		else{
			return false;
		}
	}

}
