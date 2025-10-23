public class Phone {
    private String name;
//    private String company;
    private int price;

    public Phone(String name,  int price) {
        this.name = name;
//        this.company = company;
        this.price = price;
    }
//    public static int compare(Phone a, Phone b) {
//        if(a.getPrice() > b.getPrice())
//            return 1;
//        return -1;
//
//    }
    public String getName() {
        return name;
    }

//    public String getCompany() {
//        return company;
//    }

    public int getPrice() {
        return price;
    }

}

