package hexlet.code.validators;

import hexlet.code.Validator;
import lombok.Setter;


public class StringSchema implements Schema {
    @Setter
    private Validator validator;

    public StringSchema() {
    }

    @Override
    public boolean isValid(Object value) {
        return false;
    }

    public void required(){

    }

    public void minLength(int count) {

    }

    public void contains(String text) {

    }
}
