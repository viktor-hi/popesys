package cn.chen.demo01.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.annotation.Version;

import lombok.Data;

import java.util.Date;

import static com.baomidou.mybatisplus.annotation.FieldStrategy.NOT_NULL;

@Data
@TableName(value = "User",schema="MyDockerSQL")
public class User {

    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    @TableField(value = "name",insertStrategy = NOT_NULL)
    private String name;

    @TableField(value = "age",insertStrategy = NOT_NULL)
    private Integer age;

    @TableField(value = "CREATE_TIME",fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(value = "UPDATE_TIME",fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @Version
    @TableField(value = "version",fill = FieldFill.INSERT)
    private Integer version;

    @TableLogic
    private Integer deleted;
}
