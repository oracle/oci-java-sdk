/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcescheduler.model;

/**
 * This is a resource filter for filtering resource based on compartment OCID. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CompartmentIdResourceFilter.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "attribute")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CompartmentIdResourceFilter extends ResourceFilter {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** This is the compartment used for filtering. */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * This is the compartment used for filtering.
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /** This sets whether to include child compartments. */
        @com.fasterxml.jackson.annotation.JsonProperty("shouldIncludeChildCompartments")
        private Boolean shouldIncludeChildCompartments;

        /**
         * This sets whether to include child compartments.
         *
         * @param shouldIncludeChildCompartments the value to set
         * @return this builder
         */
        public Builder shouldIncludeChildCompartments(Boolean shouldIncludeChildCompartments) {
            this.shouldIncludeChildCompartments = shouldIncludeChildCompartments;
            this.__explicitlySet__.add("shouldIncludeChildCompartments");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CompartmentIdResourceFilter build() {
            CompartmentIdResourceFilter model =
                    new CompartmentIdResourceFilter(
                            this.value, this.shouldIncludeChildCompartments);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CompartmentIdResourceFilter model) {
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("shouldIncludeChildCompartments")) {
                this.shouldIncludeChildCompartments(model.getShouldIncludeChildCompartments());
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
    public CompartmentIdResourceFilter(String value, Boolean shouldIncludeChildCompartments) {
        super();
        this.value = value;
        this.shouldIncludeChildCompartments = shouldIncludeChildCompartments;
    }

    /** This is the compartment used for filtering. */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * This is the compartment used for filtering.
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /** This sets whether to include child compartments. */
    @com.fasterxml.jackson.annotation.JsonProperty("shouldIncludeChildCompartments")
    private final Boolean shouldIncludeChildCompartments;

    /**
     * This sets whether to include child compartments.
     *
     * @return the value
     */
    public Boolean getShouldIncludeChildCompartments() {
        return shouldIncludeChildCompartments;
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
        sb.append("CompartmentIdResourceFilter(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", shouldIncludeChildCompartments=")
                .append(String.valueOf(this.shouldIncludeChildCompartments));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CompartmentIdResourceFilter)) {
            return false;
        }

        CompartmentIdResourceFilter other = (CompartmentIdResourceFilter) o;
        return java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(
                        this.shouldIncludeChildCompartments, other.shouldIncludeChildCompartments)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldIncludeChildCompartments == null
                                ? 43
                                : this.shouldIncludeChildCompartments.hashCode());
        return result;
    }
}
