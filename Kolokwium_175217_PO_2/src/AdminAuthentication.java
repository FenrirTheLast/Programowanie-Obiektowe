// zad 5
public class AdminAuthentication implements Authentication {
    @Override
    public boolean login(String username, String password){
        System.out.println("Admin login: " + username);
        return true;
    }

    @Override
    public void logout(){
        System.out.println("Admin wylogował się");
    }

    @Override
    public boolean resetPassword(String userName, String oldPassword, String newPassword){
        System.out.println("Hasło zmienione dla Admina: " + userName);
        return true;
    }
}
