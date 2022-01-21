package ua.avadamedia.forostina.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.avadamedia.forostina.entity.user.Right;
import ua.avadamedia.forostina.entity.user.User;
import ua.avadamedia.forostina.repository.UserRepository;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) {
        return userRepository.findByPhone(username)
                .map(this::toUserDetail)
                .orElseThrow(() -> new UsernameNotFoundException("User not found :" + username));

    }

    private UserDetails toUserDetail(User user) {
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_" + user.getRole().name()));

        for (Right role : user.getRights()){
            grantedAuthorities.add(new SimpleGrantedAuthority(role.getName().toUpperCase()));
        }

        return org.springframework.security.core.userdetails.User.builder()
                .username(user.getName())
                .password(user.getPassword())
                .authorities(grantedAuthorities)
                .disabled(!user.isActive())
                .build();
    }

}
