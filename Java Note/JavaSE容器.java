/**
 * 容器1136  一个图一个类三个知识点六个接口
 *          Collecction                                
 *     |                 |                
 *    Set                List                         Map 
 *     |               |         |                    |
 * HashSet      LinkedList     ArrayList            HashMap
 *@Collection定义了存取一组对象的方法
    * Set中的数据对象没有顺序且不可以重复
    * List中的数据对象有顺序且可以重复
 *@Map接口定义了存储键值对的映射的方法
 */
Collection接口所定义的方法：
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