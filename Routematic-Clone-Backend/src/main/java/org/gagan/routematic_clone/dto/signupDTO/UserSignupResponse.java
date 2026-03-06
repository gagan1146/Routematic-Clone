package org.gagan.routematic_clone.dto.signupDTO;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserSignupResponse {
    private UUID id;
    private String username;
    private String email;
    private String phoneNumber;
    private String department;
    private String role;
    private Integer tPin;
    private String locality;
    private String address;
    private String pickupLocation;
    private String dropLocation;
}