package class10;

public class T1 {
    public static void main(String[] args) {

        String username="giumoralejo";
        String password="giumoralejo";
        String confirmPassword="giumoralejo";




        if(username.isEmpty() || password.isEmpty()){
            System.out.println("username or password cannot be empty");
        }

        if(password.length()<8) {
            System.out.println("password is too short");
        }

        if(password.equals(username)){
            System.out.println("password cannot contain username");
        }

        if(!confirmPassword.equals(password)){
            System.out.println("password does not match");

            }

        if(!username.isEmpty()&&
                password.length()>8&&
                !password.equals(username)&&
                confirmPassword.equals(password)){
            System.out.println("Your password and username have been created");
        }


        }
    }

