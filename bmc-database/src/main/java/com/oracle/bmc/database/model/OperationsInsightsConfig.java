/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The configuration of Operations Insights for the external database <br>
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
        builder = OperationsInsightsConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OperationsInsightsConfig
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"operationsInsightsStatus", "operationsInsightsConnectorId"})
    public OperationsInsightsConfig(
            OperationsInsightsStatus operationsInsightsStatus,
            String operationsInsightsConnectorId) {
        super();
        this.operationsInsightsStatus = operationsInsightsStatus;
        this.operationsInsightsConnectorId = operationsInsightsConnectorId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The status of Operations Insights */
        @com.fasterxml.jackson.annotation.JsonProperty("operationsInsightsStatus")
        private OperationsInsightsStatus operationsInsightsStatus;

        /**
         * The status of Operations Insights
         *
         * @param operationsInsightsStatus the value to set
         * @return this builder
         */
        public Builder operationsInsightsStatus(OperationsInsightsStatus operationsInsightsStatus) {
            this.operationsInsightsStatus = operationsInsightsStatus;
            this.__explicitlySet__.add("operationsInsightsStatus");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * {@link
         * #createExternalDatabaseConnectorDetails(CreateExternalDatabaseConnectorDetailsRequest)
         * createExternalDatabaseConnectorDetails}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("operationsInsightsConnectorId")
        private String operationsInsightsConnectorId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * {@link
         * #createExternalDatabaseConnectorDetails(CreateExternalDatabaseConnectorDetailsRequest)
         * createExternalDatabaseConnectorDetails}.
         *
         * @param operationsInsightsConnectorId the value to set
         * @return this builder
         */
        public Builder operationsInsightsConnectorId(String operationsInsightsConnectorId) {
            this.operationsInsightsConnectorId = operationsInsightsConnectorId;
            this.__explicitlySet__.add("operationsInsightsConnectorId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OperationsInsightsConfig build() {
            OperationsInsightsConfig model =
                    new OperationsInsightsConfig(
                            this.operationsInsightsStatus, this.operationsInsightsConnectorId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OperationsInsightsConfig model) {
            if (model.wasPropertyExplicitlySet("operationsInsightsStatus")) {
                this.operationsInsightsStatus(model.getOperationsInsightsStatus());
            }
            if (model.wasPropertyExplicitlySet("operationsInsightsConnectorId")) {
                this.operationsInsightsConnectorId(model.getOperationsInsightsConnectorId());
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

    /** The status of Operations Insights */
    public enum OperationsInsightsStatus implements com.oracle.bmc.http.internal.BmcEnum {
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
                org.slf4j.LoggerFactory.getLogger(OperationsInsightsStatus.class);

        private final String value;
        private static java.util.Map<String, OperationsInsightsStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (OperationsInsightsStatus v : OperationsInsightsStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        OperationsInsightsStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OperationsInsightsStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'OperationsInsightsStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The status of Operations Insights */
    @com.fasterxml.jackson.annotation.JsonProperty("operationsInsightsStatus")
    private final OperationsInsightsStatus operationsInsightsStatus;

    /**
     * The status of Operations Insights
     *
     * @return the value
     */
    public OperationsInsightsStatus getOperationsInsightsStatus() {
        return operationsInsightsStatus;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * {@link #createExternalDatabaseConnectorDetails(CreateExternalDatabaseConnectorDetailsRequest)
     * createExternalDatabaseConnectorDetails}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("operationsInsightsConnectorId")
    private final String operationsInsightsConnectorId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * {@link #createExternalDatabaseConnectorDetails(CreateExternalDatabaseConnectorDetailsRequest)
     * createExternalDatabaseConnectorDetails}.
     *
     * @return the value
     */
    public String getOperationsInsightsConnectorId() {
        return operationsInsightsConnectorId;
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
        sb.append("OperationsInsightsConfig(");
        sb.append("super=").append(super.toString());
        sb.append("operationsInsightsStatus=")
                .append(String.valueOf(this.operationsInsightsStatus));
        sb.append(", operationsInsightsConnectorId=")
                .append(String.valueOf(this.operationsInsightsConnectorId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OperationsInsightsConfig)) {
            return false;
        }

        OperationsInsightsConfig other = (OperationsInsightsConfig) o;
        return java.util.Objects.equals(
                        this.operationsInsightsStatus, other.operationsInsightsStatus)
                && java.util.Objects.equals(
                        this.operationsInsightsConnectorId, other.operationsInsightsConnectorId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.operationsInsightsStatus == null
                                ? 43
                                : this.operationsInsightsStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.operationsInsightsConnectorId == null
                                ? 43
                                : this.operationsInsightsConnectorId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
