package com.portfolio.stefano.Security.Service;

import com.portfolio.stefano.Security.Entity.Rol;
import com.portfolio.stefano.Security.Entity.Usuario;
import com.portfolio.stefano.Security.Enums.RolNombre;
import com.portfolio.stefano.Security.Repository.iRolRepository;
import com.portfolio.stefano.Security.Repository.iUsuarioRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    iUsuarioRepository iusuarioRepository;
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return iusuarioRepository.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByNombreUsuario(String nombreUsuario){
        return iusuarioRepository.existsByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByEmail(String email){
        return iusuarioRepository.existsByEmail(email);
    }
    public void save(Usuario usuario){
        iusuarioRepository.save(usuario);
    }
}
