package LearnJavapkg1;

class data{
    private int id;
    private String password;
    //getters and setters
    /*void setid(int id){
        this.id=id;
    }
    int getId(){
        return id;
    }
     */
    //auto generated getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}//new class created
public class EncapsulationClass20 {
    public static void main(String[] args) {
        System.out.println("Encapsulation");
        data obj=new data();//new object creared
        //obj.id=12345; //will not work
        //obj.password="12345";//will not work
        obj.setId(1234);
        obj.getId();
        obj.setPassword("12345");
        obj.getPassword();
    }
}
//encapsulation for security
//we use access modifiers to do this