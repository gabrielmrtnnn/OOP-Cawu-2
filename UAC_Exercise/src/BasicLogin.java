
public class BasicLogin implements ILogin {
    private String name;
    private String pass;
    
    public BasicLogin(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    public String getName(){
        return name;
    }

    public String getPass(){
        return pass;
    }

    @Override
    public boolean authenticate(String name, String pass) {
        return this.name.equals(name) && this.pass.equals(pass);
    }
    
}
