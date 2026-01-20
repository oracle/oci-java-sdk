/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * State stored in All States Map of Composite State <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = State.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class State extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "parameterValue", "timeValue"})
    public State(String name, ParameterValue parameterValue, java.util.Date timeValue) {
        super();
        this.name = name;
        this.parameterValue = parameterValue;
        this.timeValue = timeValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A simple name for the State. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * A simple name for the State.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parameterValue")
        private ParameterValue parameterValue;

        public Builder parameterValue(ParameterValue parameterValue) {
            this.parameterValue = parameterValue;
            this.__explicitlySet__.add("parameterValue");
            return this;
        }
        /** To store a date value for the State we use dateValue attribute. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeValue")
        private java.util.Date timeValue;

        /**
         * To store a date value for the State we use dateValue attribute.
         *
         * @param timeValue the value to set
         * @return this builder
         */
        public Builder timeValue(java.util.Date timeValue) {
            this.timeValue = timeValue;
            this.__explicitlySet__.add("timeValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public State build() {
            State model = new State(this.name, this.parameterValue, this.timeValue);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(State model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("parameterValue")) {
                this.parameterValue(model.getParameterValue());
            }
            if (model.wasPropertyExplicitlySet("timeValue")) {
                this.timeValue(model.getTimeValue());
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

    /** A simple name for the State. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * A simple name for the State.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("parameterValue")
    private final ParameterValue parameterValue;

    public ParameterValue getParameterValue() {
        return parameterValue;
    }

    /** To store a date value for the State we use dateValue attribute. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeValue")
    private final java.util.Date timeValue;

    /**
     * To store a date value for the State we use dateValue attribute.
     *
     * @return the value
     */
    public java.util.Date getTimeValue() {
        return timeValue;
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
        sb.append("State(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", parameterValue=").append(String.valueOf(this.parameterValue));
        sb.append(", timeValue=").append(String.valueOf(this.timeValue));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof State)) {
            return false;
        }

        State other = (State) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.parameterValue, other.parameterValue)
                && java.util.Objects.equals(this.timeValue, other.timeValue)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.parameterValue == null ? 43 : this.parameterValue.hashCode());
        result = (result * PRIME) + (this.timeValue == null ? 43 : this.timeValue.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
