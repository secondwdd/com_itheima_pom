public class LoginService {
    LoginDao loginDao = new LoginDao();
    public void login(){
        System.out.println("进入了service方法");
        loginDao.login();
    }
}
