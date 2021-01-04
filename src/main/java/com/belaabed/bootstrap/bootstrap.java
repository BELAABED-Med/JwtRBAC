package com.belaabed.bootstrap;

import com.belaabed.Model.ERole;
import com.belaabed.Model.Role;
import com.belaabed.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class bootstrap implements CommandLineRunner {

    @Autowired
    RoleRepository roleRepository;

    @Override
    public void run(String... args) throws Exception {

        roleRepository.save(new Role(1L,ERole.ROLE_USER));
        roleRepository.save(new Role(2L,ERole.ROLE_MODERATOR));
        roleRepository.save(new Role(3L,ERole.ROLE_ADMIN));

    }
}
