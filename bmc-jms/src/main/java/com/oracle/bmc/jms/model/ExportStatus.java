/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Attributes of fleet's export status. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ExportStatus.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExportStatus extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"fleetId", "timeLastRun", "timeNextRun", "latestRunStatus"})
    public ExportStatus(
            String fleetId,
            java.util.Date timeLastRun,
            java.util.Date timeNextRun,
            ExportRunStatus latestRunStatus) {
        super();
        this.fleetId = fleetId;
        this.timeLastRun = timeLastRun;
        this.timeNextRun = timeNextRun;
        this.latestRunStatus = latestRunStatus;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * fleet.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("fleetId")
        private String fleetId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * fleet.
         *
         * @param fleetId the value to set
         * @return this builder
         */
        public Builder fleetId(String fleetId) {
            this.fleetId = fleetId;
            this.__explicitlySet__.add("fleetId");
            return this;
        }
        /** The date and time of the last export run. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastRun")
        private java.util.Date timeLastRun;

        /**
         * The date and time of the last export run.
         *
         * @param timeLastRun the value to set
         * @return this builder
         */
        public Builder timeLastRun(java.util.Date timeLastRun) {
            this.timeLastRun = timeLastRun;
            this.__explicitlySet__.add("timeLastRun");
            return this;
        }
        /** The date and time of the next export run. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeNextRun")
        private java.util.Date timeNextRun;

        /**
         * The date and time of the next export run.
         *
         * @param timeNextRun the value to set
         * @return this builder
         */
        public Builder timeNextRun(java.util.Date timeNextRun) {
            this.timeNextRun = timeNextRun;
            this.__explicitlySet__.add("timeNextRun");
            return this;
        }
        /** The status of the latest export run. */
        @com.fasterxml.jackson.annotation.JsonProperty("latestRunStatus")
        private ExportRunStatus latestRunStatus;

        /**
         * The status of the latest export run.
         *
         * @param latestRunStatus the value to set
         * @return this builder
         */
        public Builder latestRunStatus(ExportRunStatus latestRunStatus) {
            this.latestRunStatus = latestRunStatus;
            this.__explicitlySet__.add("latestRunStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExportStatus build() {
            ExportStatus model =
                    new ExportStatus(
                            this.fleetId, this.timeLastRun, this.timeNextRun, this.latestRunStatus);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExportStatus model) {
            if (model.wasPropertyExplicitlySet("fleetId")) {
                this.fleetId(model.getFleetId());
            }
            if (model.wasPropertyExplicitlySet("timeLastRun")) {
                this.timeLastRun(model.getTimeLastRun());
            }
            if (model.wasPropertyExplicitlySet("timeNextRun")) {
                this.timeNextRun(model.getTimeNextRun());
            }
            if (model.wasPropertyExplicitlySet("latestRunStatus")) {
                this.latestRunStatus(model.getLatestRunStatus());
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

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * fleet.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fleetId")
    private final String fleetId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * fleet.
     *
     * @return the value
     */
    public String getFleetId() {
        return fleetId;
    }

    /** The date and time of the last export run. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastRun")
    private final java.util.Date timeLastRun;

    /**
     * The date and time of the last export run.
     *
     * @return the value
     */
    public java.util.Date getTimeLastRun() {
        return timeLastRun;
    }

    /** The date and time of the next export run. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeNextRun")
    private final java.util.Date timeNextRun;

    /**
     * The date and time of the next export run.
     *
     * @return the value
     */
    public java.util.Date getTimeNextRun() {
        return timeNextRun;
    }

    /** The status of the latest export run. */
    @com.fasterxml.jackson.annotation.JsonProperty("latestRunStatus")
    private final ExportRunStatus latestRunStatus;

    /**
     * The status of the latest export run.
     *
     * @return the value
     */
    public ExportRunStatus getLatestRunStatus() {
        return latestRunStatus;
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
        sb.append("ExportStatus(");
        sb.append("super=").append(super.toString());
        sb.append("fleetId=").append(String.valueOf(this.fleetId));
        sb.append(", timeLastRun=").append(String.valueOf(this.timeLastRun));
        sb.append(", timeNextRun=").append(String.valueOf(this.timeNextRun));
        sb.append(", latestRunStatus=").append(String.valueOf(this.latestRunStatus));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExportStatus)) {
            return false;
        }

        ExportStatus other = (ExportStatus) o;
        return java.util.Objects.equals(this.fleetId, other.fleetId)
                && java.util.Objects.equals(this.timeLastRun, other.timeLastRun)
                && java.util.Objects.equals(this.timeNextRun, other.timeNextRun)
                && java.util.Objects.equals(this.latestRunStatus, other.latestRunStatus)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.fleetId == null ? 43 : this.fleetId.hashCode());
        result = (result * PRIME) + (this.timeLastRun == null ? 43 : this.timeLastRun.hashCode());
        result = (result * PRIME) + (this.timeNextRun == null ? 43 : this.timeNextRun.hashCode());
        result =
                (result * PRIME)
                        + (this.latestRunStatus == null ? 43 : this.latestRunStatus.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
