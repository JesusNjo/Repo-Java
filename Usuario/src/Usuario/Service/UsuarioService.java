/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario.Service;

import Usuario.Persistence.UsuarioJpaController;
import Usuario.Usuario;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.UUID;

/**
 *
 * @author JesusNjo
 */
public class UsuarioService {

    UsuarioJpaController usuarioJpa = new UsuarioJpaController();
    Usuario usuario = new Usuario();
    Scanner input = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
    UUID id = UUID.randomUUID();

    public void consultarUsuario() {

        try {
            List<Usuario> listaUser = usuarioJpa.findUsuarioEntities();

            System.out.println("----Usuario----");
            for (Usuario usuario1 : listaUser) {
                System.out.println(usuario1.toString());
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void crearUsuarios() throws Exception {
        try {

            usuario.setId_usuario(id.toString());
            System.out.println("Ingrese el nombre de usuario");
            usuario.setNombre(input.next());
            System.out.println("Ingrese el correo electronico");
            String email = input.next();
            if (email.contains("@")) {
                usuario.setEmail(input.next());
            } else {
                System.out.println("Email invalido, debe tener @");
                int cont = 3;
                while (!email.contains("@")) {
                    System.out.println("Ingrese nuevamente el correo, tiene " + cont + " intentos");
                    email = input.next();
                    cont--;
                    if (cont == 0 && !email.contains("@")) {
                        System.out.println("Finalizaron sus intentos!");
                        break;

                    }
                }
                usuario.setEmail(email);
            }
            System.out.println("Ingrese la edad del usuario");
            usuario.setEdad(input.next());

            if (usuario.getNombre() != null && usuario.getEmail() != null && usuario.getEdad() != null) {
                usuarioJpa.create(usuario);
            } else {
                System.out.println("No pueden haber campos vacios");
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
