public class LoginWeb {

    static LoginService loginService = new LoginService();
    public static void main(String[] args) {
        System.out.println("进入了登录方法");
        loginService.login();
    }
}
