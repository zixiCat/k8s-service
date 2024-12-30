package com.k8s.service.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@TableName("user")
public class UserEntity extends BaseEntity {
  private String name;
  private String email;
  private Integer phone;
  private String address;
  private String remark;
  private Integer role;
  private Integer status;
}