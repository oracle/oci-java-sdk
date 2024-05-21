/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * Replication filter rule for a channel.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ChannelFilter.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ChannelFilter extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"type", "value"})
    public ChannelFilter(Type type, String value) {
        super();
        this.type = type;
        this.value = value;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The type of the filter rule.
         * <p>
         * For details on each type, see
         * [Replication Filtering Rules](https://dev.mysql.com/doc/refman/8.0/en/replication-rules.html)
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * The type of the filter rule.
         * <p>
         * For details on each type, see
         * [Replication Filtering Rules](https://dev.mysql.com/doc/refman/8.0/en/replication-rules.html)
         *
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * The body of the filter rule. This can represent a database, a table, or a database pair (represented as
         * "db1->db2"). For more information, see
         * [Replication Filtering Rules](https://dev.mysql.com/doc/refman/8.0/en/replication-rules.html).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * The body of the filter rule. This can represent a database, a table, or a database pair (represented as
         * "db1->db2"). For more information, see
         * [Replication Filtering Rules](https://dev.mysql.com/doc/refman/8.0/en/replication-rules.html).
         *
         * @param value the value to set
         * @return this builder
         **/
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ChannelFilter build() {
            ChannelFilter model = new ChannelFilter(this.type, this.value);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ChannelFilter model) {
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The type of the filter rule.
     * <p>
     * For details on each type, see
     * [Replication Filtering Rules](https://dev.mysql.com/doc/refman/8.0/en/replication-rules.html)
     *
     **/
    public enum Type {
        ReplicateDoDb("REPLICATE_DO_DB"),
        ReplicateIgnoreDb("REPLICATE_IGNORE_DB"),
        ReplicateDoTable("REPLICATE_DO_TABLE"),
        ReplicateIgnoreTable("REPLICATE_IGNORE_TABLE"),
        ReplicateWildDoTable("REPLICATE_WILD_DO_TABLE"),
        ReplicateWildIgnoreTable("REPLICATE_WILD_IGNORE_TABLE"),
        ReplicateRewriteDb("REPLICATE_REWRITE_DB"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of the filter rule.
     * <p>
     * For details on each type, see
     * [Replication Filtering Rules](https://dev.mysql.com/doc/refman/8.0/en/replication-rules.html)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * The type of the filter rule.
     * <p>
     * For details on each type, see
     * [Replication Filtering Rules](https://dev.mysql.com/doc/refman/8.0/en/replication-rules.html)
     *
     * @return the value
     **/
    public Type getType() {
        return type;
    }

    /**
     * The body of the filter rule. This can represent a database, a table, or a database pair (represented as
     * "db1->db2"). For more information, see
     * [Replication Filtering Rules](https://dev.mysql.com/doc/refman/8.0/en/replication-rules.html).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * The body of the filter rule. This can represent a database, a table, or a database pair (represented as
     * "db1->db2"). For more information, see
     * [Replication Filtering Rules](https://dev.mysql.com/doc/refman/8.0/en/replication-rules.html).
     *
     * @return the value
     **/
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ChannelFilter(");
        sb.append("super=").append(super.toString());
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChannelFilter)) {
            return false;
        }

        ChannelFilter other = (ChannelFilter) o;
        return java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.value, other.value)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
