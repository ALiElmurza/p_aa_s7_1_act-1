package app.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


/**
 * Сущность Admin является наследником класса User.
 * Админ будет управлять созданием, удалением, изменением всех пользователей и добавлением ролей.
 *
 * @author Minibaeva Elvira
 */

@Data
@NoArgsConstructor
@Component
@Entity(name = "admins")
public class Admin extends User {
}