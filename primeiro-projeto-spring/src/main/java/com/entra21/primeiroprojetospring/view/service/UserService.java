package com.entra21.primeiroprojetospring.view.service;

import com.entra21.primeiroprojetospring.model.dto.CadastroDTO;
import com.entra21.primeiroprojetospring.model.dto.LoginDTO;
import com.entra21.primeiroprojetospring.model.entity.UserEntity;
import com.entra21.primeiroprojetospring.view.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        UserEntity user = userRepository.findByLogin(username);
        if (user == null) {
            throw new UsernameNotFoundException(username);
        }
        return user;
    }

    public void criar(CadastroDTO dto) {
        UserEntity en = new UserEntity();
        en.setLogin(dto.getLogin());
        en.setPassword(dto.getSenha());
        userRepository.save(en);
    }

    public UserEntity getLogado() {
        try {
            return (UserEntity) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public UserEntity getLogin(LoginDTO login) {
        UserEntity u = userRepository.findByLogin(login.getUsername());
        if (u.getPassword().equals(login.getPassword())) {
            return u;
        }
        throw new RuntimeException("Senha inválida!");
    }
}