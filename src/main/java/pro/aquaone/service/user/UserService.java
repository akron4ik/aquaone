package pro.aquaone.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.data.domain.Sort;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import pro.aquaone.AuthorizedUser;
import pro.aquaone.model.User;
import pro.aquaone.repository.user.CrudUserRepository;

import java.util.List;

import static pro.aquaone.util.UserUtil.prepareToSave;
import static pro.aquaone.util.ValidationUtil.checkNotFound;
import static pro.aquaone.util.ValidationUtil.checkNotFoundWithId;

@Service
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UserService implements UserDetailsService {
    private static final Sort SORT_NAME_EMAIL = new Sort(Sort.Direction.ASC, "name", "email");


    private final CrudUserRepository repository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserService(CrudUserRepository repository, PasswordEncoder passwordEncoder){
        this.repository = repository;
        this.passwordEncoder = passwordEncoder;
    }

    public User create(User user){
        Assert.notNull(user, "user must not be null");
        return repository.save(prepareToSave(user, passwordEncoder));

    }

    public void delete(int id){
        checkNotFoundWithId(repository.deleteUserById(id), id);
    }

    public User get(int id){
       return checkNotFoundWithId(repository.findById(id).orElse(null), id);
    }

    public User getByEmail(String email){
         Assert.notNull(email,"email must not be null" );
         return checkNotFound(repository.getUserByEmail(email), "email=" + email);
    }

    public User getByPhone(String phone){
        Assert.notNull(phone, "phone must not be null");
        return checkNotFound(repository.getUserByPhone(phone), "phone=" + phone);
    }

    public List<User> getUsersByAddress(String address){
        Assert.notNull(address, "address must not be null");
        return checkNotFound(repository.getUsersByAddress(address), "address=" + address);
    }

    public User getWithOrders(int id){
        return checkNotFoundWithId(repository.getWithOrders(id), id);
    }

    public List<User> getAll(){
        return repository.findAll(SORT_NAME_EMAIL);
    }

    public void update(User user){
        Assert.notNull(user, "user must not be null");
        repository.save(prepareToSave(user, passwordEncoder));
    }



    @Override
    public AuthorizedUser loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = repository.getUserByEmail(email.toLowerCase());
        if (user == null) {
            throw new UsernameNotFoundException("User " + email + " is not found");
        }
        return new AuthorizedUser(user);
    }
}
