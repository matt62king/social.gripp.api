package social.gripp.api.user.models;

public interface PasswordReset {
    String getUserEmail();
    void setUserEmail(String userEmail);
    String getResetToken();
    void setResetToken(String resetToken);
    String getNewPassword();
    void setNewPassword(String newPassword);
}
