/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.wlms.model;

/**
 * Details of the WebLogic and Node Manager credentials. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = WlsDomainCredential.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class WlsDomainCredential
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"type", "strategy", "userSecretId", "passwordSecretId"})
    public WlsDomainCredential(
            String type, Strategy strategy, String userSecretId, String passwordSecretId) {
        super();
        this.type = type;
        this.strategy = strategy;
        this.userSecretId = userSecretId;
        this.passwordSecretId = passwordSecretId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The type of credential. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * The type of credential.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** The strategy for passing the new credentials. */
        @com.fasterxml.jackson.annotation.JsonProperty("strategy")
        private Strategy strategy;

        /**
         * The strategy for passing the new credentials.
         *
         * @param strategy the value to set
         * @return this builder
         */
        public Builder strategy(Strategy strategy) {
            this.strategy = strategy;
            this.__explicitlySet__.add("strategy");
            return this;
        }
        /** The OCID for user secret. */
        @com.fasterxml.jackson.annotation.JsonProperty("userSecretId")
        private String userSecretId;

        /**
         * The OCID for user secret.
         *
         * @param userSecretId the value to set
         * @return this builder
         */
        public Builder userSecretId(String userSecretId) {
            this.userSecretId = userSecretId;
            this.__explicitlySet__.add("userSecretId");
            return this;
        }
        /** The OCID for password secret. */
        @com.fasterxml.jackson.annotation.JsonProperty("passwordSecretId")
        private String passwordSecretId;

        /**
         * The OCID for password secret.
         *
         * @param passwordSecretId the value to set
         * @return this builder
         */
        public Builder passwordSecretId(String passwordSecretId) {
            this.passwordSecretId = passwordSecretId;
            this.__explicitlySet__.add("passwordSecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WlsDomainCredential build() {
            WlsDomainCredential model =
                    new WlsDomainCredential(
                            this.type, this.strategy, this.userSecretId, this.passwordSecretId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WlsDomainCredential model) {
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("strategy")) {
                this.strategy(model.getStrategy());
            }
            if (model.wasPropertyExplicitlySet("userSecretId")) {
                this.userSecretId(model.getUserSecretId());
            }
            if (model.wasPropertyExplicitlySet("passwordSecretId")) {
                this.passwordSecretId(model.getPasswordSecretId());
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

    /** The type of credential. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * The type of credential.
     *
     * @return the value
     */
    public String getType() {
        return type;
    }

    /** The strategy for passing the new credentials. */
    public enum Strategy implements com.oracle.bmc.http.internal.BmcEnum {
        UseDomainConfig("USE_DOMAIN_CONFIG"),
        UseNodeManagerConfig("USE_NODE_MANAGER_CONFIG"),
        UseSecrets("USE_SECRETS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Strategy.class);

        private final String value;
        private static java.util.Map<String, Strategy> map;

        static {
            map = new java.util.HashMap<>();
            for (Strategy v : Strategy.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Strategy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Strategy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Strategy', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The strategy for passing the new credentials. */
    @com.fasterxml.jackson.annotation.JsonProperty("strategy")
    private final Strategy strategy;

    /**
     * The strategy for passing the new credentials.
     *
     * @return the value
     */
    public Strategy getStrategy() {
        return strategy;
    }

    /** The OCID for user secret. */
    @com.fasterxml.jackson.annotation.JsonProperty("userSecretId")
    private final String userSecretId;

    /**
     * The OCID for user secret.
     *
     * @return the value
     */
    public String getUserSecretId() {
        return userSecretId;
    }

    /** The OCID for password secret. */
    @com.fasterxml.jackson.annotation.JsonProperty("passwordSecretId")
    private final String passwordSecretId;

    /**
     * The OCID for password secret.
     *
     * @return the value
     */
    public String getPasswordSecretId() {
        return passwordSecretId;
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
        sb.append("WlsDomainCredential(");
        sb.append("super=").append(super.toString());
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", strategy=").append(String.valueOf(this.strategy));
        sb.append(", userSecretId=").append(String.valueOf(this.userSecretId));
        sb.append(", passwordSecretId=").append(String.valueOf(this.passwordSecretId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WlsDomainCredential)) {
            return false;
        }

        WlsDomainCredential other = (WlsDomainCredential) o;
        return java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.strategy, other.strategy)
                && java.util.Objects.equals(this.userSecretId, other.userSecretId)
                && java.util.Objects.equals(this.passwordSecretId, other.passwordSecretId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.strategy == null ? 43 : this.strategy.hashCode());
        result = (result * PRIME) + (this.userSecretId == null ? 43 : this.userSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.passwordSecretId == null ? 43 : this.passwordSecretId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
