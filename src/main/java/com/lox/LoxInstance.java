package com.lox;

import java.util.HashMap;
import java.util.Map;

class LoxInstance {
    LoxClass cls;
    private final Map<String, Object> fields = new HashMap<>();

    LoxInstance(LoxClass cls) {
        this.cls = cls;
    }

    Object get(Token name) {
        if (fields.containsKey(name.lexeme)) {
            return fields.get(name.lexeme);
        }

        LoxFunction method = cls.findMethod(name.lexeme);
        if (method != null) return method.bind(this);
        throw new RuntimeError(name, "Undefined property '" + name.lexeme + "'.");
    }

    void set(Token name, Object value) {
        fields.put(name.lexeme, value);
    }

    @Override
    public String toString() {
        return cls.name + " instance";
    }
}
