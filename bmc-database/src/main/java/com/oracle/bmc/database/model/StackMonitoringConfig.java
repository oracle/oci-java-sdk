/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The configuration of Stack Monitoring for the external database. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = StackMonitoringConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class StackMonitoringConfig
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"stackMonitoringStatus", "stackMonitoringConnectorId"})
    public StackMonitoringConfig(
            StackMonitoringStatus stackMonitoringStatus, String stackMonitoringConnectorId) {
        super();
        this.stackMonitoringStatus = stackMonitoringStatus;
        this.stackMonitoringConnectorId = stackMonitoringConnectorId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The status of Stack Monitoring. */
        @com.fasterxml.jackson.annotation.JsonProperty("stackMonitoringStatus")
        private StackMonitoringStatus stackMonitoringStatus;

        /**
         * The status of Stack Monitoring.
         *
         * @param stackMonitoringStatus the value to set
         * @return this builder
         */
        public Builder stackMonitoringStatus(StackMonitoringStatus stackMonitoringStatus) {
            this.stackMonitoringStatus = stackMonitoringStatus;
            this.__explicitlySet__.add("stackMonitoringStatus");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * {@link
         * #createExternalDatabaseConnectorDetails(CreateExternalDatabaseConnectorDetailsRequest)
         * createExternalDatabaseConnectorDetails}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("stackMonitoringConnectorId")
        private String stackMonitoringConnectorId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * {@link
         * #createExternalDatabaseConnectorDetails(CreateExternalDatabaseConnectorDetailsRequest)
         * createExternalDatabaseConnectorDetails}.
         *
         * @param stackMonitoringConnectorId the value to set
         * @return this builder
         */
        public Builder stackMonitoringConnectorId(String stackMonitoringConnectorId) {
            this.stackMonitoringConnectorId = stackMonitoringConnectorId;
            this.__explicitlySet__.add("stackMonitoringConnectorId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StackMonitoringConfig build() {
            StackMonitoringConfig model =
                    new StackMonitoringConfig(
                            this.stackMonitoringStatus, this.stackMonitoringConnectorId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StackMonitoringConfig model) {
            if (model.wasPropertyExplicitlySet("stackMonitoringStatus")) {
                this.stackMonitoringStatus(model.getStackMonitoringStatus());
            }
            if (model.wasPropertyExplicitlySet("stackMonitoringConnectorId")) {
                this.stackMonitoringConnectorId(model.getStackMonitoringConnectorId());
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

    /** The status of Stack Monitoring. */
    public enum StackMonitoringStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Enabling("ENABLING"),
        Enabled("ENABLED"),
        Disabling("DISABLING"),
        NotEnabled("NOT_ENABLED"),
        FailedEnabling("FAILED_ENABLING"),
        FailedDisabling("FAILED_DISABLING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(StackMonitoringStatus.class);

        private final String value;
        private static java.util.Map<String, StackMonitoringStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (StackMonitoringStatus v : StackMonitoringStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        StackMonitoringStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static StackMonitoringStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'StackMonitoringStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The status of Stack Monitoring. */
    @com.fasterxml.jackson.annotation.JsonProperty("stackMonitoringStatus")
    private final StackMonitoringStatus stackMonitoringStatus;

    /**
     * The status of Stack Monitoring.
     *
     * @return the value
     */
    public StackMonitoringStatus getStackMonitoringStatus() {
        return stackMonitoringStatus;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * {@link #createExternalDatabaseConnectorDetails(CreateExternalDatabaseConnectorDetailsRequest)
     * createExternalDatabaseConnectorDetails}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("stackMonitoringConnectorId")
    private final String stackMonitoringConnectorId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * {@link #createExternalDatabaseConnectorDetails(CreateExternalDatabaseConnectorDetailsRequest)
     * createExternalDatabaseConnectorDetails}.
     *
     * @return the value
     */
    public String getStackMonitoringConnectorId() {
        return stackMonitoringConnectorId;
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
        sb.append("StackMonitoringConfig(");
        sb.append("super=").append(super.toString());
        sb.append("stackMonitoringStatus=").append(String.valueOf(this.stackMonitoringStatus));
        sb.append(", stackMonitoringConnectorId=")
                .append(String.valueOf(this.stackMonitoringConnectorId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StackMonitoringConfig)) {
            return false;
        }

        StackMonitoringConfig other = (StackMonitoringConfig) o;
        return java.util.Objects.equals(this.stackMonitoringStatus, other.stackMonitoringStatus)
                && java.util.Objects.equals(
                        this.stackMonitoringConnectorId, other.stackMonitoringConnectorId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.stackMonitoringStatus == null
                                ? 43
                                : this.stackMonitoringStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.stackMonitoringConnectorId == null
                                ? 43
                                : this.stackMonitoringConnectorId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
