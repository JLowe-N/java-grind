public enum sumatra {
    justin("cool", "28"), bucky("nice", "22"), jules("worker", "33"), kelsey("smart", "22"),
    sruthi("adventurous", "24");

    private final String desc;
    private final String year;

    sumatra(String description, String birthday) {
        desc = description;
        year = birthday;
    }

    public String getDesc() {
        return desc;
    }

    public String getYear() {
        return year;
    }
}