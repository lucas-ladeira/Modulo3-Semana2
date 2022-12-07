package br.com.futurodev.modulo3semana2exercicios.security;

import br.com.futurodev.modulo3semana2exercicios.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/*
 * Step 6 - Encontrar usuário
 * ... implements UserDetailsService ...
 */
@Service
public class AutenticacaoService implements UserDetailsService {

    @Autowired private UsuarioRepository usuarioRepository;

    /*
     * Implementar nesse método a lógica de busca de usuário no sistema
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return usuarioRepository.buscarPorLogin(username);
    }
}
