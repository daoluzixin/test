package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
//统一响应结果
public class Result extends User {

    private Integer code;//响应码，1 代表成功; 0 代表失败
    private String msg;  //响应信息 描述字符串
    private Object data; //返回的数据

    //方法的重载
    //增删改 成功响应
    public static com.example.pojo.Result success(){
        return new com.example.pojo.Result(1,"success",null);
    }
    //查询 成功响应
    public static com.example.pojo.Result success(Object data){
        return new com.example.pojo.Result(1,"success",data);
    }
    //失败响应
    public static com.example.pojo.Result error(String msg){
        return new com.example.pojo.Result(0,msg,null);
    }
}

