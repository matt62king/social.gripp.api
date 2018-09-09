package social.gripp.api.user.models;

import com.google.cloud.datastore.Key;
import com.greenfrog.utils.datastore.fecher.annotaions.IndexedID;
import com.greenfrog.utils.datastore.mapper.annotations.Column;
import com.greenfrog.utils.datastore.mapper.annotations.EntityKey;
import com.greenfrog.utils.datastore.mapper.annotations.Store;
import social.gripp.api.constraints.Authority;

@Store(value = "user_authority", cache = true)
public class UserAuthority {
    @EntityKey
    private Key id;

    @IndexedID
    @Column("user_email")
    private String userEmail;

    @Column("user_authority")
    private Authority userAuthority;

    public Key getKey() {
        return id;
    }

    public void setKey(Key id) {
        this.id = id;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Authority getUserAuthority() {
        return userAuthority;
    }

    public void setUserAuthority(Authority userAuthority) {
        this.userAuthority = userAuthority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserAuthority that = (UserAuthority) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (userEmail != null ? !userEmail.equals(that.userEmail) : that.userEmail != null) return false;
        return userAuthority == that.userAuthority;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (userEmail != null ? userEmail.hashCode() : 0);
        result = 31 * result + (userAuthority != null ? userAuthority.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "UserAuthorityBean{" +
                "id='" + id + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userAuthority=" + userAuthority +
                '}';
    }
}
