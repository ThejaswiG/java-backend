package com.example.ecommerce.controller;

        import com.example.ecommerce.model.Customer;
        import com.example.ecommerce.service.AuthService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.http.ResponseEntity;
        import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody Customer customer) {
        return authService.registerUser(customer);
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody Customer customer) {
        return authService.loginUser(customer);
    }
}
