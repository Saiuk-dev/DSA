package OOPS;

public class Oops {
    public static void main(String[] args) {

        Bankaccount myacc = new Bankaccount();

        myacc.username = "Sai Ukarande";
        myacc.setpassword("abcdefg");
        System.out.println(myacc.getpassword());
    }
}

 class Bankaccount {

    public String username;

    private String password;
    public void setpassword(String pwd){
        password = pwd;
    }

    public String getpassword(){
        return password;
    }
}