//What is getters and setters?
//When it will be used?
class Data{
    private String id;
    private String password;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
 
}

public class _5_GettersSetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Data obj1=new Data();
//      obj1.id="A12345";   warning id is private;  code generate error
//      obj1.password="12345"; warning password is private;  code generate error
      obj1.setId("A12345");
      obj1.getId();
      obj1.setPassword("12345");
      obj1.getPassword();
      System.out.println(obj1.getId());
      System.out.println(obj1.getPassword());

	}

}
/*
getters and setters are used when encapsulation (security)
since id,password are private ,we can not assign value for id,password inside the main class
to do this we use getters and setters
IntelliJ, Eclipse provides automatic getter and setter generate option
*/