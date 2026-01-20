/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * Summary of the Digital Assistant instance. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OdaInstanceSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OdaInstanceSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "description",
        "compartmentId",
        "shapeName",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleSubState",
        "stateMessage",
        "freeformTags",
        "definedTags",
        "isRoleBasedAccess",
        "identityDomain",
        "importedPackageNames",
        "attachmentTypes"
    })
    public OdaInstanceSummary(
            String id,
            String displayName,
            String description,
            String compartmentId,
            ShapeName shapeName,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            LifecycleSubState lifecycleSubState,
            String stateMessage,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            Boolean isRoleBasedAccess,
            String identityDomain,
            java.util.List<String> importedPackageNames,
            java.util.List<String> attachmentTypes) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.description = description;
        this.compartmentId = compartmentId;
        this.shapeName = shapeName;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleSubState = lifecycleSubState;
        this.stateMessage = stateMessage;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.isRoleBasedAccess = isRoleBasedAccess;
        this.identityDomain = identityDomain;
        this.importedPackageNames = importedPackageNames;
        this.attachmentTypes = attachmentTypes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique identifier of the Digital Assistant instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique identifier of the Digital Assistant instance.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** User-defined name for the Digital Assistant instance. You can change this value. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * User-defined name for the Digital Assistant instance. You can change this value.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Description of the Digital Assistant instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the Digital Assistant instance.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Identifier of the compartment that the instance belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Identifier of the compartment that the instance belongs to.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Shape or size of the instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
        private ShapeName shapeName;

        /**
         * Shape or size of the instance.
         *
         * @param shapeName the value to set
         * @return this builder
         */
        public Builder shapeName(ShapeName shapeName) {
            this.shapeName = shapeName;
            this.__explicitlySet__.add("shapeName");
            return this;
        }
        /**
         * When the Digital Assistant instance was created. A date-time string as described in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * When the Digital Assistant instance was created. A date-time string as described in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
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
         * When the Digital Assistant instance was last updated. A date-time string as described in
         * [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * When the Digital Assistant instance was last updated. A date-time string as described in
         * [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The current state of the instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the instance.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** The current sub-state of the Digital Assistant instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleSubState")
        private LifecycleSubState lifecycleSubState;

        /**
         * The current sub-state of the Digital Assistant instance.
         *
         * @param lifecycleSubState the value to set
         * @return this builder
         */
        public Builder lifecycleSubState(LifecycleSubState lifecycleSubState) {
            this.lifecycleSubState = lifecycleSubState;
            this.__explicitlySet__.add("lifecycleSubState");
            return this;
        }
        /**
         * A message describing the current state in more detail. For example, actionable
         * information about an instance that's in the {@code FAILED} state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("stateMessage")
        private String stateMessage;

        /**
         * A message describing the current state in more detail. For example, actionable
         * information about an instance that's in the {@code FAILED} state.
         *
         * @param stateMessage the value to set
         * @return this builder
         */
        public Builder stateMessage(String stateMessage) {
            this.stateMessage = stateMessage;
            this.__explicitlySet__.add("stateMessage");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type, or scope.
         * Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type, or scope.
         * Example: {@code {"bar-key": "value"}}
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
         * Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example:
         * {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example:
         * {@code {"foo-namespace": {"bar-key": "value"}}}
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
         * Should this Digital Assistant instance use role-based authorization via an identity
         * domain (true) or use the default policy-based authorization via IAM policies (false)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isRoleBasedAccess")
        private Boolean isRoleBasedAccess;

        /**
         * Should this Digital Assistant instance use role-based authorization via an identity
         * domain (true) or use the default policy-based authorization via IAM policies (false)
         *
         * @param isRoleBasedAccess the value to set
         * @return this builder
         */
        public Builder isRoleBasedAccess(Boolean isRoleBasedAccess) {
            this.isRoleBasedAccess = isRoleBasedAccess;
            this.__explicitlySet__.add("isRoleBasedAccess");
            return this;
        }
        /**
         * If isRoleBasedAccess is set to true, this property specifies the identity domain that is
         * to be used to implement this type of authorzation. Digital Assistant will create an
         * Identity Application instance and Application Roles within this identity domain. The
         * caller may then perform and user roll mappings they like to grant access to users within
         * the identity domain.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("identityDomain")
        private String identityDomain;

        /**
         * If isRoleBasedAccess is set to true, this property specifies the identity domain that is
         * to be used to implement this type of authorzation. Digital Assistant will create an
         * Identity Application instance and Application Roles within this identity domain. The
         * caller may then perform and user roll mappings they like to grant access to users within
         * the identity domain.
         *
         * @param identityDomain the value to set
         * @return this builder
         */
        public Builder identityDomain(String identityDomain) {
            this.identityDomain = identityDomain;
            this.__explicitlySet__.add("identityDomain");
            return this;
        }
        /** A list of package names imported into this instance (if any). */
        @com.fasterxml.jackson.annotation.JsonProperty("importedPackageNames")
        private java.util.List<String> importedPackageNames;

        /**
         * A list of package names imported into this instance (if any).
         *
         * @param importedPackageNames the value to set
         * @return this builder
         */
        public Builder importedPackageNames(java.util.List<String> importedPackageNames) {
            this.importedPackageNames = importedPackageNames;
            this.__explicitlySet__.add("importedPackageNames");
            return this;
        }
        /** A list of attachment types for this instance (if any). */
        @com.fasterxml.jackson.annotation.JsonProperty("attachmentTypes")
        private java.util.List<String> attachmentTypes;

        /**
         * A list of attachment types for this instance (if any).
         *
         * @param attachmentTypes the value to set
         * @return this builder
         */
        public Builder attachmentTypes(java.util.List<String> attachmentTypes) {
            this.attachmentTypes = attachmentTypes;
            this.__explicitlySet__.add("attachmentTypes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OdaInstanceSummary build() {
            OdaInstanceSummary model =
                    new OdaInstanceSummary(
                            this.id,
                            this.displayName,
                            this.description,
                            this.compartmentId,
                            this.shapeName,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleSubState,
                            this.stateMessage,
                            this.freeformTags,
                            this.definedTags,
                            this.isRoleBasedAccess,
                            this.identityDomain,
                            this.importedPackageNames,
                            this.attachmentTypes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OdaInstanceSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("shapeName")) {
                this.shapeName(model.getShapeName());
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
            if (model.wasPropertyExplicitlySet("lifecycleSubState")) {
                this.lifecycleSubState(model.getLifecycleSubState());
            }
            if (model.wasPropertyExplicitlySet("stateMessage")) {
                this.stateMessage(model.getStateMessage());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("isRoleBasedAccess")) {
                this.isRoleBasedAccess(model.getIsRoleBasedAccess());
            }
            if (model.wasPropertyExplicitlySet("identityDomain")) {
                this.identityDomain(model.getIdentityDomain());
            }
            if (model.wasPropertyExplicitlySet("importedPackageNames")) {
                this.importedPackageNames(model.getImportedPackageNames());
            }
            if (model.wasPropertyExplicitlySet("attachmentTypes")) {
                this.attachmentTypes(model.getAttachmentTypes());
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

    /** Unique identifier of the Digital Assistant instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique identifier of the Digital Assistant instance.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** User-defined name for the Digital Assistant instance. You can change this value. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * User-defined name for the Digital Assistant instance. You can change this value.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Description of the Digital Assistant instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the Digital Assistant instance.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Identifier of the compartment that the instance belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Identifier of the compartment that the instance belongs to.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Shape or size of the instance. */
    public enum ShapeName implements com.oracle.bmc.http.internal.BmcEnum {
        Development("DEVELOPMENT"),
        Production("PRODUCTION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ShapeName.class);

        private final String value;
        private static java.util.Map<String, ShapeName> map;

        static {
            map = new java.util.HashMap<>();
            for (ShapeName v : ShapeName.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ShapeName(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ShapeName create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ShapeName', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Shape or size of the instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
    private final ShapeName shapeName;

    /**
     * Shape or size of the instance.
     *
     * @return the value
     */
    public ShapeName getShapeName() {
        return shapeName;
    }

    /**
     * When the Digital Assistant instance was created. A date-time string as described in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * When the Digital Assistant instance was created. A date-time string as described in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * When the Digital Assistant instance was last updated. A date-time string as described in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * When the Digital Assistant instance was last updated. A date-time string as described in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The current state of the instance. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Updating("UPDATING"),
        Active("ACTIVE"),
        Inactive("INACTIVE"),
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
    /** The current state of the instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the instance.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** The current sub-state of the Digital Assistant instance. */
    public enum LifecycleSubState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Starting("STARTING"),
        Stopping("STOPPING"),
        ChangingCompartment("CHANGING_COMPARTMENT"),
        ActivatingCustomerEncryptionKey("ACTIVATING_CUSTOMER_ENCRYPTION_KEY"),
        UpdatingCustomerEncryptionKey("UPDATING_CUSTOMER_ENCRYPTION_KEY"),
        DeactivatingCustomerEncryptionKey("DEACTIVATING_CUSTOMER_ENCRYPTION_KEY"),
        Deleting("DELETING"),
        DeletePending("DELETE_PENDING"),
        Recovering("RECOVERING"),
        Updating("UPDATING"),
        Purging("PURGING"),
        Queued("QUEUED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleSubState.class);

        private final String value;
        private static java.util.Map<String, LifecycleSubState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleSubState v : LifecycleSubState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleSubState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleSubState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleSubState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current sub-state of the Digital Assistant instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleSubState")
    private final LifecycleSubState lifecycleSubState;

    /**
     * The current sub-state of the Digital Assistant instance.
     *
     * @return the value
     */
    public LifecycleSubState getLifecycleSubState() {
        return lifecycleSubState;
    }

    /**
     * A message describing the current state in more detail. For example, actionable information
     * about an instance that's in the {@code FAILED} state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("stateMessage")
    private final String stateMessage;

    /**
     * A message describing the current state in more detail. For example, actionable information
     * about an instance that's in the {@code FAILED} state.
     *
     * @return the value
     */
    public String getStateMessage() {
        return stateMessage;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope. Example:
     * {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope. Example:
     * {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Should this Digital Assistant instance use role-based authorization via an identity domain
     * (true) or use the default policy-based authorization via IAM policies (false)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isRoleBasedAccess")
    private final Boolean isRoleBasedAccess;

    /**
     * Should this Digital Assistant instance use role-based authorization via an identity domain
     * (true) or use the default policy-based authorization via IAM policies (false)
     *
     * @return the value
     */
    public Boolean getIsRoleBasedAccess() {
        return isRoleBasedAccess;
    }

    /**
     * If isRoleBasedAccess is set to true, this property specifies the identity domain that is to
     * be used to implement this type of authorzation. Digital Assistant will create an Identity
     * Application instance and Application Roles within this identity domain. The caller may then
     * perform and user roll mappings they like to grant access to users within the identity domain.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identityDomain")
    private final String identityDomain;

    /**
     * If isRoleBasedAccess is set to true, this property specifies the identity domain that is to
     * be used to implement this type of authorzation. Digital Assistant will create an Identity
     * Application instance and Application Roles within this identity domain. The caller may then
     * perform and user roll mappings they like to grant access to users within the identity domain.
     *
     * @return the value
     */
    public String getIdentityDomain() {
        return identityDomain;
    }

    /** A list of package names imported into this instance (if any). */
    @com.fasterxml.jackson.annotation.JsonProperty("importedPackageNames")
    private final java.util.List<String> importedPackageNames;

    /**
     * A list of package names imported into this instance (if any).
     *
     * @return the value
     */
    public java.util.List<String> getImportedPackageNames() {
        return importedPackageNames;
    }

    /** A list of attachment types for this instance (if any). */
    @com.fasterxml.jackson.annotation.JsonProperty("attachmentTypes")
    private final java.util.List<String> attachmentTypes;

    /**
     * A list of attachment types for this instance (if any).
     *
     * @return the value
     */
    public java.util.List<String> getAttachmentTypes() {
        return attachmentTypes;
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
        sb.append("OdaInstanceSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", shapeName=").append(String.valueOf(this.shapeName));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleSubState=").append(String.valueOf(this.lifecycleSubState));
        sb.append(", stateMessage=").append(String.valueOf(this.stateMessage));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", isRoleBasedAccess=").append(String.valueOf(this.isRoleBasedAccess));
        sb.append(", identityDomain=").append(String.valueOf(this.identityDomain));
        sb.append(", importedPackageNames=").append(String.valueOf(this.importedPackageNames));
        sb.append(", attachmentTypes=").append(String.valueOf(this.attachmentTypes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OdaInstanceSummary)) {
            return false;
        }

        OdaInstanceSummary other = (OdaInstanceSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.shapeName, other.shapeName)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleSubState, other.lifecycleSubState)
                && java.util.Objects.equals(this.stateMessage, other.stateMessage)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.isRoleBasedAccess, other.isRoleBasedAccess)
                && java.util.Objects.equals(this.identityDomain, other.identityDomain)
                && java.util.Objects.equals(this.importedPackageNames, other.importedPackageNames)
                && java.util.Objects.equals(this.attachmentTypes, other.attachmentTypes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.shapeName == null ? 43 : this.shapeName.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleSubState == null ? 43 : this.lifecycleSubState.hashCode());
        result = (result * PRIME) + (this.stateMessage == null ? 43 : this.stateMessage.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.isRoleBasedAccess == null ? 43 : this.isRoleBasedAccess.hashCode());
        result =
                (result * PRIME)
                        + (this.identityDomain == null ? 43 : this.identityDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.importedPackageNames == null
                                ? 43
                                : this.importedPackageNames.hashCode());
        result =
                (result * PRIME)
                        + (this.attachmentTypes == null ? 43 : this.attachmentTypes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
