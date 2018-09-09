package social.gripp.api.user.models;

public class PasswordReset {

    private String userEmail;
    private String resetToken;
    private String newPassword;

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getResetToken() {
        return resetToken;
    }

    public void setResetToken(String resetToken) {
        this.resetToken = resetToken;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PasswordReset that = (PasswordReset) o;

        if (userEmail != null ? !userEmail.equals(that.userEmail) : that.userEmail != null) return false;
        if (resetToken != null ? !resetToken.equals(that.resetToken) : that.resetToken != null) return false;
        return newPassword != null ? newPassword.equals(that.newPassword) : that.newPassword == null;
    }

    @Override
    public int hashCode() {
        int result = userEmail != null ? userEmail.hashCode() : 0;
        result = 31 * result + (resetToken != null ? resetToken.hashCode() : 0);
        result = 31 * result + (newPassword != null ? newPassword.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PasswordResetBean{" +
                "userEmail='" + userEmail + '\'' +
                ", resetToken='" + resetToken + '\'' +
                ", newPassword='" + newPassword + '\'' +
                '}';
    }
}
