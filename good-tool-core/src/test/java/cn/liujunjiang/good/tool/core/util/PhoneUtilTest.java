package cn.liujunjiang.good.tool.core.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * PhoneUtil 单元测试
 *
 * @author liuyang
 * @date 2019/4/9 20:17
 */
public class PhoneUtilTest {

    @Test
    public void blurTest() {
        String phone = PhoneUtil.blur("13856781234");
        Assert.assertEquals(phone, "138****1234");
    }
}
