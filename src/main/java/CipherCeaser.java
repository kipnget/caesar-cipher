public class CipherCeaser {
    private String mName;
    private int mkey;
    // setter
    public void setTheWord(String name){
        this.mName = name;

    }
    public void setKey(int key){
        this.mkey = key;

    }

    public String getMName(){
        return this.mName;
    }

    public int getMkey(){
        return this.mkey;
    }
    //constructor
    public  CipherCeaser(String name,int key){
        mName = name;
        mkey =key;
    }
}
