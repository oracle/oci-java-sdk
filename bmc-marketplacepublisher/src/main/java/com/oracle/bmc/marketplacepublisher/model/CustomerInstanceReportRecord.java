/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * The model for instance report item <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CustomerInstanceReportRecord.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CustomerInstanceReportRecord
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "publisherId",
        "listingName",
        "listingId",
        "listingVersionId",
        "packageVersion",
        "packageVersionId",
        "status",
        "instanceId",
        "timeInstanceCreation",
        "timeInstanceTermination",
        "region",
        "realm",
        "shape",
        "ociTenancy",
        "tenantAdminName",
        "tenantAdminEmail",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public CustomerInstanceReportRecord(
            String publisherId,
            String listingName,
            String listingId,
            String listingVersionId,
            String packageVersion,
            String packageVersionId,
            String status,
            String instanceId,
            java.util.Date timeInstanceCreation,
            java.util.Date timeInstanceTermination,
            String region,
            String realm,
            String shape,
            String ociTenancy,
            String tenantAdminName,
            String tenantAdminEmail,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.publisherId = publisherId;
        this.listingName = listingName;
        this.listingId = listingId;
        this.listingVersionId = listingVersionId;
        this.packageVersion = packageVersion;
        this.packageVersionId = packageVersionId;
        this.status = status;
        this.instanceId = instanceId;
        this.timeInstanceCreation = timeInstanceCreation;
        this.timeInstanceTermination = timeInstanceTermination;
        this.region = region;
        this.realm = realm;
        this.shape = shape;
        this.ociTenancy = ociTenancy;
        this.tenantAdminName = tenantAdminName;
        this.tenantAdminEmail = tenantAdminEmail;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** publisher OCID */
        @com.fasterxml.jackson.annotation.JsonProperty("publisherId")
        private String publisherId;

        /**
         * publisher OCID
         *
         * @param publisherId the value to set
         * @return this builder
         */
        public Builder publisherId(String publisherId) {
            this.publisherId = publisherId;
            this.__explicitlySet__.add("publisherId");
            return this;
        }
        /** Name of the listing */
        @com.fasterxml.jackson.annotation.JsonProperty("listingName")
        private String listingName;

        /**
         * Name of the listing
         *
         * @param listingName the value to set
         * @return this builder
         */
        public Builder listingName(String listingName) {
            this.listingName = listingName;
            this.__explicitlySet__.add("listingName");
            return this;
        }
        /** Listing ID */
        @com.fasterxml.jackson.annotation.JsonProperty("listingId")
        private String listingId;

        /**
         * Listing ID
         *
         * @param listingId the value to set
         * @return this builder
         */
        public Builder listingId(String listingId) {
            this.listingId = listingId;
            this.__explicitlySet__.add("listingId");
            return this;
        }
        /** Listing version ID */
        @com.fasterxml.jackson.annotation.JsonProperty("listingVersionId")
        private String listingVersionId;

        /**
         * Listing version ID
         *
         * @param listingVersionId the value to set
         * @return this builder
         */
        public Builder listingVersionId(String listingVersionId) {
            this.listingVersionId = listingVersionId;
            this.__explicitlySet__.add("listingVersionId");
            return this;
        }
        /** The version for the package */
        @com.fasterxml.jackson.annotation.JsonProperty("packageVersion")
        private String packageVersion;

        /**
         * The version for the package
         *
         * @param packageVersion the value to set
         * @return this builder
         */
        public Builder packageVersion(String packageVersion) {
            this.packageVersion = packageVersion;
            this.__explicitlySet__.add("packageVersion");
            return this;
        }
        /** Package version ID */
        @com.fasterxml.jackson.annotation.JsonProperty("packageVersionId")
        private String packageVersionId;

        /**
         * Package version ID
         *
         * @param packageVersionId the value to set
         * @return this builder
         */
        public Builder packageVersionId(String packageVersionId) {
            this.packageVersionId = packageVersionId;
            this.__explicitlySet__.add("packageVersionId");
            return this;
        }
        /** Instance status */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private String status;

        /**
         * Instance status
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(String status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** Instance OCID */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private String instanceId;

        /**
         * Instance OCID
         *
         * @param instanceId the value to set
         * @return this builder
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            this.__explicitlySet__.add("instanceId");
            return this;
        }
        /**
         * The date and time that instance was created, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeInstanceCreation")
        private java.util.Date timeInstanceCreation;

        /**
         * The date and time that instance was created, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2016-08-25T21:10:29.600Z}
         *
         * @param timeInstanceCreation the value to set
         * @return this builder
         */
        public Builder timeInstanceCreation(java.util.Date timeInstanceCreation) {
            this.timeInstanceCreation = timeInstanceCreation;
            this.__explicitlySet__.add("timeInstanceCreation");
            return this;
        }
        /**
         * The date and time that instance was terminated, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeInstanceTermination")
        private java.util.Date timeInstanceTermination;

        /**
         * The date and time that instance was terminated, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2016-08-25T21:10:29.600Z}
         *
         * @param timeInstanceTermination the value to set
         * @return this builder
         */
        public Builder timeInstanceTermination(java.util.Date timeInstanceTermination) {
            this.timeInstanceTermination = timeInstanceTermination;
            this.__explicitlySet__.add("timeInstanceTermination");
            return this;
        }
        /** The region of the instance */
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * The region of the instance
         *
         * @param region the value to set
         * @return this builder
         */
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /** The realm of the instance */
        @com.fasterxml.jackson.annotation.JsonProperty("realm")
        private String realm;

        /**
         * The realm of the instance
         *
         * @param realm the value to set
         * @return this builder
         */
        public Builder realm(String realm) {
            this.realm = realm;
            this.__explicitlySet__.add("realm");
            return this;
        }
        /** The shape of the instance */
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * The shape of the instance
         *
         * @param shape the value to set
         * @return this builder
         */
        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }
        /** The tenancy of the instance */
        @com.fasterxml.jackson.annotation.JsonProperty("ociTenancy")
        private String ociTenancy;

        /**
         * The tenancy of the instance
         *
         * @param ociTenancy the value to set
         * @return this builder
         */
        public Builder ociTenancy(String ociTenancy) {
            this.ociTenancy = ociTenancy;
            this.__explicitlySet__.add("ociTenancy");
            return this;
        }
        /** The name of the tenant adminstrator */
        @com.fasterxml.jackson.annotation.JsonProperty("tenantAdminName")
        private String tenantAdminName;

        /**
         * The name of the tenant adminstrator
         *
         * @param tenantAdminName the value to set
         * @return this builder
         */
        public Builder tenantAdminName(String tenantAdminName) {
            this.tenantAdminName = tenantAdminName;
            this.__explicitlySet__.add("tenantAdminName");
            return this;
        }
        /** The email of the tenant adminstrator */
        @com.fasterxml.jackson.annotation.JsonProperty("tenantAdminEmail")
        private String tenantAdminEmail;

        /**
         * The email of the tenant adminstrator
         *
         * @param tenantAdminEmail the value to set
         * @return this builder
         */
        public Builder tenantAdminEmail(String tenantAdminEmail) {
            this.tenantAdminEmail = tenantAdminEmail;
            this.__explicitlySet__.add("tenantAdminEmail");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CustomerInstanceReportRecord build() {
            CustomerInstanceReportRecord model =
                    new CustomerInstanceReportRecord(
                            this.publisherId,
                            this.listingName,
                            this.listingId,
                            this.listingVersionId,
                            this.packageVersion,
                            this.packageVersionId,
                            this.status,
                            this.instanceId,
                            this.timeInstanceCreation,
                            this.timeInstanceTermination,
                            this.region,
                            this.realm,
                            this.shape,
                            this.ociTenancy,
                            this.tenantAdminName,
                            this.tenantAdminEmail,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CustomerInstanceReportRecord model) {
            if (model.wasPropertyExplicitlySet("publisherId")) {
                this.publisherId(model.getPublisherId());
            }
            if (model.wasPropertyExplicitlySet("listingName")) {
                this.listingName(model.getListingName());
            }
            if (model.wasPropertyExplicitlySet("listingId")) {
                this.listingId(model.getListingId());
            }
            if (model.wasPropertyExplicitlySet("listingVersionId")) {
                this.listingVersionId(model.getListingVersionId());
            }
            if (model.wasPropertyExplicitlySet("packageVersion")) {
                this.packageVersion(model.getPackageVersion());
            }
            if (model.wasPropertyExplicitlySet("packageVersionId")) {
                this.packageVersionId(model.getPackageVersionId());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("instanceId")) {
                this.instanceId(model.getInstanceId());
            }
            if (model.wasPropertyExplicitlySet("timeInstanceCreation")) {
                this.timeInstanceCreation(model.getTimeInstanceCreation());
            }
            if (model.wasPropertyExplicitlySet("timeInstanceTermination")) {
                this.timeInstanceTermination(model.getTimeInstanceTermination());
            }
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("realm")) {
                this.realm(model.getRealm());
            }
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("ociTenancy")) {
                this.ociTenancy(model.getOciTenancy());
            }
            if (model.wasPropertyExplicitlySet("tenantAdminName")) {
                this.tenantAdminName(model.getTenantAdminName());
            }
            if (model.wasPropertyExplicitlySet("tenantAdminEmail")) {
                this.tenantAdminEmail(model.getTenantAdminEmail());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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

    /** publisher OCID */
    @com.fasterxml.jackson.annotation.JsonProperty("publisherId")
    private final String publisherId;

    /**
     * publisher OCID
     *
     * @return the value
     */
    public String getPublisherId() {
        return publisherId;
    }

    /** Name of the listing */
    @com.fasterxml.jackson.annotation.JsonProperty("listingName")
    private final String listingName;

    /**
     * Name of the listing
     *
     * @return the value
     */
    public String getListingName() {
        return listingName;
    }

    /** Listing ID */
    @com.fasterxml.jackson.annotation.JsonProperty("listingId")
    private final String listingId;

    /**
     * Listing ID
     *
     * @return the value
     */
    public String getListingId() {
        return listingId;
    }

    /** Listing version ID */
    @com.fasterxml.jackson.annotation.JsonProperty("listingVersionId")
    private final String listingVersionId;

    /**
     * Listing version ID
     *
     * @return the value
     */
    public String getListingVersionId() {
        return listingVersionId;
    }

    /** The version for the package */
    @com.fasterxml.jackson.annotation.JsonProperty("packageVersion")
    private final String packageVersion;

    /**
     * The version for the package
     *
     * @return the value
     */
    public String getPackageVersion() {
        return packageVersion;
    }

    /** Package version ID */
    @com.fasterxml.jackson.annotation.JsonProperty("packageVersionId")
    private final String packageVersionId;

    /**
     * Package version ID
     *
     * @return the value
     */
    public String getPackageVersionId() {
        return packageVersionId;
    }

    /** Instance status */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final String status;

    /**
     * Instance status
     *
     * @return the value
     */
    public String getStatus() {
        return status;
    }

    /** Instance OCID */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    private final String instanceId;

    /**
     * Instance OCID
     *
     * @return the value
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * The date and time that instance was created, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeInstanceCreation")
    private final java.util.Date timeInstanceCreation;

    /**
     * The date and time that instance was created, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeInstanceCreation() {
        return timeInstanceCreation;
    }

    /**
     * The date and time that instance was terminated, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeInstanceTermination")
    private final java.util.Date timeInstanceTermination;

    /**
     * The date and time that instance was terminated, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeInstanceTermination() {
        return timeInstanceTermination;
    }

    /** The region of the instance */
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * The region of the instance
     *
     * @return the value
     */
    public String getRegion() {
        return region;
    }

    /** The realm of the instance */
    @com.fasterxml.jackson.annotation.JsonProperty("realm")
    private final String realm;

    /**
     * The realm of the instance
     *
     * @return the value
     */
    public String getRealm() {
        return realm;
    }

    /** The shape of the instance */
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * The shape of the instance
     *
     * @return the value
     */
    public String getShape() {
        return shape;
    }

    /** The tenancy of the instance */
    @com.fasterxml.jackson.annotation.JsonProperty("ociTenancy")
    private final String ociTenancy;

    /**
     * The tenancy of the instance
     *
     * @return the value
     */
    public String getOciTenancy() {
        return ociTenancy;
    }

    /** The name of the tenant adminstrator */
    @com.fasterxml.jackson.annotation.JsonProperty("tenantAdminName")
    private final String tenantAdminName;

    /**
     * The name of the tenant adminstrator
     *
     * @return the value
     */
    public String getTenantAdminName() {
        return tenantAdminName;
    }

    /** The email of the tenant adminstrator */
    @com.fasterxml.jackson.annotation.JsonProperty("tenantAdminEmail")
    private final String tenantAdminEmail;

    /**
     * The email of the tenant adminstrator
     *
     * @return the value
     */
    public String getTenantAdminEmail() {
        return tenantAdminEmail;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("CustomerInstanceReportRecord(");
        sb.append("super=").append(super.toString());
        sb.append("publisherId=").append(String.valueOf(this.publisherId));
        sb.append(", listingName=").append(String.valueOf(this.listingName));
        sb.append(", listingId=").append(String.valueOf(this.listingId));
        sb.append(", listingVersionId=").append(String.valueOf(this.listingVersionId));
        sb.append(", packageVersion=").append(String.valueOf(this.packageVersion));
        sb.append(", packageVersionId=").append(String.valueOf(this.packageVersionId));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", instanceId=").append(String.valueOf(this.instanceId));
        sb.append(", timeInstanceCreation=").append(String.valueOf(this.timeInstanceCreation));
        sb.append(", timeInstanceTermination=")
                .append(String.valueOf(this.timeInstanceTermination));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", realm=").append(String.valueOf(this.realm));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", ociTenancy=").append(String.valueOf(this.ociTenancy));
        sb.append(", tenantAdminName=").append(String.valueOf(this.tenantAdminName));
        sb.append(", tenantAdminEmail=").append(String.valueOf(this.tenantAdminEmail));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CustomerInstanceReportRecord)) {
            return false;
        }

        CustomerInstanceReportRecord other = (CustomerInstanceReportRecord) o;
        return java.util.Objects.equals(this.publisherId, other.publisherId)
                && java.util.Objects.equals(this.listingName, other.listingName)
                && java.util.Objects.equals(this.listingId, other.listingId)
                && java.util.Objects.equals(this.listingVersionId, other.listingVersionId)
                && java.util.Objects.equals(this.packageVersion, other.packageVersion)
                && java.util.Objects.equals(this.packageVersionId, other.packageVersionId)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.instanceId, other.instanceId)
                && java.util.Objects.equals(this.timeInstanceCreation, other.timeInstanceCreation)
                && java.util.Objects.equals(
                        this.timeInstanceTermination, other.timeInstanceTermination)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.realm, other.realm)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.ociTenancy, other.ociTenancy)
                && java.util.Objects.equals(this.tenantAdminName, other.tenantAdminName)
                && java.util.Objects.equals(this.tenantAdminEmail, other.tenantAdminEmail)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.publisherId == null ? 43 : this.publisherId.hashCode());
        result = (result * PRIME) + (this.listingName == null ? 43 : this.listingName.hashCode());
        result = (result * PRIME) + (this.listingId == null ? 43 : this.listingId.hashCode());
        result =
                (result * PRIME)
                        + (this.listingVersionId == null ? 43 : this.listingVersionId.hashCode());
        result =
                (result * PRIME)
                        + (this.packageVersion == null ? 43 : this.packageVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.packageVersionId == null ? 43 : this.packageVersionId.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.instanceId == null ? 43 : this.instanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.timeInstanceCreation == null
                                ? 43
                                : this.timeInstanceCreation.hashCode());
        result =
                (result * PRIME)
                        + (this.timeInstanceTermination == null
                                ? 43
                                : this.timeInstanceTermination.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result = (result * PRIME) + (this.realm == null ? 43 : this.realm.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result = (result * PRIME) + (this.ociTenancy == null ? 43 : this.ociTenancy.hashCode());
        result =
                (result * PRIME)
                        + (this.tenantAdminName == null ? 43 : this.tenantAdminName.hashCode());
        result =
                (result * PRIME)
                        + (this.tenantAdminEmail == null ? 43 : this.tenantAdminEmail.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
