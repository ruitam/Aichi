package jp.co.bananadream.practice6.yanagawa.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Send}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2017/08/31 15:03:31")
public class SendNames {

    /**
     * postelCodeのプロパティ名を返します。
     * 
     * @return postelCodeのプロパティ名
     */
    public static PropertyName<String> postelCode() {
        return new PropertyName<String>("postelCode");
    }

    /**
     * addressのプロパティ名を返します。
     * 
     * @return addressのプロパティ名
     */
    public static PropertyName<String> address() {
        return new PropertyName<String>("address");
    }

    /**
     * searchのプロパティ名を返します。
     * 
     * @return searchのプロパティ名
     */
    public static PropertyName<String> search() {
        return new PropertyName<String>("search");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _SendNames extends PropertyName<Send> {

        /**
         * インスタンスを構築します。
         */
        public _SendNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _SendNames(final String name) {
            super(name);
        }

        /**
         * インスタンスを構築します。
         * 
         * @param parent
         *            親
         * @param name
         *            名前
         */
        public _SendNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * postelCodeのプロパティ名を返します。
         *
         * @return postelCodeのプロパティ名
         */
        public PropertyName<String> postelCode() {
            return new PropertyName<String>(this, "postelCode");
        }

        /**
         * addressのプロパティ名を返します。
         *
         * @return addressのプロパティ名
         */
        public PropertyName<String> address() {
            return new PropertyName<String>(this, "address");
        }

        /**
         * searchのプロパティ名を返します。
         *
         * @return searchのプロパティ名
         */
        public PropertyName<String> search() {
            return new PropertyName<String>(this, "search");
        }
    }
}