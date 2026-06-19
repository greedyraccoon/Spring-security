package com.graccoon.springsecurity.Service;

import com.graccoon.springsecurity.Model.Student;
import com.graccoon.springsecurity.Model.UserPrincipal;
import com.graccoon.springsecurity.Model.Users;
import com.graccoon.springsecurity.Repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MyUserDetailService implements UserDetailsService {

    private final UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Users user = repo.findByUsername(username);

        if(user == null){
            System.out.println("user not found ");
            throw new UsernameNotFoundException("user not found ");
        }


        return new UserPrincipal(user);
    }


}
