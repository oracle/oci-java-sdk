/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The scope of analytics data.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SecurityFeatureAnalyticsDimensions.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SecurityFeatureAnalyticsDimensions
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"securityFeature"})
    public SecurityFeatureAnalyticsDimensions(SecurityFeature securityFeature) {
        super();
        this.securityFeature = securityFeature;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the security feature.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("securityFeature")
        private SecurityFeature securityFeature;

        /**
         * The name of the security feature.
         * @param securityFeature the value to set
         * @return this builder
         **/
        public Builder securityFeature(SecurityFeature securityFeature) {
            this.securityFeature = securityFeature;
            this.__explicitlySet__.add("securityFeature");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SecurityFeatureAnalyticsDimensions build() {
            SecurityFeatureAnalyticsDimensions model =
                    new SecurityFeatureAnalyticsDimensions(this.securityFeature);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SecurityFeatureAnalyticsDimensions model) {
            if (model.wasPropertyExplicitlySet("securityFeature")) {
                this.securityFeature(model.getSecurityFeature());
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
     * The name of the security feature.
     **/
    public enum SecurityFeature {
        UnifiedAudit("UNIFIED_AUDIT"),
        FineGrainedAudit("FINE_GRAINED_AUDIT"),
        TraditionalAudit("TRADITIONAL_AUDIT"),
        DatabaseVault("DATABASE_VAULT"),
        PrivilegeAnalysis("PRIVILEGE_ANALYSIS"),
        TablespaceEncryption("TABLESPACE_ENCRYPTION"),
        ColumnEncryption("COLUMN_ENCRYPTION"),
        NetworkEncryption("NETWORK_ENCRYPTION"),
        PasswordAuthentication("PASSWORD_AUTHENTICATION"),
        GlobalAuthentication("GLOBAL_AUTHENTICATION"),
        ExternalAuthentication("EXTERNAL_AUTHENTICATION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(SecurityFeature.class);

        private final String value;
        private static java.util.Map<String, SecurityFeature> map;

        static {
            map = new java.util.HashMap<>();
            for (SecurityFeature v : SecurityFeature.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        SecurityFeature(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SecurityFeature create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'SecurityFeature', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The name of the security feature.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("securityFeature")
    private final SecurityFeature securityFeature;

    /**
     * The name of the security feature.
     * @return the value
     **/
    public SecurityFeature getSecurityFeature() {
        return securityFeature;
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
        sb.append("SecurityFeatureAnalyticsDimensions(");
        sb.append("super=").append(super.toString());
        sb.append("securityFeature=").append(String.valueOf(this.securityFeature));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SecurityFeatureAnalyticsDimensions)) {
            return false;
        }

        SecurityFeatureAnalyticsDimensions other = (SecurityFeatureAnalyticsDimensions) o;
        return java.util.Objects.equals(this.securityFeature, other.securityFeature)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.securityFeature == null ? 43 : this.securityFeature.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
