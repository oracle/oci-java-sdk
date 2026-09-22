/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * One SQLNET parameter and its evaluated quantum readiness.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CryptoSqlnetParameter.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CryptoSqlnetParameter
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "value", "quantumReadiness"})
    public CryptoSqlnetParameter(
            String name,
            CryptoSqlnetParameterValue value,
            CryptoQuantumReadiness quantumReadiness) {
        super();
        this.name = name;
        this.value = value;
        this.quantumReadiness = quantumReadiness;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * SQLNET parameter name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * SQLNET parameter name.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private CryptoSqlnetParameterValue value;

        public Builder value(CryptoSqlnetParameterValue value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * Quantum-readiness classification of this parameter.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("quantumReadiness")
        private CryptoQuantumReadiness quantumReadiness;

        /**
         * Quantum-readiness classification of this parameter.
         * @param quantumReadiness the value to set
         * @return this builder
         **/
        public Builder quantumReadiness(CryptoQuantumReadiness quantumReadiness) {
            this.quantumReadiness = quantumReadiness;
            this.__explicitlySet__.add("quantumReadiness");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CryptoSqlnetParameter build() {
            CryptoSqlnetParameter model =
                    new CryptoSqlnetParameter(this.name, this.value, this.quantumReadiness);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CryptoSqlnetParameter model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("quantumReadiness")) {
                this.quantumReadiness(model.getQuantumReadiness());
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
     * SQLNET parameter name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * SQLNET parameter name.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final CryptoSqlnetParameterValue value;

    public CryptoSqlnetParameterValue getValue() {
        return value;
    }

    /**
     * Quantum-readiness classification of this parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("quantumReadiness")
    private final CryptoQuantumReadiness quantumReadiness;

    /**
     * Quantum-readiness classification of this parameter.
     * @return the value
     **/
    public CryptoQuantumReadiness getQuantumReadiness() {
        return quantumReadiness;
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
        sb.append("CryptoSqlnetParameter(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", quantumReadiness=").append(String.valueOf(this.quantumReadiness));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CryptoSqlnetParameter)) {
            return false;
        }

        CryptoSqlnetParameter other = (CryptoSqlnetParameter) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.quantumReadiness, other.quantumReadiness)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result =
                (result * PRIME)
                        + (this.quantumReadiness == null ? 43 : this.quantumReadiness.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
