/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * A summary of an entitlement included in a usage plan.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = EntitlementSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class EntitlementSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "description", "rateLimit", "quota"})
    public EntitlementSummary(String name, String description, RateLimit rateLimit, Quota quota) {
        super();
        this.name = name;
        this.description = description;
        this.rateLimit = rateLimit;
        this.quota = quota;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * An entitlement name, unique within a usage plan.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * An entitlement name, unique within a usage plan.
         *
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * A user-friendly description. To provide some insight about the resource.
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A user-friendly description. To provide some insight about the resource.
         * Avoid entering confidential information.
         *
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rateLimit")
        private RateLimit rateLimit;

        public Builder rateLimit(RateLimit rateLimit) {
            this.rateLimit = rateLimit;
            this.__explicitlySet__.add("rateLimit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("quota")
        private Quota quota;

        public Builder quota(Quota quota) {
            this.quota = quota;
            this.__explicitlySet__.add("quota");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EntitlementSummary build() {
            EntitlementSummary model =
                    new EntitlementSummary(this.name, this.description, this.rateLimit, this.quota);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EntitlementSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("rateLimit")) {
                this.rateLimit(model.getRateLimit());
            }
            if (model.wasPropertyExplicitlySet("quota")) {
                this.quota(model.getQuota());
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
     * An entitlement name, unique within a usage plan.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * An entitlement name, unique within a usage plan.
     *
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * A user-friendly description. To provide some insight about the resource.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A user-friendly description. To provide some insight about the resource.
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("rateLimit")
    private final RateLimit rateLimit;

    public RateLimit getRateLimit() {
        return rateLimit;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("quota")
    private final Quota quota;

    public Quota getQuota() {
        return quota;
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
        sb.append("EntitlementSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", rateLimit=").append(String.valueOf(this.rateLimit));
        sb.append(", quota=").append(String.valueOf(this.quota));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EntitlementSummary)) {
            return false;
        }

        EntitlementSummary other = (EntitlementSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.rateLimit, other.rateLimit)
                && java.util.Objects.equals(this.quota, other.quota)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.rateLimit == null ? 43 : this.rateLimit.hashCode());
        result = (result * PRIME) + (this.quota == null ? 43 : this.quota.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
