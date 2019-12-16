import sun.awt.image.ImageWatched;

/**
 * Created by nextgo on 2017/10/7 0007.
 */
public class List {
    public List(){
        this.first = new LinkNode();
        this.last = new LinkNode();
        this.first.setNode(new LinkNode());
        this.last.setNode(this.first.getNode());
        this.max = new Integer(0);
    }

    public List(int[] arr){
        this();

        Integer i = this.max;
        for(; i < arr.length - 1; i++) {
            this.last.getNode().setData(arr[i]);
            this.last.getNode().setNode(new LinkNode());
            this.last.setNode(this.last.getNode().getNode());
        }

        this.last.getNode().setData(arr[i]);
        this.last.getNode().setNode(null);
        i++;
        System.out.println("--->" + this.max + "--->" + i);
    }

    public void insert(int data, int n){
        int index;
        this.last.setNode(this.first.getNode());

        for(index = 0; index < n; index++){
            this.last.setNode(this.last.getNode().getNode());
        }



    }

    public void show(){
        this.last.setNode(this.first.getNode());
        for(; this.last.getNode() != null ;
            this.last.setNode(this.last.getNode().getNode())) {
            System.out.println(this.last.getNode().getData());
        }
    }

    private LinkNode first;
    private LinkNode last;
    Integer max;
}
