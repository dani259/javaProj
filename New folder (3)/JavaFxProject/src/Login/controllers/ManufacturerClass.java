package Login.controllers;

public class ManufacturerClass {

    private String ID;
    private String username;
    private String password;

    public ManufacturerClass(String ID, String username, String password)
    {
        this.ID = ID;
        this.username = username;
        this.password = password;
    }

    public boolean equals(Object o)
    {

        if((o instanceof ManufacturerClass) && ((ManufacturerClass)o).username.equals(username))
        {
            return true;
        }
            return false;

    }

    /*public String toString()
    {
        String s = "";
        return s + "ID : " + ID + "  username : "  + username + " ";

    }*/

}
