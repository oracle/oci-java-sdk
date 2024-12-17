/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Details about the identity configuration <br>
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
        builder = IdentityConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class IdentityConfiguration
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "identityDomainId",
        "confidentialApplicationId",
        "lifecycleState",
        "timeCreated",
        "timeUpdated",
        "iamUserSyncConfiguration",
        "upstConfiguration"
    })
    public IdentityConfiguration(
            String id,
            String displayName,
            String identityDomainId,
            String confidentialApplicationId,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            IamUserSyncConfiguration iamUserSyncConfiguration,
            UpstConfiguration upstConfiguration) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.identityDomainId = identityDomainId;
        this.confidentialApplicationId = confidentialApplicationId;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.iamUserSyncConfiguration = iamUserSyncConfiguration;
        this.upstConfiguration = upstConfiguration;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The id of the UPST config */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The id of the UPST config
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** the display name of the identity configuration */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * the display name of the identity configuration
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Identity domain to use for identity config */
        @com.fasterxml.jackson.annotation.JsonProperty("identityDomainId")
        private String identityDomainId;

        /**
         * Identity domain to use for identity config
         *
         * @param identityDomainId the value to set
         * @return this builder
         */
        public Builder identityDomainId(String identityDomainId) {
            this.identityDomainId = identityDomainId;
            this.__explicitlySet__.add("identityDomainId");
            return this;
        }
        /** identity domain confidential application ID for the identity config */
        @com.fasterxml.jackson.annotation.JsonProperty("confidentialApplicationId")
        private String confidentialApplicationId;

        /**
         * identity domain confidential application ID for the identity config
         *
         * @param confidentialApplicationId the value to set
         * @return this builder
         */
        public Builder confidentialApplicationId(String confidentialApplicationId) {
            this.confidentialApplicationId = confidentialApplicationId;
            this.__explicitlySet__.add("confidentialApplicationId");
            return this;
        }
        /** Lifecycle state of the identity configuration */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * Lifecycle state of the identity configuration
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
         * Time when this identity configuration was created, shown as an RFC 3339 formatted
         * datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Time when this identity configuration was created, shown as an RFC 3339 formatted
         * datetime string.
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
         * Time when this identity configuration config was updated, shown as an RFC 3339 formatted
         * datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * Time when this identity configuration config was updated, shown as an RFC 3339 formatted
         * datetime string.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("iamUserSyncConfiguration")
        private IamUserSyncConfiguration iamUserSyncConfiguration;

        public Builder iamUserSyncConfiguration(IamUserSyncConfiguration iamUserSyncConfiguration) {
            this.iamUserSyncConfiguration = iamUserSyncConfiguration;
            this.__explicitlySet__.add("iamUserSyncConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("upstConfiguration")
        private UpstConfiguration upstConfiguration;

        public Builder upstConfiguration(UpstConfiguration upstConfiguration) {
            this.upstConfiguration = upstConfiguration;
            this.__explicitlySet__.add("upstConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IdentityConfiguration build() {
            IdentityConfiguration model =
                    new IdentityConfiguration(
                            this.id,
                            this.displayName,
                            this.identityDomainId,
                            this.confidentialApplicationId,
                            this.lifecycleState,
                            this.timeCreated,
                            this.timeUpdated,
                            this.iamUserSyncConfiguration,
                            this.upstConfiguration);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IdentityConfiguration model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("identityDomainId")) {
                this.identityDomainId(model.getIdentityDomainId());
            }
            if (model.wasPropertyExplicitlySet("confidentialApplicationId")) {
                this.confidentialApplicationId(model.getConfidentialApplicationId());
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
            if (model.wasPropertyExplicitlySet("iamUserSyncConfiguration")) {
                this.iamUserSyncConfiguration(model.getIamUserSyncConfiguration());
            }
            if (model.wasPropertyExplicitlySet("upstConfiguration")) {
                this.upstConfiguration(model.getUpstConfiguration());
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

    /** The id of the UPST config */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The id of the UPST config
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** the display name of the identity configuration */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * the display name of the identity configuration
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Identity domain to use for identity config */
    @com.fasterxml.jackson.annotation.JsonProperty("identityDomainId")
    private final String identityDomainId;

    /**
     * Identity domain to use for identity config
     *
     * @return the value
     */
    public String getIdentityDomainId() {
        return identityDomainId;
    }

    /** identity domain confidential application ID for the identity config */
    @com.fasterxml.jackson.annotation.JsonProperty("confidentialApplicationId")
    private final String confidentialApplicationId;

    /**
     * identity domain confidential application ID for the identity config
     *
     * @return the value
     */
    public String getConfidentialApplicationId() {
        return confidentialApplicationId;
    }

    /** Lifecycle state of the identity configuration */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Active("ACTIVE"),
        Deleted("DELETED"),

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
    /** Lifecycle state of the identity configuration */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * Lifecycle state of the identity configuration
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Time when this identity configuration was created, shown as an RFC 3339 formatted datetime
     * string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Time when this identity configuration was created, shown as an RFC 3339 formatted datetime
     * string.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Time when this identity configuration config was updated, shown as an RFC 3339 formatted
     * datetime string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * Time when this identity configuration config was updated, shown as an RFC 3339 formatted
     * datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("iamUserSyncConfiguration")
    private final IamUserSyncConfiguration iamUserSyncConfiguration;

    public IamUserSyncConfiguration getIamUserSyncConfiguration() {
        return iamUserSyncConfiguration;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("upstConfiguration")
    private final UpstConfiguration upstConfiguration;

    public UpstConfiguration getUpstConfiguration() {
        return upstConfiguration;
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
        sb.append("IdentityConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", identityDomainId=").append(String.valueOf(this.identityDomainId));
        sb.append(", confidentialApplicationId=")
                .append(String.valueOf(this.confidentialApplicationId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", iamUserSyncConfiguration=")
                .append(String.valueOf(this.iamUserSyncConfiguration));
        sb.append(", upstConfiguration=").append(String.valueOf(this.upstConfiguration));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IdentityConfiguration)) {
            return false;
        }

        IdentityConfiguration other = (IdentityConfiguration) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.identityDomainId, other.identityDomainId)
                && java.util.Objects.equals(
                        this.confidentialApplicationId, other.confidentialApplicationId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(
                        this.iamUserSyncConfiguration, other.iamUserSyncConfiguration)
                && java.util.Objects.equals(this.upstConfiguration, other.upstConfiguration)
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
                        + (this.identityDomainId == null ? 43 : this.identityDomainId.hashCode());
        result =
                (result * PRIME)
                        + (this.confidentialApplicationId == null
                                ? 43
                                : this.confidentialApplicationId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.iamUserSyncConfiguration == null
                                ? 43
                                : this.iamUserSyncConfiguration.hashCode());
        result =
                (result * PRIME)
                        + (this.upstConfiguration == null ? 43 : this.upstConfiguration.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
