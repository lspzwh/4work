package MyList;

public class Mylist<T> {
    private Object[] Arry;
    private int size=0;
    public int getSize(){
        return size;
    }////////////元素个数
    public void setSize(int size){
        this.size=size;
    }
    public void Arry(int x) {
        if (x >= 0) Arry = new Object[x];
        else {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }System.out.println("已设置默认值");
            Arry =new Object[0];
        }
    }///////////加
    public void add(Object obj){
         if(Arry.length<=size){
             Object[] ne =new Object[size+1];
             ne[size]=obj;
             System.arraycopy(Arry,0,ne,0,Arry.length);
             Arry=ne;
         }else Arry[size]=obj;
         size++;
    }////////////查
    public Object get(int index){
        return Arry[index];
    }
    ////////////删指定位置
    public void remove(int index){
        if(size-1-index>=0&&index>0){
            System.arraycopy(Arry,index+1,Arry,index,size-1-index);
        }
        size--;
    }
    //////////////////删除指定元素
    public void remove(Object obj){
        for (int i = 0; i < size; i++) {
            if(get(i).equals(obj))
                remove(i);
        }
    }/////////指定增加
    public void add(int index,Object obj){
        if(index<=size-1&&index>=0){
            Arry[index]=obj;

        }
    }/////////查
    public void find(Object obj){
        for (int i = 0; i < size; i++) {
            if(get(i).equals(obj))
                System.out.println(i);
        }
    }
    //////////改
    public void set(int index,Object obj){
        Arry[index]=obj;
    }
    class Itr implements Iterator<T>{

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public T next() {
            return null;
        }
        public Iterator iterator()
        {return new Itr();}
    }


}
