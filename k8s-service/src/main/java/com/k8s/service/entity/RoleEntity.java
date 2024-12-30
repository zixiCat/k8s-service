package com.k8s.service.entity;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.EqualsAndHashCode;

@TableName("role")
@Data
@EqualsAndHashCode(callSuper = true)
public class RoleEntity extends BaseEntity {
  private String name;
  private String remark;
}