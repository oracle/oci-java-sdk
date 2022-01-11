/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oce.model;

/**
 * Details of OceInstance.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190912")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OceInstance.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class OceInstance {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("guid")
        private String guid;

        public Builder guid(String guid) {
            this.guid = guid;
            this.__explicitlySet__.add("guid");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
        private String tenancyId;

        public Builder tenancyId(String tenancyId) {
            this.tenancyId = tenancyId;
            this.__explicitlySet__.add("tenancyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("idcsTenancy")
        private String idcsTenancy;

        public Builder idcsTenancy(String idcsTenancy) {
            this.idcsTenancy = idcsTenancy;
            this.__explicitlySet__.add("idcsTenancy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tenancyName")
        private String tenancyName;

        public Builder tenancyName(String tenancyName) {
            this.tenancyName = tenancyName;
            this.__explicitlySet__.add("tenancyName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("upgradeSchedule")
        private UpgradeSchedule upgradeSchedule;

        public Builder upgradeSchedule(UpgradeSchedule upgradeSchedule) {
            this.upgradeSchedule = upgradeSchedule;
            this.__explicitlySet__.add("upgradeSchedule");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("identityStripe")
        private IdentityStripeDetails identityStripe;

        public Builder identityStripe(IdentityStripeDetails identityStripe) {
            this.identityStripe = identityStripe;
            this.__explicitlySet__.add("identityStripe");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instanceUsageType")
        private InstanceUsageType instanceUsageType;

        public Builder instanceUsageType(InstanceUsageType instanceUsageType) {
            this.instanceUsageType = instanceUsageType;
            this.__explicitlySet__.add("instanceUsageType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectStorageNamespace")
        private String objectStorageNamespace;

        public Builder objectStorageNamespace(String objectStorageNamespace) {
            this.objectStorageNamespace = objectStorageNamespace;
            this.__explicitlySet__.add("objectStorageNamespace");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("adminEmail")
        private String adminEmail;

        public Builder adminEmail(String adminEmail) {
            this.adminEmail = adminEmail;
            this.__explicitlySet__.add("adminEmail");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("wafPrimaryDomain")
        private String wafPrimaryDomain;

        public Builder wafPrimaryDomain(String wafPrimaryDomain) {
            this.wafPrimaryDomain = wafPrimaryDomain;
            this.__explicitlySet__.add("wafPrimaryDomain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instanceAccessType")
        private InstanceAccessType instanceAccessType;

        public Builder instanceAccessType(InstanceAccessType instanceAccessType) {
            this.instanceAccessType = instanceAccessType;
            this.__explicitlySet__.add("instanceAccessType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instanceLicenseType")
        private LicenseType instanceLicenseType;

        public Builder instanceLicenseType(LicenseType instanceLicenseType) {
            this.instanceLicenseType = instanceLicenseType;
            this.__explicitlySet__.add("instanceLicenseType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stateMessage")
        private String stateMessage;

        public Builder stateMessage(String stateMessage) {
            this.stateMessage = stateMessage;
            this.__explicitlySet__.add("stateMessage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("service")
        private java.util.Map<String, Object> service;

        public Builder service(java.util.Map<String, Object> service) {
            this.service = service;
            this.__explicitlySet__.add("service");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OceInstance build() {
            OceInstance __instance__ =
                    new OceInstance(
                            id,
                            guid,
                            description,
                            compartmentId,
                            name,
                            tenancyId,
                            idcsTenancy,
                            tenancyName,
                            upgradeSchedule,
                            identityStripe,
                            instanceUsageType,
                            objectStorageNamespace,
                            adminEmail,
                            wafPrimaryDomain,
                            instanceAccessType,
                            instanceLicenseType,
                            timeCreated,
                            timeUpdated,
                            lifecycleState,
                            stateMessage,
                            freeformTags,
                            definedTags,
                            systemTags,
                            service);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OceInstance o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .guid(o.getGuid())
                            .description(o.getDescription())
                            .compartmentId(o.getCompartmentId())
                            .name(o.getName())
                            .tenancyId(o.getTenancyId())
                            .idcsTenancy(o.getIdcsTenancy())
                            .tenancyName(o.getTenancyName())
                            .upgradeSchedule(o.getUpgradeSchedule())
                            .identityStripe(o.getIdentityStripe())
                            .instanceUsageType(o.getInstanceUsageType())
                            .objectStorageNamespace(o.getObjectStorageNamespace())
                            .adminEmail(o.getAdminEmail())
                            .wafPrimaryDomain(o.getWafPrimaryDomain())
                            .instanceAccessType(o.getInstanceAccessType())
                            .instanceLicenseType(o.getInstanceLicenseType())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .lifecycleState(o.getLifecycleState())
                            .stateMessage(o.getStateMessage())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .systemTags(o.getSystemTags())
                            .service(o.getService());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Unique identifier that is immutable on creation
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * Unique GUID identifier that is immutable on creation
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("guid")
    String guid;

    /**
     * OceInstance description, can be updated
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * Compartment Identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * OceInstance Name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * Tenancy Identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
    String tenancyId;

    /**
     * IDCS Tenancy Identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idcsTenancy")
    String idcsTenancy;

    /**
     * Tenancy Name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenancyName")
    String tenancyName;
    /**
     * Upgrade schedule type representing service to be upgraded immediately whenever latest version is released
     * or delay upgrade of the service to previous released version
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum UpgradeSchedule {
        UpgradeImmediately("UPGRADE_IMMEDIATELY"),
        DelayedUpgrade("DELAYED_UPGRADE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, UpgradeSchedule> map;

        static {
            map = new java.util.HashMap<>();
            for (UpgradeSchedule v : UpgradeSchedule.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        UpgradeSchedule(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static UpgradeSchedule create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'UpgradeSchedule', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Upgrade schedule type representing service to be upgraded immediately whenever latest version is released
     * or delay upgrade of the service to previous released version
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("upgradeSchedule")
    UpgradeSchedule upgradeSchedule;

    @com.fasterxml.jackson.annotation.JsonProperty("identityStripe")
    IdentityStripeDetails identityStripe;
    /**
     * Instance type based on its usage
     **/
    @lombok.extern.slf4j.Slf4j
    public enum InstanceUsageType {
        Primary("PRIMARY"),
        Nonprimary("NONPRIMARY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, InstanceUsageType> map;

        static {
            map = new java.util.HashMap<>();
            for (InstanceUsageType v : InstanceUsageType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        InstanceUsageType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static InstanceUsageType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'InstanceUsageType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Instance type based on its usage
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceUsageType")
    InstanceUsageType instanceUsageType;

    /**
     * Object Storage Namespace of tenancy
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectStorageNamespace")
    String objectStorageNamespace;

    /**
     * Admin Email for Notification
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("adminEmail")
    String adminEmail;

    /**
     * Web Application Firewall(WAF) primary domain
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("wafPrimaryDomain")
    String wafPrimaryDomain;
    /**
     * Flag indicating whether the instance access is private or public
     **/
    @lombok.extern.slf4j.Slf4j
    public enum InstanceAccessType {
        Public("PUBLIC"),
        Private("PRIVATE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, InstanceAccessType> map;

        static {
            map = new java.util.HashMap<>();
            for (InstanceAccessType v : InstanceAccessType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        InstanceAccessType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static InstanceAccessType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'InstanceAccessType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Flag indicating whether the instance access is private or public
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceAccessType")
    InstanceAccessType instanceAccessType;

    /**
     * Flag indicating whether the instance license is new cloud or bring your own license
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceLicenseType")
    LicenseType instanceLicenseType;

    /**
     * The time the the OceInstance was created. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The time the OceInstance was updated. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;
    /**
     * The current state of the file system.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Creating("CREATING"),
        Updating("UPDATING"),
        Active("ACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * The current state of the file system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * An message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stateMessage")
    String stateMessage;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * SERVICE data.
     * Example: {@code {"service": {"IDCS": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("service")
    java.util.Map<String, Object> service;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
