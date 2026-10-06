/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ociproductcatalog.model;

/**
 * The details of a sku <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SkuSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SkuSummary extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"bpartNumber", "description"})
    public SkuSummary(String bpartNumber, String description) {
        super();
        this.bpartNumber = bpartNumber;
        this.description = description;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** sku bpartNumber */
        @com.fasterxml.jackson.annotation.JsonProperty("bpartNumber")
        private String bpartNumber;

        /**
         * sku bpartNumber
         *
         * @param bpartNumber the value to set
         * @return this builder
         */
        public Builder bpartNumber(String bpartNumber) {
            this.bpartNumber = bpartNumber;
            this.__explicitlySet__.add("bpartNumber");
            return this;
        }
        /** description of the sku */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * description of the sku
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SkuSummary build() {
            SkuSummary model = new SkuSummary(this.bpartNumber, this.description);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SkuSummary model) {
            if (model.wasPropertyExplicitlySet("bpartNumber")) {
                this.bpartNumber(model.getBpartNumber());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
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

    /** sku bpartNumber */
    @com.fasterxml.jackson.annotation.JsonProperty("bpartNumber")
    private final String bpartNumber;

    /**
     * sku bpartNumber
     *
     * @return the value
     */
    public String getBpartNumber() {
        return bpartNumber;
    }

    /** description of the sku */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * description of the sku
     *
     * @return the value
     */
    public String getDescription() {
        return description;
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
        sb.append("SkuSummary(");
        sb.append("super=").append(super.toString());
        sb.append("bpartNumber=").append(String.valueOf(this.bpartNumber));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SkuSummary)) {
            return false;
        }

        SkuSummary other = (SkuSummary) o;
        return java.util.Objects.equals(this.bpartNumber, other.bpartNumber)
                && java.util.Objects.equals(this.description, other.description)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.bpartNumber == null ? 43 : this.bpartNumber.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
