/**
 * Created by nextgo on 2017/10/7 0007.
 */
public class LinkNode {
    public void setData(int data){
        this.data = data;
    }
    public void setNode(LinkNode node){
        this.node = node;
    }
    public int getData(){
        return this.data;
    }
    public LinkNode getNode(){
        return this.node;
    }

    private int data;
    private LinkNode node;
}
