package cn.jackiegu.design.pattern.study.strategy;

import java.math.BigDecimal;

/**
 * 返利收费类
 *
 * @author JackieGu
 */
public class CashReturn implements CashSuper {

    /**
     * 返利条件
     */
    private final BigDecimal moneyCondition;

    /**
     * 返利金额
     */
    private final BigDecimal moneyReturn;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = BigDecimal.valueOf(moneyCondition);
        this.moneyReturn = BigDecimal.valueOf(moneyReturn);
    }

    /**
     * 返利收费实现
     *
     * @param money 应收取金额
     * @return 返利后收取金额
     */
    @Override
    public BigDecimal acceptCash(BigDecimal money) {
        BigDecimal divide = money.divide(moneyCondition, 0, BigDecimal.ROUND_DOWN);
        return money.subtract(divide.multiply(moneyReturn));
    }
}
