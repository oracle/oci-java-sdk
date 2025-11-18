/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dbmulticloud.model;

/**
 * This object is about to provide input params to create Oracle DB AWS Identity Connector Resource.
 * <br>
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
        builder = UpdateOracleDbAwsIdentityConnectorDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateOracleDbAwsIdentityConnectorDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "resourceId",
        "oidcScope",
        "issuerUrl",
        "serviceRoleDetails",
        "awsLocation",
        "awsStsPrivateEndpoint",
        "awsAccountId",
        "freeformTags",
        "definedTags"
    })
    public UpdateOracleDbAwsIdentityConnectorDetails(
            String displayName,
            String resourceId,
            String oidcScope,
            String issuerUrl,
            java.util.List<ServiceRoleDetail> serviceRoleDetails,
            String awsLocation,
            String awsStsPrivateEndpoint,
            String awsAccountId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.resourceId = resourceId;
        this.oidcScope = oidcScope;
        this.issuerUrl = issuerUrl;
        this.serviceRoleDetails = serviceRoleDetails;
        this.awsLocation = awsLocation;
        this.awsStsPrivateEndpoint = awsStsPrivateEndpoint;
        this.awsAccountId = awsAccountId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Oracle DB Google AWS Identity Connector resource name. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Oracle DB Google AWS Identity Connector resource name.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * AWS VM Cluster resource.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * AWS VM Cluster resource.
         *
         * @param resourceId the value to set
         * @return this builder
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /** IAM Domain scope for issuer URL. */
        @com.fasterxml.jackson.annotation.JsonProperty("oidcScope")
        private String oidcScope;

        /**
         * IAM Domain scope for issuer URL.
         *
         * @param oidcScope the value to set
         * @return this builder
         */
        public Builder oidcScope(String oidcScope) {
            this.oidcScope = oidcScope;
            this.__explicitlySet__.add("oidcScope");
            return this;
        }
        /** OIDC token issuer Url. */
        @com.fasterxml.jackson.annotation.JsonProperty("issuerUrl")
        private String issuerUrl;

        /**
         * OIDC token issuer Url.
         *
         * @param issuerUrl the value to set
         * @return this builder
         */
        public Builder issuerUrl(String issuerUrl) {
            this.issuerUrl = issuerUrl;
            this.__explicitlySet__.add("issuerUrl");
            return this;
        }
        /** Service role details and respective Amazon resource nam of Role. */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceRoleDetails")
        private java.util.List<ServiceRoleDetail> serviceRoleDetails;

        /**
         * Service role details and respective Amazon resource nam of Role.
         *
         * @param serviceRoleDetails the value to set
         * @return this builder
         */
        public Builder serviceRoleDetails(java.util.List<ServiceRoleDetail> serviceRoleDetails) {
            this.serviceRoleDetails = serviceRoleDetails;
            this.__explicitlySet__.add("serviceRoleDetails");
            return this;
        }
        /** AWS resource Location. */
        @com.fasterxml.jackson.annotation.JsonProperty("awsLocation")
        private String awsLocation;

        /**
         * AWS resource Location.
         *
         * @param awsLocation the value to set
         * @return this builder
         */
        public Builder awsLocation(String awsLocation) {
            this.awsLocation = awsLocation;
            this.__explicitlySet__.add("awsLocation");
            return this;
        }
        /** Private endpoint of AWS Security Token Service. */
        @com.fasterxml.jackson.annotation.JsonProperty("awsStsPrivateEndpoint")
        private String awsStsPrivateEndpoint;

        /**
         * Private endpoint of AWS Security Token Service.
         *
         * @param awsStsPrivateEndpoint the value to set
         * @return this builder
         */
        public Builder awsStsPrivateEndpoint(String awsStsPrivateEndpoint) {
            this.awsStsPrivateEndpoint = awsStsPrivateEndpoint;
            this.__explicitlySet__.add("awsStsPrivateEndpoint");
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

        public UpdateOracleDbAwsIdentityConnectorDetails build() {
            UpdateOracleDbAwsIdentityConnectorDetails model =
                    new UpdateOracleDbAwsIdentityConnectorDetails(
                            this.displayName,
                            this.resourceId,
                            this.oidcScope,
                            this.issuerUrl,
                            this.serviceRoleDetails,
                            this.awsLocation,
                            this.awsStsPrivateEndpoint,
                            this.awsAccountId,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateOracleDbAwsIdentityConnectorDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
            }
            if (model.wasPropertyExplicitlySet("oidcScope")) {
                this.oidcScope(model.getOidcScope());
            }
            if (model.wasPropertyExplicitlySet("issuerUrl")) {
                this.issuerUrl(model.getIssuerUrl());
            }
            if (model.wasPropertyExplicitlySet("serviceRoleDetails")) {
                this.serviceRoleDetails(model.getServiceRoleDetails());
            }
            if (model.wasPropertyExplicitlySet("awsLocation")) {
                this.awsLocation(model.getAwsLocation());
            }
            if (model.wasPropertyExplicitlySet("awsStsPrivateEndpoint")) {
                this.awsStsPrivateEndpoint(model.getAwsStsPrivateEndpoint());
            }
            if (model.wasPropertyExplicitlySet("awsAccountId")) {
                this.awsAccountId(model.getAwsAccountId());
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

    /** Oracle DB Google AWS Identity Connector resource name. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Oracle DB Google AWS Identity Connector resource name.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the AWS
     * VM Cluster resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the AWS
     * VM Cluster resource.
     *
     * @return the value
     */
    public String getResourceId() {
        return resourceId;
    }

    /** IAM Domain scope for issuer URL. */
    @com.fasterxml.jackson.annotation.JsonProperty("oidcScope")
    private final String oidcScope;

    /**
     * IAM Domain scope for issuer URL.
     *
     * @return the value
     */
    public String getOidcScope() {
        return oidcScope;
    }

    /** OIDC token issuer Url. */
    @com.fasterxml.jackson.annotation.JsonProperty("issuerUrl")
    private final String issuerUrl;

    /**
     * OIDC token issuer Url.
     *
     * @return the value
     */
    public String getIssuerUrl() {
        return issuerUrl;
    }

    /** Service role details and respective Amazon resource nam of Role. */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceRoleDetails")
    private final java.util.List<ServiceRoleDetail> serviceRoleDetails;

    /**
     * Service role details and respective Amazon resource nam of Role.
     *
     * @return the value
     */
    public java.util.List<ServiceRoleDetail> getServiceRoleDetails() {
        return serviceRoleDetails;
    }

    /** AWS resource Location. */
    @com.fasterxml.jackson.annotation.JsonProperty("awsLocation")
    private final String awsLocation;

    /**
     * AWS resource Location.
     *
     * @return the value
     */
    public String getAwsLocation() {
        return awsLocation;
    }

    /** Private endpoint of AWS Security Token Service. */
    @com.fasterxml.jackson.annotation.JsonProperty("awsStsPrivateEndpoint")
    private final String awsStsPrivateEndpoint;

    /**
     * Private endpoint of AWS Security Token Service.
     *
     * @return the value
     */
    public String getAwsStsPrivateEndpoint() {
        return awsStsPrivateEndpoint;
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
        sb.append("UpdateOracleDbAwsIdentityConnectorDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", oidcScope=").append(String.valueOf(this.oidcScope));
        sb.append(", issuerUrl=").append(String.valueOf(this.issuerUrl));
        sb.append(", serviceRoleDetails=").append(String.valueOf(this.serviceRoleDetails));
        sb.append(", awsLocation=").append(String.valueOf(this.awsLocation));
        sb.append(", awsStsPrivateEndpoint=").append(String.valueOf(this.awsStsPrivateEndpoint));
        sb.append(", awsAccountId=").append(String.valueOf(this.awsAccountId));
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
        if (!(o instanceof UpdateOracleDbAwsIdentityConnectorDetails)) {
            return false;
        }

        UpdateOracleDbAwsIdentityConnectorDetails other =
                (UpdateOracleDbAwsIdentityConnectorDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.oidcScope, other.oidcScope)
                && java.util.Objects.equals(this.issuerUrl, other.issuerUrl)
                && java.util.Objects.equals(this.serviceRoleDetails, other.serviceRoleDetails)
                && java.util.Objects.equals(this.awsLocation, other.awsLocation)
                && java.util.Objects.equals(this.awsStsPrivateEndpoint, other.awsStsPrivateEndpoint)
                && java.util.Objects.equals(this.awsAccountId, other.awsAccountId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result = (result * PRIME) + (this.oidcScope == null ? 43 : this.oidcScope.hashCode());
        result = (result * PRIME) + (this.issuerUrl == null ? 43 : this.issuerUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceRoleDetails == null
                                ? 43
                                : this.serviceRoleDetails.hashCode());
        result = (result * PRIME) + (this.awsLocation == null ? 43 : this.awsLocation.hashCode());
        result =
                (result * PRIME)
                        + (this.awsStsPrivateEndpoint == null
                                ? 43
                                : this.awsStsPrivateEndpoint.hashCode());
        result = (result * PRIME) + (this.awsAccountId == null ? 43 : this.awsAccountId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
