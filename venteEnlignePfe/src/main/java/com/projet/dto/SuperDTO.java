package com.projet.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotNull;
import java.util.Date;

@Data
@NoArgsConstructor
public abstract class SuperDTO {
    @NotNull
    private int id;

    @NotNull
    private Date createdAt;

    @NotNull
    private Date updatedAt;
}
