package cn.jackiegu.design.pattern.study.strategy;

import java.math.BigDecimal;

/**
 * 打折收费类
 *
 * @author JackieGu
 */
public class CashRebate implements CashSuper {

    /**
     * 折扣
     */
    private final BigDecimal moneyRebate;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = BigDecimal.valueOf(moneyRebate);
    }

    /**
     * 打折收费实现
     *
     * @param money 应收取金额
     * @return 打折后收取金额
     */
    @Override
    public BigDecimal acceptCash(BigDecimal money) {
        return money.multiply(moneyRebate);
    }
}
