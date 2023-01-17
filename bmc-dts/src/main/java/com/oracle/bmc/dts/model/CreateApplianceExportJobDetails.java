/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dts.model;

/**
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.017")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateApplianceExportJobDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CreateApplianceExportJobDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "bucketName",
        "displayName",
        "prefix",
        "rangeStart",
        "rangeEnd",
        "customerShippingAddress",
        "freeformTags",
        "definedTags"
    })
    public CreateApplianceExportJobDetails(
            String compartmentId,
            String bucketName,
            String displayName,
            String prefix,
            String rangeStart,
            String rangeEnd,
            ShippingAddress customerShippingAddress,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.bucketName = bucketName;
        this.displayName = displayName;
        this.prefix = prefix;
        this.rangeStart = rangeStart;
        this.rangeEnd = rangeEnd;
        this.customerShippingAddress = customerShippingAddress;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
        private String bucketName;

        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            this.__explicitlySet__.add("bucketName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** List of objects with names matching this prefix would be part of this export job. */
        @com.fasterxml.jackson.annotation.JsonProperty("prefix")
        private String prefix;

        /**
         * List of objects with names matching this prefix would be part of this export job.
         *
         * @param prefix the value to set
         * @return this builder
         */
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            this.__explicitlySet__.add("prefix");
            return this;
        }
        /** Object names returned by a list query must be greater or equal to this parameter. */
        @com.fasterxml.jackson.annotation.JsonProperty("rangeStart")
        private String rangeStart;

        /**
         * Object names returned by a list query must be greater or equal to this parameter.
         *
         * @param rangeStart the value to set
         * @return this builder
         */
        public Builder rangeStart(String rangeStart) {
            this.rangeStart = rangeStart;
            this.__explicitlySet__.add("rangeStart");
            return this;
        }
        /** Object names returned by a list query must be strictly less than this parameter. */
        @com.fasterxml.jackson.annotation.JsonProperty("rangeEnd")
        private String rangeEnd;

        /**
         * Object names returned by a list query must be strictly less than this parameter.
         *
         * @param rangeEnd the value to set
         * @return this builder
         */
        public Builder rangeEnd(String rangeEnd) {
            this.rangeEnd = rangeEnd;
            this.__explicitlySet__.add("rangeEnd");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customerShippingAddress")
        private ShippingAddress customerShippingAddress;

        public Builder customerShippingAddress(ShippingAddress customerShippingAddress) {
            this.customerShippingAddress = customerShippingAddress;
            this.__explicitlySet__.add("customerShippingAddress");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateApplianceExportJobDetails build() {
            CreateApplianceExportJobDetails model =
                    new CreateApplianceExportJobDetails(
                            this.compartmentId,
                            this.bucketName,
                            this.displayName,
                            this.prefix,
                            this.rangeStart,
                            this.rangeEnd,
                            this.customerShippingAddress,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateApplianceExportJobDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("bucketName")) {
                this.bucketName(model.getBucketName());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("prefix")) {
                this.prefix(model.getPrefix());
            }
            if (model.wasPropertyExplicitlySet("rangeStart")) {
                this.rangeStart(model.getRangeStart());
            }
            if (model.wasPropertyExplicitlySet("rangeEnd")) {
                this.rangeEnd(model.getRangeEnd());
            }
            if (model.wasPropertyExplicitlySet("customerShippingAddress")) {
                this.customerShippingAddress(model.getCustomerShippingAddress());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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

    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
    private final String bucketName;

    public String getBucketName() {
        return bucketName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /** List of objects with names matching this prefix would be part of this export job. */
    @com.fasterxml.jackson.annotation.JsonProperty("prefix")
    private final String prefix;

    /**
     * List of objects with names matching this prefix would be part of this export job.
     *
     * @return the value
     */
    public String getPrefix() {
        return prefix;
    }

    /** Object names returned by a list query must be greater or equal to this parameter. */
    @com.fasterxml.jackson.annotation.JsonProperty("rangeStart")
    private final String rangeStart;

    /**
     * Object names returned by a list query must be greater or equal to this parameter.
     *
     * @return the value
     */
    public String getRangeStart() {
        return rangeStart;
    }

    /** Object names returned by a list query must be strictly less than this parameter. */
    @com.fasterxml.jackson.annotation.JsonProperty("rangeEnd")
    private final String rangeEnd;

    /**
     * Object names returned by a list query must be strictly less than this parameter.
     *
     * @return the value
     */
    public String getRangeEnd() {
        return rangeEnd;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("customerShippingAddress")
    private final ShippingAddress customerShippingAddress;

    public ShippingAddress getCustomerShippingAddress() {
        return customerShippingAddress;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("CreateApplianceExportJobDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", bucketName=").append(String.valueOf(this.bucketName));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", prefix=").append(String.valueOf(this.prefix));
        sb.append(", rangeStart=").append(String.valueOf(this.rangeStart));
        sb.append(", rangeEnd=").append(String.valueOf(this.rangeEnd));
        sb.append(", customerShippingAddress=")
                .append(String.valueOf(this.customerShippingAddress));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateApplianceExportJobDetails)) {
            return false;
        }

        CreateApplianceExportJobDetails other = (CreateApplianceExportJobDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.prefix, other.prefix)
                && java.util.Objects.equals(this.rangeStart, other.rangeStart)
                && java.util.Objects.equals(this.rangeEnd, other.rangeEnd)
                && java.util.Objects.equals(
                        this.customerShippingAddress, other.customerShippingAddress)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.bucketName == null ? 43 : this.bucketName.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.prefix == null ? 43 : this.prefix.hashCode());
        result = (result * PRIME) + (this.rangeStart == null ? 43 : this.rangeStart.hashCode());
        result = (result * PRIME) + (this.rangeEnd == null ? 43 : this.rangeEnd.hashCode());
        result =
                (result * PRIME)
                        + (this.customerShippingAddress == null
                                ? 43
                                : this.customerShippingAddress.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
