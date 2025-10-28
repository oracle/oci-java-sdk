/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details to update SaaS administrative user configuration. <br>
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
        builder = ConfigureSaasAdminUserDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ConfigureSaasAdminUserDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "password",
        "secretId",
        "secretVersionNumber",
        "duration",
        "isEnabled",
        "accessType",
        "timeSaasAdminUserEnabled"
    })
    public ConfigureSaasAdminUserDetails(
            String password,
            String secretId,
            Integer secretVersionNumber,
            Integer duration,
            Boolean isEnabled,
            AccessType accessType,
            java.util.Date timeSaasAdminUserEnabled) {
        super();
        this.password = password;
        this.secretId = secretId;
        this.secretVersionNumber = secretVersionNumber;
        this.duration = duration;
        this.isEnabled = isEnabled;
        this.accessType = accessType;
        this.timeSaasAdminUserEnabled = timeSaasAdminUserEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A strong password for SaaS administrative user. The password must be a minimum of nine
         * (9) characters and contain a minimum of two (2) uppercase, two (2) lowercase, two (2)
         * numbers, and two (2) special characters from _ (underscore), \\# (hashtag), or - (dash).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("password")
        private String password;

        /**
         * A strong password for SaaS administrative user. The password must be a minimum of nine
         * (9) characters and contain a minimum of two (2) uppercase, two (2) lowercase, two (2)
         * numbers, and two (2) special characters from _ (underscore), \\# (hashtag), or - (dash).
         *
         * @param password the value to set
         * @return this builder
         */
        public Builder password(String password) {
            this.password = password;
            this.__explicitlySet__.add("password");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Oracle Cloud Infrastructure
         * [secret](https://docs.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("secretId")
        private String secretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Oracle Cloud Infrastructure
         * [secret](https://docs.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
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
         * The version of the vault secret. If no version is specified, the latest version will be
         * used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("secretVersionNumber")
        private Integer secretVersionNumber;

        /**
         * The version of the vault secret. If no version is specified, the latest version will be
         * used.
         *
         * @param secretVersionNumber the value to set
         * @return this builder
         */
        public Builder secretVersionNumber(Integer secretVersionNumber) {
            this.secretVersionNumber = secretVersionNumber;
            this.__explicitlySet__.add("secretVersionNumber");
            return this;
        }
        /**
         * How long, in hours, the SaaS administrative user will stay enabled. If no duration is
         * specified, the default value 1 will be used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("duration")
        private Integer duration;

        /**
         * How long, in hours, the SaaS administrative user will stay enabled. If no duration is
         * specified, the default value 1 will be used.
         *
         * @param duration the value to set
         * @return this builder
         */
        public Builder duration(Integer duration) {
            this.duration = duration;
            this.__explicitlySet__.add("duration");
            return this;
        }
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

        public ConfigureSaasAdminUserDetails build() {
            ConfigureSaasAdminUserDetails model =
                    new ConfigureSaasAdminUserDetails(
                            this.password,
                            this.secretId,
                            this.secretVersionNumber,
                            this.duration,
                            this.isEnabled,
                            this.accessType,
                            this.timeSaasAdminUserEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConfigureSaasAdminUserDetails model) {
            if (model.wasPropertyExplicitlySet("password")) {
                this.password(model.getPassword());
            }
            if (model.wasPropertyExplicitlySet("secretId")) {
                this.secretId(model.getSecretId());
            }
            if (model.wasPropertyExplicitlySet("secretVersionNumber")) {
                this.secretVersionNumber(model.getSecretVersionNumber());
            }
            if (model.wasPropertyExplicitlySet("duration")) {
                this.duration(model.getDuration());
            }
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

    /**
     * A strong password for SaaS administrative user. The password must be a minimum of nine (9)
     * characters and contain a minimum of two (2) uppercase, two (2) lowercase, two (2) numbers,
     * and two (2) special characters from _ (underscore), \\# (hashtag), or - (dash).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("password")
    private final String password;

    /**
     * A strong password for SaaS administrative user. The password must be a minimum of nine (9)
     * characters and contain a minimum of two (2) uppercase, two (2) lowercase, two (2) numbers,
     * and two (2) special characters from _ (underscore), \\# (hashtag), or - (dash).
     *
     * @return the value
     */
    public String getPassword() {
        return password;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Oracle Cloud Infrastructure
     * [secret](https://docs.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretId")
    private final String secretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Oracle Cloud Infrastructure
     * [secret](https://docs.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
     *
     * @return the value
     */
    public String getSecretId() {
        return secretId;
    }

    /**
     * The version of the vault secret. If no version is specified, the latest version will be used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretVersionNumber")
    private final Integer secretVersionNumber;

    /**
     * The version of the vault secret. If no version is specified, the latest version will be used.
     *
     * @return the value
     */
    public Integer getSecretVersionNumber() {
        return secretVersionNumber;
    }

    /**
     * How long, in hours, the SaaS administrative user will stay enabled. If no duration is
     * specified, the default value 1 will be used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("duration")
    private final Integer duration;

    /**
     * How long, in hours, the SaaS administrative user will stay enabled. If no duration is
     * specified, the default value 1 will be used.
     *
     * @return the value
     */
    public Integer getDuration() {
        return duration;
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
        ;

        private final String value;
        private static java.util.Map<String, AccessType> map;

        static {
            map = new java.util.HashMap<>();
            for (AccessType v : AccessType.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid AccessType: " + key);
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
        sb.append("ConfigureSaasAdminUserDetails(");
        sb.append("super=").append(super.toString());
        sb.append("password=").append(String.valueOf(this.password));
        sb.append(", secretId=").append(String.valueOf(this.secretId));
        sb.append(", secretVersionNumber=").append(String.valueOf(this.secretVersionNumber));
        sb.append(", duration=").append(String.valueOf(this.duration));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
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
        if (!(o instanceof ConfigureSaasAdminUserDetails)) {
            return false;
        }

        ConfigureSaasAdminUserDetails other = (ConfigureSaasAdminUserDetails) o;
        return java.util.Objects.equals(this.password, other.password)
                && java.util.Objects.equals(this.secretId, other.secretId)
                && java.util.Objects.equals(this.secretVersionNumber, other.secretVersionNumber)
                && java.util.Objects.equals(this.duration, other.duration)
                && java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.accessType, other.accessType)
                && java.util.Objects.equals(
                        this.timeSaasAdminUserEnabled, other.timeSaasAdminUserEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.password == null ? 43 : this.password.hashCode());
        result = (result * PRIME) + (this.secretId == null ? 43 : this.secretId.hashCode());
        result =
                (result * PRIME)
                        + (this.secretVersionNumber == null
                                ? 43
                                : this.secretVersionNumber.hashCode());
        result = (result * PRIME) + (this.duration == null ? 43 : this.duration.hashCode());
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
