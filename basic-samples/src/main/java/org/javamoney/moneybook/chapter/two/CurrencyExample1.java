package org.javamoney.moneybook.chapter.two;

import org.javamoney.moneta.FastMoney;
import org.javamoney.moneta.Money;
import org.javamoney.moneta.RoundedMoney;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;
import java.math.BigDecimal;

/**
 * Created by otaviojava on 25/05/15.
 */
public class CurrencyExample1 {

    public static void main(String[] args) {

        CurrencyUnit currencyUnit = Monetary.getCurrency("BRL");
        String currencyCode = currencyUnit.getCurrencyCode();//BRL
        int numericCurrencyCode = currencyUnit.getNumericCode();//2
        int fractionDigits = currencyUnit.getDefaultFractionDigits();//986

    }

    /**
     * Created by otaviojava on 26/05/15.
     */
    public static class CreationMethodsMoney {

        public static void main(String[] args) {
            CurrencyUnit currency = Monetary.getCurrency("BRL");
            MonetaryAmount money = Money.of(BigDecimal.TEN, currency); //BRL 10
            MonetaryAmount zero = Money.zero(currency);//BRL 0
            MonetaryAmount moneyFromCurrencyCode = Money.of(10, "USD");//USD 10
            MonetaryAmount moneyFromCents = Money.ofMinor(currency, 100_00);//BRL 10
        }
    }

    /**
     * Created by otaviojava on 26/05/15.
     */
    public static class CreationMethodsRoundedMoney {

        public static void main(String[] args) {
            CurrencyUnit currency = Monetary.getCurrency("BRL");
            MonetaryAmount money = RoundedMoney.of(BigDecimal.TEN, currency); //BRL 10
            MonetaryAmount zero = RoundedMoney.zero(currency);//BRL 0
            MonetaryAmount moneyFromCurrencyCode = RoundedMoney.of(10, "USD");//USD 10
            MonetaryAmount moneyFromCents = RoundedMoney.ofMinor(currency, 100_00);//BRL 10
        }
    }

    /**
     * Created by otaviojava on 26/05/15.
     */
    public static class CreationsMethodsFastMoney {

        public static void main(String[] args) {
            CurrencyUnit currency = Monetary.getCurrency("BRL");
            MonetaryAmount money = FastMoney.of(BigDecimal.TEN, currency); //BRL 10
            MonetaryAmount zero = FastMoney.zero(currency);//BRL 0
            MonetaryAmount moneyFromCurrencyCode = FastMoney.of(10, "USD");//USD 10
            MonetaryAmount moneyFromCents = FastMoney.ofMinor(currency, 100_00);//BRL 10
        }
    }
}
