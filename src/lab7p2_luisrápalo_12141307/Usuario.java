package lab7p2_luisrápalo_12141307;
public class Usuario {
    private int id;
    private String username;
    private boolean admin ;

    public Usuario() {
    }

    public Usuario(int id, String username, boolean admin) {
        this.id = id;
        this.username = username;
        this.admin = admin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", username=" + username + ", admin=" + admin + '}';
    }
    
    
}
