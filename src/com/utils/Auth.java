package com.utils;

import com.entity.NhanVien;

public class Auth {
    public static NhanVien user = null;
    public static void clear() {
        Auth.user = null;
    }
    public static Boolean isLogin(){
        return Auth.user != null;
    }
    public static boolean isManager() {
        return Auth.isLogin() && Auth.user.getVaiTro();
    }
}
