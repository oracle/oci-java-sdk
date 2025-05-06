/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Summary information about a FamProvision. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ProvisionSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ProvisionSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "provisionDescription",
        "compartmentId",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails",
        "packageCatalogItemId",
        "configCatalogItemId",
        "packageCatalogItemDisplayName",
        "packageCatalogItemListingId",
        "packageCatalogItemListingVersion",
        "configCatalogItemDisplayName",
        "configCatalogItemListingId",
        "configCatalogItemListingVersion",
        "stackId",
        "fleetId",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public ProvisionSummary(
            String id,
            String displayName,
            String provisionDescription,
            String compartmentId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            Provision.LifecycleState lifecycleState,
            String lifecycleDetails,
            String packageCatalogItemId,
            String configCatalogItemId,
            String packageCatalogItemDisplayName,
            String packageCatalogItemListingId,
            String packageCatalogItemListingVersion,
            String configCatalogItemDisplayName,
            String configCatalogItemListingId,
            String configCatalogItemListingVersion,
            String stackId,
            String fleetId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.provisionDescription = provisionDescription;
        this.compartmentId = compartmentId;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.packageCatalogItemId = packageCatalogItemId;
        this.configCatalogItemId = configCatalogItemId;
        this.packageCatalogItemDisplayName = packageCatalogItemDisplayName;
        this.packageCatalogItemListingId = packageCatalogItemListingId;
        this.packageCatalogItemListingVersion = packageCatalogItemListingVersion;
        this.configCatalogItemDisplayName = configCatalogItemDisplayName;
        this.configCatalogItemListingId = configCatalogItemListingId;
        this.configCatalogItemListingVersion = configCatalogItemListingVersion;
        this.stackId = stackId;
        this.fleetId = fleetId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * FamProvision.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * FamProvision.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** A user-friendly name. Does not have to be unique, and it's changeable. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** A description of the provision. */
        @com.fasterxml.jackson.annotation.JsonProperty("provisionDescription")
        private String provisionDescription;

        /**
         * A description of the provision.
         *
         * @param provisionDescription the value to set
         * @return this builder
         */
        public Builder provisionDescription(String provisionDescription) {
            this.provisionDescription = provisionDescription;
            this.__explicitlySet__.add("provisionDescription");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment.
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
         * The date and time the FamProvision was created, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the FamProvision was created, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
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
         * The date and time the FamProvision was updated, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the FamProvision was updated, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The current state of the FamProvision. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private Provision.LifecycleState lifecycleState;

        /**
         * The current state of the FamProvision.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(Provision.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message that describes the current state of the FamProvision in more detail. For
         * example, can be used to provide actionable information for a resource in the Failed
         * state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message that describes the current state of the FamProvision in more detail. For
         * example, can be used to provide actionable information for a resource in the Failed
         * state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Catalog Item.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("packageCatalogItemId")
        private String packageCatalogItemId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Catalog Item.
         *
         * @param packageCatalogItemId the value to set
         * @return this builder
         */
        public Builder packageCatalogItemId(String packageCatalogItemId) {
            this.packageCatalogItemId = packageCatalogItemId;
            this.__explicitlySet__.add("packageCatalogItemId");
            return this;
        }
        /**
         * A [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Catalog Item to a file with key/value pairs to set up variables for createStack API.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("configCatalogItemId")
        private String configCatalogItemId;

        /**
         * A [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Catalog Item to a file with key/value pairs to set up variables for createStack API.
         *
         * @param configCatalogItemId the value to set
         * @return this builder
         */
        public Builder configCatalogItemId(String configCatalogItemId) {
            this.configCatalogItemId = configCatalogItemId;
            this.__explicitlySet__.add("configCatalogItemId");
            return this;
        }
        /** A display Name of the Catalog Item in the Catalog. */
        @com.fasterxml.jackson.annotation.JsonProperty("packageCatalogItemDisplayName")
        private String packageCatalogItemDisplayName;

        /**
         * A display Name of the Catalog Item in the Catalog.
         *
         * @param packageCatalogItemDisplayName the value to set
         * @return this builder
         */
        public Builder packageCatalogItemDisplayName(String packageCatalogItemDisplayName) {
            this.packageCatalogItemDisplayName = packageCatalogItemDisplayName;
            this.__explicitlySet__.add("packageCatalogItemDisplayName");
            return this;
        }
        /** A listing ID of the Catalog Item in the Catalog. */
        @com.fasterxml.jackson.annotation.JsonProperty("packageCatalogItemListingId")
        private String packageCatalogItemListingId;

        /**
         * A listing ID of the Catalog Item in the Catalog.
         *
         * @param packageCatalogItemListingId the value to set
         * @return this builder
         */
        public Builder packageCatalogItemListingId(String packageCatalogItemListingId) {
            this.packageCatalogItemListingId = packageCatalogItemListingId;
            this.__explicitlySet__.add("packageCatalogItemListingId");
            return this;
        }
        /** A listing version of the Catalog Item in the Catalog. */
        @com.fasterxml.jackson.annotation.JsonProperty("packageCatalogItemListingVersion")
        private String packageCatalogItemListingVersion;

        /**
         * A listing version of the Catalog Item in the Catalog.
         *
         * @param packageCatalogItemListingVersion the value to set
         * @return this builder
         */
        public Builder packageCatalogItemListingVersion(String packageCatalogItemListingVersion) {
            this.packageCatalogItemListingVersion = packageCatalogItemListingVersion;
            this.__explicitlySet__.add("packageCatalogItemListingVersion");
            return this;
        }
        /** A display Name of the Catalog Item in the Catalog. */
        @com.fasterxml.jackson.annotation.JsonProperty("configCatalogItemDisplayName")
        private String configCatalogItemDisplayName;

        /**
         * A display Name of the Catalog Item in the Catalog.
         *
         * @param configCatalogItemDisplayName the value to set
         * @return this builder
         */
        public Builder configCatalogItemDisplayName(String configCatalogItemDisplayName) {
            this.configCatalogItemDisplayName = configCatalogItemDisplayName;
            this.__explicitlySet__.add("configCatalogItemDisplayName");
            return this;
        }
        /** A listing ID of the Catalog Item in the Catalog. */
        @com.fasterxml.jackson.annotation.JsonProperty("configCatalogItemListingId")
        private String configCatalogItemListingId;

        /**
         * A listing ID of the Catalog Item in the Catalog.
         *
         * @param configCatalogItemListingId the value to set
         * @return this builder
         */
        public Builder configCatalogItemListingId(String configCatalogItemListingId) {
            this.configCatalogItemListingId = configCatalogItemListingId;
            this.__explicitlySet__.add("configCatalogItemListingId");
            return this;
        }
        /** A listing version of the Catalog Item in the Catalog. */
        @com.fasterxml.jackson.annotation.JsonProperty("configCatalogItemListingVersion")
        private String configCatalogItemListingVersion;

        /**
         * A listing version of the Catalog Item in the Catalog.
         *
         * @param configCatalogItemListingVersion the value to set
         * @return this builder
         */
        public Builder configCatalogItemListingVersion(String configCatalogItemListingVersion) {
            this.configCatalogItemListingVersion = configCatalogItemListingVersion;
            this.__explicitlySet__.add("configCatalogItemListingVersion");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * RMS Stack.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("stackId")
        private String stackId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * RMS Stack.
         *
         * @param stackId the value to set
         * @return this builder
         */
        public Builder stackId(String stackId) {
            this.stackId = stackId;
            this.__explicitlySet__.add("stackId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Fleet.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("fleetId")
        private String fleetId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Fleet.
         *
         * @param fleetId the value to set
         * @return this builder
         */
        public Builder fleetId(String fleetId) {
            this.fleetId = fleetId;
            this.__explicitlySet__.add("fleetId");
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

        public ProvisionSummary build() {
            ProvisionSummary model =
                    new ProvisionSummary(
                            this.id,
                            this.displayName,
                            this.provisionDescription,
                            this.compartmentId,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.packageCatalogItemId,
                            this.configCatalogItemId,
                            this.packageCatalogItemDisplayName,
                            this.packageCatalogItemListingId,
                            this.packageCatalogItemListingVersion,
                            this.configCatalogItemDisplayName,
                            this.configCatalogItemListingId,
                            this.configCatalogItemListingVersion,
                            this.stackId,
                            this.fleetId,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProvisionSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("provisionDescription")) {
                this.provisionDescription(model.getProvisionDescription());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
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
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("packageCatalogItemId")) {
                this.packageCatalogItemId(model.getPackageCatalogItemId());
            }
            if (model.wasPropertyExplicitlySet("configCatalogItemId")) {
                this.configCatalogItemId(model.getConfigCatalogItemId());
            }
            if (model.wasPropertyExplicitlySet("packageCatalogItemDisplayName")) {
                this.packageCatalogItemDisplayName(model.getPackageCatalogItemDisplayName());
            }
            if (model.wasPropertyExplicitlySet("packageCatalogItemListingId")) {
                this.packageCatalogItemListingId(model.getPackageCatalogItemListingId());
            }
            if (model.wasPropertyExplicitlySet("packageCatalogItemListingVersion")) {
                this.packageCatalogItemListingVersion(model.getPackageCatalogItemListingVersion());
            }
            if (model.wasPropertyExplicitlySet("configCatalogItemDisplayName")) {
                this.configCatalogItemDisplayName(model.getConfigCatalogItemDisplayName());
            }
            if (model.wasPropertyExplicitlySet("configCatalogItemListingId")) {
                this.configCatalogItemListingId(model.getConfigCatalogItemListingId());
            }
            if (model.wasPropertyExplicitlySet("configCatalogItemListingVersion")) {
                this.configCatalogItemListingVersion(model.getConfigCatalogItemListingVersion());
            }
            if (model.wasPropertyExplicitlySet("stackId")) {
                this.stackId(model.getStackId());
            }
            if (model.wasPropertyExplicitlySet("fleetId")) {
                this.fleetId(model.getFleetId());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * FamProvision.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * FamProvision.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** A user-friendly name. Does not have to be unique, and it's changeable. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** A description of the provision. */
    @com.fasterxml.jackson.annotation.JsonProperty("provisionDescription")
    private final String provisionDescription;

    /**
     * A description of the provision.
     *
     * @return the value
     */
    public String getProvisionDescription() {
        return provisionDescription;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The date and time the FamProvision was created, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the FamProvision was created, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the FamProvision was updated, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the FamProvision was updated, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The current state of the FamProvision. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final Provision.LifecycleState lifecycleState;

    /**
     * The current state of the FamProvision.
     *
     * @return the value
     */
    public Provision.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message that describes the current state of the FamProvision in more detail. For example,
     * can be used to provide actionable information for a resource in the Failed state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message that describes the current state of the FamProvision in more detail. For example,
     * can be used to provide actionable information for a resource in the Failed state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Catalog Item.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("packageCatalogItemId")
    private final String packageCatalogItemId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Catalog Item.
     *
     * @return the value
     */
    public String getPackageCatalogItemId() {
        return packageCatalogItemId;
    }

    /**
     * A [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Catalog Item to a file with key/value pairs to set up variables for createStack API.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configCatalogItemId")
    private final String configCatalogItemId;

    /**
     * A [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Catalog Item to a file with key/value pairs to set up variables for createStack API.
     *
     * @return the value
     */
    public String getConfigCatalogItemId() {
        return configCatalogItemId;
    }

    /** A display Name of the Catalog Item in the Catalog. */
    @com.fasterxml.jackson.annotation.JsonProperty("packageCatalogItemDisplayName")
    private final String packageCatalogItemDisplayName;

    /**
     * A display Name of the Catalog Item in the Catalog.
     *
     * @return the value
     */
    public String getPackageCatalogItemDisplayName() {
        return packageCatalogItemDisplayName;
    }

    /** A listing ID of the Catalog Item in the Catalog. */
    @com.fasterxml.jackson.annotation.JsonProperty("packageCatalogItemListingId")
    private final String packageCatalogItemListingId;

    /**
     * A listing ID of the Catalog Item in the Catalog.
     *
     * @return the value
     */
    public String getPackageCatalogItemListingId() {
        return packageCatalogItemListingId;
    }

    /** A listing version of the Catalog Item in the Catalog. */
    @com.fasterxml.jackson.annotation.JsonProperty("packageCatalogItemListingVersion")
    private final String packageCatalogItemListingVersion;

    /**
     * A listing version of the Catalog Item in the Catalog.
     *
     * @return the value
     */
    public String getPackageCatalogItemListingVersion() {
        return packageCatalogItemListingVersion;
    }

    /** A display Name of the Catalog Item in the Catalog. */
    @com.fasterxml.jackson.annotation.JsonProperty("configCatalogItemDisplayName")
    private final String configCatalogItemDisplayName;

    /**
     * A display Name of the Catalog Item in the Catalog.
     *
     * @return the value
     */
    public String getConfigCatalogItemDisplayName() {
        return configCatalogItemDisplayName;
    }

    /** A listing ID of the Catalog Item in the Catalog. */
    @com.fasterxml.jackson.annotation.JsonProperty("configCatalogItemListingId")
    private final String configCatalogItemListingId;

    /**
     * A listing ID of the Catalog Item in the Catalog.
     *
     * @return the value
     */
    public String getConfigCatalogItemListingId() {
        return configCatalogItemListingId;
    }

    /** A listing version of the Catalog Item in the Catalog. */
    @com.fasterxml.jackson.annotation.JsonProperty("configCatalogItemListingVersion")
    private final String configCatalogItemListingVersion;

    /**
     * A listing version of the Catalog Item in the Catalog.
     *
     * @return the value
     */
    public String getConfigCatalogItemListingVersion() {
        return configCatalogItemListingVersion;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the RMS
     * Stack.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("stackId")
    private final String stackId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the RMS
     * Stack.
     *
     * @return the value
     */
    public String getStackId() {
        return stackId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Fleet.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fleetId")
    private final String fleetId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Fleet.
     *
     * @return the value
     */
    public String getFleetId() {
        return fleetId;
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
        sb.append("ProvisionSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", provisionDescription=").append(String.valueOf(this.provisionDescription));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", packageCatalogItemId=").append(String.valueOf(this.packageCatalogItemId));
        sb.append(", configCatalogItemId=").append(String.valueOf(this.configCatalogItemId));
        sb.append(", packageCatalogItemDisplayName=")
                .append(String.valueOf(this.packageCatalogItemDisplayName));
        sb.append(", packageCatalogItemListingId=")
                .append(String.valueOf(this.packageCatalogItemListingId));
        sb.append(", packageCatalogItemListingVersion=")
                .append(String.valueOf(this.packageCatalogItemListingVersion));
        sb.append(", configCatalogItemDisplayName=")
                .append(String.valueOf(this.configCatalogItemDisplayName));
        sb.append(", configCatalogItemListingId=")
                .append(String.valueOf(this.configCatalogItemListingId));
        sb.append(", configCatalogItemListingVersion=")
                .append(String.valueOf(this.configCatalogItemListingVersion));
        sb.append(", stackId=").append(String.valueOf(this.stackId));
        sb.append(", fleetId=").append(String.valueOf(this.fleetId));
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
        if (!(o instanceof ProvisionSummary)) {
            return false;
        }

        ProvisionSummary other = (ProvisionSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.provisionDescription, other.provisionDescription)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.packageCatalogItemId, other.packageCatalogItemId)
                && java.util.Objects.equals(this.configCatalogItemId, other.configCatalogItemId)
                && java.util.Objects.equals(
                        this.packageCatalogItemDisplayName, other.packageCatalogItemDisplayName)
                && java.util.Objects.equals(
                        this.packageCatalogItemListingId, other.packageCatalogItemListingId)
                && java.util.Objects.equals(
                        this.packageCatalogItemListingVersion,
                        other.packageCatalogItemListingVersion)
                && java.util.Objects.equals(
                        this.configCatalogItemDisplayName, other.configCatalogItemDisplayName)
                && java.util.Objects.equals(
                        this.configCatalogItemListingId, other.configCatalogItemListingId)
                && java.util.Objects.equals(
                        this.configCatalogItemListingVersion, other.configCatalogItemListingVersion)
                && java.util.Objects.equals(this.stackId, other.stackId)
                && java.util.Objects.equals(this.fleetId, other.fleetId)
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
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.provisionDescription == null
                                ? 43
                                : this.provisionDescription.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.packageCatalogItemId == null
                                ? 43
                                : this.packageCatalogItemId.hashCode());
        result =
                (result * PRIME)
                        + (this.configCatalogItemId == null
                                ? 43
                                : this.configCatalogItemId.hashCode());
        result =
                (result * PRIME)
                        + (this.packageCatalogItemDisplayName == null
                                ? 43
                                : this.packageCatalogItemDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.packageCatalogItemListingId == null
                                ? 43
                                : this.packageCatalogItemListingId.hashCode());
        result =
                (result * PRIME)
                        + (this.packageCatalogItemListingVersion == null
                                ? 43
                                : this.packageCatalogItemListingVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.configCatalogItemDisplayName == null
                                ? 43
                                : this.configCatalogItemDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.configCatalogItemListingId == null
                                ? 43
                                : this.configCatalogItemListingId.hashCode());
        result =
                (result * PRIME)
                        + (this.configCatalogItemListingVersion == null
                                ? 43
                                : this.configCatalogItemListingVersion.hashCode());
        result = (result * PRIME) + (this.stackId == null ? 43 : this.stackId.hashCode());
        result = (result * PRIME) + (this.fleetId == null ? 43 : this.fleetId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
