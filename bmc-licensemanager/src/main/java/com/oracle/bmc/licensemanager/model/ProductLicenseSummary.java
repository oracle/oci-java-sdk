/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.licensemanager.model;

/**
 * The product license summary. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ProductLicenseSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ProductLicenseSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "status",
        "statusDescription",
        "lifecycleState",
        "totalActiveLicenseUnitCount",
        "totalLicenseUnitsConsumed",
        "totalLicenseRecordCount",
        "activeLicenseRecordCount",
        "licenseUnit",
        "isVendorOracle",
        "isOverSubscribed",
        "isUnlimited",
        "displayName",
        "vendorName",
        "timeCreated",
        "timeUpdated",
        "images",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public ProductLicenseSummary(
            String id,
            String compartmentId,
            Status status,
            String statusDescription,
            LifeCycleState lifecycleState,
            Integer totalActiveLicenseUnitCount,
            Double totalLicenseUnitsConsumed,
            Integer totalLicenseRecordCount,
            Integer activeLicenseRecordCount,
            LicenseUnit licenseUnit,
            Boolean isVendorOracle,
            Boolean isOverSubscribed,
            Boolean isUnlimited,
            String displayName,
            String vendorName,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.List<ImageResponse> images,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.status = status;
        this.statusDescription = statusDescription;
        this.lifecycleState = lifecycleState;
        this.totalActiveLicenseUnitCount = totalActiveLicenseUnitCount;
        this.totalLicenseUnitsConsumed = totalLicenseUnitsConsumed;
        this.totalLicenseRecordCount = totalLicenseRecordCount;
        this.activeLicenseRecordCount = activeLicenseRecordCount;
        this.licenseUnit = licenseUnit;
        this.isVendorOracle = isVendorOracle;
        this.isOverSubscribed = isOverSubscribed;
        this.isUnlimited = isUnlimited;
        this.displayName = displayName;
        this.vendorName = vendorName;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.images = images;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The product license
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The product license
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
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
         * The compartment
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) where
         * the product license is created.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The compartment
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) where
         * the product license is created.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The current product license status. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * The current product license status.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** Status description for the current product license status. */
        @com.fasterxml.jackson.annotation.JsonProperty("statusDescription")
        private String statusDescription;

        /**
         * Status description for the current product license status.
         *
         * @param statusDescription the value to set
         * @return this builder
         */
        public Builder statusDescription(String statusDescription) {
            this.statusDescription = statusDescription;
            this.__explicitlySet__.add("statusDescription");
            return this;
        }
        /** The current product license state. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifeCycleState lifecycleState;

        /**
         * The current product license state.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifeCycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The total number of licenses available for the product license, calculated by adding up
         * all the license counts for active license records associated with the product license.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("totalActiveLicenseUnitCount")
        private Integer totalActiveLicenseUnitCount;

        /**
         * The total number of licenses available for the product license, calculated by adding up
         * all the license counts for active license records associated with the product license.
         *
         * @param totalActiveLicenseUnitCount the value to set
         * @return this builder
         */
        public Builder totalActiveLicenseUnitCount(Integer totalActiveLicenseUnitCount) {
            this.totalActiveLicenseUnitCount = totalActiveLicenseUnitCount;
            this.__explicitlySet__.add("totalActiveLicenseUnitCount");
            return this;
        }
        /** The number of license units consumed. Updated after each allocation run. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalLicenseUnitsConsumed")
        private Double totalLicenseUnitsConsumed;

        /**
         * The number of license units consumed. Updated after each allocation run.
         *
         * @param totalLicenseUnitsConsumed the value to set
         * @return this builder
         */
        public Builder totalLicenseUnitsConsumed(Double totalLicenseUnitsConsumed) {
            this.totalLicenseUnitsConsumed = totalLicenseUnitsConsumed;
            this.__explicitlySet__.add("totalLicenseUnitsConsumed");
            return this;
        }
        /** The number of license records associated with the product license. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalLicenseRecordCount")
        private Integer totalLicenseRecordCount;

        /**
         * The number of license records associated with the product license.
         *
         * @param totalLicenseRecordCount the value to set
         * @return this builder
         */
        public Builder totalLicenseRecordCount(Integer totalLicenseRecordCount) {
            this.totalLicenseRecordCount = totalLicenseRecordCount;
            this.__explicitlySet__.add("totalLicenseRecordCount");
            return this;
        }
        /** The number of active license records associated with the product license. */
        @com.fasterxml.jackson.annotation.JsonProperty("activeLicenseRecordCount")
        private Integer activeLicenseRecordCount;

        /**
         * The number of active license records associated with the product license.
         *
         * @param activeLicenseRecordCount the value to set
         * @return this builder
         */
        public Builder activeLicenseRecordCount(Integer activeLicenseRecordCount) {
            this.activeLicenseRecordCount = activeLicenseRecordCount;
            this.__explicitlySet__.add("activeLicenseRecordCount");
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
        /** Specifies whether the vendor is Oracle or a third party. */
        @com.fasterxml.jackson.annotation.JsonProperty("isVendorOracle")
        private Boolean isVendorOracle;

        /**
         * Specifies whether the vendor is Oracle or a third party.
         *
         * @param isVendorOracle the value to set
         * @return this builder
         */
        public Builder isVendorOracle(Boolean isVendorOracle) {
            this.isVendorOracle = isVendorOracle;
            this.__explicitlySet__.add("isVendorOracle");
            return this;
        }
        /** Specifies whether or not the product license is oversubscribed. */
        @com.fasterxml.jackson.annotation.JsonProperty("isOverSubscribed")
        private Boolean isOverSubscribed;

        /**
         * Specifies whether or not the product license is oversubscribed.
         *
         * @param isOverSubscribed the value to set
         * @return this builder
         */
        public Builder isOverSubscribed(Boolean isOverSubscribed) {
            this.isOverSubscribed = isOverSubscribed;
            this.__explicitlySet__.add("isOverSubscribed");
            return this;
        }
        /** Specifies if the license unit count is unlimited. */
        @com.fasterxml.jackson.annotation.JsonProperty("isUnlimited")
        private Boolean isUnlimited;

        /**
         * Specifies if the license unit count is unlimited.
         *
         * @param isUnlimited the value to set
         * @return this builder
         */
        public Builder isUnlimited(Boolean isUnlimited) {
            this.isUnlimited = isUnlimited;
            this.__explicitlySet__.add("isUnlimited");
            return this;
        }
        /** License record name */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * License record name
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The vendor of the ProductLicense */
        @com.fasterxml.jackson.annotation.JsonProperty("vendorName")
        private String vendorName;

        /**
         * The vendor of the ProductLicense
         *
         * @param vendorName the value to set
         * @return this builder
         */
        public Builder vendorName(String vendorName) {
            this.vendorName = vendorName;
            this.__explicitlySet__.add("vendorName");
            return this;
        }
        /**
         * The time the product license was created. An [RFC
         * 3339](https://tools.ietf.org/html/rfc3339)-formatted datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the product license was created. An [RFC
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
         * The time the product license was updated. An [RFC
         * 3339](https://tools.ietf.org/html/rfc3339)-formatted datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the product license was updated. An [RFC
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
        /** The images associated with the product license. */
        @com.fasterxml.jackson.annotation.JsonProperty("images")
        private java.util.List<ImageResponse> images;

        /**
         * The images associated with the product license.
         *
         * @param images the value to set
         * @return this builder
         */
        public Builder images(java.util.List<ImageResponse> images) {
            this.images = images;
            this.__explicitlySet__.add("images");
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

        public ProductLicenseSummary build() {
            ProductLicenseSummary model =
                    new ProductLicenseSummary(
                            this.id,
                            this.compartmentId,
                            this.status,
                            this.statusDescription,
                            this.lifecycleState,
                            this.totalActiveLicenseUnitCount,
                            this.totalLicenseUnitsConsumed,
                            this.totalLicenseRecordCount,
                            this.activeLicenseRecordCount,
                            this.licenseUnit,
                            this.isVendorOracle,
                            this.isOverSubscribed,
                            this.isUnlimited,
                            this.displayName,
                            this.vendorName,
                            this.timeCreated,
                            this.timeUpdated,
                            this.images,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProductLicenseSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("statusDescription")) {
                this.statusDescription(model.getStatusDescription());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("totalActiveLicenseUnitCount")) {
                this.totalActiveLicenseUnitCount(model.getTotalActiveLicenseUnitCount());
            }
            if (model.wasPropertyExplicitlySet("totalLicenseUnitsConsumed")) {
                this.totalLicenseUnitsConsumed(model.getTotalLicenseUnitsConsumed());
            }
            if (model.wasPropertyExplicitlySet("totalLicenseRecordCount")) {
                this.totalLicenseRecordCount(model.getTotalLicenseRecordCount());
            }
            if (model.wasPropertyExplicitlySet("activeLicenseRecordCount")) {
                this.activeLicenseRecordCount(model.getActiveLicenseRecordCount());
            }
            if (model.wasPropertyExplicitlySet("licenseUnit")) {
                this.licenseUnit(model.getLicenseUnit());
            }
            if (model.wasPropertyExplicitlySet("isVendorOracle")) {
                this.isVendorOracle(model.getIsVendorOracle());
            }
            if (model.wasPropertyExplicitlySet("isOverSubscribed")) {
                this.isOverSubscribed(model.getIsOverSubscribed());
            }
            if (model.wasPropertyExplicitlySet("isUnlimited")) {
                this.isUnlimited(model.getIsUnlimited());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("vendorName")) {
                this.vendorName(model.getVendorName());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("images")) {
                this.images(model.getImages());
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
     * The product license
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The product license
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The compartment
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) where the
     * product license is created.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The compartment
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) where the
     * product license is created.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The current product license status. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * The current product license status.
     *
     * @return the value
     */
    public Status getStatus() {
        return status;
    }

    /** Status description for the current product license status. */
    @com.fasterxml.jackson.annotation.JsonProperty("statusDescription")
    private final String statusDescription;

    /**
     * Status description for the current product license status.
     *
     * @return the value
     */
    public String getStatusDescription() {
        return statusDescription;
    }

    /** The current product license state. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifeCycleState lifecycleState;

    /**
     * The current product license state.
     *
     * @return the value
     */
    public LifeCycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The total number of licenses available for the product license, calculated by adding up all
     * the license counts for active license records associated with the product license.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("totalActiveLicenseUnitCount")
    private final Integer totalActiveLicenseUnitCount;

    /**
     * The total number of licenses available for the product license, calculated by adding up all
     * the license counts for active license records associated with the product license.
     *
     * @return the value
     */
    public Integer getTotalActiveLicenseUnitCount() {
        return totalActiveLicenseUnitCount;
    }

    /** The number of license units consumed. Updated after each allocation run. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalLicenseUnitsConsumed")
    private final Double totalLicenseUnitsConsumed;

    /**
     * The number of license units consumed. Updated after each allocation run.
     *
     * @return the value
     */
    public Double getTotalLicenseUnitsConsumed() {
        return totalLicenseUnitsConsumed;
    }

    /** The number of license records associated with the product license. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalLicenseRecordCount")
    private final Integer totalLicenseRecordCount;

    /**
     * The number of license records associated with the product license.
     *
     * @return the value
     */
    public Integer getTotalLicenseRecordCount() {
        return totalLicenseRecordCount;
    }

    /** The number of active license records associated with the product license. */
    @com.fasterxml.jackson.annotation.JsonProperty("activeLicenseRecordCount")
    private final Integer activeLicenseRecordCount;

    /**
     * The number of active license records associated with the product license.
     *
     * @return the value
     */
    public Integer getActiveLicenseRecordCount() {
        return activeLicenseRecordCount;
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

    /** Specifies whether the vendor is Oracle or a third party. */
    @com.fasterxml.jackson.annotation.JsonProperty("isVendorOracle")
    private final Boolean isVendorOracle;

    /**
     * Specifies whether the vendor is Oracle or a third party.
     *
     * @return the value
     */
    public Boolean getIsVendorOracle() {
        return isVendorOracle;
    }

    /** Specifies whether or not the product license is oversubscribed. */
    @com.fasterxml.jackson.annotation.JsonProperty("isOverSubscribed")
    private final Boolean isOverSubscribed;

    /**
     * Specifies whether or not the product license is oversubscribed.
     *
     * @return the value
     */
    public Boolean getIsOverSubscribed() {
        return isOverSubscribed;
    }

    /** Specifies if the license unit count is unlimited. */
    @com.fasterxml.jackson.annotation.JsonProperty("isUnlimited")
    private final Boolean isUnlimited;

    /**
     * Specifies if the license unit count is unlimited.
     *
     * @return the value
     */
    public Boolean getIsUnlimited() {
        return isUnlimited;
    }

    /** License record name */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * License record name
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The vendor of the ProductLicense */
    @com.fasterxml.jackson.annotation.JsonProperty("vendorName")
    private final String vendorName;

    /**
     * The vendor of the ProductLicense
     *
     * @return the value
     */
    public String getVendorName() {
        return vendorName;
    }

    /**
     * The time the product license was created. An [RFC
     * 3339](https://tools.ietf.org/html/rfc3339)-formatted datetime string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the product license was created. An [RFC
     * 3339](https://tools.ietf.org/html/rfc3339)-formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the product license was updated. An [RFC
     * 3339](https://tools.ietf.org/html/rfc3339)-formatted datetime string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the product license was updated. An [RFC
     * 3339](https://tools.ietf.org/html/rfc3339)-formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The images associated with the product license. */
    @com.fasterxml.jackson.annotation.JsonProperty("images")
    private final java.util.List<ImageResponse> images;

    /**
     * The images associated with the product license.
     *
     * @return the value
     */
    public java.util.List<ImageResponse> getImages() {
        return images;
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
        sb.append("ProductLicenseSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", statusDescription=").append(String.valueOf(this.statusDescription));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", totalActiveLicenseUnitCount=")
                .append(String.valueOf(this.totalActiveLicenseUnitCount));
        sb.append(", totalLicenseUnitsConsumed=")
                .append(String.valueOf(this.totalLicenseUnitsConsumed));
        sb.append(", totalLicenseRecordCount=")
                .append(String.valueOf(this.totalLicenseRecordCount));
        sb.append(", activeLicenseRecordCount=")
                .append(String.valueOf(this.activeLicenseRecordCount));
        sb.append(", licenseUnit=").append(String.valueOf(this.licenseUnit));
        sb.append(", isVendorOracle=").append(String.valueOf(this.isVendorOracle));
        sb.append(", isOverSubscribed=").append(String.valueOf(this.isOverSubscribed));
        sb.append(", isUnlimited=").append(String.valueOf(this.isUnlimited));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", vendorName=").append(String.valueOf(this.vendorName));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", images=").append(String.valueOf(this.images));
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
        if (!(o instanceof ProductLicenseSummary)) {
            return false;
        }

        ProductLicenseSummary other = (ProductLicenseSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.statusDescription, other.statusDescription)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(
                        this.totalActiveLicenseUnitCount, other.totalActiveLicenseUnitCount)
                && java.util.Objects.equals(
                        this.totalLicenseUnitsConsumed, other.totalLicenseUnitsConsumed)
                && java.util.Objects.equals(
                        this.totalLicenseRecordCount, other.totalLicenseRecordCount)
                && java.util.Objects.equals(
                        this.activeLicenseRecordCount, other.activeLicenseRecordCount)
                && java.util.Objects.equals(this.licenseUnit, other.licenseUnit)
                && java.util.Objects.equals(this.isVendorOracle, other.isVendorOracle)
                && java.util.Objects.equals(this.isOverSubscribed, other.isOverSubscribed)
                && java.util.Objects.equals(this.isUnlimited, other.isUnlimited)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.vendorName, other.vendorName)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.images, other.images)
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
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.statusDescription == null ? 43 : this.statusDescription.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.totalActiveLicenseUnitCount == null
                                ? 43
                                : this.totalActiveLicenseUnitCount.hashCode());
        result =
                (result * PRIME)
                        + (this.totalLicenseUnitsConsumed == null
                                ? 43
                                : this.totalLicenseUnitsConsumed.hashCode());
        result =
                (result * PRIME)
                        + (this.totalLicenseRecordCount == null
                                ? 43
                                : this.totalLicenseRecordCount.hashCode());
        result =
                (result * PRIME)
                        + (this.activeLicenseRecordCount == null
                                ? 43
                                : this.activeLicenseRecordCount.hashCode());
        result = (result * PRIME) + (this.licenseUnit == null ? 43 : this.licenseUnit.hashCode());
        result =
                (result * PRIME)
                        + (this.isVendorOracle == null ? 43 : this.isVendorOracle.hashCode());
        result =
                (result * PRIME)
                        + (this.isOverSubscribed == null ? 43 : this.isOverSubscribed.hashCode());
        result = (result * PRIME) + (this.isUnlimited == null ? 43 : this.isUnlimited.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.vendorName == null ? 43 : this.vendorName.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.images == null ? 43 : this.images.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
