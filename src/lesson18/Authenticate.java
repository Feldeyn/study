package lesson18;

public class Authenticate {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        isCorrect("login1", "password1", "password1");
        isCorrect("login1login1login1login1login1login1", "password1password1",
                "password1");
        isCorrect("login1", "password1", "password2");
        isCorrect("login1", "password1password1password1password1password1password1password1",
                "password1password1password1password1password1password1password1");
        System.out.println("Конец!!!");
    }

    public static boolean isCorrect(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        try {
            if (login.length() > 20) {
                throw new WrongLoginException("Login - " + login + " - is wrong");
            }
            if (password.length() > 20 || !password.equals(confirmPassword)) {
                throw new WrongPasswordException("Password - " + password + " - is wrong.   " +
                        "Or password <> confirmPassword");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Login - " +login+",  пароль - " + password +
                    ",  подтверждение пароля - " + confirmPassword);
        }
        return true;
    }
}
