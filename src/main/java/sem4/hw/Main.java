package sem4.hw;

public class Main {
    public static void main(String[] args) {
        String[][] users = {
                {"Ivan", "pass", "pass"},
                {"user1231superUsers1986", "qwerty", "qwerty"},
                {"user1", "qwerty", "Qwerty"},
                {"user2", "qwerty123121413542356346", "qwerty"},
                {"user3", "qwerty2123123141fadfasdgasg", "qwerty2123123141fadfasdgasg"}
        };

        for (String[] user : users) {
            try {
                System.out.println(checkLoginPassword(user[0], user[1], user[2]));
            }catch (WrongLoginException e){
                System.out.println(e.getMessage());
            }catch (WrongPasswordException e){
                System.out.println(e.getMessage());
            }

        }


    }

    static boolean checkLoginPassword(String login, String pass, String corrPass) {
        if (login.length() >= 20) throw new WrongLoginException(login, login.length());
        boolean correctPass = pass.equals(corrPass);
        if (pass.length() >= 20 || !correctPass) throw new WrongPasswordException(pass.length(), correctPass);
        return true;
    }


    //       Исключение для некорректного логина
    public static class WrongLoginException extends RuntimeException {

        //        Длина логина
        private int loginLenght;
        private String login;

        public WrongLoginException(String login, int loginLenght) {

//            вызов конструктора родителя, для заполнения стектрейса
            super();

            this.loginLenght = loginLenght;
            this.login = login;
        }

        //        переопределение метода getMessage
        @Override
        public String getMessage() {
            return String.format("Введённый логин \"%s\" не корректен, должно быть менее 20 символов, " +
                    "введено %d символов.", login, loginLenght);
        }
    }

    public static class WrongPasswordException extends RuntimeException {
        //        длина пароля
        private int passLenght;

        //        совпадают ли пароли
        private boolean correctPass;

        public WrongPasswordException(int passLenght, boolean correctPass) {
            super();
            this.passLenght = passLenght;
            this.correctPass = correctPass;
        }

        //        Переопределение метода getMessage
        @Override
        public String getMessage() {
            String word = (correctPass) ? "" : "не ";
            String word2 = (passLenght < 20) ? "" : "не ";
            return String.format("Введённые пароли %sсовпадают, " +
                    "длина пароля должна быть менее 20 символов: %sсоблюдается.", word, word2);
        }
    }
}

