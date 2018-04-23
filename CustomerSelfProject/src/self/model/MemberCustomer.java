package self.model;

public class MemberCustomer extends Customer {

    private double points;
    private double discountRate;

    public MemberCustomer() {
    }

    public MemberCustomer(double points, double discountRate) {
        this.points = points;
        this.discountRate = discountRate;
    }

    public MemberCustomer(String name, String surname, double points) {
        super(name, surname);
        this.points = points;

    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getDiscountRate() {
        return discountRate = 0.2;
    }

    public void setDiscountsRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public double redeemPoint2Cash(int usePoints) {
        int Pointsum = 0;
        
        if(usePoints > points){
            System.out.println("Your point are not enough");
            
            return -1;
        } else if(usePoints <= points){
            this.points = points-usePoints;
            int CountPoint = usePoints / 800;
            
            Pointsum = CountPoint*100;
            
            double leftPoint = usePoints - (CountPoint * 800); //ดูว่าเหลือที่ไม่ได้ใช้กี่ Points
           this.points += leftPoint; //เอาค่าที่ไม่ได้ใ้บวกกลับเข้าไป
        }
       
        
      return Pointsum;
    }

    @Override
    public void addPointFromBuyingTotalPrice(double buyingPrice) {
        int pointTemp = (int)buyingPrice;
        int pointreturn = 0;
            while(pointTemp >= 25){
                pointTemp = pointTemp-25;
                pointreturn++;
            }
            
            this.points = pointreturn;
            
    }

}
