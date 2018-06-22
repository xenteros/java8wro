package com.github.xenteros.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.HashMap;
import java.util.Map;

public class UserDetailsServiceImpl implements UserDetailsService {

    private Map<String, UserDetails> users;

    public UserDetailsServiceImpl() {

        users = new HashMap<>();
        users.put("user", new User("user", "{noop}password") );
        users.put("admin", new User("admin", "{noop}pass") );
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        if (users.containsKey(s)) {
            return users.get(s);
        }

        throw new UsernameNotFoundException(s);
    }
}
