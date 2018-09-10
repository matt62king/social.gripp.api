package social.gripp.api.user.mappers;

import com.google.cloud.datastore.FullEntity;
import com.google.cloud.datastore.IncompleteKey;
import com.google.cloud.datastore.StringValue;
import com.google.cloud.datastore.Value;
import com.greenfrog.utils.datastore.fecher.annotaions.MapConstructor;
import com.greenfrog.utils.datastore.mapper.mapper.Mapper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import social.gripp.api.user.models.User;

import javax.annotation.Nullable;
import java.util.Map;

@Component
public class UserMapper extends Mapper<User> {

    private final PasswordEncoder passwordEncoder;

    @MapConstructor
    public UserMapper() {
        super();
        passwordEncoder = new BCryptPasswordEncoder(16);
    }

    @Override
    public FullEntity<IncompleteKey> mapEntity(User userBean) {
        return getEntityMapper().mapBeanToEntity(userBean, this);
    }

    @Override
    public User mapBean(FullEntity<?> fullEntity) {
        return getEntityMapper().mapEntityToBean(fullEntity, new User());
    }

    @Override
    public void mapProvidedFields(Map<String, Value<?>> map, User userBean) {
        map.put("user_password", StringValue.of(generatePasswordHash(userBean)));
    }

    @Nullable
    private String generatePasswordHash(User userBean) {
        return userBean.getPassword() != null ? passwordEncoder.encode(userBean.getPassword()) : null;
    }
}
