package com.Sudongbu.bordjione.dto;

import com.Sudongbu.bordjione.dto.validation.ValidationGroups;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class RegisterReqDto {

    @NotBlank(message = "아이디는 비워 둘 수 없습니다", groups = ValidationGroups.NotBlankGroup.class)
    @Size(min =1, max = 16, message = "아이디는 16글자까지만 입력가능합니다.", groups = ValidationGroups.SizeGroup.class)
    @Pattern( regexp = "^[a-zA-Z0-9]*$",message = "영문과 숫자만 가능합니다.")
    private String userid;

    @NotBlank(message = "닉네임은 비워 둘 수 없습니다", groups = ValidationGroups.NotBlankGroup.class)
    private String nickname;

    @NotBlank(message = "이름은 비워 둘 수 없습니다", groups = ValidationGroups.NotBlankGroup.class)
    @Size(min = 1, max = 4, message = "이름은 4글자 까지만 입력가능합니다.", groups = ValidationGroups.SizeGroup.class)
    @Pattern(regexp = "^[가-힇]*$", message = "한글만 입력 가능합니다", groups = ValidationGroups.PatternCheckGroup.class)
    private String username;



    @NotBlank(message = "이메일은 비워 둘 수 없습니다", groups = ValidationGroups.NotBlankGroup.class)
    @Email( message = "이메일 형식이어야 합니다.")
    private String email;

    @NotBlank(message = "비밀번호는 비워 둘 수 없습니다", groups = ValidationGroups.NotBlankGroup.class)
    @Size(min = 8, max = 16, message = "비밀번호는 8자 부터 16자까지 입력하여야 합니다", groups = ValidationGroups.SizeGroup.class)
    @Pattern(regexp = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*[~!@#$%^&*_])[a-zA-Z\\d-~!@#$%^&*_]*$", message = "비밀번호는 특수기호, 영문, 숫자를 모두 포함해야합니다.", groups = ValidationGroups.PatternCheckGroup.class)
    private String password;



}
