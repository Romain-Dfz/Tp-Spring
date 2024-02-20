package org.example.connexion;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService implements UserDetailsService {

    private static final String CORRECT_USERNAME = "admin";
    private static final String CORRECT_PASSWORD = "password";

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (CORRECT_USERNAME.equals(username)) {
            return org.springframework.security.core.userdetails.User.withUsername(username)
                    .password("{noop}" + CORRECT_PASSWORD) // {noop} indique que le mot de passe n'est pas encodé
                    .roles("USER")
                    .build();
        }
        throw new UsernameNotFoundException("User not found");
    }
}
