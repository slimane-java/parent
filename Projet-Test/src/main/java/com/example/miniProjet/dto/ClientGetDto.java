package com.example.miniProjet.dto;

import com.example.miniProjet.enums.RolesEnum;
import com.example.miniProjet.validateInterface.OnCreateOrder;
import lombok.*;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientGetDto {

    @NotNull(groups = OnCreateOrder.class)
    private Long id;
	private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String username;
    private List<RolesEnum> rolesEntities;



}
