package com.yangtao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    private String id;
    @NotBlank(message = "部门名不能为空")
    @Length(min = 6, max = 20, message = "部门名长度在6~20位之间")
    private String name;
    private String tel;
}
