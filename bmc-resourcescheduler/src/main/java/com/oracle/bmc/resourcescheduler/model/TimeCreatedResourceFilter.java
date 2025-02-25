/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcescheduler.model;

/**
 * This is a resource filter for filtering resources based on their creation time.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TimeCreatedResourceFilter.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "attribute"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TimeCreatedResourceFilter extends ResourceFilter {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * This is the condition for the filter in comparison to its creation time.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("condition")
        private Condition condition;

        /**
         * This is the condition for the filter in comparison to its creation time.
         * @param condition the value to set
         * @return this builder
         **/
        public Builder condition(Condition condition) {
            this.condition = condition;
            this.__explicitlySet__.add("condition");
            return this;
        }
        /**
         * This is the date and time as the value of the filter.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * This is the date and time as the value of the filter.
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

        public TimeCreatedResourceFilter build() {
            TimeCreatedResourceFilter model =
                    new TimeCreatedResourceFilter(this.condition, this.value);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TimeCreatedResourceFilter model) {
            if (model.wasPropertyExplicitlySet("condition")) {
                this.condition(model.getCondition());
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

    @Deprecated
    public TimeCreatedResourceFilter(Condition condition, String value) {
        super();
        this.condition = condition;
        this.value = value;
    }

    /**
     * This is the condition for the filter in comparison to its creation time.
     **/
    public enum Condition {
        Equal("EQUAL"),
        Before("BEFORE"),
        After("AFTER"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Condition.class);

        private final String value;
        private static java.util.Map<String, Condition> map;

        static {
            map = new java.util.HashMap<>();
            for (Condition v : Condition.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Condition(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Condition create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Condition', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * This is the condition for the filter in comparison to its creation time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("condition")
    private final Condition condition;

    /**
     * This is the condition for the filter in comparison to its creation time.
     * @return the value
     **/
    public Condition getCondition() {
        return condition;
    }

    /**
     * This is the date and time as the value of the filter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * This is the date and time as the value of the filter.
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
        sb.append("TimeCreatedResourceFilter(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", condition=").append(String.valueOf(this.condition));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TimeCreatedResourceFilter)) {
            return false;
        }

        TimeCreatedResourceFilter other = (TimeCreatedResourceFilter) o;
        return java.util.Objects.equals(this.condition, other.condition)
                && java.util.Objects.equals(this.value, other.value)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.condition == null ? 43 : this.condition.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        return result;
    }
}
