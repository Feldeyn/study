package lesson18;

public class Authenticate {
    public static void main(String[] args) {
        try {
            isCorrect("login1", "password1", "password1");
            isCorrect("login1login1login1login1login1login1", "password1password1", "password1");
            isCorrect("login1", "password1", "password2");
            isCorrect("login1", "password1password1password1password1password1password1password1",
                    "password1password1password1password1password1password1password1");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Конец!!!");
    }

    public static boolean isCorrect(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        if (login.length() > 20) {
            throw new WrongLoginException("Login - " + login + " - is wrong");
        }
        if (password.length() > 20 || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password - " + password + " - is wrong.   " +
                    "\nOr password <> confirmPassword");
        }

        return true;
    }
}
