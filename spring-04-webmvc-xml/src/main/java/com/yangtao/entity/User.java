package com.yangtao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String id;
    @NotBlank(message = "用户名不能为空！")
    @Length(min = 6, max = 20, message = "用户名长度必须是6~20位")
    private String username;
    @NotBlank(message = "用户姓名不能为空")
    private String name;

    private Date birthday;

    private byte[] photo;

    private Department department;
}
