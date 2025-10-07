/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.iot.model;

/**
 * An IoT domain is an Oracle Cloud Infrastructure resource that provides a managed environment for
 * organizing and managing digital twin resources, such as models, adapters, instances and
 * relationships, within a compartment and IoT domain group.
 *
 * <p>To use any API operations, you must be authorized in an IAM policy. If you are not authorized,
 * contact an administrator. If you are an administrator who needs to create policies to grant users
 * access, see [Getting Started with
 * Policies](https://docs.oracle.com/iaas/Content/Identity/policiesgs/get-started-with-policies.htm).
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = IotDomain.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class IotDomain extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "iotDomainGroupId",
        "compartmentId",
        "displayName",
        "description",
        "deviceHost",
        "dbAllowListedIdentityGroupNames",
        "dbAllowedIdentityDomainHost",
        "dataRetentionPeriodsInDays",
        "lifecycleState",
        "freeformTags",
        "definedTags",
        "systemTags",
        "timeCreated",
        "timeUpdated"
    })
    public IotDomain(
            String id,
            String iotDomainGroupId,
            String compartmentId,
            String displayName,
            String description,
            String deviceHost,
            java.util.List<String> dbAllowListedIdentityGroupNames,
            String dbAllowedIdentityDomainHost,
            DataRetentionPeriodsInDays dataRetentionPeriodsInDays,
            LifecycleState lifecycleState,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            java.util.Date timeCreated,
            java.util.Date timeUpdated) {
        super();
        this.id = id;
        this.iotDomainGroupId = iotDomainGroupId;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.description = description;
        this.deviceHost = deviceHost;
        this.dbAllowListedIdentityGroupNames = dbAllowListedIdentityGroupNames;
        this.dbAllowedIdentityDomainHost = dbAllowedIdentityDomainHost;
        this.dataRetentionPeriodsInDays = dataRetentionPeriodsInDays;
        this.lifecycleState = lifecycleState;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * resource.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * resource.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * IoT domain group.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("iotDomainGroupId")
        private String iotDomainGroupId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * IoT domain group.
         *
         * @param iotDomainGroupId the value to set
         * @return this builder
         */
        public Builder iotDomainGroupId(String iotDomainGroupId) {
            this.iotDomainGroupId = iotDomainGroupId;
            this.__explicitlySet__.add("iotDomainGroupId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment corresponding to the resource.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment corresponding to the resource.
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
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** A short description of the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A short description of the resource.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Host name of an IoT domain, where IoT devices can connect to. */
        @com.fasterxml.jackson.annotation.JsonProperty("deviceHost")
        private String deviceHost;

        /**
         * Host name of an IoT domain, where IoT devices can connect to.
         *
         * @param deviceHost the value to set
         * @return this builder
         */
        public Builder deviceHost(String deviceHost) {
            this.deviceHost = deviceHost;
            this.__explicitlySet__.add("deviceHost");
            return this;
        }
        /**
         * List of IAM groups of form described in
         * [here](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/mnqmn/#GUID-3634D6C9-A7F1-4875-9925-BAEA2D3C5197)
         * that are allowed to directly connect to the data host.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbAllowListedIdentityGroupNames")
        private java.util.List<String> dbAllowListedIdentityGroupNames;

        /**
         * List of IAM groups of form described in
         * [here](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/mnqmn/#GUID-3634D6C9-A7F1-4875-9925-BAEA2D3C5197)
         * that are allowed to directly connect to the data host.
         *
         * @param dbAllowListedIdentityGroupNames the value to set
         * @return this builder
         */
        public Builder dbAllowListedIdentityGroupNames(
                java.util.List<String> dbAllowListedIdentityGroupNames) {
            this.dbAllowListedIdentityGroupNames = dbAllowListedIdentityGroupNames;
            this.__explicitlySet__.add("dbAllowListedIdentityGroupNames");
            return this;
        }
        /**
         * Host name of identity domain that is used for authenticating connect to data host via
         * ORDS.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbAllowedIdentityDomainHost")
        private String dbAllowedIdentityDomainHost;

        /**
         * Host name of identity domain that is used for authenticating connect to data host via
         * ORDS.
         *
         * @param dbAllowedIdentityDomainHost the value to set
         * @return this builder
         */
        public Builder dbAllowedIdentityDomainHost(String dbAllowedIdentityDomainHost) {
            this.dbAllowedIdentityDomainHost = dbAllowedIdentityDomainHost;
            this.__explicitlySet__.add("dbAllowedIdentityDomainHost");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataRetentionPeriodsInDays")
        private DataRetentionPeriodsInDays dataRetentionPeriodsInDays;

        public Builder dataRetentionPeriodsInDays(
                DataRetentionPeriodsInDays dataRetentionPeriodsInDays) {
            this.dataRetentionPeriodsInDays = dataRetentionPeriodsInDays;
            this.__explicitlySet__.add("dataRetentionPeriodsInDays");
            return this;
        }
        /** The current state of the IoT domain. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the IoT domain.
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
        /**
         * The date and time when the resource was created, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time when the resource was created, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
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
         * The date and time when the resource was last updated, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time when the resource was last updated, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IotDomain build() {
            IotDomain model =
                    new IotDomain(
                            this.id,
                            this.iotDomainGroupId,
                            this.compartmentId,
                            this.displayName,
                            this.description,
                            this.deviceHost,
                            this.dbAllowListedIdentityGroupNames,
                            this.dbAllowedIdentityDomainHost,
                            this.dataRetentionPeriodsInDays,
                            this.lifecycleState,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.timeCreated,
                            this.timeUpdated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IotDomain model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("iotDomainGroupId")) {
                this.iotDomainGroupId(model.getIotDomainGroupId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("deviceHost")) {
                this.deviceHost(model.getDeviceHost());
            }
            if (model.wasPropertyExplicitlySet("dbAllowListedIdentityGroupNames")) {
                this.dbAllowListedIdentityGroupNames(model.getDbAllowListedIdentityGroupNames());
            }
            if (model.wasPropertyExplicitlySet("dbAllowedIdentityDomainHost")) {
                this.dbAllowedIdentityDomainHost(model.getDbAllowedIdentityDomainHost());
            }
            if (model.wasPropertyExplicitlySet("dataRetentionPeriodsInDays")) {
                this.dataRetentionPeriodsInDays(model.getDataRetentionPeriodsInDays());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
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
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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
     * resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * resource.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the IoT
     * domain group.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("iotDomainGroupId")
    private final String iotDomainGroupId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the IoT
     * domain group.
     *
     * @return the value
     */
    public String getIotDomainGroupId() {
        return iotDomainGroupId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment corresponding to the resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment corresponding to the resource.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** A short description of the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A short description of the resource.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Host name of an IoT domain, where IoT devices can connect to. */
    @com.fasterxml.jackson.annotation.JsonProperty("deviceHost")
    private final String deviceHost;

    /**
     * Host name of an IoT domain, where IoT devices can connect to.
     *
     * @return the value
     */
    public String getDeviceHost() {
        return deviceHost;
    }

    /**
     * List of IAM groups of form described in
     * [here](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/mnqmn/#GUID-3634D6C9-A7F1-4875-9925-BAEA2D3C5197)
     * that are allowed to directly connect to the data host.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbAllowListedIdentityGroupNames")
    private final java.util.List<String> dbAllowListedIdentityGroupNames;

    /**
     * List of IAM groups of form described in
     * [here](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/mnqmn/#GUID-3634D6C9-A7F1-4875-9925-BAEA2D3C5197)
     * that are allowed to directly connect to the data host.
     *
     * @return the value
     */
    public java.util.List<String> getDbAllowListedIdentityGroupNames() {
        return dbAllowListedIdentityGroupNames;
    }

    /**
     * Host name of identity domain that is used for authenticating connect to data host via ORDS.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbAllowedIdentityDomainHost")
    private final String dbAllowedIdentityDomainHost;

    /**
     * Host name of identity domain that is used for authenticating connect to data host via ORDS.
     *
     * @return the value
     */
    public String getDbAllowedIdentityDomainHost() {
        return dbAllowedIdentityDomainHost;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dataRetentionPeriodsInDays")
    private final DataRetentionPeriodsInDays dataRetentionPeriodsInDays;

    public DataRetentionPeriodsInDays getDataRetentionPeriodsInDays() {
        return dataRetentionPeriodsInDays;
    }

    /** The current state of the IoT domain. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Updating("UPDATING"),
        Active("ACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),

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
    /** The current state of the IoT domain. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the IoT domain.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
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

    /**
     * The date and time when the resource was created, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time when the resource was created, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time when the resource was last updated, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time when the resource was last updated, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
        sb.append("IotDomain(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", iotDomainGroupId=").append(String.valueOf(this.iotDomainGroupId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", deviceHost=").append(String.valueOf(this.deviceHost));
        sb.append(", dbAllowListedIdentityGroupNames=")
                .append(String.valueOf(this.dbAllowListedIdentityGroupNames));
        sb.append(", dbAllowedIdentityDomainHost=")
                .append(String.valueOf(this.dbAllowedIdentityDomainHost));
        sb.append(", dataRetentionPeriodsInDays=")
                .append(String.valueOf(this.dataRetentionPeriodsInDays));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IotDomain)) {
            return false;
        }

        IotDomain other = (IotDomain) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.iotDomainGroupId, other.iotDomainGroupId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.deviceHost, other.deviceHost)
                && java.util.Objects.equals(
                        this.dbAllowListedIdentityGroupNames, other.dbAllowListedIdentityGroupNames)
                && java.util.Objects.equals(
                        this.dbAllowedIdentityDomainHost, other.dbAllowedIdentityDomainHost)
                && java.util.Objects.equals(
                        this.dataRetentionPeriodsInDays, other.dataRetentionPeriodsInDays)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.iotDomainGroupId == null ? 43 : this.iotDomainGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.deviceHost == null ? 43 : this.deviceHost.hashCode());
        result =
                (result * PRIME)
                        + (this.dbAllowListedIdentityGroupNames == null
                                ? 43
                                : this.dbAllowListedIdentityGroupNames.hashCode());
        result =
                (result * PRIME)
                        + (this.dbAllowedIdentityDomainHost == null
                                ? 43
                                : this.dbAllowedIdentityDomainHost.hashCode());
        result =
                (result * PRIME)
                        + (this.dataRetentionPeriodsInDays == null
                                ? 43
                                : this.dataRetentionPeriodsInDays.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
