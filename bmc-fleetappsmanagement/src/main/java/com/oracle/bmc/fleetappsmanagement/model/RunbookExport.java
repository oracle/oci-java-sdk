/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Runbook Export Status check details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RunbookExport.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RunbookExport extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "trackingId",
        "runbookId",
        "runbookName",
        "runbookVersion",
        "status",
        "details"
    })
    public RunbookExport(
            String trackingId,
            String runbookId,
            String runbookName,
            String runbookVersion,
            String status,
            java.util.Map<String, String> details) {
        super();
        this.trackingId = trackingId;
        this.runbookId = runbookId;
        this.runbookName = runbookName;
        this.runbookVersion = runbookVersion;
        this.status = status;
        this.details = details;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Tracking Id. */
        @com.fasterxml.jackson.annotation.JsonProperty("trackingId")
        private String trackingId;

        /**
         * Tracking Id.
         *
         * @param trackingId the value to set
         * @return this builder
         */
        public Builder trackingId(String trackingId) {
            this.trackingId = trackingId;
            this.__explicitlySet__.add("trackingId");
            return this;
        }
        /** The OCID of the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("runbookId")
        private String runbookId;

        /**
         * The OCID of the resource.
         *
         * @param runbookId the value to set
         * @return this builder
         */
        public Builder runbookId(String runbookId) {
            this.runbookId = runbookId;
            this.__explicitlySet__.add("runbookId");
            return this;
        }
        /** Runbook name. */
        @com.fasterxml.jackson.annotation.JsonProperty("runbookName")
        private String runbookName;

        /**
         * Runbook name.
         *
         * @param runbookName the value to set
         * @return this builder
         */
        public Builder runbookName(String runbookName) {
            this.runbookName = runbookName;
            this.__explicitlySet__.add("runbookName");
            return this;
        }
        /** Runbook version. */
        @com.fasterxml.jackson.annotation.JsonProperty("runbookVersion")
        private String runbookVersion;

        /**
         * Runbook version.
         *
         * @param runbookVersion the value to set
         * @return this builder
         */
        public Builder runbookVersion(String runbookVersion) {
            this.runbookVersion = runbookVersion;
            this.__explicitlySet__.add("runbookVersion");
            return this;
        }
        /** Status. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private String status;

        /**
         * Status.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(String status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** Map of details */
        @com.fasterxml.jackson.annotation.JsonProperty("details")
        private java.util.Map<String, String> details;

        /**
         * Map of details
         *
         * @param details the value to set
         * @return this builder
         */
        public Builder details(java.util.Map<String, String> details) {
            this.details = details;
            this.__explicitlySet__.add("details");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RunbookExport build() {
            RunbookExport model =
                    new RunbookExport(
                            this.trackingId,
                            this.runbookId,
                            this.runbookName,
                            this.runbookVersion,
                            this.status,
                            this.details);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RunbookExport model) {
            if (model.wasPropertyExplicitlySet("trackingId")) {
                this.trackingId(model.getTrackingId());
            }
            if (model.wasPropertyExplicitlySet("runbookId")) {
                this.runbookId(model.getRunbookId());
            }
            if (model.wasPropertyExplicitlySet("runbookName")) {
                this.runbookName(model.getRunbookName());
            }
            if (model.wasPropertyExplicitlySet("runbookVersion")) {
                this.runbookVersion(model.getRunbookVersion());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("details")) {
                this.details(model.getDetails());
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

    /** Tracking Id. */
    @com.fasterxml.jackson.annotation.JsonProperty("trackingId")
    private final String trackingId;

    /**
     * Tracking Id.
     *
     * @return the value
     */
    public String getTrackingId() {
        return trackingId;
    }

    /** The OCID of the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("runbookId")
    private final String runbookId;

    /**
     * The OCID of the resource.
     *
     * @return the value
     */
    public String getRunbookId() {
        return runbookId;
    }

    /** Runbook name. */
    @com.fasterxml.jackson.annotation.JsonProperty("runbookName")
    private final String runbookName;

    /**
     * Runbook name.
     *
     * @return the value
     */
    public String getRunbookName() {
        return runbookName;
    }

    /** Runbook version. */
    @com.fasterxml.jackson.annotation.JsonProperty("runbookVersion")
    private final String runbookVersion;

    /**
     * Runbook version.
     *
     * @return the value
     */
    public String getRunbookVersion() {
        return runbookVersion;
    }

    /** Status. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final String status;

    /**
     * Status.
     *
     * @return the value
     */
    public String getStatus() {
        return status;
    }

    /** Map of details */
    @com.fasterxml.jackson.annotation.JsonProperty("details")
    private final java.util.Map<String, String> details;

    /**
     * Map of details
     *
     * @return the value
     */
    public java.util.Map<String, String> getDetails() {
        return details;
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
        sb.append("RunbookExport(");
        sb.append("super=").append(super.toString());
        sb.append("trackingId=").append(String.valueOf(this.trackingId));
        sb.append(", runbookId=").append(String.valueOf(this.runbookId));
        sb.append(", runbookName=").append(String.valueOf(this.runbookName));
        sb.append(", runbookVersion=").append(String.valueOf(this.runbookVersion));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", details=").append(String.valueOf(this.details));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RunbookExport)) {
            return false;
        }

        RunbookExport other = (RunbookExport) o;
        return java.util.Objects.equals(this.trackingId, other.trackingId)
                && java.util.Objects.equals(this.runbookId, other.runbookId)
                && java.util.Objects.equals(this.runbookName, other.runbookName)
                && java.util.Objects.equals(this.runbookVersion, other.runbookVersion)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.details, other.details)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.trackingId == null ? 43 : this.trackingId.hashCode());
        result = (result * PRIME) + (this.runbookId == null ? 43 : this.runbookId.hashCode());
        result = (result * PRIME) + (this.runbookName == null ? 43 : this.runbookName.hashCode());
        result =
                (result * PRIME)
                        + (this.runbookVersion == null ? 43 : this.runbookVersion.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.details == null ? 43 : this.details.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
