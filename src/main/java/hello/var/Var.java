package hello.var;

import leap.core.annotation.Bean;
import leap.core.variable.Variable;

@Bean(name = "userId")
public class Var implements Variable {
    @Override
    public Object getValue() {
        return "userId1";
    }
}
