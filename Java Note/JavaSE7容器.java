/**
 * 容器1136  一个图一个类三个知识点六个接口
 *@一图
 *          Collecction                                
 *     |                 |                
 *    Set                List                            Map 
 *     |               |         |                    |       |
 * HashSet      LinkedList     ArrayList            TreeMap HashMap
  *@Collection定义了存取一组对象的方法
    * Set中的数据对象没有顺序且不可以重复
    * List中的数据对象有顺序且可以重复
  *@Map接口定义了存储键值对的映射的方法
 *@一类Colections
 */
@三个知识点
	//for-each循环除了简单遍历集合所有元素外，不建议用For循环
	//Generic//泛型
	//Auto-boxing/unboxing
@六接口
@Collection接口所定义的方法：
	int size();
	boolean isEmpty();
	void clear();
	boolean contains(Object element);
	boolean add(Object element);
	boolean remove(Object element);
	Iterator iterator();
	boolean containsAll(Object element);
	boolean addAll(Object element);
	boolean removeAll(Object element);
	Object [] toArray();
@Iterator接口
	boolean hasNext；
	Object next;
	void remove;
	Collection c =new HashSet();
	Iterator i=c.iterator();
@for-each循环除了简单遍历集合所有元素外，不建议用For循环
@Set接口
	retainAll();//求交集
	addAll();
@List接口//ArrayList读快改慢;LinkedListed改快读慢;
//Collections类为其提供方法
	Object  get(int index);
	Object  set(int index,Object element);
	void add(int index,Object element);
	Object remove(int index);
	int indexOf(Object o);
	int lastIndexOf(Object o);
	//List算法
	void sort(List);
	void shuffle(List);
	void reverse(List);//逆向排列
	void fill(List,Object);
	void copy(List dest,List src);
	int binarySearch(List,Object);//采用折半查找的方法查找特定对象
@Comparable接口
	public int compareTo(Object obj);
@Map接口
	//实现类有HashMap和TreeMap
	//用来存储键值对
	//通过键来标识，所以简直不能重复
	//Auto-Boxing-Unboxing
	Object put(Object key,Object value);
	Object get(Object key);
	Object remove(Object key);
	boolean containsKey(Object key);
	boolean containsValue(Object value);
	int size();
	boolean isEmpty();
	void putAll(Map t);
	void clear();