package entity;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @author 61749
 */
public class RpcRequest implements Serializable {
    private String className;
    private String methodName;
    private Object[] param;
    private Class[] types;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Object[] getParam() {
        return param;
    }

    public void setParam(Object[] param) {
        this.param = param;
    }

    public Class[] getTypes() {
        return types;
    }

    public void setTypes(Class[] types) {
        this.types = types;
    }

    @Override
    public String toString() {
        return "RpcRequest{" +
                "className='" + className + '\'' +
                ", methodName='" + methodName + '\'' +
                ", param=" + Arrays.toString(param) +
                ", types=" + Arrays.toString(types) +
                '}';
    }
}
