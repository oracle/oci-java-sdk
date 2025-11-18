/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dbmulticloud.model;

/**
 * Create Oracle DB AWS Key object. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateOracleDbAwsKeyDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateOracleDbAwsKeyDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "oracleDbConnectorId",
        "displayName",
        "awsKeyArn",
        "awsAccountId",
        "type",
        "location",
        "isAwsKeyEnabled",
        "properties",
        "freeformTags",
        "definedTags"
    })
    public CreateOracleDbAwsKeyDetails(
            String compartmentId,
            String oracleDbConnectorId,
            String displayName,
            String awsKeyArn,
            String awsAccountId,
            String type,
            String location,
            Boolean isAwsKeyEnabled,
            java.util.Map<String, String> properties,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.oracleDbConnectorId = oracleDbConnectorId;
        this.displayName = displayName;
        this.awsKeyArn = awsKeyArn;
        this.awsAccountId = awsAccountId;
        this.type = type;
        this.location = location;
        this.isAwsKeyEnabled = isAwsKeyEnabled;
        this.properties = properties;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment that contains Oracle DB AWS Key resource.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment that contains Oracle DB AWS Key resource.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Oracle DB Connector resource.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("oracleDbConnectorId")
        private String oracleDbConnectorId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Oracle DB Connector resource.
         *
         * @param oracleDbConnectorId the value to set
         * @return this builder
         */
        public Builder oracleDbConnectorId(String oracleDbConnectorId) {
            this.oracleDbConnectorId = oracleDbConnectorId;
            this.__explicitlySet__.add("oracleDbConnectorId");
            return this;
        }
        /** Oracle DB AWS Key resource name. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Oracle DB AWS Key resource name.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Amazon resource name of AWS Key. */
        @com.fasterxml.jackson.annotation.JsonProperty("awsKeyArn")
        private String awsKeyArn;

        /**
         * Amazon resource name of AWS Key.
         *
         * @param awsKeyArn the value to set
         * @return this builder
         */
        public Builder awsKeyArn(String awsKeyArn) {
            this.awsKeyArn = awsKeyArn;
            this.__explicitlySet__.add("awsKeyArn");
            return this;
        }
        /** AWS Account ID. */
        @com.fasterxml.jackson.annotation.JsonProperty("awsAccountId")
        private String awsAccountId;

        /**
         * AWS Account ID.
         *
         * @param awsAccountId the value to set
         * @return this builder
         */
        public Builder awsAccountId(String awsAccountId) {
            this.awsAccountId = awsAccountId;
            this.__explicitlySet__.add("awsAccountId");
            return this;
        }
        /** AWS Key resource type. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * AWS Key resource type.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** AWS Key resource Location. */
        @com.fasterxml.jackson.annotation.JsonProperty("location")
        private String location;

        /**
         * AWS Key resource Location.
         *
         * @param location the value to set
         * @return this builder
         */
        public Builder location(String location) {
            this.location = location;
            this.__explicitlySet__.add("location");
            return this;
        }
        /** The Oracle AWS Key resource is enabled or disabled at AWS. */
        @com.fasterxml.jackson.annotation.JsonProperty("isAwsKeyEnabled")
        private Boolean isAwsKeyEnabled;

        /**
         * The Oracle AWS Key resource is enabled or disabled at AWS.
         *
         * @param isAwsKeyEnabled the value to set
         * @return this builder
         */
        public Builder isAwsKeyEnabled(Boolean isAwsKeyEnabled) {
            this.isAwsKeyEnabled = isAwsKeyEnabled;
            this.__explicitlySet__.add("isAwsKeyEnabled");
            return this;
        }
        /** AWS Key resource's properties. */
        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.Map<String, String> properties;

        /**
         * AWS Key resource's properties.
         *
         * @param properties the value to set
         * @return this builder
         */
        public Builder properties(java.util.Map<String, String> properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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

        public CreateOracleDbAwsKeyDetails build() {
            CreateOracleDbAwsKeyDetails model =
                    new CreateOracleDbAwsKeyDetails(
                            this.compartmentId,
                            this.oracleDbConnectorId,
                            this.displayName,
                            this.awsKeyArn,
                            this.awsAccountId,
                            this.type,
                            this.location,
                            this.isAwsKeyEnabled,
                            this.properties,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateOracleDbAwsKeyDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("oracleDbConnectorId")) {
                this.oracleDbConnectorId(model.getOracleDbConnectorId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("awsKeyArn")) {
                this.awsKeyArn(model.getAwsKeyArn());
            }
            if (model.wasPropertyExplicitlySet("awsAccountId")) {
                this.awsAccountId(model.getAwsAccountId());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("location")) {
                this.location(model.getLocation());
            }
            if (model.wasPropertyExplicitlySet("isAwsKeyEnabled")) {
                this.isAwsKeyEnabled(model.getIsAwsKeyEnabled());
            }
            if (model.wasPropertyExplicitlySet("properties")) {
                this.properties(model.getProperties());
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

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment that contains Oracle DB AWS Key resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment that contains Oracle DB AWS Key resource.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Oracle DB Connector resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("oracleDbConnectorId")
    private final String oracleDbConnectorId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Oracle DB Connector resource.
     *
     * @return the value
     */
    public String getOracleDbConnectorId() {
        return oracleDbConnectorId;
    }

    /** Oracle DB AWS Key resource name. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Oracle DB AWS Key resource name.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Amazon resource name of AWS Key. */
    @com.fasterxml.jackson.annotation.JsonProperty("awsKeyArn")
    private final String awsKeyArn;

    /**
     * Amazon resource name of AWS Key.
     *
     * @return the value
     */
    public String getAwsKeyArn() {
        return awsKeyArn;
    }

    /** AWS Account ID. */
    @com.fasterxml.jackson.annotation.JsonProperty("awsAccountId")
    private final String awsAccountId;

    /**
     * AWS Account ID.
     *
     * @return the value
     */
    public String getAwsAccountId() {
        return awsAccountId;
    }

    /** AWS Key resource type. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * AWS Key resource type.
     *
     * @return the value
     */
    public String getType() {
        return type;
    }

    /** AWS Key resource Location. */
    @com.fasterxml.jackson.annotation.JsonProperty("location")
    private final String location;

    /**
     * AWS Key resource Location.
     *
     * @return the value
     */
    public String getLocation() {
        return location;
    }

    /** The Oracle AWS Key resource is enabled or disabled at AWS. */
    @com.fasterxml.jackson.annotation.JsonProperty("isAwsKeyEnabled")
    private final Boolean isAwsKeyEnabled;

    /**
     * The Oracle AWS Key resource is enabled or disabled at AWS.
     *
     * @return the value
     */
    public Boolean getIsAwsKeyEnabled() {
        return isAwsKeyEnabled;
    }

    /** AWS Key resource's properties. */
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.Map<String, String> properties;

    /**
     * AWS Key resource's properties.
     *
     * @return the value
     */
    public java.util.Map<String, String> getProperties() {
        return properties;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
        sb.append("CreateOracleDbAwsKeyDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", oracleDbConnectorId=").append(String.valueOf(this.oracleDbConnectorId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", awsKeyArn=").append(String.valueOf(this.awsKeyArn));
        sb.append(", awsAccountId=").append(String.valueOf(this.awsAccountId));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", location=").append(String.valueOf(this.location));
        sb.append(", isAwsKeyEnabled=").append(String.valueOf(this.isAwsKeyEnabled));
        sb.append(", properties=").append(String.valueOf(this.properties));
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
        if (!(o instanceof CreateOracleDbAwsKeyDetails)) {
            return false;
        }

        CreateOracleDbAwsKeyDetails other = (CreateOracleDbAwsKeyDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.oracleDbConnectorId, other.oracleDbConnectorId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.awsKeyArn, other.awsKeyArn)
                && java.util.Objects.equals(this.awsAccountId, other.awsAccountId)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.isAwsKeyEnabled, other.isAwsKeyEnabled)
                && java.util.Objects.equals(this.properties, other.properties)
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
        result =
                (result * PRIME)
                        + (this.oracleDbConnectorId == null
                                ? 43
                                : this.oracleDbConnectorId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.awsKeyArn == null ? 43 : this.awsKeyArn.hashCode());
        result = (result * PRIME) + (this.awsAccountId == null ? 43 : this.awsAccountId.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result =
                (result * PRIME)
                        + (this.isAwsKeyEnabled == null ? 43 : this.isAwsKeyEnabled.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
