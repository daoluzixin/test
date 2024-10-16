package com.example.utils;

import java.util.*;


import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.Map;

    public class JwtUtils {

        private static String signKey = "feng";
        private static Long expire = 3600000L;

        /**
         * 生成JWT令牌
         *  第二部分负载payload中存储的内容
         * @return
         */
        public static String genrateJwt(Map<String, Object> claims){

            String jwt = Jwts.builder()
                    .addClaims(claims)
                    .signWith(SignatureAlgorithm.HS256, signKey) //数字签名
                    .setExpiration(new Date(System.currentTimeMillis() + expire))  //有效期为1h
                    .compact();
            return jwt;
        }

        /**
         * 解析JTW令牌
         * @param
         * @return JWT第二部分负载payload中存储的内容
         */
        public static Claims parseJWT(String jwt){
            Claims claims = Jwts.parser()
                    .setSigningKey(signKey)
                    .parseClaimsJws(jwt)
                    .getBody();
            System.out.println(claims);

            return claims;
        }
    }


