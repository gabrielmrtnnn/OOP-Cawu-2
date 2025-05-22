public class OAuthLogin implements ILogin {
    private String token;
    
    public OAuthLogin(String token) {
        this.token = token;
    }

    public String getToken(){
        return token;
    }

    @Override
    public boolean authenticate(String username, String password) {
        return token.equals(password);
    }
}
