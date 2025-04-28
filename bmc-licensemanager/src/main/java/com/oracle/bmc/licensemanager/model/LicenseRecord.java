/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.licensemanager.model;

/**
 * License record summary. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = LicenseRecord.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LicenseRecord extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "productLicenseId",
        "compartmentId",
        "displayName",
        "productId",
        "licenseCount",
        "expirationDate",
        "supportEndDate",
        "isUnlimited",
        "isPerpetual",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "licenseUnit",
        "productLicense",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public LicenseRecord(
            String id,
            String productLicenseId,
            String compartmentId,
            String displayName,
            String productId,
            Integer licenseCount,
            java.util.Date expirationDate,
            java.util.Date supportEndDate,
            Boolean isUnlimited,
            Boolean isPerpetual,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifeCycleState lifecycleState,
            LicenseUnit licenseUnit,
            String productLicense,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.productLicenseId = productLicenseId;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.productId = productId;
        this.licenseCount = licenseCount;
        this.expirationDate = expirationDate;
        this.supportEndDate = supportEndDate;
        this.isUnlimited = isUnlimited;
        this.isPerpetual = isPerpetual;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.licenseUnit = licenseUnit;
        this.productLicense = productLicense;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The license record
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The license record
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The product license
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) with which
         * the license record is associated.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("productLicenseId")
        private String productLicenseId;

        /**
         * The product license
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) with which
         * the license record is associated.
         *
         * @param productLicenseId the value to set
         * @return this builder
         */
        public Builder productLicenseId(String productLicenseId) {
            this.productLicenseId = productLicenseId;
            this.__explicitlySet__.add("productLicenseId");
            return this;
        }
        /**
         * The compartment
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) where the
         * license record is created.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The compartment
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) where the
         * license record is created.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The license record display name. Avoid entering confidential information. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The license record display name. Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The license record product ID. */
        @com.fasterxml.jackson.annotation.JsonProperty("productId")
        private String productId;

        /**
         * The license record product ID.
         *
         * @param productId the value to set
         * @return this builder
         */
        public Builder productId(String productId) {
            this.productId = productId;
            this.__explicitlySet__.add("productId");
            return this;
        }
        /** The number of license units added by the user for the given license record. Default 1 */
        @com.fasterxml.jackson.annotation.JsonProperty("licenseCount")
        private Integer licenseCount;

        /**
         * The number of license units added by the user for the given license record. Default 1
         *
         * @param licenseCount the value to set
         * @return this builder
         */
        public Builder licenseCount(Integer licenseCount) {
            this.licenseCount = licenseCount;
            this.__explicitlySet__.add("licenseCount");
            return this;
        }
        /**
         * The license record end date in [RFC 3339](https://tools.ietf.org/html/rfc3339) date
         * format. Example: {@code 2018-09-12}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("expirationDate")
        private java.util.Date expirationDate;

        /**
         * The license record end date in [RFC 3339](https://tools.ietf.org/html/rfc3339) date
         * format. Example: {@code 2018-09-12}
         *
         * @param expirationDate the value to set
         * @return this builder
         */
        public Builder expirationDate(java.util.Date expirationDate) {
            this.expirationDate = expirationDate;
            this.__explicitlySet__.add("expirationDate");
            return this;
        }
        /**
         * The license record support end date in [RFC 3339](https://tools.ietf.org/html/rfc3339)
         * date format. Example: {@code 2018-09-12}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("supportEndDate")
        private java.util.Date supportEndDate;

        /**
         * The license record support end date in [RFC 3339](https://tools.ietf.org/html/rfc3339)
         * date format. Example: {@code 2018-09-12}
         *
         * @param supportEndDate the value to set
         * @return this builder
         */
        public Builder supportEndDate(java.util.Date supportEndDate) {
            this.supportEndDate = supportEndDate;
            this.__explicitlySet__.add("supportEndDate");
            return this;
        }
        /** Specifies if the license count is unlimited. */
        @com.fasterxml.jackson.annotation.JsonProperty("isUnlimited")
        private Boolean isUnlimited;

        /**
         * Specifies if the license count is unlimited.
         *
         * @param isUnlimited the value to set
         * @return this builder
         */
        public Builder isUnlimited(Boolean isUnlimited) {
            this.isUnlimited = isUnlimited;
            this.__explicitlySet__.add("isUnlimited");
            return this;
        }
        /** Specifies if the license record term is perpertual. */
        @com.fasterxml.jackson.annotation.JsonProperty("isPerpetual")
        private Boolean isPerpetual;

        /**
         * Specifies if the license record term is perpertual.
         *
         * @param isPerpetual the value to set
         * @return this builder
         */
        public Builder isPerpetual(Boolean isPerpetual) {
            this.isPerpetual = isPerpetual;
            this.__explicitlySet__.add("isPerpetual");
            return this;
        }
        /**
         * The time the license record was created. An [RFC
         * 3339](https://tools.ietf.org/html/rfc3339)-formatted datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the license record was created. An [RFC
         * 3339](https://tools.ietf.org/html/rfc3339)-formatted datetime string.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time the license record was updated. An [RFC
         * 3339](https://tools.ietf.org/html/rfc3339)-formatted datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the license record was updated. An [RFC
         * 3339](https://tools.ietf.org/html/rfc3339)-formatted datetime string.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The current license record state. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifeCycleState lifecycleState;

        /**
         * The current license record state.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifeCycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** The product license unit. */
        @com.fasterxml.jackson.annotation.JsonProperty("licenseUnit")
        private LicenseUnit licenseUnit;

        /**
         * The product license unit.
         *
         * @param licenseUnit the value to set
         * @return this builder
         */
        public Builder licenseUnit(LicenseUnit licenseUnit) {
            this.licenseUnit = licenseUnit;
            this.__explicitlySet__.add("licenseUnit");
            return this;
        }
        /** The product license name with which the license record is associated. */
        @com.fasterxml.jackson.annotation.JsonProperty("productLicense")
        private String productLicense;

        /**
         * The product license name with which the license record is associated.
         *
         * @param productLicense the value to set
         * @return this builder
         */
        public Builder productLicense(String productLicense) {
            this.productLicense = productLicense;
            this.__explicitlySet__.add("productLicense");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type, or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type, or scope. Exists
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
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
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

        public LicenseRecord build() {
            LicenseRecord model =
                    new LicenseRecord(
                            this.id,
                            this.productLicenseId,
                            this.compartmentId,
                            this.displayName,
                            this.productId,
                            this.licenseCount,
                            this.expirationDate,
                            this.supportEndDate,
                            this.isUnlimited,
                            this.isPerpetual,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.licenseUnit,
                            this.productLicense,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LicenseRecord model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("productLicenseId")) {
                this.productLicenseId(model.getProductLicenseId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("productId")) {
                this.productId(model.getProductId());
            }
            if (model.wasPropertyExplicitlySet("licenseCount")) {
                this.licenseCount(model.getLicenseCount());
            }
            if (model.wasPropertyExplicitlySet("expirationDate")) {
                this.expirationDate(model.getExpirationDate());
            }
            if (model.wasPropertyExplicitlySet("supportEndDate")) {
                this.supportEndDate(model.getSupportEndDate());
            }
            if (model.wasPropertyExplicitlySet("isUnlimited")) {
                this.isUnlimited(model.getIsUnlimited());
            }
            if (model.wasPropertyExplicitlySet("isPerpetual")) {
                this.isPerpetual(model.getIsPerpetual());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("licenseUnit")) {
                this.licenseUnit(model.getLicenseUnit());
            }
            if (model.wasPropertyExplicitlySet("productLicense")) {
                this.productLicense(model.getProductLicense());
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

    /**
     * The license record
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The license record
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The product license
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) with which the
     * license record is associated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("productLicenseId")
    private final String productLicenseId;

    /**
     * The product license
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) with which the
     * license record is associated.
     *
     * @return the value
     */
    public String getProductLicenseId() {
        return productLicenseId;
    }

    /**
     * The compartment [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
     * where the license record is created.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The compartment [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
     * where the license record is created.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The license record display name. Avoid entering confidential information. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The license record display name. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The license record product ID. */
    @com.fasterxml.jackson.annotation.JsonProperty("productId")
    private final String productId;

    /**
     * The license record product ID.
     *
     * @return the value
     */
    public String getProductId() {
        return productId;
    }

    /** The number of license units added by the user for the given license record. Default 1 */
    @com.fasterxml.jackson.annotation.JsonProperty("licenseCount")
    private final Integer licenseCount;

    /**
     * The number of license units added by the user for the given license record. Default 1
     *
     * @return the value
     */
    public Integer getLicenseCount() {
        return licenseCount;
    }

    /**
     * The license record end date in [RFC 3339](https://tools.ietf.org/html/rfc3339) date format.
     * Example: {@code 2018-09-12}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("expirationDate")
    private final java.util.Date expirationDate;

    /**
     * The license record end date in [RFC 3339](https://tools.ietf.org/html/rfc3339) date format.
     * Example: {@code 2018-09-12}
     *
     * @return the value
     */
    public java.util.Date getExpirationDate() {
        return expirationDate;
    }

    /**
     * The license record support end date in [RFC 3339](https://tools.ietf.org/html/rfc3339) date
     * format. Example: {@code 2018-09-12}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("supportEndDate")
    private final java.util.Date supportEndDate;

    /**
     * The license record support end date in [RFC 3339](https://tools.ietf.org/html/rfc3339) date
     * format. Example: {@code 2018-09-12}
     *
     * @return the value
     */
    public java.util.Date getSupportEndDate() {
        return supportEndDate;
    }

    /** Specifies if the license count is unlimited. */
    @com.fasterxml.jackson.annotation.JsonProperty("isUnlimited")
    private final Boolean isUnlimited;

    /**
     * Specifies if the license count is unlimited.
     *
     * @return the value
     */
    public Boolean getIsUnlimited() {
        return isUnlimited;
    }

    /** Specifies if the license record term is perpertual. */
    @com.fasterxml.jackson.annotation.JsonProperty("isPerpetual")
    private final Boolean isPerpetual;

    /**
     * Specifies if the license record term is perpertual.
     *
     * @return the value
     */
    public Boolean getIsPerpetual() {
        return isPerpetual;
    }

    /**
     * The time the license record was created. An [RFC
     * 3339](https://tools.ietf.org/html/rfc3339)-formatted datetime string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the license record was created. An [RFC
     * 3339](https://tools.ietf.org/html/rfc3339)-formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the license record was updated. An [RFC
     * 3339](https://tools.ietf.org/html/rfc3339)-formatted datetime string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the license record was updated. An [RFC
     * 3339](https://tools.ietf.org/html/rfc3339)-formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The current license record state. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifeCycleState lifecycleState;

    /**
     * The current license record state.
     *
     * @return the value
     */
    public LifeCycleState getLifecycleState() {
        return lifecycleState;
    }

    /** The product license unit. */
    @com.fasterxml.jackson.annotation.JsonProperty("licenseUnit")
    private final LicenseUnit licenseUnit;

    /**
     * The product license unit.
     *
     * @return the value
     */
    public LicenseUnit getLicenseUnit() {
        return licenseUnit;
    }

    /** The product license name with which the license record is associated. */
    @com.fasterxml.jackson.annotation.JsonProperty("productLicense")
    private final String productLicense;

    /**
     * The product license name with which the license record is associated.
     *
     * @return the value
     */
    public String getProductLicense() {
        return productLicense;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope. Exists for
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
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
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
        sb.append("LicenseRecord(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", productLicenseId=").append(String.valueOf(this.productLicenseId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", productId=").append(String.valueOf(this.productId));
        sb.append(", licenseCount=").append(String.valueOf(this.licenseCount));
        sb.append(", expirationDate=").append(String.valueOf(this.expirationDate));
        sb.append(", supportEndDate=").append(String.valueOf(this.supportEndDate));
        sb.append(", isUnlimited=").append(String.valueOf(this.isUnlimited));
        sb.append(", isPerpetual=").append(String.valueOf(this.isPerpetual));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", licenseUnit=").append(String.valueOf(this.licenseUnit));
        sb.append(", productLicense=").append(String.valueOf(this.productLicense));
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
        if (!(o instanceof LicenseRecord)) {
            return false;
        }

        LicenseRecord other = (LicenseRecord) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.productLicenseId, other.productLicenseId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.productId, other.productId)
                && java.util.Objects.equals(this.licenseCount, other.licenseCount)
                && java.util.Objects.equals(this.expirationDate, other.expirationDate)
                && java.util.Objects.equals(this.supportEndDate, other.supportEndDate)
                && java.util.Objects.equals(this.isUnlimited, other.isUnlimited)
                && java.util.Objects.equals(this.isPerpetual, other.isPerpetual)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.licenseUnit, other.licenseUnit)
                && java.util.Objects.equals(this.productLicense, other.productLicense)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.productLicenseId == null ? 43 : this.productLicenseId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.productId == null ? 43 : this.productId.hashCode());
        result = (result * PRIME) + (this.licenseCount == null ? 43 : this.licenseCount.hashCode());
        result =
                (result * PRIME)
                        + (this.expirationDate == null ? 43 : this.expirationDate.hashCode());
        result =
                (result * PRIME)
                        + (this.supportEndDate == null ? 43 : this.supportEndDate.hashCode());
        result = (result * PRIME) + (this.isUnlimited == null ? 43 : this.isUnlimited.hashCode());
        result = (result * PRIME) + (this.isPerpetual == null ? 43 : this.isPerpetual.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.licenseUnit == null ? 43 : this.licenseUnit.hashCode());
        result =
                (result * PRIME)
                        + (this.productLicense == null ? 43 : this.productLicense.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
