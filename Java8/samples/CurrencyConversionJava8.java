```package com.tmobile.supplychain.nwsc.reference.data.search.model.sku;


import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
enum CurrencyUnits {
    UNIT(""), TEN(""), HUNDRED(" Hundred And "), THOUSAND(" Thousand ");
    private static final String[] TENS_ARR = {"Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ", "Seventy ", "Eight ", "Ninety "};
    private static final String[] UNITS_ARR = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private static final Map<Integer, String> TENS_MAP = new HashMap<Integer, String>() {{
        put(11, "Eleven");
        put(12, "Twelve");
        put(13, "Thirteen");
        put(14, "Fourteen");
        put(15, "Fifteen");
        put(16, "Sixteen");
        put(17, "Seventeen");
        put(18, "Eighteen");
        put(19, "Nineteen");
    }};
    String valueInString;

    CurrencyUnits(String value) {
        this.valueInString = value;
    }

    public String getTensByValue(int value) {
        return TENS_MAP.get(value);
    }

    public String getTensByIndex(int index) {
        return TENS_ARR[index];
    }

    public String getUnitValue(int index) {
        return UNITS_ARR[index];
    }
}

public class CurrencyConversionJava8 {
    private static final int MAX_LIMIT = 9999;
    private static final Function<Integer, Integer> GET_FIRST_NUMBER = input -> {
        while (input >= 10) input /= 10;
        return input;
    };
    private static final Function<Integer, CurrencyUnits> CURRENCY_UNIT = input -> {
        if (input > 999) return CurrencyUnits.THOUSAND;
        else if (input > 99) return CurrencyUnits.HUNDRED;
        else if (input > 10) return CurrencyUnits.TEN;
        else return CurrencyUnits.UNIT;
    };
    private static final RuntimeException MAX_LIMIT_ERROR = new RuntimeException("Number cannot be greater that : " + MAX_LIMIT);

    public static void main(String[] args) {
        int input = 3411;
        System.out.println("input: " + input);
        StringBuilder result = new StringBuilder();
        getNumberInCurrency(input, result);
        System.out.println(result);
        int input2 = 3461;
        System.out.println("input2: " + input2);
        StringBuilder result2 = new StringBuilder();
        getNumberInCurrency(input2, result2);
        System.out.println(result2);
    }

    private static void getNumberInCurrency(int number, StringBuilder result) {
        assertNumberValidity(number);
        int firstNumber = GET_FIRST_NUMBER.apply(number);
        CurrencyUnits currency = CURRENCY_UNIT.apply(number);
        switch (currency) {
            case THOUSAND:
                number %= 1000;
                result.append(currency.getUnitValue(firstNumber - 1)).append(currency.valueInString);
                getNumberInCurrency(number, result);
                break;
            case HUNDRED:
                number %= 100;
                result.append(currency.getUnitValue(firstNumber - 1)).append(currency.valueInString);
                getNumberInCurrency(number, result);
                break;
            case TEN:
                String tensValue = currency.getTensByValue(number);
                if (tensValue != null) {
                    result.append(tensValue);
                } else {
                    result.append(currency.getTensByIndex(number / 10 - 1));
                    result.append(currency.getUnitValue(number % 10 - 1));
                }
        }

    }

    private static void assertNumberValidity(int number) {
        if (number > MAX_LIMIT) throw MAX_LIMIT_ERROR;
    }


}
````
