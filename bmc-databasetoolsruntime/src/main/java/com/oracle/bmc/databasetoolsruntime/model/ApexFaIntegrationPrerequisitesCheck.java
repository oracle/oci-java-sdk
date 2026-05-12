/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetoolsruntime.model;

/**
 * The results of a prerequisites check for APEX FA integration <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ApexFaIntegrationPrerequisitesCheck.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ApexFaIntegrationPrerequisitesCheck
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"status", "statusDetails"})
    public ApexFaIntegrationPrerequisitesCheck(
            Status status, java.util.List<String> statusDetails) {
        super();
        this.status = status;
        this.statusDetails = statusDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Status indicating the outcome of the prerequisites check. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * Status indicating the outcome of the prerequisites check.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * Messages describing the prerequisites check outcome. Messages can provide actionable
         * information when the status indicates a failure.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("statusDetails")
        private java.util.List<String> statusDetails;

        /**
         * Messages describing the prerequisites check outcome. Messages can provide actionable
         * information when the status indicates a failure.
         *
         * @param statusDetails the value to set
         * @return this builder
         */
        public Builder statusDetails(java.util.List<String> statusDetails) {
            this.statusDetails = statusDetails;
            this.__explicitlySet__.add("statusDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApexFaIntegrationPrerequisitesCheck build() {
            ApexFaIntegrationPrerequisitesCheck model =
                    new ApexFaIntegrationPrerequisitesCheck(this.status, this.statusDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApexFaIntegrationPrerequisitesCheck model) {
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("statusDetails")) {
                this.statusDetails(model.getStatusDetails());
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

    /** Status indicating the outcome of the prerequisites check. */
    public enum Status implements com.oracle.bmc.http.internal.BmcEnum {
        Pass("PASS"),
        Fail("FAIL"),
        Error("ERROR"),
        Unknown("UNKNOWN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Status indicating the outcome of the prerequisites check. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * Status indicating the outcome of the prerequisites check.
     *
     * @return the value
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Messages describing the prerequisites check outcome. Messages can provide actionable
     * information when the status indicates a failure.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("statusDetails")
    private final java.util.List<String> statusDetails;

    /**
     * Messages describing the prerequisites check outcome. Messages can provide actionable
     * information when the status indicates a failure.
     *
     * @return the value
     */
    public java.util.List<String> getStatusDetails() {
        return statusDetails;
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
        sb.append("ApexFaIntegrationPrerequisitesCheck(");
        sb.append("super=").append(super.toString());
        sb.append("status=").append(String.valueOf(this.status));
        sb.append(", statusDetails=").append(String.valueOf(this.statusDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ApexFaIntegrationPrerequisitesCheck)) {
            return false;
        }

        ApexFaIntegrationPrerequisitesCheck other = (ApexFaIntegrationPrerequisitesCheck) o;
        return java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.statusDetails, other.statusDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.statusDetails == null ? 43 : this.statusDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
