/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * Composite condition resource with nested condition. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CompositeCondition.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "kind")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CompositeCondition extends Condition {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("leftOperand")
        private Condition leftOperand;

        public Builder leftOperand(Condition leftOperand) {
            this.leftOperand = leftOperand;
            this.__explicitlySet__.add("leftOperand");
            return this;
        }
        /** Composite condition operator */
        @com.fasterxml.jackson.annotation.JsonProperty("compositeOperator")
        private CompositeOperator compositeOperator;

        /**
         * Composite condition operator
         *
         * @param compositeOperator the value to set
         * @return this builder
         */
        public Builder compositeOperator(CompositeOperator compositeOperator) {
            this.compositeOperator = compositeOperator;
            this.__explicitlySet__.add("compositeOperator");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rightOperand")
        private Condition rightOperand;

        public Builder rightOperand(Condition rightOperand) {
            this.rightOperand = rightOperand;
            this.__explicitlySet__.add("rightOperand");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CompositeCondition build() {
            CompositeCondition model =
                    new CompositeCondition(
                            this.leftOperand, this.compositeOperator, this.rightOperand);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CompositeCondition model) {
            if (model.wasPropertyExplicitlySet("leftOperand")) {
                this.leftOperand(model.getLeftOperand());
            }
            if (model.wasPropertyExplicitlySet("compositeOperator")) {
                this.compositeOperator(model.getCompositeOperator());
            }
            if (model.wasPropertyExplicitlySet("rightOperand")) {
                this.rightOperand(model.getRightOperand());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public CompositeCondition(
            Condition leftOperand, CompositeOperator compositeOperator, Condition rightOperand) {
        super();
        this.leftOperand = leftOperand;
        this.compositeOperator = compositeOperator;
        this.rightOperand = rightOperand;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("leftOperand")
    private final Condition leftOperand;

    public Condition getLeftOperand() {
        return leftOperand;
    }

    /** Composite condition operator */
    public enum CompositeOperator implements com.oracle.bmc.http.internal.BmcEnum {
        And("AND"),
        Or("OR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(CompositeOperator.class);

        private final String value;
        private static java.util.Map<String, CompositeOperator> map;

        static {
            map = new java.util.HashMap<>();
            for (CompositeOperator v : CompositeOperator.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        CompositeOperator(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CompositeOperator create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'CompositeOperator', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Composite condition operator */
    @com.fasterxml.jackson.annotation.JsonProperty("compositeOperator")
    private final CompositeOperator compositeOperator;

    /**
     * Composite condition operator
     *
     * @return the value
     */
    public CompositeOperator getCompositeOperator() {
        return compositeOperator;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("rightOperand")
    private final Condition rightOperand;

    public Condition getRightOperand() {
        return rightOperand;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CompositeCondition(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", leftOperand=").append(String.valueOf(this.leftOperand));
        sb.append(", compositeOperator=").append(String.valueOf(this.compositeOperator));
        sb.append(", rightOperand=").append(String.valueOf(this.rightOperand));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CompositeCondition)) {
            return false;
        }

        CompositeCondition other = (CompositeCondition) o;
        return java.util.Objects.equals(this.leftOperand, other.leftOperand)
                && java.util.Objects.equals(this.compositeOperator, other.compositeOperator)
                && java.util.Objects.equals(this.rightOperand, other.rightOperand)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.leftOperand == null ? 43 : this.leftOperand.hashCode());
        result =
                (result * PRIME)
                        + (this.compositeOperator == null ? 43 : this.compositeOperator.hashCode());
        result = (result * PRIME) + (this.rightOperand == null ? 43 : this.rightOperand.hashCode());
        return result;
    }
}
