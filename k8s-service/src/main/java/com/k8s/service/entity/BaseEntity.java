package com.k8s.service.entity;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
public class BaseEntity {
  @TableId
  private Integer id;
  private LocalDateTime createTime;
  private LocalDateTime updateTime;
  @TableLogic(value = "0", delval = "1")
  @JsonIgnore
  private Integer deleted;
}