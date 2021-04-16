package Login.controllers;

public class CustomerClass {
    private String username;
    private String password;

    public CustomerClass(String username, String password)
    {
        this.username = username;
        this.password = password;
    }

    public boolean equals(Object o)
    {

        if((o instanceof CustomerClass) && ((CustomerClass)o).username.equals(username))
            return true;
        return false;

    }
}
