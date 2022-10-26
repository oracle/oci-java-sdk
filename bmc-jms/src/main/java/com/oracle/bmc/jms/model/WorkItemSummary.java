/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * The LCM work request for a JVM installation site. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = WorkItemSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class WorkItemSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "workRequestId",
        "installationSite",
        "status",
        "retryCount",
        "timeLastUpdated"
    })
    public WorkItemSummary(
            String id,
            String workRequestId,
            InstallationSite installationSite,
            WorkItemStatus status,
            Integer retryCount,
            java.util.Date timeLastUpdated) {
        super();
        this.id = id;
        this.workRequestId = workRequestId;
        this.installationSite = installationSite;
        this.status = status;
        this.retryCount = retryCount;
        this.timeLastUpdated = timeLastUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The unique ID of ths work item. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The unique ID of ths work item.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The OCID of the work request created this work item. */
        @com.fasterxml.jackson.annotation.JsonProperty("workRequestId")
        private String workRequestId;

        /**
         * The OCID of the work request created this work item.
         *
         * @param workRequestId the value to set
         * @return this builder
         */
        public Builder workRequestId(String workRequestId) {
            this.workRequestId = workRequestId;
            this.__explicitlySet__.add("workRequestId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("installationSite")
        private InstallationSite installationSite;

        public Builder installationSite(InstallationSite installationSite) {
            this.installationSite = installationSite;
            this.__explicitlySet__.add("installationSite");
            return this;
        }
        /** The status of the work item. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private WorkItemStatus status;

        /**
         * The status of the work item.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(WorkItemStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** Number of times this work item is retried. */
        @com.fasterxml.jackson.annotation.JsonProperty("retryCount")
        private Integer retryCount;

        /**
         * Number of times this work item is retried.
         *
         * @param retryCount the value to set
         * @return this builder
         */
        public Builder retryCount(Integer retryCount) {
            this.retryCount = retryCount;
            this.__explicitlySet__.add("retryCount");
            return this;
        }
        /**
         * The date and time the work item was last updated. (formatted according to
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastUpdated")
        private java.util.Date timeLastUpdated;

        /**
         * The date and time the work item was last updated. (formatted according to
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         *
         * @param timeLastUpdated the value to set
         * @return this builder
         */
        public Builder timeLastUpdated(java.util.Date timeLastUpdated) {
            this.timeLastUpdated = timeLastUpdated;
            this.__explicitlySet__.add("timeLastUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WorkItemSummary build() {
            WorkItemSummary model =
                    new WorkItemSummary(
                            this.id,
                            this.workRequestId,
                            this.installationSite,
                            this.status,
                            this.retryCount,
                            this.timeLastUpdated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WorkItemSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("workRequestId")) {
                this.workRequestId(model.getWorkRequestId());
            }
            if (model.wasPropertyExplicitlySet("installationSite")) {
                this.installationSite(model.getInstallationSite());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("retryCount")) {
                this.retryCount(model.getRetryCount());
            }
            if (model.wasPropertyExplicitlySet("timeLastUpdated")) {
                this.timeLastUpdated(model.getTimeLastUpdated());
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

    /** The unique ID of ths work item. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The unique ID of ths work item.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The OCID of the work request created this work item. */
    @com.fasterxml.jackson.annotation.JsonProperty("workRequestId")
    private final String workRequestId;

    /**
     * The OCID of the work request created this work item.
     *
     * @return the value
     */
    public String getWorkRequestId() {
        return workRequestId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("installationSite")
    private final InstallationSite installationSite;

    public InstallationSite getInstallationSite() {
        return installationSite;
    }

    /** The status of the work item. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final WorkItemStatus status;

    /**
     * The status of the work item.
     *
     * @return the value
     */
    public WorkItemStatus getStatus() {
        return status;
    }

    /** Number of times this work item is retried. */
    @com.fasterxml.jackson.annotation.JsonProperty("retryCount")
    private final Integer retryCount;

    /**
     * Number of times this work item is retried.
     *
     * @return the value
     */
    public Integer getRetryCount() {
        return retryCount;
    }

    /**
     * The date and time the work item was last updated. (formatted according to
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastUpdated")
    private final java.util.Date timeLastUpdated;

    /**
     * The date and time the work item was last updated. (formatted according to
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     *
     * @return the value
     */
    public java.util.Date getTimeLastUpdated() {
        return timeLastUpdated;
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
        sb.append("WorkItemSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", workRequestId=").append(String.valueOf(this.workRequestId));
        sb.append(", installationSite=").append(String.valueOf(this.installationSite));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", retryCount=").append(String.valueOf(this.retryCount));
        sb.append(", timeLastUpdated=").append(String.valueOf(this.timeLastUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WorkItemSummary)) {
            return false;
        }

        WorkItemSummary other = (WorkItemSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.workRequestId, other.workRequestId)
                && java.util.Objects.equals(this.installationSite, other.installationSite)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.retryCount, other.retryCount)
                && java.util.Objects.equals(this.timeLastUpdated, other.timeLastUpdated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.workRequestId == null ? 43 : this.workRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.installationSite == null ? 43 : this.installationSite.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.retryCount == null ? 43 : this.retryCount.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastUpdated == null ? 43 : this.timeLastUpdated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
