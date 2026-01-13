/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * The task details with Java server scan related information. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ScanJavaServerTaskDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "taskType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ScanJavaServerTaskDetails extends TaskDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("scanJavaServerTaskRequest")
        private ScanJavaServerUsageDetails scanJavaServerTaskRequest;

        public Builder scanJavaServerTaskRequest(
                ScanJavaServerUsageDetails scanJavaServerTaskRequest) {
            this.scanJavaServerTaskRequest = scanJavaServerTaskRequest;
            this.__explicitlySet__.add("scanJavaServerTaskRequest");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ScanJavaServerTaskDetails build() {
            ScanJavaServerTaskDetails model =
                    new ScanJavaServerTaskDetails(this.scanJavaServerTaskRequest);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScanJavaServerTaskDetails model) {
            if (model.wasPropertyExplicitlySet("scanJavaServerTaskRequest")) {
                this.scanJavaServerTaskRequest(model.getScanJavaServerTaskRequest());
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

    @Deprecated
    public ScanJavaServerTaskDetails(ScanJavaServerUsageDetails scanJavaServerTaskRequest) {
        super();
        this.scanJavaServerTaskRequest = scanJavaServerTaskRequest;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("scanJavaServerTaskRequest")
    private final ScanJavaServerUsageDetails scanJavaServerTaskRequest;

    public ScanJavaServerUsageDetails getScanJavaServerTaskRequest() {
        return scanJavaServerTaskRequest;
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
        sb.append("ScanJavaServerTaskDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", scanJavaServerTaskRequest=")
                .append(String.valueOf(this.scanJavaServerTaskRequest));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScanJavaServerTaskDetails)) {
            return false;
        }

        ScanJavaServerTaskDetails other = (ScanJavaServerTaskDetails) o;
        return java.util.Objects.equals(
                        this.scanJavaServerTaskRequest, other.scanJavaServerTaskRequest)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.scanJavaServerTaskRequest == null
                                ? 43
                                : this.scanJavaServerTaskRequest.hashCode());
        return result;
    }
}
