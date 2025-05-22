
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
    public boolean authenticate(String username, String password) {
        return name.equals(username) && pass.equals(password);
    }
    
}
