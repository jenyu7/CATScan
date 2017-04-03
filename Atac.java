//Tina Chen, Caleb Smith-Salzberg, Angel Ng
//Team CATScan
//APCS2 pd5
//Lab02 -- All Hands on Deque! (Not Schenectady; rather, synecdoche.)
//2017-03-31

public class Atac<T> implements Deque<T>{
    private DLLNode<T> _head;
    private DLLNode<T> _tail;
    private int size;
    
    public Atac(){
	_head = new DLLNode (null, null, null);
	_tail = _head;
	size = 0;
    }
    public void addFirst( T e ){
	DLLNode<T> toAdd = new DLLNode( e, null, null );
	if ( _head.getCargo()==null )
	    _tail = toAdd;
    else {
	    toAdd.setNext( _head );
	    _head.setPrev( toAdd );
	}
	_head = toAdd;
	size += 1;
    }
    public void addLast( T e){
	DLLNode<T> toAdd = new DLLNode( e, null, null );
	if ( _head.getCargo()==null )
	    _head = toAdd;
    else {
	_tail.setNext( toAdd);
	toAdd.setPrev(_tail);
    }
	_tail = toAdd;
	size += 1;
    }
    public T peekFirst(){
	return _head.getCargo();
    }
    public T peekLast(){
	return _tail.getCargo();
    }
    public String toString(){
	String ret = "";
	DLLNode<T> temp = new DLLNode(null, null,null);
	temp = _head;
	while (temp != null){
	    ret += temp.getCargo();
	    temp = temp.getNext();
	}
	return ret;
    }
    public static void main(String[] args){
	Atac<String> bob = new Atac<String>();
	bob.addLast("a");
	bob.addLast("b");
	bob.addFirst("z");
	System.out.println(bob);
    }
}