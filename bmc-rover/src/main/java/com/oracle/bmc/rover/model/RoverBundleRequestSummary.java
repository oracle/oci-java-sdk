/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.rover.model;

/**
 * Summary of the RoverBundleRequest <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201210")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RoverBundleRequestSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RoverBundleRequestSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "destinationCompartmentId",
        "destinationBucketName",
        "bundleVersion",
        "workRequestId",
        "timeTaskCreated"
    })
    public RoverBundleRequestSummary(
            String id,
            String destinationCompartmentId,
            String destinationBucketName,
            String bundleVersion,
            String workRequestId,
            java.util.Date timeTaskCreated) {
        super();
        this.id = id;
        this.destinationCompartmentId = destinationCompartmentId;
        this.destinationBucketName = destinationBucketName;
        this.bundleVersion = bundleVersion;
        this.workRequestId = workRequestId;
        this.timeTaskCreated = timeTaskCreated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The unique identifier of roverBundleRequest. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The unique identifier of roverBundleRequest.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The OCID of destination compartment that the bundle will be copied to. */
        @com.fasterxml.jackson.annotation.JsonProperty("destinationCompartmentId")
        private String destinationCompartmentId;

        /**
         * The OCID of destination compartment that the bundle will be copied to.
         *
         * @param destinationCompartmentId the value to set
         * @return this builder
         */
        public Builder destinationCompartmentId(String destinationCompartmentId) {
            this.destinationCompartmentId = destinationCompartmentId;
            this.__explicitlySet__.add("destinationCompartmentId");
            return this;
        }
        /** The destination bucket name the bundle will be copied to. */
        @com.fasterxml.jackson.annotation.JsonProperty("destinationBucketName")
        private String destinationBucketName;

        /**
         * The destination bucket name the bundle will be copied to.
         *
         * @param destinationBucketName the value to set
         * @return this builder
         */
        public Builder destinationBucketName(String destinationBucketName) {
            this.destinationBucketName = destinationBucketName;
            this.__explicitlySet__.add("destinationBucketName");
            return this;
        }
        /** The bundle version that customer wants to upgrade to. */
        @com.fasterxml.jackson.annotation.JsonProperty("bundleVersion")
        private String bundleVersion;

        /**
         * The bundle version that customer wants to upgrade to.
         *
         * @param bundleVersion the value to set
         * @return this builder
         */
        public Builder bundleVersion(String bundleVersion) {
            this.bundleVersion = bundleVersion;
            this.__explicitlySet__.add("bundleVersion");
            return this;
        }
        /** The work request id for an async copyObject operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("workRequestId")
        private String workRequestId;

        /**
         * The work request id for an async copyObject operation.
         *
         * @param workRequestId the value to set
         * @return this builder
         */
        public Builder workRequestId(String workRequestId) {
            this.workRequestId = workRequestId;
            this.__explicitlySet__.add("workRequestId");
            return this;
        }
        /** The time of the task was created. An RFC3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeTaskCreated")
        private java.util.Date timeTaskCreated;

        /**
         * The time of the task was created. An RFC3339 formatted datetime string.
         *
         * @param timeTaskCreated the value to set
         * @return this builder
         */
        public Builder timeTaskCreated(java.util.Date timeTaskCreated) {
            this.timeTaskCreated = timeTaskCreated;
            this.__explicitlySet__.add("timeTaskCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RoverBundleRequestSummary build() {
            RoverBundleRequestSummary model =
                    new RoverBundleRequestSummary(
                            this.id,
                            this.destinationCompartmentId,
                            this.destinationBucketName,
                            this.bundleVersion,
                            this.workRequestId,
                            this.timeTaskCreated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RoverBundleRequestSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("destinationCompartmentId")) {
                this.destinationCompartmentId(model.getDestinationCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("destinationBucketName")) {
                this.destinationBucketName(model.getDestinationBucketName());
            }
            if (model.wasPropertyExplicitlySet("bundleVersion")) {
                this.bundleVersion(model.getBundleVersion());
            }
            if (model.wasPropertyExplicitlySet("workRequestId")) {
                this.workRequestId(model.getWorkRequestId());
            }
            if (model.wasPropertyExplicitlySet("timeTaskCreated")) {
                this.timeTaskCreated(model.getTimeTaskCreated());
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

    /** The unique identifier of roverBundleRequest. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The unique identifier of roverBundleRequest.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The OCID of destination compartment that the bundle will be copied to. */
    @com.fasterxml.jackson.annotation.JsonProperty("destinationCompartmentId")
    private final String destinationCompartmentId;

    /**
     * The OCID of destination compartment that the bundle will be copied to.
     *
     * @return the value
     */
    public String getDestinationCompartmentId() {
        return destinationCompartmentId;
    }

    /** The destination bucket name the bundle will be copied to. */
    @com.fasterxml.jackson.annotation.JsonProperty("destinationBucketName")
    private final String destinationBucketName;

    /**
     * The destination bucket name the bundle will be copied to.
     *
     * @return the value
     */
    public String getDestinationBucketName() {
        return destinationBucketName;
    }

    /** The bundle version that customer wants to upgrade to. */
    @com.fasterxml.jackson.annotation.JsonProperty("bundleVersion")
    private final String bundleVersion;

    /**
     * The bundle version that customer wants to upgrade to.
     *
     * @return the value
     */
    public String getBundleVersion() {
        return bundleVersion;
    }

    /** The work request id for an async copyObject operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("workRequestId")
    private final String workRequestId;

    /**
     * The work request id for an async copyObject operation.
     *
     * @return the value
     */
    public String getWorkRequestId() {
        return workRequestId;
    }

    /** The time of the task was created. An RFC3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeTaskCreated")
    private final java.util.Date timeTaskCreated;

    /**
     * The time of the task was created. An RFC3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeTaskCreated() {
        return timeTaskCreated;
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
        sb.append("RoverBundleRequestSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", destinationCompartmentId=")
                .append(String.valueOf(this.destinationCompartmentId));
        sb.append(", destinationBucketName=").append(String.valueOf(this.destinationBucketName));
        sb.append(", bundleVersion=").append(String.valueOf(this.bundleVersion));
        sb.append(", workRequestId=").append(String.valueOf(this.workRequestId));
        sb.append(", timeTaskCreated=").append(String.valueOf(this.timeTaskCreated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RoverBundleRequestSummary)) {
            return false;
        }

        RoverBundleRequestSummary other = (RoverBundleRequestSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(
                        this.destinationCompartmentId, other.destinationCompartmentId)
                && java.util.Objects.equals(this.destinationBucketName, other.destinationBucketName)
                && java.util.Objects.equals(this.bundleVersion, other.bundleVersion)
                && java.util.Objects.equals(this.workRequestId, other.workRequestId)
                && java.util.Objects.equals(this.timeTaskCreated, other.timeTaskCreated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationCompartmentId == null
                                ? 43
                                : this.destinationCompartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationBucketName == null
                                ? 43
                                : this.destinationBucketName.hashCode());
        result =
                (result * PRIME)
                        + (this.bundleVersion == null ? 43 : this.bundleVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.workRequestId == null ? 43 : this.workRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.timeTaskCreated == null ? 43 : this.timeTaskCreated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
