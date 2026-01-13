/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Information about the UPST configuration. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpstConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpstConfiguration
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "vaultId",
        "masterEncryptionKeyId",
        "secretId",
        "timeTokenExchangeKeytabLastRefreshed",
        "tokenExchangePrincipalName",
        "lifecycleState",
        "timeCreated",
        "timeUpdated",
        "keytabContent"
    })
    public UpstConfiguration(
            String vaultId,
            String masterEncryptionKeyId,
            String secretId,
            java.util.Date timeTokenExchangeKeytabLastRefreshed,
            String tokenExchangePrincipalName,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String keytabContent) {
        super();
        this.vaultId = vaultId;
        this.masterEncryptionKeyId = masterEncryptionKeyId;
        this.secretId = secretId;
        this.timeTokenExchangeKeytabLastRefreshed = timeTokenExchangeKeytabLastRefreshed;
        this.tokenExchangePrincipalName = tokenExchangePrincipalName;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.keytabContent = keytabContent;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The instance OCID of the node, which is the resource from which the node backup was
         * acquired.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
        private String vaultId;

        /**
         * The instance OCID of the node, which is the resource from which the node backup was
         * acquired.
         *
         * @param vaultId the value to set
         * @return this builder
         */
        public Builder vaultId(String vaultId) {
            this.vaultId = vaultId;
            this.__explicitlySet__.add("vaultId");
            return this;
        }
        /** Master Encryption key used for encrypting token exchange keytab. */
        @com.fasterxml.jackson.annotation.JsonProperty("masterEncryptionKeyId")
        private String masterEncryptionKeyId;

        /**
         * Master Encryption key used for encrypting token exchange keytab.
         *
         * @param masterEncryptionKeyId the value to set
         * @return this builder
         */
        public Builder masterEncryptionKeyId(String masterEncryptionKeyId) {
            this.masterEncryptionKeyId = masterEncryptionKeyId;
            this.__explicitlySet__.add("masterEncryptionKeyId");
            return this;
        }
        /** Secret ID for token exchange keytab */
        @com.fasterxml.jackson.annotation.JsonProperty("secretId")
        private String secretId;

        /**
         * Secret ID for token exchange keytab
         *
         * @param secretId the value to set
         * @return this builder
         */
        public Builder secretId(String secretId) {
            this.secretId = secretId;
            this.__explicitlySet__.add("secretId");
            return this;
        }
        /**
         * Time when the keytab for token exchange principal is last refreshed, shown as an RFC 3339
         * formatted datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeTokenExchangeKeytabLastRefreshed")
        private java.util.Date timeTokenExchangeKeytabLastRefreshed;

        /**
         * Time when the keytab for token exchange principal is last refreshed, shown as an RFC 3339
         * formatted datetime string.
         *
         * @param timeTokenExchangeKeytabLastRefreshed the value to set
         * @return this builder
         */
        public Builder timeTokenExchangeKeytabLastRefreshed(
                java.util.Date timeTokenExchangeKeytabLastRefreshed) {
            this.timeTokenExchangeKeytabLastRefreshed = timeTokenExchangeKeytabLastRefreshed;
            this.__explicitlySet__.add("timeTokenExchangeKeytabLastRefreshed");
            return this;
        }
        /** Token exchange kerberos Principal name in cluster */
        @com.fasterxml.jackson.annotation.JsonProperty("tokenExchangePrincipalName")
        private String tokenExchangePrincipalName;

        /**
         * Token exchange kerberos Principal name in cluster
         *
         * @param tokenExchangePrincipalName the value to set
         * @return this builder
         */
        public Builder tokenExchangePrincipalName(String tokenExchangePrincipalName) {
            this.tokenExchangePrincipalName = tokenExchangePrincipalName;
            this.__explicitlySet__.add("tokenExchangePrincipalName");
            return this;
        }
        /** Lifecycle state of the UPST config */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * Lifecycle state of the UPST config
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
         * Time when this UPST config was created, shown as an RFC 3339 formatted datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Time when this UPST config was created, shown as an RFC 3339 formatted datetime string.
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
         * Time when this UPST config was updated, shown as an RFC 3339 formatted datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * Time when this UPST config was updated, shown as an RFC 3339 formatted datetime string.
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
         * The kerberos keytab content used for creating identity propagation trust config, in
         * base64 format
         */
        @com.fasterxml.jackson.annotation.JsonProperty("keytabContent")
        private String keytabContent;

        /**
         * The kerberos keytab content used for creating identity propagation trust config, in
         * base64 format
         *
         * @param keytabContent the value to set
         * @return this builder
         */
        public Builder keytabContent(String keytabContent) {
            this.keytabContent = keytabContent;
            this.__explicitlySet__.add("keytabContent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpstConfiguration build() {
            UpstConfiguration model =
                    new UpstConfiguration(
                            this.vaultId,
                            this.masterEncryptionKeyId,
                            this.secretId,
                            this.timeTokenExchangeKeytabLastRefreshed,
                            this.tokenExchangePrincipalName,
                            this.lifecycleState,
                            this.timeCreated,
                            this.timeUpdated,
                            this.keytabContent);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpstConfiguration model) {
            if (model.wasPropertyExplicitlySet("vaultId")) {
                this.vaultId(model.getVaultId());
            }
            if (model.wasPropertyExplicitlySet("masterEncryptionKeyId")) {
                this.masterEncryptionKeyId(model.getMasterEncryptionKeyId());
            }
            if (model.wasPropertyExplicitlySet("secretId")) {
                this.secretId(model.getSecretId());
            }
            if (model.wasPropertyExplicitlySet("timeTokenExchangeKeytabLastRefreshed")) {
                this.timeTokenExchangeKeytabLastRefreshed(
                        model.getTimeTokenExchangeKeytabLastRefreshed());
            }
            if (model.wasPropertyExplicitlySet("tokenExchangePrincipalName")) {
                this.tokenExchangePrincipalName(model.getTokenExchangePrincipalName());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("keytabContent")) {
                this.keytabContent(model.getKeytabContent());
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
     * The instance OCID of the node, which is the resource from which the node backup was acquired.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
    private final String vaultId;

    /**
     * The instance OCID of the node, which is the resource from which the node backup was acquired.
     *
     * @return the value
     */
    public String getVaultId() {
        return vaultId;
    }

    /** Master Encryption key used for encrypting token exchange keytab. */
    @com.fasterxml.jackson.annotation.JsonProperty("masterEncryptionKeyId")
    private final String masterEncryptionKeyId;

    /**
     * Master Encryption key used for encrypting token exchange keytab.
     *
     * @return the value
     */
    public String getMasterEncryptionKeyId() {
        return masterEncryptionKeyId;
    }

    /** Secret ID for token exchange keytab */
    @com.fasterxml.jackson.annotation.JsonProperty("secretId")
    private final String secretId;

    /**
     * Secret ID for token exchange keytab
     *
     * @return the value
     */
    public String getSecretId() {
        return secretId;
    }

    /**
     * Time when the keytab for token exchange principal is last refreshed, shown as an RFC 3339
     * formatted datetime string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeTokenExchangeKeytabLastRefreshed")
    private final java.util.Date timeTokenExchangeKeytabLastRefreshed;

    /**
     * Time when the keytab for token exchange principal is last refreshed, shown as an RFC 3339
     * formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeTokenExchangeKeytabLastRefreshed() {
        return timeTokenExchangeKeytabLastRefreshed;
    }

    /** Token exchange kerberos Principal name in cluster */
    @com.fasterxml.jackson.annotation.JsonProperty("tokenExchangePrincipalName")
    private final String tokenExchangePrincipalName;

    /**
     * Token exchange kerberos Principal name in cluster
     *
     * @return the value
     */
    public String getTokenExchangePrincipalName() {
        return tokenExchangePrincipalName;
    }

    /** Lifecycle state of the UPST config */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Active("ACTIVE"),
        Deleting("DELETING"),
        Inactive("INACTIVE"),
        Updating("UPDATING"),
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
    /** Lifecycle state of the UPST config */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * Lifecycle state of the UPST config
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Time when this UPST config was created, shown as an RFC 3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Time when this UPST config was created, shown as an RFC 3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** Time when this UPST config was updated, shown as an RFC 3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * Time when this UPST config was updated, shown as an RFC 3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The kerberos keytab content used for creating identity propagation trust config, in base64
     * format
     */
    @com.fasterxml.jackson.annotation.JsonProperty("keytabContent")
    private final String keytabContent;

    /**
     * The kerberos keytab content used for creating identity propagation trust config, in base64
     * format
     *
     * @return the value
     */
    public String getKeytabContent() {
        return keytabContent;
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
        sb.append("UpstConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("vaultId=").append(String.valueOf(this.vaultId));
        sb.append(", masterEncryptionKeyId=").append(String.valueOf(this.masterEncryptionKeyId));
        sb.append(", secretId=").append(String.valueOf(this.secretId));
        sb.append(", timeTokenExchangeKeytabLastRefreshed=")
                .append(String.valueOf(this.timeTokenExchangeKeytabLastRefreshed));
        sb.append(", tokenExchangePrincipalName=")
                .append(String.valueOf(this.tokenExchangePrincipalName));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", keytabContent=").append(String.valueOf(this.keytabContent));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpstConfiguration)) {
            return false;
        }

        UpstConfiguration other = (UpstConfiguration) o;
        return java.util.Objects.equals(this.vaultId, other.vaultId)
                && java.util.Objects.equals(this.masterEncryptionKeyId, other.masterEncryptionKeyId)
                && java.util.Objects.equals(this.secretId, other.secretId)
                && java.util.Objects.equals(
                        this.timeTokenExchangeKeytabLastRefreshed,
                        other.timeTokenExchangeKeytabLastRefreshed)
                && java.util.Objects.equals(
                        this.tokenExchangePrincipalName, other.tokenExchangePrincipalName)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.keytabContent, other.keytabContent)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.vaultId == null ? 43 : this.vaultId.hashCode());
        result =
                (result * PRIME)
                        + (this.masterEncryptionKeyId == null
                                ? 43
                                : this.masterEncryptionKeyId.hashCode());
        result = (result * PRIME) + (this.secretId == null ? 43 : this.secretId.hashCode());
        result =
                (result * PRIME)
                        + (this.timeTokenExchangeKeytabLastRefreshed == null
                                ? 43
                                : this.timeTokenExchangeKeytabLastRefreshed.hashCode());
        result =
                (result * PRIME)
                        + (this.tokenExchangePrincipalName == null
                                ? 43
                                : this.tokenExchangePrincipalName.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.keytabContent == null ? 43 : this.keytabContent.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
