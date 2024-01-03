package org.tolga.dto.response;

import org.tolga.repository.enums.ERole;
import org.tolga.repository.enums.EStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RegisterResponseDto {

    private String username;
    private String email;
    private  String name;
    private Set<ERole> roles;
    private EStatus status;
}
