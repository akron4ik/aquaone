package pro.aquaone.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;
import org.w3c.dom.ls.LSOutput;
import pro.aquaone.LoggedUser;
import pro.aquaone.View;
import pro.aquaone.service.user.UserService;
import pro.aquaone.to.UserTo;
import pro.aquaone.util.TokenUtil;
import pro.aquaone.util.UserUtil;
import pro.aquaone.util.exception.InvalidDataException;
import pro.aquaone.util.exception.UserNotFoundException;
import pro.aquaone.web.AuthenticationRequest;
import pro.aquaone.web.AuthenticationResponse;

import javax.validation.Valid;


@RestController
@RequestMapping("/rest/authentication")
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private TokenUtil tokenUtil;

    @Autowired
    private UserService userService;

    @RequestMapping(
            value = "/login",
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public AuthenticationResponse login(@Valid @RequestBody AuthenticationRequest authenticationRequest) {
        /*if (authenticationRequest.getUsername().isEmpty()){
            throw new InvalidDataException("Введите ваш Email!");
        }
        if (authenticationRequest.getPassword().isEmpty()){
            throw new InvalidDataException("Введите пароль!");
        }*/

        AuthenticationResponse response = new AuthenticationResponse();

        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                            authenticationRequest.getUsername(),// But we are use user email!
                            authenticationRequest.getPassword()
                )
        );

        SecurityContextHolder.getContext().setAuthentication(authentication);
        UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());// But we are use user email!

        String token = tokenUtil.generateToken(userDetails);
        response.setToken(token);
        LoggedUser loggedUser = userService.loadUserByUsername(authenticationRequest.getUsername());
        response.setUser(loggedUser);
        return response;
    }

    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    public void logout() {

    }

    @RequestMapping(value = "/register", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public AuthenticationResponse createWithLocation(@Validated(View.Web.class) @RequestBody UserTo user) {
        System.out.println("AAAAAAAAA"+user);


        userService.create(UserUtil.createNewFromTo(user));
        AuthenticationRequest authenticationRequest = new AuthenticationRequest(user.getEmail(), user.getPassword());

        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        authenticationRequest.getUsername(),// But we are use user email!
                        authenticationRequest.getPassword()
                )
        );
        SecurityContextHolder.getContext().setAuthentication(authentication);
        UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());// But we are use user email!
        String token = tokenUtil.generateToken(userDetails);

        AuthenticationResponse response = new AuthenticationResponse(token);
        LoggedUser loggedUser = userService.loadUserByUsername(authenticationRequest.getUsername());
        response.setUser(loggedUser);

        return response;
    }
}
