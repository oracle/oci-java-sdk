/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ociproductcatalog.model;

/**
 * The properties of a product returned by the admin get API <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AdminProductSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AdminProductSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "name",
        "description",
        "lifecycleState",
        "lifecycleDetails",
        "meterwithSKUs",
        "serviceName",
        "limits",
        "timeCreated",
        "timeUpdated",
        "timeReady",
        "timeLaunched",
        "isExcluded",
        "timeExcluded",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public AdminProductSummary(
            String id,
            String compartmentId,
            String name,
            String description,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.List<MeterWithSKU> meterwithSKUs,
            String serviceName,
            java.util.List<Limit> limits,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Date timeReady,
            java.util.Date timeLaunched,
            Boolean isExcluded,
            java.util.Date timeExcluded,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.name = name;
        this.description = description;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.meterwithSKUs = meterwithSKUs;
        this.serviceName = serviceName;
        this.limits = limits;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.timeReady = timeReady;
        this.timeLaunched = timeLaunched;
        this.isExcluded = isExcluded;
        this.timeExcluded = timeExcluded;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** OCID of the product */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * OCID of the product
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
         * The OCID of the compartment (remember that the tenancy is simply the root compartment).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment (remember that the tenancy is simply the root compartment).
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Name of the product, defined by service teams. Unique within one service */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the product, defined by service teams. Unique within one service
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** description to the product */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * description to the product
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The status of a product following the OCI standard. ACTIVE: resources of this product can
         * be used by the end customer. INACTIVE: resources of this product can't be used by the end
         * customer. Product needs manual approval. NEEDS_ATTENTION: operator action is needed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The status of a product following the OCI standard. ACTIVE: resources of this product can
         * be used by the end customer. INACTIVE: resources of this product can't be used by the end
         * customer. Product needs manual approval. NEEDS_ATTENTION: operator action is needed.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The displayed status of a product. lifecycleState to lifecycleDetails mapping: INACTIVE
         * -> "Not yet launched" ACTIVE -> "Launched" NEEDS_ATTENTION -> "Pricing not set"
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * The displayed status of a product. lifecycleState to lifecycleDetails mapping: INACTIVE
         * -> "Not yet launched" ACTIVE -> "Launched" NEEDS_ATTENTION -> "Pricing not set"
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** List of meters associated with this product, including SKU information */
        @com.fasterxml.jackson.annotation.JsonProperty("meterwithSKUs")
        private java.util.List<MeterWithSKU> meterwithSKUs;

        /**
         * List of meters associated with this product, including SKU information
         *
         * @param meterwithSKUs the value to set
         * @return this builder
         */
        public Builder meterwithSKUs(java.util.List<MeterWithSKU> meterwithSKUs) {
            this.meterwithSKUs = meterwithSKUs;
            this.__explicitlySet__.add("meterwithSKUs");
            return this;
        }
        /** Name of the metering service this product relates to. */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
        private String serviceName;

        /**
         * Name of the metering service this product relates to.
         *
         * @param serviceName the value to set
         * @return this builder
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            this.__explicitlySet__.add("serviceName");
            return this;
        }
        /** List of limits that this product is associated with. */
        @com.fasterxml.jackson.annotation.JsonProperty("limits")
        private java.util.List<Limit> limits;

        /**
         * List of limits that this product is associated with.
         *
         * @param limits the value to set
         * @return this builder
         */
        public Builder limits(java.util.List<Limit> limits) {
            this.limits = limits;
            this.__explicitlySet__.add("limits");
            return this;
        }
        /** Date and time when the product was created Example: {@code 2022-01-25T21:10:29.600Z} */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Date and time when the product was created Example: {@code 2022-01-25T21:10:29.600Z}
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
         * Date and time when the product was updated. Nullable Example: {@code
         * 2022-01-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * Date and time when the product was updated. Nullable Example: {@code
         * 2022-01-25T21:10:29.600Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * Date and time when the product was set to ready. Nullable Example: {@code
         * 2022-01-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeReady")
        private java.util.Date timeReady;

        /**
         * Date and time when the product was set to ready. Nullable Example: {@code
         * 2022-01-25T21:10:29.600Z}
         *
         * @param timeReady the value to set
         * @return this builder
         */
        public Builder timeReady(java.util.Date timeReady) {
            this.timeReady = timeReady;
            this.__explicitlySet__.add("timeReady");
            return this;
        }
        /**
         * Date and time when the product was launched. Nullable Example: {@code
         * 2022-01-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLaunched")
        private java.util.Date timeLaunched;

        /**
         * Date and time when the product was launched. Nullable Example: {@code
         * 2022-01-25T21:10:29.600Z}
         *
         * @param timeLaunched the value to set
         * @return this builder
         */
        public Builder timeLaunched(java.util.Date timeLaunched) {
            this.timeLaunched = timeLaunched;
            this.__explicitlySet__.add("timeLaunched");
            return this;
        }
        /**
         * Whether the product is currently excluded from SKU processing flows. Nullable when the
         * exclusion flag has not been explicitly set.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isExcluded")
        private Boolean isExcluded;

        /**
         * Whether the product is currently excluded from SKU processing flows. Nullable when the
         * exclusion flag has not been explicitly set.
         *
         * @param isExcluded the value to set
         * @return this builder
         */
        public Builder isExcluded(Boolean isExcluded) {
            this.isExcluded = isExcluded;
            this.__explicitlySet__.add("isExcluded");
            return this;
        }
        /**
         * Date and time when the product was marked as excluded. Nullable Example: {@code
         * 2022-01-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeExcluded")
        private java.util.Date timeExcluded;

        /**
         * Date and time when the product was marked as excluded. Nullable Example: {@code
         * 2022-01-25T21:10:29.600Z}
         *
         * @param timeExcluded the value to set
         * @return this builder
         */
        public Builder timeExcluded(java.util.Date timeExcluded) {
            this.timeExcluded = timeExcluded;
            this.__explicitlySet__.add("timeExcluded");
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
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
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

        public AdminProductSummary build() {
            AdminProductSummary model =
                    new AdminProductSummary(
                            this.id,
                            this.compartmentId,
                            this.name,
                            this.description,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.meterwithSKUs,
                            this.serviceName,
                            this.limits,
                            this.timeCreated,
                            this.timeUpdated,
                            this.timeReady,
                            this.timeLaunched,
                            this.isExcluded,
                            this.timeExcluded,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AdminProductSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("meterwithSKUs")) {
                this.meterwithSKUs(model.getMeterwithSKUs());
            }
            if (model.wasPropertyExplicitlySet("serviceName")) {
                this.serviceName(model.getServiceName());
            }
            if (model.wasPropertyExplicitlySet("limits")) {
                this.limits(model.getLimits());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("timeReady")) {
                this.timeReady(model.getTimeReady());
            }
            if (model.wasPropertyExplicitlySet("timeLaunched")) {
                this.timeLaunched(model.getTimeLaunched());
            }
            if (model.wasPropertyExplicitlySet("isExcluded")) {
                this.isExcluded(model.getIsExcluded());
            }
            if (model.wasPropertyExplicitlySet("timeExcluded")) {
                this.timeExcluded(model.getTimeExcluded());
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

    /** OCID of the product */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * OCID of the product
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The OCID of the compartment (remember that the tenancy is simply the root compartment). */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment (remember that the tenancy is simply the root compartment).
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Name of the product, defined by service teams. Unique within one service */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the product, defined by service teams. Unique within one service
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** description to the product */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * description to the product
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The status of a product following the OCI standard. ACTIVE: resources of this product can be
     * used by the end customer. INACTIVE: resources of this product can't be used by the end
     * customer. Product needs manual approval. NEEDS_ATTENTION: operator action is needed.
     */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        NeedsAttention("NEEDS_ATTENTION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The status of a product following the OCI standard. ACTIVE: resources of this product can be
     * used by the end customer. INACTIVE: resources of this product can't be used by the end
     * customer. Product needs manual approval. NEEDS_ATTENTION: operator action is needed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The status of a product following the OCI standard. ACTIVE: resources of this product can be
     * used by the end customer. INACTIVE: resources of this product can't be used by the end
     * customer. Product needs manual approval. NEEDS_ATTENTION: operator action is needed.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The displayed status of a product. lifecycleState to lifecycleDetails mapping: INACTIVE ->
     * "Not yet launched" ACTIVE -> "Launched" NEEDS_ATTENTION -> "Pricing not set"
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * The displayed status of a product. lifecycleState to lifecycleDetails mapping: INACTIVE ->
     * "Not yet launched" ACTIVE -> "Launched" NEEDS_ATTENTION -> "Pricing not set"
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** List of meters associated with this product, including SKU information */
    @com.fasterxml.jackson.annotation.JsonProperty("meterwithSKUs")
    private final java.util.List<MeterWithSKU> meterwithSKUs;

    /**
     * List of meters associated with this product, including SKU information
     *
     * @return the value
     */
    public java.util.List<MeterWithSKU> getMeterwithSKUs() {
        return meterwithSKUs;
    }

    /** Name of the metering service this product relates to. */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
    private final String serviceName;

    /**
     * Name of the metering service this product relates to.
     *
     * @return the value
     */
    public String getServiceName() {
        return serviceName;
    }

    /** List of limits that this product is associated with. */
    @com.fasterxml.jackson.annotation.JsonProperty("limits")
    private final java.util.List<Limit> limits;

    /**
     * List of limits that this product is associated with.
     *
     * @return the value
     */
    public java.util.List<Limit> getLimits() {
        return limits;
    }

    /** Date and time when the product was created Example: {@code 2022-01-25T21:10:29.600Z} */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Date and time when the product was created Example: {@code 2022-01-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Date and time when the product was updated. Nullable Example: {@code
     * 2022-01-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * Date and time when the product was updated. Nullable Example: {@code
     * 2022-01-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Date and time when the product was set to ready. Nullable Example: {@code
     * 2022-01-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeReady")
    private final java.util.Date timeReady;

    /**
     * Date and time when the product was set to ready. Nullable Example: {@code
     * 2022-01-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeReady() {
        return timeReady;
    }

    /**
     * Date and time when the product was launched. Nullable Example: {@code
     * 2022-01-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLaunched")
    private final java.util.Date timeLaunched;

    /**
     * Date and time when the product was launched. Nullable Example: {@code
     * 2022-01-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeLaunched() {
        return timeLaunched;
    }

    /**
     * Whether the product is currently excluded from SKU processing flows. Nullable when the
     * exclusion flag has not been explicitly set.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isExcluded")
    private final Boolean isExcluded;

    /**
     * Whether the product is currently excluded from SKU processing flows. Nullable when the
     * exclusion flag has not been explicitly set.
     *
     * @return the value
     */
    public Boolean getIsExcluded() {
        return isExcluded;
    }

    /**
     * Date and time when the product was marked as excluded. Nullable Example: {@code
     * 2022-01-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeExcluded")
    private final java.util.Date timeExcluded;

    /**
     * Date and time when the product was marked as excluded. Nullable Example: {@code
     * 2022-01-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeExcluded() {
        return timeExcluded;
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

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
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
        sb.append("AdminProductSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", meterwithSKUs=").append(String.valueOf(this.meterwithSKUs));
        sb.append(", serviceName=").append(String.valueOf(this.serviceName));
        sb.append(", limits=").append(String.valueOf(this.limits));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", timeReady=").append(String.valueOf(this.timeReady));
        sb.append(", timeLaunched=").append(String.valueOf(this.timeLaunched));
        sb.append(", isExcluded=").append(String.valueOf(this.isExcluded));
        sb.append(", timeExcluded=").append(String.valueOf(this.timeExcluded));
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
        if (!(o instanceof AdminProductSummary)) {
            return false;
        }

        AdminProductSummary other = (AdminProductSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.meterwithSKUs, other.meterwithSKUs)
                && java.util.Objects.equals(this.serviceName, other.serviceName)
                && java.util.Objects.equals(this.limits, other.limits)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.timeReady, other.timeReady)
                && java.util.Objects.equals(this.timeLaunched, other.timeLaunched)
                && java.util.Objects.equals(this.isExcluded, other.isExcluded)
                && java.util.Objects.equals(this.timeExcluded, other.timeExcluded)
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
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.meterwithSKUs == null ? 43 : this.meterwithSKUs.hashCode());
        result = (result * PRIME) + (this.serviceName == null ? 43 : this.serviceName.hashCode());
        result = (result * PRIME) + (this.limits == null ? 43 : this.limits.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.timeReady == null ? 43 : this.timeReady.hashCode());
        result = (result * PRIME) + (this.timeLaunched == null ? 43 : this.timeLaunched.hashCode());
        result = (result * PRIME) + (this.isExcluded == null ? 43 : this.isExcluded.hashCode());
        result = (result * PRIME) + (this.timeExcluded == null ? 43 : this.timeExcluded.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
