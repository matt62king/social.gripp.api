package social.gripp.api.user.models;

import com.google.cloud.datastore.Key;
import com.greenfrog.utils.datastore.fecher.annotaions.IndexedID;
import com.greenfrog.utils.datastore.fecher.annotaions.ToMany;
import com.greenfrog.utils.datastore.mapper.annotations.Column;
import com.greenfrog.utils.datastore.mapper.annotations.EntityKey;
import com.greenfrog.utils.datastore.mapper.annotations.Provided;

import java.util.List;

public class User {
    @EntityKey
    private Key key;

    @Column("user_handle")
    private String handle;

    @IndexedID
    @Column("user_email")
    private String email;

    @Provided(out = false)
    @Column("user_password")
    private String password;

    @ToMany(UserAuthority.class)
    private List<UserAuthority> userAuthorities;

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public String getHandle() {
        return handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<UserAuthority> getUserAuthorities() {
        return userAuthorities;
    }

    public void setUserAuthorities(List<UserAuthority> userAuthorities) {
        this.userAuthorities = userAuthorities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User userBean = (User) o;

        if (key != null ? !key.equals(userBean.key) : userBean.key != null) return false;
        if (handle != null ? !handle.equals(userBean.handle) : userBean.handle != null) return false;
        if (email != null ? !email.equals(userBean.email) : userBean.email != null) return false;
        if (password != null ? !password.equals(userBean.password) : userBean.password != null) return false;
        return userAuthorities != null ? userAuthorities.equals(userBean.userAuthorities) : userBean.userAuthorities == null;
    }

    @Override
    public int hashCode() {
        int result = key != null ? key.hashCode() : 0;
        result = 31 * result + (handle != null ? handle.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (userAuthorities != null ? userAuthorities.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "key=" + key +
                ", handle='" + handle + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", userAuthorities=" + userAuthorities +
                '}';
    }
}
