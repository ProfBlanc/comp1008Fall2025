package wk6;

import java.util.regex.Pattern;

public class Course {

    private String code;

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        code = code.toLowerCase();
        String letters = code.substring(0, 4);
        String numbers = code.substring(4);

        if(Pattern.matches("\\d{4}", numbers)
                &&
                Pattern.matches("[a-z]{4}", letters)
                &&
                Pattern.matches("[a-zA-Z]{4}\\d{4}", code)
        ) {
            this.code = code;
            return;
        }
        throw new IllegalArgumentException("Invalid code");

    }
}
