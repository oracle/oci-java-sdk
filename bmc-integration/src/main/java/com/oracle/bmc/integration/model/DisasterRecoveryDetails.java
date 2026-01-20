/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.integration.model;

/**
 * Disaster recovery details for the integration instance created in the region. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DisasterRecoveryDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DisasterRecoveryDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "role",
        "regionalInstanceUrl",
        "crossRegionIntegrationInstanceDetails"
    })
    public DisasterRecoveryDetails(
            Role role,
            String regionalInstanceUrl,
            CrossRegionIntegrationInstanceDetails crossRegionIntegrationInstanceDetails) {
        super();
        this.role = role;
        this.regionalInstanceUrl = regionalInstanceUrl;
        this.crossRegionIntegrationInstanceDetails = crossRegionIntegrationInstanceDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Role of the integration instance in the region */
        @com.fasterxml.jackson.annotation.JsonProperty("role")
        private Role role;

        /**
         * Role of the integration instance in the region
         *
         * @param role the value to set
         * @return this builder
         */
        public Builder role(Role role) {
            this.role = role;
            this.__explicitlySet__.add("role");
            return this;
        }
        /** Region specific instance url for the integration instance in the region */
        @com.fasterxml.jackson.annotation.JsonProperty("regionalInstanceUrl")
        private String regionalInstanceUrl;

        /**
         * Region specific instance url for the integration instance in the region
         *
         * @param regionalInstanceUrl the value to set
         * @return this builder
         */
        public Builder regionalInstanceUrl(String regionalInstanceUrl) {
            this.regionalInstanceUrl = regionalInstanceUrl;
            this.__explicitlySet__.add("regionalInstanceUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("crossRegionIntegrationInstanceDetails")
        private CrossRegionIntegrationInstanceDetails crossRegionIntegrationInstanceDetails;

        public Builder crossRegionIntegrationInstanceDetails(
                CrossRegionIntegrationInstanceDetails crossRegionIntegrationInstanceDetails) {
            this.crossRegionIntegrationInstanceDetails = crossRegionIntegrationInstanceDetails;
            this.__explicitlySet__.add("crossRegionIntegrationInstanceDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DisasterRecoveryDetails build() {
            DisasterRecoveryDetails model =
                    new DisasterRecoveryDetails(
                            this.role,
                            this.regionalInstanceUrl,
                            this.crossRegionIntegrationInstanceDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DisasterRecoveryDetails model) {
            if (model.wasPropertyExplicitlySet("role")) {
                this.role(model.getRole());
            }
            if (model.wasPropertyExplicitlySet("regionalInstanceUrl")) {
                this.regionalInstanceUrl(model.getRegionalInstanceUrl());
            }
            if (model.wasPropertyExplicitlySet("crossRegionIntegrationInstanceDetails")) {
                this.crossRegionIntegrationInstanceDetails(
                        model.getCrossRegionIntegrationInstanceDetails());
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

    /** Role of the integration instance in the region */
    public enum Role implements com.oracle.bmc.http.internal.BmcEnum {
        Primary("PRIMARY"),
        Secondary("SECONDARY"),
        Unknown("UNKNOWN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Role.class);

        private final String value;
        private static java.util.Map<String, Role> map;

        static {
            map = new java.util.HashMap<>();
            for (Role v : Role.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Role(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Role create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Role', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /** Role of the integration instance in the region */
    @com.fasterxml.jackson.annotation.JsonProperty("role")
    private final Role role;

    /**
     * Role of the integration instance in the region
     *
     * @return the value
     */
    public Role getRole() {
        return role;
    }

    /** Region specific instance url for the integration instance in the region */
    @com.fasterxml.jackson.annotation.JsonProperty("regionalInstanceUrl")
    private final String regionalInstanceUrl;

    /**
     * Region specific instance url for the integration instance in the region
     *
     * @return the value
     */
    public String getRegionalInstanceUrl() {
        return regionalInstanceUrl;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("crossRegionIntegrationInstanceDetails")
    private final CrossRegionIntegrationInstanceDetails crossRegionIntegrationInstanceDetails;

    public CrossRegionIntegrationInstanceDetails getCrossRegionIntegrationInstanceDetails() {
        return crossRegionIntegrationInstanceDetails;
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
        sb.append("DisasterRecoveryDetails(");
        sb.append("super=").append(super.toString());
        sb.append("role=").append(String.valueOf(this.role));
        sb.append(", regionalInstanceUrl=").append(String.valueOf(this.regionalInstanceUrl));
        sb.append(", crossRegionIntegrationInstanceDetails=")
                .append(String.valueOf(this.crossRegionIntegrationInstanceDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DisasterRecoveryDetails)) {
            return false;
        }

        DisasterRecoveryDetails other = (DisasterRecoveryDetails) o;
        return java.util.Objects.equals(this.role, other.role)
                && java.util.Objects.equals(this.regionalInstanceUrl, other.regionalInstanceUrl)
                && java.util.Objects.equals(
                        this.crossRegionIntegrationInstanceDetails,
                        other.crossRegionIntegrationInstanceDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.role == null ? 43 : this.role.hashCode());
        result =
                (result * PRIME)
                        + (this.regionalInstanceUrl == null
                                ? 43
                                : this.regionalInstanceUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.crossRegionIntegrationInstanceDetails == null
                                ? 43
                                : this.crossRegionIntegrationInstanceDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
