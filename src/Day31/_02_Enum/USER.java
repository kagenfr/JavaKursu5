package Day31._02_Enum;

public class USER {
    String username;
    Role role;
    Statu statu;
    public USER(String username, Role role, Statu statu) {
        this.username = username;
        this.role = role;
        this.statu = statu;
    }
    public String toString() {
        return "USER{" +
                "username='" + username + '\'' +
                ", role=" + role +
                ", statu=" + statu +
                '}';
    }
}
