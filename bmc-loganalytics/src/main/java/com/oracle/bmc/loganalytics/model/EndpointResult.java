/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * The validation status of a specified endpoint. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = EndpointResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class EndpointResult
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "endpointName",
        "url",
        "status",
        "violations",
        "logEndpoints"
    })
    public EndpointResult(
            String endpointName,
            String url,
            String status,
            java.util.List<Violation> violations,
            java.util.List<String> logEndpoints) {
        super();
        this.endpointName = endpointName;
        this.url = url;
        this.status = status;
        this.violations = violations;
        this.logEndpoints = logEndpoints;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The endpoint name. */
        @com.fasterxml.jackson.annotation.JsonProperty("endpointName")
        private String endpointName;

        /**
         * The endpoint name.
         *
         * @param endpointName the value to set
         * @return this builder
         */
        public Builder endpointName(String endpointName) {
            this.endpointName = endpointName;
            this.__explicitlySet__.add("endpointName");
            return this;
        }
        /** The endpoint URL. */
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;

        /**
         * The endpoint URL.
         *
         * @param url the value to set
         * @return this builder
         */
        public Builder url(String url) {
            this.url = url;
            this.__explicitlySet__.add("url");
            return this;
        }
        /** The endpoint validation status. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private String status;

        /**
         * The endpoint validation status.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(String status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** The list of violations (if any). */
        @com.fasterxml.jackson.annotation.JsonProperty("violations")
        private java.util.List<Violation> violations;

        /**
         * The list of violations (if any).
         *
         * @param violations the value to set
         * @return this builder
         */
        public Builder violations(java.util.List<Violation> violations) {
            this.violations = violations;
            this.__explicitlySet__.add("violations");
            return this;
        }
        /** The resolved log endpoints based on the specified list endpoint response. */
        @com.fasterxml.jackson.annotation.JsonProperty("logEndpoints")
        private java.util.List<String> logEndpoints;

        /**
         * The resolved log endpoints based on the specified list endpoint response.
         *
         * @param logEndpoints the value to set
         * @return this builder
         */
        public Builder logEndpoints(java.util.List<String> logEndpoints) {
            this.logEndpoints = logEndpoints;
            this.__explicitlySet__.add("logEndpoints");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EndpointResult build() {
            EndpointResult model =
                    new EndpointResult(
                            this.endpointName,
                            this.url,
                            this.status,
                            this.violations,
                            this.logEndpoints);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EndpointResult model) {
            if (model.wasPropertyExplicitlySet("endpointName")) {
                this.endpointName(model.getEndpointName());
            }
            if (model.wasPropertyExplicitlySet("url")) {
                this.url(model.getUrl());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("violations")) {
                this.violations(model.getViolations());
            }
            if (model.wasPropertyExplicitlySet("logEndpoints")) {
                this.logEndpoints(model.getLogEndpoints());
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

    /** The endpoint name. */
    @com.fasterxml.jackson.annotation.JsonProperty("endpointName")
    private final String endpointName;

    /**
     * The endpoint name.
     *
     * @return the value
     */
    public String getEndpointName() {
        return endpointName;
    }

    /** The endpoint URL. */
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    private final String url;

    /**
     * The endpoint URL.
     *
     * @return the value
     */
    public String getUrl() {
        return url;
    }

    /** The endpoint validation status. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final String status;

    /**
     * The endpoint validation status.
     *
     * @return the value
     */
    public String getStatus() {
        return status;
    }

    /** The list of violations (if any). */
    @com.fasterxml.jackson.annotation.JsonProperty("violations")
    private final java.util.List<Violation> violations;

    /**
     * The list of violations (if any).
     *
     * @return the value
     */
    public java.util.List<Violation> getViolations() {
        return violations;
    }

    /** The resolved log endpoints based on the specified list endpoint response. */
    @com.fasterxml.jackson.annotation.JsonProperty("logEndpoints")
    private final java.util.List<String> logEndpoints;

    /**
     * The resolved log endpoints based on the specified list endpoint response.
     *
     * @return the value
     */
    public java.util.List<String> getLogEndpoints() {
        return logEndpoints;
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
        sb.append("EndpointResult(");
        sb.append("super=").append(super.toString());
        sb.append("endpointName=").append(String.valueOf(this.endpointName));
        sb.append(", url=").append(String.valueOf(this.url));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", violations=").append(String.valueOf(this.violations));
        sb.append(", logEndpoints=").append(String.valueOf(this.logEndpoints));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EndpointResult)) {
            return false;
        }

        EndpointResult other = (EndpointResult) o;
        return java.util.Objects.equals(this.endpointName, other.endpointName)
                && java.util.Objects.equals(this.url, other.url)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.violations, other.violations)
                && java.util.Objects.equals(this.logEndpoints, other.logEndpoints)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.endpointName == null ? 43 : this.endpointName.hashCode());
        result = (result * PRIME) + (this.url == null ? 43 : this.url.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.violations == null ? 43 : this.violations.hashCode());
        result = (result * PRIME) + (this.logEndpoints == null ? 43 : this.logEndpoints.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
