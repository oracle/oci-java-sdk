/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.multicloud.model;

/**
 * A multicloud Alert
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MulticloudAlert.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MulticloudAlert extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "description",
        "alertType",
        "severity",
        "subscriptionId",
        "subscriptionType",
        "alertStatus",
        "timeCreated",
        "timeUpdated",
        "resourceId",
        "resourceType",
        "compartmentId",
        "functionType",
        "source",
        "alertId",
        "lifecycleState",
        "freeformTags",
        "definedTags",
        "systemTags",
        "sourceRegion",
        "additionalParameters"
    })
    public MulticloudAlert(
            String id,
            String displayName,
            String description,
            String alertType,
            Severity severity,
            String subscriptionId,
            SubscriptionType subscriptionType,
            AlertStatus alertStatus,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String resourceId,
            String resourceType,
            String compartmentId,
            String functionType,
            String source,
            String alertId,
            LifecycleState lifecycleState,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            String sourceRegion,
            java.util.Map<String, String> additionalParameters) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.description = description;
        this.alertType = alertType;
        this.severity = severity;
        this.subscriptionId = subscriptionId;
        this.subscriptionType = subscriptionType;
        this.alertStatus = alertStatus;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.resourceId = resourceId;
        this.resourceType = resourceType;
        this.compartmentId = compartmentId;
        this.functionType = functionType;
        this.source = source;
        this.alertId = alertId;
        this.lifecycleState = lifecycleState;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.sourceRegion = sourceRegion;
        this.additionalParameters = additionalParameters;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the multicloud alert.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the multicloud alert.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Human-readable name of the alert.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Human-readable name of the alert.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Description of the alert and its purpose.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the alert and its purpose.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Type/category of the alert (e.g. IAM_POLICY_GAP, TAG_INCONSISTENCY).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("alertType")
        private String alertType;

        /**
         * Type/category of the alert (e.g. IAM_POLICY_GAP, TAG_INCONSISTENCY).
         * @param alertType the value to set
         * @return this builder
         **/
        public Builder alertType(String alertType) {
            this.alertType = alertType;
            this.__explicitlySet__.add("alertType");
            return this;
        }
        /**
         * Severity of the alert.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("severity")
        private Severity severity;

        /**
         * Severity of the alert.
         * @param severity the value to set
         * @return this builder
         **/
        public Builder severity(Severity severity) {
            this.severity = severity;
            this.__explicitlySet__.add("severity");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the multicloud subscription.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
        private String subscriptionId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the multicloud subscription.
         * @param subscriptionId the value to set
         * @return this builder
         **/
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            this.__explicitlySet__.add("subscriptionId");
            return this;
        }
        /**
         * Oracle Cloud Infrastructure Subscription Type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionType")
        private SubscriptionType subscriptionType;

        /**
         * Oracle Cloud Infrastructure Subscription Type.
         * @param subscriptionType the value to set
         * @return this builder
         **/
        public Builder subscriptionType(SubscriptionType subscriptionType) {
            this.subscriptionType = subscriptionType;
            this.__explicitlySet__.add("subscriptionType");
            return this;
        }
        /**
         * Current acknowledgment status of the alert.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("alertStatus")
        private AlertStatus alertStatus;

        /**
         * Current acknowledgment status of the alert.
         * @param alertStatus the value to set
         * @return this builder
         **/
        public Builder alertStatus(AlertStatus alertStatus) {
            this.alertStatus = alertStatus;
            this.__explicitlySet__.add("alertStatus");
            return this;
        }
        /**
         * Timestamp when the alert was created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Timestamp when the alert was created.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * Timestamp when the alert was last updated.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * Timestamp when the alert was last updated.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the affected resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the affected resource.
         * @param resourceId the value to set
         * @return this builder
         **/
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /**
         * Type of the affected resource (e.g. ADBD).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private String resourceType;

        /**
         * Type of the affected resource (e.g. ADBD).
         * @param resourceType the value to set
         * @return this builder
         **/
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /**
         * Root Compartment The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) (TenantId) associated with the alert.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Root Compartment The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) (TenantId) associated with the alert.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Internal service or function type generating the alert (e.g. ORP, ODBG_NETWORK, BILLING, OBSERVABILITY).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("functionType")
        private String functionType;

        /**
         * Internal service or function type generating the alert (e.g. ORP, ODBG_NETWORK, BILLING, OBSERVABILITY).
         * @param functionType the value to set
         * @return this builder
         **/
        public Builder functionType(String functionType) {
            this.functionType = functionType;
            this.__explicitlySet__.add("functionType");
            return this;
        }
        /**
         * Source subsystem that generated the alert. (Azure Tag Validation)
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("source")
        private String source;

        /**
         * Source subsystem that generated the alert. (Azure Tag Validation)
         * @param source the value to set
         * @return this builder
         **/
        public Builder source(String source) {
            this.source = source;
            this.__explicitlySet__.add("source");
            return this;
        }
        /**
         * External or human-friendly alert identifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("alertId")
        private String alertId;

        /**
         * External or human-friendly alert identifier.
         * @param alertId the value to set
         * @return this builder
         **/
        public Builder alertId(String alertId) {
            this.alertId = alertId;
            this.__explicitlySet__.add("alertId");
            return this;
        }
        /**
         * The current state of the Multicloud Network Alert.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the Multicloud Network Alert.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * <p>
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * <p>
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /**
         * OCI region where the alert originated (e.g. us-phoenix-1)
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceRegion")
        private String sourceRegion;

        /**
         * OCI region where the alert originated (e.g. us-phoenix-1)
         * @param sourceRegion the value to set
         * @return this builder
         **/
        public Builder sourceRegion(String sourceRegion) {
            this.sourceRegion = sourceRegion;
            this.__explicitlySet__.add("sourceRegion");
            return this;
        }
        /**
         * Alert-specific contextual parameters.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("additionalParameters")
        private java.util.Map<String, String> additionalParameters;

        /**
         * Alert-specific contextual parameters.
         * @param additionalParameters the value to set
         * @return this builder
         **/
        public Builder additionalParameters(java.util.Map<String, String> additionalParameters) {
            this.additionalParameters = additionalParameters;
            this.__explicitlySet__.add("additionalParameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MulticloudAlert build() {
            MulticloudAlert model =
                    new MulticloudAlert(
                            this.id,
                            this.displayName,
                            this.description,
                            this.alertType,
                            this.severity,
                            this.subscriptionId,
                            this.subscriptionType,
                            this.alertStatus,
                            this.timeCreated,
                            this.timeUpdated,
                            this.resourceId,
                            this.resourceType,
                            this.compartmentId,
                            this.functionType,
                            this.source,
                            this.alertId,
                            this.lifecycleState,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.sourceRegion,
                            this.additionalParameters);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MulticloudAlert model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("alertType")) {
                this.alertType(model.getAlertType());
            }
            if (model.wasPropertyExplicitlySet("severity")) {
                this.severity(model.getSeverity());
            }
            if (model.wasPropertyExplicitlySet("subscriptionId")) {
                this.subscriptionId(model.getSubscriptionId());
            }
            if (model.wasPropertyExplicitlySet("subscriptionType")) {
                this.subscriptionType(model.getSubscriptionType());
            }
            if (model.wasPropertyExplicitlySet("alertStatus")) {
                this.alertStatus(model.getAlertStatus());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
            }
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("functionType")) {
                this.functionType(model.getFunctionType());
            }
            if (model.wasPropertyExplicitlySet("source")) {
                this.source(model.getSource());
            }
            if (model.wasPropertyExplicitlySet("alertId")) {
                this.alertId(model.getAlertId());
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
            if (model.wasPropertyExplicitlySet("sourceRegion")) {
                this.sourceRegion(model.getSourceRegion());
            }
            if (model.wasPropertyExplicitlySet("additionalParameters")) {
                this.additionalParameters(model.getAdditionalParameters());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the multicloud alert.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the multicloud alert.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Human-readable name of the alert.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Human-readable name of the alert.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Description of the alert and its purpose.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the alert and its purpose.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Type/category of the alert (e.g. IAM_POLICY_GAP, TAG_INCONSISTENCY).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("alertType")
    private final String alertType;

    /**
     * Type/category of the alert (e.g. IAM_POLICY_GAP, TAG_INCONSISTENCY).
     * @return the value
     **/
    public String getAlertType() {
        return alertType;
    }

    /**
     * Severity of the alert.
     **/
    public enum Severity {
        Low("LOW"),
        Medium("MEDIUM"),
        High("HIGH"),
        Critical("CRITICAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Severity.class);

        private final String value;
        private static java.util.Map<String, Severity> map;

        static {
            map = new java.util.HashMap<>();
            for (Severity v : Severity.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Severity(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Severity create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Severity', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Severity of the alert.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    private final Severity severity;

    /**
     * Severity of the alert.
     * @return the value
     **/
    public Severity getSeverity() {
        return severity;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the multicloud subscription.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
    private final String subscriptionId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the multicloud subscription.
     * @return the value
     **/
    public String getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Oracle Cloud Infrastructure Subscription Type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionType")
    private final SubscriptionType subscriptionType;

    /**
     * Oracle Cloud Infrastructure Subscription Type.
     * @return the value
     **/
    public SubscriptionType getSubscriptionType() {
        return subscriptionType;
    }

    /**
     * Current acknowledgment status of the alert.
     **/
    public enum AlertStatus {
        Unacknowledged("UNACKNOWLEDGED"),
        Acknowledged("ACKNOWLEDGED"),
        Resolved("RESOLVED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AlertStatus.class);

        private final String value;
        private static java.util.Map<String, AlertStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (AlertStatus v : AlertStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AlertStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AlertStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AlertStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Current acknowledgment status of the alert.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("alertStatus")
    private final AlertStatus alertStatus;

    /**
     * Current acknowledgment status of the alert.
     * @return the value
     **/
    public AlertStatus getAlertStatus() {
        return alertStatus;
    }

    /**
     * Timestamp when the alert was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Timestamp when the alert was created.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Timestamp when the alert was last updated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * Timestamp when the alert was last updated.
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the affected resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the affected resource.
     * @return the value
     **/
    public String getResourceId() {
        return resourceId;
    }

    /**
     * Type of the affected resource (e.g. ADBD).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final String resourceType;

    /**
     * Type of the affected resource (e.g. ADBD).
     * @return the value
     **/
    public String getResourceType() {
        return resourceType;
    }

    /**
     * Root Compartment The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) (TenantId) associated with the alert.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Root Compartment The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) (TenantId) associated with the alert.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Internal service or function type generating the alert (e.g. ORP, ODBG_NETWORK, BILLING, OBSERVABILITY).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("functionType")
    private final String functionType;

    /**
     * Internal service or function type generating the alert (e.g. ORP, ODBG_NETWORK, BILLING, OBSERVABILITY).
     * @return the value
     **/
    public String getFunctionType() {
        return functionType;
    }

    /**
     * Source subsystem that generated the alert. (Azure Tag Validation)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    private final String source;

    /**
     * Source subsystem that generated the alert. (Azure Tag Validation)
     * @return the value
     **/
    public String getSource() {
        return source;
    }

    /**
     * External or human-friendly alert identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("alertId")
    private final String alertId;

    /**
     * External or human-friendly alert identifier.
     * @return the value
     **/
    public String getAlertId() {
        return alertId;
    }

    /**
     * The current state of the Multicloud Network Alert.
     **/
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
     * The current state of the Multicloud Network Alert.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the Multicloud Network Alert.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * <p>
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * <p>
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /**
     * OCI region where the alert originated (e.g. us-phoenix-1)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceRegion")
    private final String sourceRegion;

    /**
     * OCI region where the alert originated (e.g. us-phoenix-1)
     * @return the value
     **/
    public String getSourceRegion() {
        return sourceRegion;
    }

    /**
     * Alert-specific contextual parameters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("additionalParameters")
    private final java.util.Map<String, String> additionalParameters;

    /**
     * Alert-specific contextual parameters.
     * @return the value
     **/
    public java.util.Map<String, String> getAdditionalParameters() {
        return additionalParameters;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("MulticloudAlert(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", alertType=").append(String.valueOf(this.alertType));
        sb.append(", severity=").append(String.valueOf(this.severity));
        sb.append(", subscriptionId=").append(String.valueOf(this.subscriptionId));
        sb.append(", subscriptionType=").append(String.valueOf(this.subscriptionType));
        sb.append(", alertStatus=").append(String.valueOf(this.alertStatus));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", functionType=").append(String.valueOf(this.functionType));
        sb.append(", source=").append(String.valueOf(this.source));
        sb.append(", alertId=").append(String.valueOf(this.alertId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", sourceRegion=").append(String.valueOf(this.sourceRegion));
        sb.append(", additionalParameters=").append(String.valueOf(this.additionalParameters));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MulticloudAlert)) {
            return false;
        }

        MulticloudAlert other = (MulticloudAlert) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.alertType, other.alertType)
                && java.util.Objects.equals(this.severity, other.severity)
                && java.util.Objects.equals(this.subscriptionId, other.subscriptionId)
                && java.util.Objects.equals(this.subscriptionType, other.subscriptionType)
                && java.util.Objects.equals(this.alertStatus, other.alertStatus)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.functionType, other.functionType)
                && java.util.Objects.equals(this.source, other.source)
                && java.util.Objects.equals(this.alertId, other.alertId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.sourceRegion, other.sourceRegion)
                && java.util.Objects.equals(this.additionalParameters, other.additionalParameters)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.alertType == null ? 43 : this.alertType.hashCode());
        result = (result * PRIME) + (this.severity == null ? 43 : this.severity.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionId == null ? 43 : this.subscriptionId.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionType == null ? 43 : this.subscriptionType.hashCode());
        result = (result * PRIME) + (this.alertStatus == null ? 43 : this.alertStatus.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.functionType == null ? 43 : this.functionType.hashCode());
        result = (result * PRIME) + (this.source == null ? 43 : this.source.hashCode());
        result = (result * PRIME) + (this.alertId == null ? 43 : this.alertId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + (this.sourceRegion == null ? 43 : this.sourceRegion.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalParameters == null
                                ? 43
                                : this.additionalParameters.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
