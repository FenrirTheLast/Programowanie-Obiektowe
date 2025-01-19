// zad 5
public class UserAuthentication implements Authentication {
    @Override
    public boolean login(String username, String password){
        System.out.println("Wprowaź login: " + username);
        return true;
    }

    @Override
    public void logout(){
        System.out.println("Użytkownik wylogował się");
    }
    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword){
        System.out.println("Hasło zresetowane dla użytkownika: " + username);
        return true;
    }
}
