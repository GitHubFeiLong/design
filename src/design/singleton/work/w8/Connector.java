package design.singleton.work.w8;

import java.io.Serializable;
import java.util.Objects;

/**
 * 类描述：
 *
 * @author cfl
 * @version 1.0
 * @date 2022/12/13 22:00
 */
public class Connector implements Cloneable, Serializable {
    //~fields
    //==================================================================================================================
    private String host;
    private int port;
    private String username;
    private String password;
    private String info;
    //~methods
    //==================================================================================================================

    @Override
    public Connector clone() {
        try {
            return (Connector)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Connector(String host, int port, String username, String password, String info) {
        this.host = host;
        this.port = port;
        this.username = username;
        this.password = password;
        this.info = info;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Connector connector = (Connector) o;
        return port == connector.port && Objects.equals(host, connector.host) && Objects.equals(username, connector.username) && Objects.equals(password, connector.password) && Objects.equals(info, connector.info);
    }

    @Override
    public int hashCode() {
        return Objects.hash(host, port, username, password, info);
    }

    @Override
    public String toString() {
        return "Connector{" +
                "host='" + host + '\'' +
                ", port=" + port +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
