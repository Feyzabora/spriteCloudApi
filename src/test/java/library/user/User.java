package library.user;

public class User {

    private final Integer id;
    private final String username;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;
    private final String phone;
    private final Integer userStatus;

    public User(Integer id, Integer userStatus,
                String firstName, String lastName,
                String email, String password,
                String phone, String username){

        this.id = id;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.userStatus = userStatus;
    }

    public String getUsername(){return username;}

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }

    public String getPhone(){
        return phone;
    }

    public Integer getId(){return id;}

    public Integer getUserStatus(){
        return userStatus;
    }
}
