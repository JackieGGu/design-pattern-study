package cn.jackiegu.design.pattern.study.strategy;

import java.math.BigDecimal;

/**
 * 正常收费类
 *
 * @author JackieGu
 */
public class CashNormal implements CashSuper {

    /**
     * 正常收费实现
     *
     * @param money 应收取金额
     * @return 正常收取金额
     */
    @Override
    public BigDecimal acceptCash(BigDecimal money) {
        return money;
    }
}
