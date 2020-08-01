package cn.jackiegu.design.pattern.study.strategy;

import java.math.BigDecimal;

/**
 * 抽象收费类
 *
 * @author JackieGu
 */
public interface CashSuper {

    /**
     * 抽象收费接口
     *
     * @param money 应收取金额
     * @return 实际收取金额
     */
    BigDecimal acceptCash(BigDecimal money);
}
