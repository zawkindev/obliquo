package zawkin.me.obliquo.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import zawkin.me.obliquo.dto.UserDTO;
import zawkin.me.obliquo.service.UserService;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private UserService service;

    @PostMapping("/register")
    private ResponseEntity<Boolean> register(@Valid @RequestBody UserDTO user, HttpServletRequest request) {
        return ResponseEntity.ok(service.registration(user, request));
    }

    @PostMapping("/login")
    private ResponseEntity<Boolean> login(@RequestBody UserDTO user, HttpServletRequest request) {
        return ResponseEntity.ok(service.login(user, request));
    }
}
