package cn.jackiegu.design.pattern.study.strategy;

import java.math.BigDecimal;
import java.util.Map;

/**
 * 收费策略类
 *
 * @author JackieGu
 */
public class CashStrategy {

    /**
     * 正常收费
     */
    public static final int NORMAL = 1;

    /**
     * 打折收费
     */
    public static final int REBATE = 2;
    public static final String REBATE_KEY = "REBATE";

    /**
     * 返利收费
     */
    public static final int RETURN = 3;
    public static final String RETURN_CONDITION_KEY = "RETURN_CONDITION";
    public static final String RETURN_VAL_KEY = "RETURN_VAL";

    /**
     * 抽象收费类
     */
    private final CashSuper cashSuper;

    /**
     * 对抽象收费类进行实例化
     *
     * @param cashType 收费方式
     * @param params 参数
     */
    public CashStrategy(int cashType, Map<String, Double> params) {
        switch (cashType) {
            case NORMAL:
                this.cashSuper = new CashNormal();
                break;
            case REBATE:
                double moneyRebate = params.get(REBATE_KEY);
                this.cashSuper = new CashRebate(moneyRebate);
                break;
            case RETURN:
                double moneyCondition = params.get(RETURN_CONDITION_KEY);
                double moneyReturn = params.get(RETURN_VAL_KEY);
                this.cashSuper = new CashReturn(moneyCondition, moneyReturn);
                break;
            default:
                throw new RuntimeException("Parameter 'cashType' is not supported");
        }
    }

    /**
     * 通过相应收费模式计算实收金额
     *
     * @param money 应收金额
     * @return 实收金额
     */
    public double getActualMoney(double money) {
        return this.cashSuper.acceptCash(BigDecimal.valueOf(money)).doubleValue();
    }
}
