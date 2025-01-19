// zad 5
interface Authentication {
    boolean login(String username, String password);
    void logout();
    boolean resetPassword(String username, String oldPassword, String newPassword);
}
