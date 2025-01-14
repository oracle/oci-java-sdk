/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vault.model;

/**
 * The details of the secret. Secret details do not contain the contents of the secret itself. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180608")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Secret.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Secret extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "currentVersionNumber",
        "definedTags",
        "description",
        "freeformTags",
        "id",
        "keyId",
        "lifecycleDetails",
        "lifecycleState",
        "metadata",
        "rotationConfig",
        "rotationStatus",
        "lastRotationTime",
        "nextRotationTime",
        "secretName",
        "secretRules",
        "timeCreated",
        "timeOfCurrentVersionExpiry",
        "timeOfDeletion",
        "vaultId",
        "secretGenerationContext",
        "isAutoGenerationEnabled"
    })
    public Secret(
            String compartmentId,
            Long currentVersionNumber,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String description,
            java.util.Map<String, String> freeformTags,
            String id,
            String keyId,
            String lifecycleDetails,
            LifecycleState lifecycleState,
            java.util.Map<String, Object> metadata,
            RotationConfig rotationConfig,
            RotationStatus rotationStatus,
            java.util.Date lastRotationTime,
            java.util.Date nextRotationTime,
            String secretName,
            java.util.List<SecretRule> secretRules,
            java.util.Date timeCreated,
            java.util.Date timeOfCurrentVersionExpiry,
            java.util.Date timeOfDeletion,
            String vaultId,
            SecretGenerationContext secretGenerationContext,
            Boolean isAutoGenerationEnabled) {
        super();
        this.compartmentId = compartmentId;
        this.currentVersionNumber = currentVersionNumber;
        this.definedTags = definedTags;
        this.description = description;
        this.freeformTags = freeformTags;
        this.id = id;
        this.keyId = keyId;
        this.lifecycleDetails = lifecycleDetails;
        this.lifecycleState = lifecycleState;
        this.metadata = metadata;
        this.rotationConfig = rotationConfig;
        this.rotationStatus = rotationStatus;
        this.lastRotationTime = lastRotationTime;
        this.nextRotationTime = nextRotationTime;
        this.secretName = secretName;
        this.secretRules = secretRules;
        this.timeCreated = timeCreated;
        this.timeOfCurrentVersionExpiry = timeOfCurrentVersionExpiry;
        this.timeOfDeletion = timeOfDeletion;
        this.vaultId = vaultId;
        this.secretGenerationContext = secretGenerationContext;
        this.isAutoGenerationEnabled = isAutoGenerationEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the compartment where you want to create the secret. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment where you want to create the secret.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The version number of the secret version that's currently in use. */
        @com.fasterxml.jackson.annotation.JsonProperty("currentVersionNumber")
        private Long currentVersionNumber;

        /**
         * The version number of the secret version that's currently in use.
         *
         * @param currentVersionNumber the value to set
         * @return this builder
         */
        public Builder currentVersionNumber(Long currentVersionNumber) {
            this.currentVersionNumber = currentVersionNumber;
            this.__explicitlySet__.add("currentVersionNumber");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
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
        /** A brief description of the secret. Avoid entering confidential information. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A brief description of the secret. Avoid entering confidential information.
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
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /** The OCID of the secret. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the secret.
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
         * The OCID of the master encryption key that is used to encrypt the secret. You must
         * specify a symmetric key to encrypt the secret during import to the vault. You cannot
         * encrypt secrets with asymmetric keys. Furthermore, the key must exist in the vault that
         * you specify.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("keyId")
        private String keyId;

        /**
         * The OCID of the master encryption key that is used to encrypt the secret. You must
         * specify a symmetric key to encrypt the secret during import to the vault. You cannot
         * encrypt secrets with asymmetric keys. Furthermore, the key must exist in the vault that
         * you specify.
         *
         * @param keyId the value to set
         * @return this builder
         */
        public Builder keyId(String keyId) {
            this.keyId = keyId;
            this.__explicitlySet__.add("keyId");
            return this;
        }
        /** Additional information about the current lifecycle state of the secret. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Additional information about the current lifecycle state of the secret.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** The current lifecycle state of the secret. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current lifecycle state of the secret.
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
         * Additional metadata that you can use to provide context about how to use the secret or
         * during rotation or other administrative tasks. For example, for a secret that you use to
         * connect to a database, the additional metadata might specify the connection endpoint and
         * the connection string. Provide additional metadata as key-value pairs.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private java.util.Map<String, Object> metadata;

        /**
         * Additional metadata that you can use to provide context about how to use the secret or
         * during rotation or other administrative tasks. For example, for a secret that you use to
         * connect to a database, the additional metadata might specify the connection endpoint and
         * the connection string. Provide additional metadata as key-value pairs.
         *
         * @param metadata the value to set
         * @return this builder
         */
        public Builder metadata(java.util.Map<String, Object> metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rotationConfig")
        private RotationConfig rotationConfig;

        public Builder rotationConfig(RotationConfig rotationConfig) {
            this.rotationConfig = rotationConfig;
            this.__explicitlySet__.add("rotationConfig");
            return this;
        }
        /** Additional information about the status of the secret rotation */
        @com.fasterxml.jackson.annotation.JsonProperty("rotationStatus")
        private RotationStatus rotationStatus;

        /**
         * Additional information about the status of the secret rotation
         *
         * @param rotationStatus the value to set
         * @return this builder
         */
        public Builder rotationStatus(RotationStatus rotationStatus) {
            this.rotationStatus = rotationStatus;
            this.__explicitlySet__.add("rotationStatus");
            return this;
        }
        /**
         * A property indicating when the secret was last rotated successfully, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2019-04-03T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lastRotationTime")
        private java.util.Date lastRotationTime;

        /**
         * A property indicating when the secret was last rotated successfully, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2019-04-03T21:10:29.600Z}
         *
         * @param lastRotationTime the value to set
         * @return this builder
         */
        public Builder lastRotationTime(java.util.Date lastRotationTime) {
            this.lastRotationTime = lastRotationTime;
            this.__explicitlySet__.add("lastRotationTime");
            return this;
        }
        /**
         * A property indicating when the secret is scheduled to be rotated, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2019-04-03T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nextRotationTime")
        private java.util.Date nextRotationTime;

        /**
         * A property indicating when the secret is scheduled to be rotated, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2019-04-03T21:10:29.600Z}
         *
         * @param nextRotationTime the value to set
         * @return this builder
         */
        public Builder nextRotationTime(java.util.Date nextRotationTime) {
            this.nextRotationTime = nextRotationTime;
            this.__explicitlySet__.add("nextRotationTime");
            return this;
        }
        /** The user-friendly name of the secret. Avoid entering confidential information. */
        @com.fasterxml.jackson.annotation.JsonProperty("secretName")
        private String secretName;

        /**
         * The user-friendly name of the secret. Avoid entering confidential information.
         *
         * @param secretName the value to set
         * @return this builder
         */
        public Builder secretName(String secretName) {
            this.secretName = secretName;
            this.__explicitlySet__.add("secretName");
            return this;
        }
        /** A list of rules that control how the secret is used and managed. */
        @com.fasterxml.jackson.annotation.JsonProperty("secretRules")
        private java.util.List<SecretRule> secretRules;

        /**
         * A list of rules that control how the secret is used and managed.
         *
         * @param secretRules the value to set
         * @return this builder
         */
        public Builder secretRules(java.util.List<SecretRule> secretRules) {
            this.secretRules = secretRules;
            this.__explicitlySet__.add("secretRules");
            return this;
        }
        /**
         * A property indicating when the secret was created, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2019-04-03T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * A property indicating when the secret was created, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2019-04-03T21:10:29.600Z}
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
         * An optional property indicating when the current secret version will expire, expressed in
         * [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2019-04-03T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfCurrentVersionExpiry")
        private java.util.Date timeOfCurrentVersionExpiry;

        /**
         * An optional property indicating when the current secret version will expire, expressed in
         * [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2019-04-03T21:10:29.600Z}
         *
         * @param timeOfCurrentVersionExpiry the value to set
         * @return this builder
         */
        public Builder timeOfCurrentVersionExpiry(java.util.Date timeOfCurrentVersionExpiry) {
            this.timeOfCurrentVersionExpiry = timeOfCurrentVersionExpiry;
            this.__explicitlySet__.add("timeOfCurrentVersionExpiry");
            return this;
        }
        /**
         * An optional property indicating when to delete the secret, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2019-04-03T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfDeletion")
        private java.util.Date timeOfDeletion;

        /**
         * An optional property indicating when to delete the secret, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2019-04-03T21:10:29.600Z}
         *
         * @param timeOfDeletion the value to set
         * @return this builder
         */
        public Builder timeOfDeletion(java.util.Date timeOfDeletion) {
            this.timeOfDeletion = timeOfDeletion;
            this.__explicitlySet__.add("timeOfDeletion");
            return this;
        }
        /** The OCID of the vault where the secret exists. */
        @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
        private String vaultId;

        /**
         * The OCID of the vault where the secret exists.
         *
         * @param vaultId the value to set
         * @return this builder
         */
        public Builder vaultId(String vaultId) {
            this.vaultId = vaultId;
            this.__explicitlySet__.add("vaultId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("secretGenerationContext")
        private SecretGenerationContext secretGenerationContext;

        public Builder secretGenerationContext(SecretGenerationContext secretGenerationContext) {
            this.secretGenerationContext = secretGenerationContext;
            this.__explicitlySet__.add("secretGenerationContext");
            return this;
        }
        /**
         * The value of this flag determines whether or not secret content will be generated
         * automatically.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoGenerationEnabled")
        private Boolean isAutoGenerationEnabled;

        /**
         * The value of this flag determines whether or not secret content will be generated
         * automatically.
         *
         * @param isAutoGenerationEnabled the value to set
         * @return this builder
         */
        public Builder isAutoGenerationEnabled(Boolean isAutoGenerationEnabled) {
            this.isAutoGenerationEnabled = isAutoGenerationEnabled;
            this.__explicitlySet__.add("isAutoGenerationEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Secret build() {
            Secret model =
                    new Secret(
                            this.compartmentId,
                            this.currentVersionNumber,
                            this.definedTags,
                            this.description,
                            this.freeformTags,
                            this.id,
                            this.keyId,
                            this.lifecycleDetails,
                            this.lifecycleState,
                            this.metadata,
                            this.rotationConfig,
                            this.rotationStatus,
                            this.lastRotationTime,
                            this.nextRotationTime,
                            this.secretName,
                            this.secretRules,
                            this.timeCreated,
                            this.timeOfCurrentVersionExpiry,
                            this.timeOfDeletion,
                            this.vaultId,
                            this.secretGenerationContext,
                            this.isAutoGenerationEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Secret model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("currentVersionNumber")) {
                this.currentVersionNumber(model.getCurrentVersionNumber());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("keyId")) {
                this.keyId(model.getKeyId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
            }
            if (model.wasPropertyExplicitlySet("rotationConfig")) {
                this.rotationConfig(model.getRotationConfig());
            }
            if (model.wasPropertyExplicitlySet("rotationStatus")) {
                this.rotationStatus(model.getRotationStatus());
            }
            if (model.wasPropertyExplicitlySet("lastRotationTime")) {
                this.lastRotationTime(model.getLastRotationTime());
            }
            if (model.wasPropertyExplicitlySet("nextRotationTime")) {
                this.nextRotationTime(model.getNextRotationTime());
            }
            if (model.wasPropertyExplicitlySet("secretName")) {
                this.secretName(model.getSecretName());
            }
            if (model.wasPropertyExplicitlySet("secretRules")) {
                this.secretRules(model.getSecretRules());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeOfCurrentVersionExpiry")) {
                this.timeOfCurrentVersionExpiry(model.getTimeOfCurrentVersionExpiry());
            }
            if (model.wasPropertyExplicitlySet("timeOfDeletion")) {
                this.timeOfDeletion(model.getTimeOfDeletion());
            }
            if (model.wasPropertyExplicitlySet("vaultId")) {
                this.vaultId(model.getVaultId());
            }
            if (model.wasPropertyExplicitlySet("secretGenerationContext")) {
                this.secretGenerationContext(model.getSecretGenerationContext());
            }
            if (model.wasPropertyExplicitlySet("isAutoGenerationEnabled")) {
                this.isAutoGenerationEnabled(model.getIsAutoGenerationEnabled());
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

    /** The OCID of the compartment where you want to create the secret. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment where you want to create the secret.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The version number of the secret version that's currently in use. */
    @com.fasterxml.jackson.annotation.JsonProperty("currentVersionNumber")
    private final Long currentVersionNumber;

    /**
     * The version number of the secret version that's currently in use.
     *
     * @return the value
     */
    public Long getCurrentVersionNumber() {
        return currentVersionNumber;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /** A brief description of the secret. Avoid entering confidential information. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A brief description of the secret. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /** The OCID of the secret. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the secret.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The OCID of the master encryption key that is used to encrypt the secret. You must specify a
     * symmetric key to encrypt the secret during import to the vault. You cannot encrypt secrets
     * with asymmetric keys. Furthermore, the key must exist in the vault that you specify.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("keyId")
    private final String keyId;

    /**
     * The OCID of the master encryption key that is used to encrypt the secret. You must specify a
     * symmetric key to encrypt the secret during import to the vault. You cannot encrypt secrets
     * with asymmetric keys. Furthermore, the key must exist in the vault that you specify.
     *
     * @return the value
     */
    public String getKeyId() {
        return keyId;
    }

    /** Additional information about the current lifecycle state of the secret. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Additional information about the current lifecycle state of the secret.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** The current lifecycle state of the secret. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Active("ACTIVE"),
        Updating("UPDATING"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        SchedulingDeletion("SCHEDULING_DELETION"),
        PendingDeletion("PENDING_DELETION"),
        CancellingDeletion("CANCELLING_DELETION"),
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
    /** The current lifecycle state of the secret. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current lifecycle state of the secret.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Additional metadata that you can use to provide context about how to use the secret or during
     * rotation or other administrative tasks. For example, for a secret that you use to connect to
     * a database, the additional metadata might specify the connection endpoint and the connection
     * string. Provide additional metadata as key-value pairs.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final java.util.Map<String, Object> metadata;

    /**
     * Additional metadata that you can use to provide context about how to use the secret or during
     * rotation or other administrative tasks. For example, for a secret that you use to connect to
     * a database, the additional metadata might specify the connection endpoint and the connection
     * string. Provide additional metadata as key-value pairs.
     *
     * @return the value
     */
    public java.util.Map<String, Object> getMetadata() {
        return metadata;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("rotationConfig")
    private final RotationConfig rotationConfig;

    public RotationConfig getRotationConfig() {
        return rotationConfig;
    }

    /** Additional information about the status of the secret rotation */
    public enum RotationStatus implements com.oracle.bmc.http.internal.BmcEnum {
        InProgress("IN_PROGRESS"),
        Scheduled("SCHEDULED"),
        NotEnabled("NOT_ENABLED"),
        Cancelling("CANCELLING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(RotationStatus.class);

        private final String value;
        private static java.util.Map<String, RotationStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (RotationStatus v : RotationStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RotationStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RotationStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RotationStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Additional information about the status of the secret rotation */
    @com.fasterxml.jackson.annotation.JsonProperty("rotationStatus")
    private final RotationStatus rotationStatus;

    /**
     * Additional information about the status of the secret rotation
     *
     * @return the value
     */
    public RotationStatus getRotationStatus() {
        return rotationStatus;
    }

    /**
     * A property indicating when the secret was last rotated successfully, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2019-04-03T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastRotationTime")
    private final java.util.Date lastRotationTime;

    /**
     * A property indicating when the secret was last rotated successfully, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2019-04-03T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getLastRotationTime() {
        return lastRotationTime;
    }

    /**
     * A property indicating when the secret is scheduled to be rotated, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2019-04-03T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nextRotationTime")
    private final java.util.Date nextRotationTime;

    /**
     * A property indicating when the secret is scheduled to be rotated, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2019-04-03T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getNextRotationTime() {
        return nextRotationTime;
    }

    /** The user-friendly name of the secret. Avoid entering confidential information. */
    @com.fasterxml.jackson.annotation.JsonProperty("secretName")
    private final String secretName;

    /**
     * The user-friendly name of the secret. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getSecretName() {
        return secretName;
    }

    /** A list of rules that control how the secret is used and managed. */
    @com.fasterxml.jackson.annotation.JsonProperty("secretRules")
    private final java.util.List<SecretRule> secretRules;

    /**
     * A list of rules that control how the secret is used and managed.
     *
     * @return the value
     */
    public java.util.List<SecretRule> getSecretRules() {
        return secretRules;
    }

    /**
     * A property indicating when the secret was created, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2019-04-03T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * A property indicating when the secret was created, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2019-04-03T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * An optional property indicating when the current secret version will expire, expressed in
     * [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2019-04-03T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfCurrentVersionExpiry")
    private final java.util.Date timeOfCurrentVersionExpiry;

    /**
     * An optional property indicating when the current secret version will expire, expressed in
     * [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2019-04-03T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeOfCurrentVersionExpiry() {
        return timeOfCurrentVersionExpiry;
    }

    /**
     * An optional property indicating when to delete the secret, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2019-04-03T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfDeletion")
    private final java.util.Date timeOfDeletion;

    /**
     * An optional property indicating when to delete the secret, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2019-04-03T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeOfDeletion() {
        return timeOfDeletion;
    }

    /** The OCID of the vault where the secret exists. */
    @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
    private final String vaultId;

    /**
     * The OCID of the vault where the secret exists.
     *
     * @return the value
     */
    public String getVaultId() {
        return vaultId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("secretGenerationContext")
    private final SecretGenerationContext secretGenerationContext;

    public SecretGenerationContext getSecretGenerationContext() {
        return secretGenerationContext;
    }

    /**
     * The value of this flag determines whether or not secret content will be generated
     * automatically.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoGenerationEnabled")
    private final Boolean isAutoGenerationEnabled;

    /**
     * The value of this flag determines whether or not secret content will be generated
     * automatically.
     *
     * @return the value
     */
    public Boolean getIsAutoGenerationEnabled() {
        return isAutoGenerationEnabled;
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
        sb.append("Secret(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", currentVersionNumber=").append(String.valueOf(this.currentVersionNumber));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", keyId=").append(String.valueOf(this.keyId));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(", rotationConfig=").append(String.valueOf(this.rotationConfig));
        sb.append(", rotationStatus=").append(String.valueOf(this.rotationStatus));
        sb.append(", lastRotationTime=").append(String.valueOf(this.lastRotationTime));
        sb.append(", nextRotationTime=").append(String.valueOf(this.nextRotationTime));
        sb.append(", secretName=").append(String.valueOf(this.secretName));
        sb.append(", secretRules=").append(String.valueOf(this.secretRules));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeOfCurrentVersionExpiry=")
                .append(String.valueOf(this.timeOfCurrentVersionExpiry));
        sb.append(", timeOfDeletion=").append(String.valueOf(this.timeOfDeletion));
        sb.append(", vaultId=").append(String.valueOf(this.vaultId));
        sb.append(", secretGenerationContext=")
                .append(String.valueOf(this.secretGenerationContext));
        sb.append(", isAutoGenerationEnabled=")
                .append(String.valueOf(this.isAutoGenerationEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Secret)) {
            return false;
        }

        Secret other = (Secret) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.currentVersionNumber, other.currentVersionNumber)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.keyId, other.keyId)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && java.util.Objects.equals(this.rotationConfig, other.rotationConfig)
                && java.util.Objects.equals(this.rotationStatus, other.rotationStatus)
                && java.util.Objects.equals(this.lastRotationTime, other.lastRotationTime)
                && java.util.Objects.equals(this.nextRotationTime, other.nextRotationTime)
                && java.util.Objects.equals(this.secretName, other.secretName)
                && java.util.Objects.equals(this.secretRules, other.secretRules)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(
                        this.timeOfCurrentVersionExpiry, other.timeOfCurrentVersionExpiry)
                && java.util.Objects.equals(this.timeOfDeletion, other.timeOfDeletion)
                && java.util.Objects.equals(this.vaultId, other.vaultId)
                && java.util.Objects.equals(
                        this.secretGenerationContext, other.secretGenerationContext)
                && java.util.Objects.equals(
                        this.isAutoGenerationEnabled, other.isAutoGenerationEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.currentVersionNumber == null
                                ? 43
                                : this.currentVersionNumber.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.keyId == null ? 43 : this.keyId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result =
                (result * PRIME)
                        + (this.rotationConfig == null ? 43 : this.rotationConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.rotationStatus == null ? 43 : this.rotationStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.lastRotationTime == null ? 43 : this.lastRotationTime.hashCode());
        result =
                (result * PRIME)
                        + (this.nextRotationTime == null ? 43 : this.nextRotationTime.hashCode());
        result = (result * PRIME) + (this.secretName == null ? 43 : this.secretName.hashCode());
        result = (result * PRIME) + (this.secretRules == null ? 43 : this.secretRules.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfCurrentVersionExpiry == null
                                ? 43
                                : this.timeOfCurrentVersionExpiry.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfDeletion == null ? 43 : this.timeOfDeletion.hashCode());
        result = (result * PRIME) + (this.vaultId == null ? 43 : this.vaultId.hashCode());
        result =
                (result * PRIME)
                        + (this.secretGenerationContext == null
                                ? 43
                                : this.secretGenerationContext.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoGenerationEnabled == null
                                ? 43
                                : this.isAutoGenerationEnabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
