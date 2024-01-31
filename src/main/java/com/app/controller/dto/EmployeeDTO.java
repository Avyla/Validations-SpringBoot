package com.app.controller.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data

@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {

    /*
        @NotNull: Verifica que un campo no sea null
        @NotBlank: Verifica que un campo no sea null y tampoco vacio
        @NotEmpty: Verifica que un campo de tipo lista no este vacio
        @Size(min=integer, max=integer): Establece un minimo y un maximo de caracteres
        @Min(Integer): Verifica que un campo (int, Integer, Long...) sea mayor o igual al parametro
        @Max(Integer): Verifica que un campo (int, Integer, Long...) sea menor o igual al parametro
        @Email: Verifica un correo electronico
        @Pattern(ExpresionRegular): Valida que un string cumpla la expresion regular
        @Digits(integer=int, fraction=int) Verifica la cantidad de digitos que un double recibira en su parte entera y decimal
        @Past: Verifica que una fecha sea anterior a la fecha actual
        @Future: Verifica que una fecha sea posterior a la fecha actual
        @AssertTrue: Verifica que un campo boolean sea true
        @AssertFalse: Verifica que un campo boolean sea false
        - A los objetos añidados se le debe agregar la anotacion @Valid y dentro de la clase la anotacion @Validated
            despues de ello se puede validar sus atributos con las demas anotaciones.
        NOTA: En todas las anotaciones esta la propiedad "message" que permite modificar el mensaje de error
    */

    @NotBlank
    private String name;

    @NotBlank
    private String lastName;

    @NotBlank
    private String email;

    @NotBlank
    private Long phone;

    @NotBlank
    @Min(18)
    @Max(80)
    private byte age;

    @Digits(integer = 1, fraction = 2)
    @NotBlank
    private double height;

    @AssertFalse
    @NotBlank
    private boolean married;

    @NotBlank
    private LocalDate dateBirth;

    @Valid
    private DepartmentDTO department;

}
