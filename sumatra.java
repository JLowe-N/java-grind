public class sumatra {
    private String name;
    private costarican birthday;

    public sumatra(String theName, costarican theDate) {
        name = theName;
        birthday = theDate;
    }

    public String toString() {
        return String.format("My name is %s, my birthday is %s", name, birthday);
    }

}
