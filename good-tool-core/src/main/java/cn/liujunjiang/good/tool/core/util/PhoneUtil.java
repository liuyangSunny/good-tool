package cn.liujunjiang.good.tool.core.util;

import cn.hutool.core.util.StrUtil;

/**
 * 手机号处理工具类
 *
 * @author liuyang
 * @date 2019/3/25 11:26
 */
public class PhoneUtil {

    public static final char C_STAR = '*';

    /**
     * 模糊处理
     * 默认将手机号的第5位到第8位替换为
     *
     * @param phoneNumber 手机号
     * @return 模糊后的手机号
     */
    public static String blur(String phoneNumber) {
        return StrUtil.replace(phoneNumber, 3, 7, C_STAR);
    }

}

