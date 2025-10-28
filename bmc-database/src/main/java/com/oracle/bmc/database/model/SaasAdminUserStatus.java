/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * SaaS administrative user status. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SaasAdminUserStatus.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SaasAdminUserStatus
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isEnabled", "accessType", "timeSaasAdminUserEnabled"})
    public SaasAdminUserStatus(
            Boolean isEnabled, AccessType accessType, java.util.Date timeSaasAdminUserEnabled) {
        super();
        this.isEnabled = isEnabled;
        this.accessType = accessType;
        this.timeSaasAdminUserEnabled = timeSaasAdminUserEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Indicates if the SaaS administrative user is enabled for the Autonomous AI Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Indicates if the SaaS administrative user is enabled for the Autonomous AI Database.
         *
         * @param isEnabled the value to set
         * @return this builder
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /**
         * The access type for the SaaS administrative user. If no access type is specified, the
         * READ_ONLY access type is used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("accessType")
        private AccessType accessType;

        /**
         * The access type for the SaaS administrative user. If no access type is specified, the
         * READ_ONLY access type is used.
         *
         * @param accessType the value to set
         * @return this builder
         */
        public Builder accessType(AccessType accessType) {
            this.accessType = accessType;
            this.__explicitlySet__.add("accessType");
            return this;
        }
        /**
         * The date and time the SaaS administrative user was enabled at, for the Autonomous AI
         * Database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeSaasAdminUserEnabled")
        private java.util.Date timeSaasAdminUserEnabled;

        /**
         * The date and time the SaaS administrative user was enabled at, for the Autonomous AI
         * Database.
         *
         * @param timeSaasAdminUserEnabled the value to set
         * @return this builder
         */
        public Builder timeSaasAdminUserEnabled(java.util.Date timeSaasAdminUserEnabled) {
            this.timeSaasAdminUserEnabled = timeSaasAdminUserEnabled;
            this.__explicitlySet__.add("timeSaasAdminUserEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SaasAdminUserStatus build() {
            SaasAdminUserStatus model =
                    new SaasAdminUserStatus(
                            this.isEnabled, this.accessType, this.timeSaasAdminUserEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SaasAdminUserStatus model) {
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("accessType")) {
                this.accessType(model.getAccessType());
            }
            if (model.wasPropertyExplicitlySet("timeSaasAdminUserEnabled")) {
                this.timeSaasAdminUserEnabled(model.getTimeSaasAdminUserEnabled());
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

    /** Indicates if the SaaS administrative user is enabled for the Autonomous AI Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Indicates if the SaaS administrative user is enabled for the Autonomous AI Database.
     *
     * @return the value
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * The access type for the SaaS administrative user. If no access type is specified, the
     * READ_ONLY access type is used.
     */
    public enum AccessType implements com.oracle.bmc.http.internal.BmcEnum {
        ReadOnly("READ_ONLY"),
        ReadWrite("READ_WRITE"),
        Admin("ADMIN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AccessType.class);

        private final String value;
        private static java.util.Map<String, AccessType> map;

        static {
            map = new java.util.HashMap<>();
            for (AccessType v : AccessType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AccessType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AccessType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AccessType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The access type for the SaaS administrative user. If no access type is specified, the
     * READ_ONLY access type is used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("accessType")
    private final AccessType accessType;

    /**
     * The access type for the SaaS administrative user. If no access type is specified, the
     * READ_ONLY access type is used.
     *
     * @return the value
     */
    public AccessType getAccessType() {
        return accessType;
    }

    /**
     * The date and time the SaaS administrative user was enabled at, for the Autonomous AI
     * Database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeSaasAdminUserEnabled")
    private final java.util.Date timeSaasAdminUserEnabled;

    /**
     * The date and time the SaaS administrative user was enabled at, for the Autonomous AI
     * Database.
     *
     * @return the value
     */
    public java.util.Date getTimeSaasAdminUserEnabled() {
        return timeSaasAdminUserEnabled;
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
        sb.append("SaasAdminUserStatus(");
        sb.append("super=").append(super.toString());
        sb.append("isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", accessType=").append(String.valueOf(this.accessType));
        sb.append(", timeSaasAdminUserEnabled=")
                .append(String.valueOf(this.timeSaasAdminUserEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SaasAdminUserStatus)) {
            return false;
        }

        SaasAdminUserStatus other = (SaasAdminUserStatus) o;
        return java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.accessType, other.accessType)
                && java.util.Objects.equals(
                        this.timeSaasAdminUserEnabled, other.timeSaasAdminUserEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + (this.accessType == null ? 43 : this.accessType.hashCode());
        result =
                (result * PRIME)
                        + (this.timeSaasAdminUserEnabled == null
                                ? 43
                                : this.timeSaasAdminUserEnabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
