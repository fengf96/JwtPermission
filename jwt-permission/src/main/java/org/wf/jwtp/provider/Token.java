package org.wf.jwtp.provider;

import java.io.Serializable;
import java.util.Date;

/**
 * Token实体类
 * Created by wangfan on 2018-12-28 上午 9:21.
 */
public class Token implements Serializable {
    private Integer tokenId;  // 自增主键

    private String userId;  // 用户id

    private String accessToken;  // access_token

    private String refreshToken;  // refresh_token

    private Date expireTime;  // 过期时间

    private Date refreshTokenExpireTime;  // refresh_token过期时间

    private String[] roles;  // 用户角色

    private String[] permissions;  // 用户权限

    public Integer getTokenId() {
        return tokenId;
    }

    public void setTokenId(Integer tokenId) {
        this.tokenId = tokenId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }

    public String[] getPermissions() {
        return permissions;
    }

    public void setPermissions(String[] permissions) {
        this.permissions = permissions;
    }

    public Date getRefreshTokenExpireTime() {
        return refreshTokenExpireTime;
    }

    public void setRefreshTokenExpireTime(Date refreshTokenExpireTime) {
        this.refreshTokenExpireTime = refreshTokenExpireTime;
    }
}
