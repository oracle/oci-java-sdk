/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * The API key information.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = BdsApiKey.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BdsApiKey {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "userId",
        "keyAlias",
        "defaultRegion",
        "tenantId",
        "fingerprint",
        "pemfilepath",
        "timeCreated",
        "lifecycleState"
    })
    public BdsApiKey(
            String id,
            String userId,
            String keyAlias,
            String defaultRegion,
            String tenantId,
            String fingerprint,
            String pemfilepath,
            java.util.Date timeCreated,
            LifecycleState lifecycleState) {
        super();
        this.id = id;
        this.userId = userId;
        this.keyAlias = keyAlias;
        this.defaultRegion = defaultRegion;
        this.tenantId = tenantId;
        this.fingerprint = fingerprint;
        this.pemfilepath = pemfilepath;
        this.timeCreated = timeCreated;
        this.lifecycleState = lifecycleState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userId")
        private String userId;

        public Builder userId(String userId) {
            this.userId = userId;
            this.__explicitlySet__.add("userId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keyAlias")
        private String keyAlias;

        public Builder keyAlias(String keyAlias) {
            this.keyAlias = keyAlias;
            this.__explicitlySet__.add("keyAlias");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultRegion")
        private String defaultRegion;

        public Builder defaultRegion(String defaultRegion) {
            this.defaultRegion = defaultRegion;
            this.__explicitlySet__.add("defaultRegion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
        private String tenantId;

        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            this.__explicitlySet__.add("tenantId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fingerprint")
        private String fingerprint;

        public Builder fingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            this.__explicitlySet__.add("fingerprint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pemfilepath")
        private String pemfilepath;

        public Builder pemfilepath(String pemfilepath) {
            this.pemfilepath = pemfilepath;
            this.__explicitlySet__.add("pemfilepath");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BdsApiKey build() {
            BdsApiKey __instance__ =
                    new BdsApiKey(
                            id,
                            userId,
                            keyAlias,
                            defaultRegion,
                            tenantId,
                            fingerprint,
                            pemfilepath,
                            timeCreated,
                            lifecycleState);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BdsApiKey o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .userId(o.getUserId())
                            .keyAlias(o.getKeyAlias())
                            .defaultRegion(o.getDefaultRegion())
                            .tenantId(o.getTenantId())
                            .fingerprint(o.getFingerprint())
                            .pemfilepath(o.getPemfilepath())
                            .timeCreated(o.getTimeCreated())
                            .lifecycleState(o.getLifecycleState());

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
     * Identifier of the user's API key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    /**
     * The user OCID for which this API key was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userId")
    private final String userId;

    public String getUserId() {
        return userId;
    }

    /**
     * User friendly identifier used to uniquely differentiate between different API keys.
     * Only ASCII alphanumeric characters with no spaces allowed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyAlias")
    private final String keyAlias;

    public String getKeyAlias() {
        return keyAlias;
    }

    /**
     * The name of the region to establish the Object Storage endpoint. Example us-phoenix-1 .
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultRegion")
    private final String defaultRegion;

    public String getDefaultRegion() {
        return defaultRegion;
    }

    /**
     * The OCID of your tenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
    private final String tenantId;

    public String getTenantId() {
        return tenantId;
    }

    /**
     * The fingerprint that corresponds to the public API key requested.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fingerprint")
    private final String fingerprint;

    public String getFingerprint() {
        return fingerprint;
    }

    /**
     * The full path and file name of the private key used for authentication. This location will be automatically selected
     * on the BDS local file system.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pemfilepath")
    private final String pemfilepath;

    public String getPemfilepath() {
        return pemfilepath;
    }

    /**
     * The time the API key was created, shown as an RFC 3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The state of the key.
     **/
    public enum LifecycleState {
        Creating("CREATING"),
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
     * The state of the key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("BdsApiKey(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", userId=").append(String.valueOf(this.userId));
        sb.append(", keyAlias=").append(String.valueOf(this.keyAlias));
        sb.append(", defaultRegion=").append(String.valueOf(this.defaultRegion));
        sb.append(", tenantId=").append(String.valueOf(this.tenantId));
        sb.append(", fingerprint=").append(String.valueOf(this.fingerprint));
        sb.append(", pemfilepath=").append(String.valueOf(this.pemfilepath));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BdsApiKey)) {
            return false;
        }

        BdsApiKey other = (BdsApiKey) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.userId, other.userId)
                && java.util.Objects.equals(this.keyAlias, other.keyAlias)
                && java.util.Objects.equals(this.defaultRegion, other.defaultRegion)
                && java.util.Objects.equals(this.tenantId, other.tenantId)
                && java.util.Objects.equals(this.fingerprint, other.fingerprint)
                && java.util.Objects.equals(this.pemfilepath, other.pemfilepath)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.userId == null ? 43 : this.userId.hashCode());
        result = (result * PRIME) + (this.keyAlias == null ? 43 : this.keyAlias.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultRegion == null ? 43 : this.defaultRegion.hashCode());
        result = (result * PRIME) + (this.tenantId == null ? 43 : this.tenantId.hashCode());
        result = (result * PRIME) + (this.fingerprint == null ? 43 : this.fingerprint.hashCode());
        result = (result * PRIME) + (this.pemfilepath == null ? 43 : this.pemfilepath.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
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
