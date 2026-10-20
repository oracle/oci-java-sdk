/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.pss.model;

/**
 * A Public Safety and Security instance.
 *
 * <p>To use any of the API operations, you must be authorized in an IAM policy. If you're not
 * authorized, talk to an administrator. If you're an administrator who needs to write policies to
 * give users access, see [Getting Started with
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260831")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Instance.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Instance extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "compartmentId",
        "identityDomainUrl",
        "identityDomainWebAuthClientId",
        "identityDomainWebAuthClientSecretVaultId",
        "adminIdentityDomainUserId",
        "publicIp",
        "serviceEndpoint",
        "uiEndpoint",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public Instance(
            String id,
            String displayName,
            String compartmentId,
            String identityDomainUrl,
            String identityDomainWebAuthClientId,
            String identityDomainWebAuthClientSecretVaultId,
            String adminIdentityDomainUserId,
            String publicIp,
            String serviceEndpoint,
            String uiEndpoint,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.identityDomainUrl = identityDomainUrl;
        this.identityDomainWebAuthClientId = identityDomainWebAuthClientId;
        this.identityDomainWebAuthClientSecretVaultId = identityDomainWebAuthClientSecretVaultId;
        this.adminIdentityDomainUserId = adminIdentityDomainUserId;
        this.publicIp = publicIp;
        this.serviceEndpoint = serviceEndpoint;
        this.uiEndpoint = uiEndpoint;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Instance.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Instance.
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
         * The URL of the identity domain associated with the instance.
         *
         * <p>Example: {@code https://idcs-1234567890.identity.oraclecloud.com}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("identityDomainUrl")
        private String identityDomainUrl;

        /**
         * The URL of the identity domain associated with the instance.
         *
         * <p>Example: {@code https://idcs-1234567890.identity.oraclecloud.com}
         *
         * @param identityDomainUrl the value to set
         * @return this builder
         */
        public Builder identityDomainUrl(String identityDomainUrl) {
            this.identityDomainUrl = identityDomainUrl;
            this.__explicitlySet__.add("identityDomainUrl");
            return this;
        }
        /**
         * The client ID of the identity-domain confidential application used for browser
         * authentication.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("identityDomainWebAuthClientId")
        private String identityDomainWebAuthClientId;

        /**
         * The client ID of the identity-domain confidential application used for browser
         * authentication.
         *
         * @param identityDomainWebAuthClientId the value to set
         * @return this builder
         */
        public Builder identityDomainWebAuthClientId(String identityDomainWebAuthClientId) {
            this.identityDomainWebAuthClientId = identityDomainWebAuthClientId;
            this.__explicitlySet__.add("identityDomainWebAuthClientId");
            return this;
        }
        /**
         * The OCID of the Vault secret containing the identity-domain confidential application's
         * client secret.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("identityDomainWebAuthClientSecretVaultId")
        private String identityDomainWebAuthClientSecretVaultId;

        /**
         * The OCID of the Vault secret containing the identity-domain confidential application's
         * client secret.
         *
         * @param identityDomainWebAuthClientSecretVaultId the value to set
         * @return this builder
         */
        public Builder identityDomainWebAuthClientSecretVaultId(
                String identityDomainWebAuthClientSecretVaultId) {
            this.identityDomainWebAuthClientSecretVaultId =
                    identityDomainWebAuthClientSecretVaultId;
            this.__explicitlySet__.add("identityDomainWebAuthClientSecretVaultId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * identity-domain user that initially administers the PSS instance.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("adminIdentityDomainUserId")
        private String adminIdentityDomainUserId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * identity-domain user that initially administers the PSS instance.
         *
         * @param adminIdentityDomainUserId the value to set
         * @return this builder
         */
        public Builder adminIdentityDomainUserId(String adminIdentityDomainUserId) {
            this.adminIdentityDomainUserId = adminIdentityDomainUserId;
            this.__explicitlySet__.add("adminIdentityDomainUserId");
            return this;
        }
        /** The public IP address for the instance's API gateway. */
        @com.fasterxml.jackson.annotation.JsonProperty("publicIp")
        private String publicIp;

        /**
         * The public IP address for the instance's API gateway.
         *
         * @param publicIp the value to set
         * @return this builder
         */
        public Builder publicIp(String publicIp) {
            this.publicIp = publicIp;
            this.__explicitlySet__.add("publicIp");
            return this;
        }
        /**
         * The HTTPS endpoint for the instance's PSS API.
         *
         * <p>Example: {@code https://example.pss.oraclecloud.com/api/}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceEndpoint")
        private String serviceEndpoint;

        /**
         * The HTTPS endpoint for the instance's PSS API.
         *
         * <p>Example: {@code https://example.pss.oraclecloud.com/api/}
         *
         * @param serviceEndpoint the value to set
         * @return this builder
         */
        public Builder serviceEndpoint(String serviceEndpoint) {
            this.serviceEndpoint = serviceEndpoint;
            this.__explicitlySet__.add("serviceEndpoint");
            return this;
        }
        /**
         * The HTTPS endpoint for the instance's PSS user interface.
         *
         * <p>Example: {@code https://example.pss.oraclecloud.com/ui/}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("uiEndpoint")
        private String uiEndpoint;

        /**
         * The HTTPS endpoint for the instance's PSS user interface.
         *
         * <p>Example: {@code https://example.pss.oraclecloud.com/ui/}
         *
         * @param uiEndpoint the value to set
         * @return this builder
         */
        public Builder uiEndpoint(String uiEndpoint) {
            this.uiEndpoint = uiEndpoint;
            this.__explicitlySet__.add("uiEndpoint");
            return this;
        }
        /**
         * The date and time the Instance was created, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the Instance was created, in the format defined by [RFC
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
         * The date and time the Instance was updated, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the Instance was updated, in the format defined by [RFC
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
        /** The current state of the Instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the Instance.
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
         * A message that describes the current state of the Instance in more detail. For example,
         * can be used to provide actionable information for a resource in the Failed state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message that describes the current state of the Instance in more detail. For example,
         * can be used to provide actionable information for a resource in the Failed state.
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
         * <p>Example: {@code {"orcl-cloud": {"example-key": "example-value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         *
         * <p>Example: {@code {"orcl-cloud": {"example-key": "example-value"}}}
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

        public Instance build() {
            Instance model =
                    new Instance(
                            this.id,
                            this.displayName,
                            this.compartmentId,
                            this.identityDomainUrl,
                            this.identityDomainWebAuthClientId,
                            this.identityDomainWebAuthClientSecretVaultId,
                            this.adminIdentityDomainUserId,
                            this.publicIp,
                            this.serviceEndpoint,
                            this.uiEndpoint,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Instance model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("identityDomainUrl")) {
                this.identityDomainUrl(model.getIdentityDomainUrl());
            }
            if (model.wasPropertyExplicitlySet("identityDomainWebAuthClientId")) {
                this.identityDomainWebAuthClientId(model.getIdentityDomainWebAuthClientId());
            }
            if (model.wasPropertyExplicitlySet("identityDomainWebAuthClientSecretVaultId")) {
                this.identityDomainWebAuthClientSecretVaultId(
                        model.getIdentityDomainWebAuthClientSecretVaultId());
            }
            if (model.wasPropertyExplicitlySet("adminIdentityDomainUserId")) {
                this.adminIdentityDomainUserId(model.getAdminIdentityDomainUserId());
            }
            if (model.wasPropertyExplicitlySet("publicIp")) {
                this.publicIp(model.getPublicIp());
            }
            if (model.wasPropertyExplicitlySet("serviceEndpoint")) {
                this.serviceEndpoint(model.getServiceEndpoint());
            }
            if (model.wasPropertyExplicitlySet("uiEndpoint")) {
                this.uiEndpoint(model.getUiEndpoint());
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
     * Instance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Instance.
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
     * The URL of the identity domain associated with the instance.
     *
     * <p>Example: {@code https://idcs-1234567890.identity.oraclecloud.com}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identityDomainUrl")
    private final String identityDomainUrl;

    /**
     * The URL of the identity domain associated with the instance.
     *
     * <p>Example: {@code https://idcs-1234567890.identity.oraclecloud.com}
     *
     * @return the value
     */
    public String getIdentityDomainUrl() {
        return identityDomainUrl;
    }

    /**
     * The client ID of the identity-domain confidential application used for browser
     * authentication.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identityDomainWebAuthClientId")
    private final String identityDomainWebAuthClientId;

    /**
     * The client ID of the identity-domain confidential application used for browser
     * authentication.
     *
     * @return the value
     */
    public String getIdentityDomainWebAuthClientId() {
        return identityDomainWebAuthClientId;
    }

    /**
     * The OCID of the Vault secret containing the identity-domain confidential application's client
     * secret.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identityDomainWebAuthClientSecretVaultId")
    private final String identityDomainWebAuthClientSecretVaultId;

    /**
     * The OCID of the Vault secret containing the identity-domain confidential application's client
     * secret.
     *
     * @return the value
     */
    public String getIdentityDomainWebAuthClientSecretVaultId() {
        return identityDomainWebAuthClientSecretVaultId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * identity-domain user that initially administers the PSS instance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("adminIdentityDomainUserId")
    private final String adminIdentityDomainUserId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * identity-domain user that initially administers the PSS instance.
     *
     * @return the value
     */
    public String getAdminIdentityDomainUserId() {
        return adminIdentityDomainUserId;
    }

    /** The public IP address for the instance's API gateway. */
    @com.fasterxml.jackson.annotation.JsonProperty("publicIp")
    private final String publicIp;

    /**
     * The public IP address for the instance's API gateway.
     *
     * @return the value
     */
    public String getPublicIp() {
        return publicIp;
    }

    /**
     * The HTTPS endpoint for the instance's PSS API.
     *
     * <p>Example: {@code https://example.pss.oraclecloud.com/api/}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceEndpoint")
    private final String serviceEndpoint;

    /**
     * The HTTPS endpoint for the instance's PSS API.
     *
     * <p>Example: {@code https://example.pss.oraclecloud.com/api/}
     *
     * @return the value
     */
    public String getServiceEndpoint() {
        return serviceEndpoint;
    }

    /**
     * The HTTPS endpoint for the instance's PSS user interface.
     *
     * <p>Example: {@code https://example.pss.oraclecloud.com/ui/}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("uiEndpoint")
    private final String uiEndpoint;

    /**
     * The HTTPS endpoint for the instance's PSS user interface.
     *
     * <p>Example: {@code https://example.pss.oraclecloud.com/ui/}
     *
     * @return the value
     */
    public String getUiEndpoint() {
        return uiEndpoint;
    }

    /**
     * The date and time the Instance was created, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the Instance was created, in the format defined by [RFC
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
     * The date and time the Instance was updated, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the Instance was updated, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The current state of the Instance. */
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
    /** The current state of the Instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the Instance.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message that describes the current state of the Instance in more detail. For example, can
     * be used to provide actionable information for a resource in the Failed state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message that describes the current state of the Instance in more detail. For example, can
     * be used to provide actionable information for a resource in the Failed state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
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
     * <p>Example: {@code {"orcl-cloud": {"example-key": "example-value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     *
     * <p>Example: {@code {"orcl-cloud": {"example-key": "example-value"}}}
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
        sb.append("Instance(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", identityDomainUrl=").append(String.valueOf(this.identityDomainUrl));
        sb.append(", identityDomainWebAuthClientId=")
                .append(String.valueOf(this.identityDomainWebAuthClientId));
        sb.append(", identityDomainWebAuthClientSecretVaultId=")
                .append(String.valueOf(this.identityDomainWebAuthClientSecretVaultId));
        sb.append(", adminIdentityDomainUserId=")
                .append(String.valueOf(this.adminIdentityDomainUserId));
        sb.append(", publicIp=").append(String.valueOf(this.publicIp));
        sb.append(", serviceEndpoint=").append(String.valueOf(this.serviceEndpoint));
        sb.append(", uiEndpoint=").append(String.valueOf(this.uiEndpoint));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
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
        if (!(o instanceof Instance)) {
            return false;
        }

        Instance other = (Instance) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.identityDomainUrl, other.identityDomainUrl)
                && java.util.Objects.equals(
                        this.identityDomainWebAuthClientId, other.identityDomainWebAuthClientId)
                && java.util.Objects.equals(
                        this.identityDomainWebAuthClientSecretVaultId,
                        other.identityDomainWebAuthClientSecretVaultId)
                && java.util.Objects.equals(
                        this.adminIdentityDomainUserId, other.adminIdentityDomainUserId)
                && java.util.Objects.equals(this.publicIp, other.publicIp)
                && java.util.Objects.equals(this.serviceEndpoint, other.serviceEndpoint)
                && java.util.Objects.equals(this.uiEndpoint, other.uiEndpoint)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
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
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.identityDomainUrl == null ? 43 : this.identityDomainUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.identityDomainWebAuthClientId == null
                                ? 43
                                : this.identityDomainWebAuthClientId.hashCode());
        result =
                (result * PRIME)
                        + (this.identityDomainWebAuthClientSecretVaultId == null
                                ? 43
                                : this.identityDomainWebAuthClientSecretVaultId.hashCode());
        result =
                (result * PRIME)
                        + (this.adminIdentityDomainUserId == null
                                ? 43
                                : this.adminIdentityDomainUserId.hashCode());
        result = (result * PRIME) + (this.publicIp == null ? 43 : this.publicIp.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceEndpoint == null ? 43 : this.serviceEndpoint.hashCode());
        result = (result * PRIME) + (this.uiEndpoint == null ? 43 : this.uiEndpoint.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
