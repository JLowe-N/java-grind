public class sumatra {
    private String girlName;

    public sumatra(String name) {
        girlName = name;
    }
    public void setName(String name){
        girlName = name;
    }
    public String getName(){
        return girlName;
    }
    public void saying() {
        System.out.printf("Your favorite person is %s", getName());
    }
}
