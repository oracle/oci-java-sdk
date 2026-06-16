/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

/**
 * Describes a supported filter for an insight type. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220915")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = InsightFilterCapability.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InsightFilterCapability
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "type", "values", "canUsePartialMatch"})
    public InsightFilterCapability(
            String name, String type, java.util.List<String> values, Boolean canUsePartialMatch) {
        super();
        this.name = name;
        this.type = type;
        this.values = values;
        this.canUsePartialMatch = canUsePartialMatch;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of the filter parameter. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the filter parameter.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Data type of the filter parameter. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * Data type of the filter parameter.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** Allowed values for enum-based filters. */
        @com.fasterxml.jackson.annotation.JsonProperty("values")
        private java.util.List<String> values;

        /**
         * Allowed values for enum-based filters.
         *
         * @param values the value to set
         * @return this builder
         */
        public Builder values(java.util.List<String> values) {
            this.values = values;
            this.__explicitlySet__.add("values");
            return this;
        }
        /** Indicates whether partial matching is supported. */
        @com.fasterxml.jackson.annotation.JsonProperty("canUsePartialMatch")
        private Boolean canUsePartialMatch;

        /**
         * Indicates whether partial matching is supported.
         *
         * @param canUsePartialMatch the value to set
         * @return this builder
         */
        public Builder canUsePartialMatch(Boolean canUsePartialMatch) {
            this.canUsePartialMatch = canUsePartialMatch;
            this.__explicitlySet__.add("canUsePartialMatch");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InsightFilterCapability build() {
            InsightFilterCapability model =
                    new InsightFilterCapability(
                            this.name, this.type, this.values, this.canUsePartialMatch);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InsightFilterCapability model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("values")) {
                this.values(model.getValues());
            }
            if (model.wasPropertyExplicitlySet("canUsePartialMatch")) {
                this.canUsePartialMatch(model.getCanUsePartialMatch());
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

    /** Name of the filter parameter. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the filter parameter.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Data type of the filter parameter. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * Data type of the filter parameter.
     *
     * @return the value
     */
    public String getType() {
        return type;
    }

    /** Allowed values for enum-based filters. */
    @com.fasterxml.jackson.annotation.JsonProperty("values")
    private final java.util.List<String> values;

    /**
     * Allowed values for enum-based filters.
     *
     * @return the value
     */
    public java.util.List<String> getValues() {
        return values;
    }

    /** Indicates whether partial matching is supported. */
    @com.fasterxml.jackson.annotation.JsonProperty("canUsePartialMatch")
    private final Boolean canUsePartialMatch;

    /**
     * Indicates whether partial matching is supported.
     *
     * @return the value
     */
    public Boolean getCanUsePartialMatch() {
        return canUsePartialMatch;
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
        sb.append("InsightFilterCapability(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", values=").append(String.valueOf(this.values));
        sb.append(", canUsePartialMatch=").append(String.valueOf(this.canUsePartialMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InsightFilterCapability)) {
            return false;
        }

        InsightFilterCapability other = (InsightFilterCapability) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.values, other.values)
                && java.util.Objects.equals(this.canUsePartialMatch, other.canUsePartialMatch)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.values == null ? 43 : this.values.hashCode());
        result =
                (result * PRIME)
                        + (this.canUsePartialMatch == null
                                ? 43
                                : this.canUsePartialMatch.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
