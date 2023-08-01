/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * The result of the endpoint configuration validation <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ValidateEndpointResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ValidateEndpointResult
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"status", "statusDescription", "validationResults"})
    public ValidateEndpointResult(
            String status,
            String statusDescription,
            java.util.List<EndpointResult> validationResults) {
        super();
        this.status = status;
        this.statusDescription = statusDescription;
        this.validationResults = validationResults;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The validation status. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private String status;

        /**
         * The validation status.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(String status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** The validation status description. */
        @com.fasterxml.jackson.annotation.JsonProperty("statusDescription")
        private String statusDescription;

        /**
         * The validation status description.
         *
         * @param statusDescription the value to set
         * @return this builder
         */
        public Builder statusDescription(String statusDescription) {
            this.statusDescription = statusDescription;
            this.__explicitlySet__.add("statusDescription");
            return this;
        }
        /** Validation results for each specified endpoint. */
        @com.fasterxml.jackson.annotation.JsonProperty("validationResults")
        private java.util.List<EndpointResult> validationResults;

        /**
         * Validation results for each specified endpoint.
         *
         * @param validationResults the value to set
         * @return this builder
         */
        public Builder validationResults(java.util.List<EndpointResult> validationResults) {
            this.validationResults = validationResults;
            this.__explicitlySet__.add("validationResults");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ValidateEndpointResult build() {
            ValidateEndpointResult model =
                    new ValidateEndpointResult(
                            this.status, this.statusDescription, this.validationResults);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ValidateEndpointResult model) {
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("statusDescription")) {
                this.statusDescription(model.getStatusDescription());
            }
            if (model.wasPropertyExplicitlySet("validationResults")) {
                this.validationResults(model.getValidationResults());
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

    /** The validation status. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final String status;

    /**
     * The validation status.
     *
     * @return the value
     */
    public String getStatus() {
        return status;
    }

    /** The validation status description. */
    @com.fasterxml.jackson.annotation.JsonProperty("statusDescription")
    private final String statusDescription;

    /**
     * The validation status description.
     *
     * @return the value
     */
    public String getStatusDescription() {
        return statusDescription;
    }

    /** Validation results for each specified endpoint. */
    @com.fasterxml.jackson.annotation.JsonProperty("validationResults")
    private final java.util.List<EndpointResult> validationResults;

    /**
     * Validation results for each specified endpoint.
     *
     * @return the value
     */
    public java.util.List<EndpointResult> getValidationResults() {
        return validationResults;
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
        sb.append("ValidateEndpointResult(");
        sb.append("super=").append(super.toString());
        sb.append("status=").append(String.valueOf(this.status));
        sb.append(", statusDescription=").append(String.valueOf(this.statusDescription));
        sb.append(", validationResults=").append(String.valueOf(this.validationResults));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ValidateEndpointResult)) {
            return false;
        }

        ValidateEndpointResult other = (ValidateEndpointResult) o;
        return java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.statusDescription, other.statusDescription)
                && java.util.Objects.equals(this.validationResults, other.validationResults)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.statusDescription == null ? 43 : this.statusDescription.hashCode());
        result =
                (result * PRIME)
                        + (this.validationResults == null ? 43 : this.validationResults.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
