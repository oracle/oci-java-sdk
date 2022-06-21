/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.model;

/**
 * The request details to be updated in the firewall policy.
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
    builder = UpdateNetworkFirewallPolicyDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateNetworkFirewallPolicyDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "mappedSecrets",
        "applicationLists",
        "urlLists",
        "ipAddressLists",
        "securityRules",
        "decryptionRules",
        "decryptionProfiles",
        "freeformTags",
        "definedTags"
    })
    public UpdateNetworkFirewallPolicyDetails(
            String displayName,
            java.util.Map<String, MappedSecret> mappedSecrets,
            java.util.Map<String, java.util.List<Application>> applicationLists,
            java.util.Map<String, java.util.List<UrlPattern>> urlLists,
            java.util.Map<String, java.util.List<String>> ipAddressLists,
            java.util.List<SecurityRule> securityRules,
            java.util.List<DecryptionRule> decryptionRules,
            java.util.Map<String, DecryptionProfile> decryptionProfiles,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.mappedSecrets = mappedSecrets;
        this.applicationLists = applicationLists;
        this.urlLists = urlLists;
        this.ipAddressLists = ipAddressLists;
        this.securityRules = securityRules;
        this.decryptionRules = decryptionRules;
        this.decryptionProfiles = decryptionProfiles;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user-friendly name for the firewall. Does not have to be unique, and it's changeable. Avoid entering confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name for the firewall. Does not have to be unique, and it's changeable. Avoid entering confidential information.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateNetworkFirewallPolicyDetails build() {
            UpdateNetworkFirewallPolicyDetails __instance__ =
                    new UpdateNetworkFirewallPolicyDetails(
                            displayName,
                            mappedSecrets,
                            applicationLists,
                            urlLists,
                            ipAddressLists,
                            securityRules,
                            decryptionRules,
                            decryptionProfiles,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateNetworkFirewallPolicyDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .mappedSecrets(o.getMappedSecrets())
                            .applicationLists(o.getApplicationLists())
                            .urlLists(o.getUrlLists())
                            .ipAddressLists(o.getIpAddressLists())
                            .securityRules(o.getSecurityRules())
                            .decryptionRules(o.getDecryptionRules())
                            .decryptionProfiles(o.getDecryptionProfiles())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * A user-friendly name for the firewall. Does not have to be unique, and it's changeable. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name for the firewall. Does not have to be unique, and it's changeable. Avoid entering confidential information.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
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

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateNetworkFirewallPolicyDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", mappedSecrets=").append(String.valueOf(this.mappedSecrets));
        sb.append(", applicationLists=").append(String.valueOf(this.applicationLists));
        sb.append(", urlLists=").append(String.valueOf(this.urlLists));
        sb.append(", ipAddressLists=").append(String.valueOf(this.ipAddressLists));
        sb.append(", securityRules=").append(String.valueOf(this.securityRules));
        sb.append(", decryptionRules=").append(String.valueOf(this.decryptionRules));
        sb.append(", decryptionProfiles=").append(String.valueOf(this.decryptionProfiles));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateNetworkFirewallPolicyDetails)) {
            return false;
        }

        UpdateNetworkFirewallPolicyDetails other = (UpdateNetworkFirewallPolicyDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.mappedSecrets, other.mappedSecrets)
                && java.util.Objects.equals(this.applicationLists, other.applicationLists)
                && java.util.Objects.equals(this.urlLists, other.urlLists)
                && java.util.Objects.equals(this.ipAddressLists, other.ipAddressLists)
                && java.util.Objects.equals(this.securityRules, other.securityRules)
                && java.util.Objects.equals(this.decryptionRules, other.decryptionRules)
                && java.util.Objects.equals(this.decryptionProfiles, other.decryptionProfiles)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
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
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
