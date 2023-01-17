/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.model;

/**
 * Description of NetworkFirewall Policy.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = NetworkFirewallPolicy.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class NetworkFirewallPolicy
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails",
        "mappedSecrets",
        "applicationLists",
        "urlLists",
        "ipAddressLists",
        "securityRules",
        "decryptionRules",
        "decryptionProfiles",
        "isFirewallAttached",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public NetworkFirewallPolicy(
            String id,
            String compartmentId,
            String displayName,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Map<String, MappedSecret> mappedSecrets,
            java.util.Map<String, java.util.List<Application>> applicationLists,
            java.util.Map<String, java.util.List<UrlPattern>> urlLists,
            java.util.Map<String, java.util.List<String>> ipAddressLists,
            java.util.List<SecurityRule> securityRules,
            java.util.List<DecryptionRule> decryptionRules,
            java.util.Map<String, DecryptionProfile> decryptionProfiles,
            Boolean isFirewallAttached,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.mappedSecrets = mappedSecrets;
        this.applicationLists = applicationLists;
        this.urlLists = urlLists;
        this.ipAddressLists = ipAddressLists;
        this.securityRules = securityRules;
        this.decryptionRules = decryptionRules;
        this.decryptionProfiles = decryptionProfiles;
        this.isFirewallAttached = isFirewallAttached;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the resource - Network Firewall Policy.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the resource - Network Firewall Policy.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the NetworkFirewall Policy.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the NetworkFirewall Policy.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * A user-friendly optional name for the firewall policy. Avoid entering confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly optional name for the firewall policy. Avoid entering confidential information.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The time instant at which the Network Firewall Policy was created in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time instant at which the Network Firewall Policy was created in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time instant at which the Network Firewall Policy was updated in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time instant at which the Network Firewall Policy was updated in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The current state of the Network Firewall Policy.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the Network Firewall Policy.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * Map defining secrets of the policy.
         * The value of an entry is a "mapped secret" consisting of a purpose and source.
         * The associated key is the identifier by which the mapped secret is referenced.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mappedSecrets")
        private java.util.Map<String, MappedSecret> mappedSecrets;

        /**
         * Map defining secrets of the policy.
         * The value of an entry is a "mapped secret" consisting of a purpose and source.
         * The associated key is the identifier by which the mapped secret is referenced.
         *
         * @param mappedSecrets the value to set
         * @return this builder
         **/
        public Builder mappedSecrets(java.util.Map<String, MappedSecret> mappedSecrets) {
            this.mappedSecrets = mappedSecrets;
            this.__explicitlySet__.add("mappedSecrets");
            return this;
        }
        /**
         * Map defining application lists of the policy.
         * The value of an entry is a list of "applications", each consisting of a protocol identifier (such as TCP, UDP, or ICMP) and protocol-specific parameters (such as a port range).
         * The associated key is the identifier by which the application list is referenced.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("applicationLists")
        private java.util.Map<String, java.util.List<Application>> applicationLists;

        /**
         * Map defining application lists of the policy.
         * The value of an entry is a list of "applications", each consisting of a protocol identifier (such as TCP, UDP, or ICMP) and protocol-specific parameters (such as a port range).
         * The associated key is the identifier by which the application list is referenced.
         *
         * @param applicationLists the value to set
         * @return this builder
         **/
        public Builder applicationLists(
                java.util.Map<String, java.util.List<Application>> applicationLists) {
            this.applicationLists = applicationLists;
            this.__explicitlySet__.add("applicationLists");
            return this;
        }
        /**
         * Map defining URL pattern lists of the policy.
         * The value of an entry is a list of URL patterns.
         * The associated key is the identifier by which the URL pattern list is referenced.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("urlLists")
        private java.util.Map<String, java.util.List<UrlPattern>> urlLists;

        /**
         * Map defining URL pattern lists of the policy.
         * The value of an entry is a list of URL patterns.
         * The associated key is the identifier by which the URL pattern list is referenced.
         *
         * @param urlLists the value to set
         * @return this builder
         **/
        public Builder urlLists(java.util.Map<String, java.util.List<UrlPattern>> urlLists) {
            this.urlLists = urlLists;
            this.__explicitlySet__.add("urlLists");
            return this;
        }
        /**
         * Map defining IP address lists of the policy.
         * The value of an entry is a list of IP addresses or prefixes in CIDR notation.
         * The associated key is the identifier by which the IP address list is referenced.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipAddressLists")
        private java.util.Map<String, java.util.List<String>> ipAddressLists;

        /**
         * Map defining IP address lists of the policy.
         * The value of an entry is a list of IP addresses or prefixes in CIDR notation.
         * The associated key is the identifier by which the IP address list is referenced.
         *
         * @param ipAddressLists the value to set
         * @return this builder
         **/
        public Builder ipAddressLists(
                java.util.Map<String, java.util.List<String>> ipAddressLists) {
            this.ipAddressLists = ipAddressLists;
            this.__explicitlySet__.add("ipAddressLists");
            return this;
        }
        /**
         * List of Security Rules defining the behavior of the policy.
         * The first rule with a matching condition determines the action taken upon network traffic.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("securityRules")
        private java.util.List<SecurityRule> securityRules;

        /**
         * List of Security Rules defining the behavior of the policy.
         * The first rule with a matching condition determines the action taken upon network traffic.
         *
         * @param securityRules the value to set
         * @return this builder
         **/
        public Builder securityRules(java.util.List<SecurityRule> securityRules) {
            this.securityRules = securityRules;
            this.__explicitlySet__.add("securityRules");
            return this;
        }
        /**
         * List of Decryption Rules defining the behavior of the policy.
         * The first rule with a matching condition determines the action taken upon network traffic.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("decryptionRules")
        private java.util.List<DecryptionRule> decryptionRules;

        /**
         * List of Decryption Rules defining the behavior of the policy.
         * The first rule with a matching condition determines the action taken upon network traffic.
         *
         * @param decryptionRules the value to set
         * @return this builder
         **/
        public Builder decryptionRules(java.util.List<DecryptionRule> decryptionRules) {
            this.decryptionRules = decryptionRules;
            this.__explicitlySet__.add("decryptionRules");
            return this;
        }
        /**
         * Map defining decryption profiles of the policy.
         * The value of an entry is a decryption profile.
         * The associated key is the identifier by which the decryption profile is referenced.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("decryptionProfiles")
        private java.util.Map<String, DecryptionProfile> decryptionProfiles;

        /**
         * Map defining decryption profiles of the policy.
         * The value of an entry is a decryption profile.
         * The associated key is the identifier by which the decryption profile is referenced.
         *
         * @param decryptionProfiles the value to set
         * @return this builder
         **/
        public Builder decryptionProfiles(
                java.util.Map<String, DecryptionProfile> decryptionProfiles) {
            this.decryptionProfiles = decryptionProfiles;
            this.__explicitlySet__.add("decryptionProfiles");
            return this;
        }
        /**
         * To determine if any Network Firewall is associated with this Network Firewall Policy.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isFirewallAttached")
        private Boolean isFirewallAttached;

        /**
         * To determine if any Network Firewall is associated with this Network Firewall Policy.
         *
         * @param isFirewallAttached the value to set
         * @return this builder
         **/
        public Builder isFirewallAttached(Boolean isFirewallAttached) {
            this.isFirewallAttached = isFirewallAttached;
            this.__explicitlySet__.add("isFirewallAttached");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
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
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NetworkFirewallPolicy build() {
            NetworkFirewallPolicy model =
                    new NetworkFirewallPolicy(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.mappedSecrets,
                            this.applicationLists,
                            this.urlLists,
                            this.ipAddressLists,
                            this.securityRules,
                            this.decryptionRules,
                            this.decryptionProfiles,
                            this.isFirewallAttached,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NetworkFirewallPolicy model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
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
            if (model.wasPropertyExplicitlySet("mappedSecrets")) {
                this.mappedSecrets(model.getMappedSecrets());
            }
            if (model.wasPropertyExplicitlySet("applicationLists")) {
                this.applicationLists(model.getApplicationLists());
            }
            if (model.wasPropertyExplicitlySet("urlLists")) {
                this.urlLists(model.getUrlLists());
            }
            if (model.wasPropertyExplicitlySet("ipAddressLists")) {
                this.ipAddressLists(model.getIpAddressLists());
            }
            if (model.wasPropertyExplicitlySet("securityRules")) {
                this.securityRules(model.getSecurityRules());
            }
            if (model.wasPropertyExplicitlySet("decryptionRules")) {
                this.decryptionRules(model.getDecryptionRules());
            }
            if (model.wasPropertyExplicitlySet("decryptionProfiles")) {
                this.decryptionProfiles(model.getDecryptionProfiles());
            }
            if (model.wasPropertyExplicitlySet("isFirewallAttached")) {
                this.isFirewallAttached(model.getIsFirewallAttached());
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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the resource - Network Firewall Policy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the resource - Network Firewall Policy.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the NetworkFirewall Policy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the NetworkFirewall Policy.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * A user-friendly optional name for the firewall policy. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly optional name for the firewall policy. Avoid entering confidential information.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The time instant at which the Network Firewall Policy was created in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time instant at which the Network Firewall Policy was created in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time instant at which the Network Firewall Policy was updated in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time instant at which the Network Firewall Policy was updated in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The current state of the Network Firewall Policy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the Network Firewall Policy.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * Map defining secrets of the policy.
     * The value of an entry is a "mapped secret" consisting of a purpose and source.
     * The associated key is the identifier by which the mapped secret is referenced.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mappedSecrets")
    private final java.util.Map<String, MappedSecret> mappedSecrets;

    /**
     * Map defining secrets of the policy.
     * The value of an entry is a "mapped secret" consisting of a purpose and source.
     * The associated key is the identifier by which the mapped secret is referenced.
     *
     * @return the value
     **/
    public java.util.Map<String, MappedSecret> getMappedSecrets() {
        return mappedSecrets;
    }

    /**
     * Map defining application lists of the policy.
     * The value of an entry is a list of "applications", each consisting of a protocol identifier (such as TCP, UDP, or ICMP) and protocol-specific parameters (such as a port range).
     * The associated key is the identifier by which the application list is referenced.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applicationLists")
    private final java.util.Map<String, java.util.List<Application>> applicationLists;

    /**
     * Map defining application lists of the policy.
     * The value of an entry is a list of "applications", each consisting of a protocol identifier (such as TCP, UDP, or ICMP) and protocol-specific parameters (such as a port range).
     * The associated key is the identifier by which the application list is referenced.
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.List<Application>> getApplicationLists() {
        return applicationLists;
    }

    /**
     * Map defining URL pattern lists of the policy.
     * The value of an entry is a list of URL patterns.
     * The associated key is the identifier by which the URL pattern list is referenced.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("urlLists")
    private final java.util.Map<String, java.util.List<UrlPattern>> urlLists;

    /**
     * Map defining URL pattern lists of the policy.
     * The value of an entry is a list of URL patterns.
     * The associated key is the identifier by which the URL pattern list is referenced.
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.List<UrlPattern>> getUrlLists() {
        return urlLists;
    }

    /**
     * Map defining IP address lists of the policy.
     * The value of an entry is a list of IP addresses or prefixes in CIDR notation.
     * The associated key is the identifier by which the IP address list is referenced.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddressLists")
    private final java.util.Map<String, java.util.List<String>> ipAddressLists;

    /**
     * Map defining IP address lists of the policy.
     * The value of an entry is a list of IP addresses or prefixes in CIDR notation.
     * The associated key is the identifier by which the IP address list is referenced.
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.List<String>> getIpAddressLists() {
        return ipAddressLists;
    }

    /**
     * List of Security Rules defining the behavior of the policy.
     * The first rule with a matching condition determines the action taken upon network traffic.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("securityRules")
    private final java.util.List<SecurityRule> securityRules;

    /**
     * List of Security Rules defining the behavior of the policy.
     * The first rule with a matching condition determines the action taken upon network traffic.
     *
     * @return the value
     **/
    public java.util.List<SecurityRule> getSecurityRules() {
        return securityRules;
    }

    /**
     * List of Decryption Rules defining the behavior of the policy.
     * The first rule with a matching condition determines the action taken upon network traffic.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("decryptionRules")
    private final java.util.List<DecryptionRule> decryptionRules;

    /**
     * List of Decryption Rules defining the behavior of the policy.
     * The first rule with a matching condition determines the action taken upon network traffic.
     *
     * @return the value
     **/
    public java.util.List<DecryptionRule> getDecryptionRules() {
        return decryptionRules;
    }

    /**
     * Map defining decryption profiles of the policy.
     * The value of an entry is a decryption profile.
     * The associated key is the identifier by which the decryption profile is referenced.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("decryptionProfiles")
    private final java.util.Map<String, DecryptionProfile> decryptionProfiles;

    /**
     * Map defining decryption profiles of the policy.
     * The value of an entry is a decryption profile.
     * The associated key is the identifier by which the decryption profile is referenced.
     *
     * @return the value
     **/
    public java.util.Map<String, DecryptionProfile> getDecryptionProfiles() {
        return decryptionProfiles;
    }

    /**
     * To determine if any Network Firewall is associated with this Network Firewall Policy.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isFirewallAttached")
    private final Boolean isFirewallAttached;

    /**
     * To determine if any Network Firewall is associated with this Network Firewall Policy.
     *
     * @return the value
     **/
    public Boolean getIsFirewallAttached() {
        return isFirewallAttached;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("NetworkFirewallPolicy(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", mappedSecrets=").append(String.valueOf(this.mappedSecrets));
        sb.append(", applicationLists=").append(String.valueOf(this.applicationLists));
        sb.append(", urlLists=").append(String.valueOf(this.urlLists));
        sb.append(", ipAddressLists=").append(String.valueOf(this.ipAddressLists));
        sb.append(", securityRules=").append(String.valueOf(this.securityRules));
        sb.append(", decryptionRules=").append(String.valueOf(this.decryptionRules));
        sb.append(", decryptionProfiles=").append(String.valueOf(this.decryptionProfiles));
        sb.append(", isFirewallAttached=").append(String.valueOf(this.isFirewallAttached));
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
        if (!(o instanceof NetworkFirewallPolicy)) {
            return false;
        }

        NetworkFirewallPolicy other = (NetworkFirewallPolicy) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.mappedSecrets, other.mappedSecrets)
                && java.util.Objects.equals(this.applicationLists, other.applicationLists)
                && java.util.Objects.equals(this.urlLists, other.urlLists)
                && java.util.Objects.equals(this.ipAddressLists, other.ipAddressLists)
                && java.util.Objects.equals(this.securityRules, other.securityRules)
                && java.util.Objects.equals(this.decryptionRules, other.decryptionRules)
                && java.util.Objects.equals(this.decryptionProfiles, other.decryptionProfiles)
                && java.util.Objects.equals(this.isFirewallAttached, other.isFirewallAttached)
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
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
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
                        + (this.mappedSecrets == null ? 43 : this.mappedSecrets.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationLists == null ? 43 : this.applicationLists.hashCode());
        result = (result * PRIME) + (this.urlLists == null ? 43 : this.urlLists.hashCode());
        result =
                (result * PRIME)
                        + (this.ipAddressLists == null ? 43 : this.ipAddressLists.hashCode());
        result =
                (result * PRIME)
                        + (this.securityRules == null ? 43 : this.securityRules.hashCode());
        result =
                (result * PRIME)
                        + (this.decryptionRules == null ? 43 : this.decryptionRules.hashCode());
        result =
                (result * PRIME)
                        + (this.decryptionProfiles == null
                                ? 43
                                : this.decryptionProfiles.hashCode());
        result =
                (result * PRIME)
                        + (this.isFirewallAttached == null
                                ? 43
                                : this.isFirewallAttached.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
