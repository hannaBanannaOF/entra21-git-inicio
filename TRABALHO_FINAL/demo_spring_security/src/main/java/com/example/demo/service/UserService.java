package com.example.demo.service;

import com.example.demo.dto.CadastroDTO;
import com.example.demo.repository.UserRepository;
import com.example.demo.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) {
        UserEntity user = userRepository.findByLogin(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        return user;
    }

    public void criar(CadastroDTO dto) {
        UserEntity en = new UserEntity();
        en.setLogin(dto.login);
        en.setPassword(dto.senha);
        userRepository.save(en);
    }
}
