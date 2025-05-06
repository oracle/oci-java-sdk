/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * A string variable that holds a value <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = FleetBasedActionGroupDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "kind")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class FleetBasedActionGroupDetails extends ActionGroupDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("product")
        private String product;

        public Builder product(String product) {
            this.product = product;
            this.__explicitlySet__.add("product");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleOperation")
        private String lifecycleOperation;

        public Builder lifecycleOperation(String lifecycleOperation) {
            this.lifecycleOperation = lifecycleOperation;
            this.__explicitlySet__.add("lifecycleOperation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("activityId")
        private String activityId;

        public Builder activityId(String activityId) {
            this.activityId = activityId;
            this.__explicitlySet__.add("activityId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private JobStatus status;

        public Builder status(JobStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
        private java.util.Date timeEnded;

        public Builder timeEnded(java.util.Date timeEnded) {
            this.timeEnded = timeEnded;
            this.__explicitlySet__.add("timeEnded");
            return this;
        }
        /** ID of the fleet */
        @com.fasterxml.jackson.annotation.JsonProperty("fleetId")
        private String fleetId;

        /**
         * ID of the fleet
         *
         * @param fleetId the value to set
         * @return this builder
         */
        public Builder fleetId(String fleetId) {
            this.fleetId = fleetId;
            this.__explicitlySet__.add("fleetId");
            return this;
        }
        /** sequence of the Action Group */
        @com.fasterxml.jackson.annotation.JsonProperty("sequence")
        private Integer sequence;

        /**
         * sequence of the Action Group
         *
         * @param sequence the value to set
         * @return this builder
         */
        public Builder sequence(Integer sequence) {
            this.sequence = sequence;
            this.__explicitlySet__.add("sequence");
            return this;
        }
        /** ID of the runbook */
        @com.fasterxml.jackson.annotation.JsonProperty("runbookId")
        private String runbookId;

        /**
         * ID of the runbook
         *
         * @param runbookId the value to set
         * @return this builder
         */
        public Builder runbookId(String runbookId) {
            this.runbookId = runbookId;
            this.__explicitlySet__.add("runbookId");
            return this;
        }
        /** Name of the runbook version */
        @com.fasterxml.jackson.annotation.JsonProperty("runbookVersionName")
        private String runbookVersionName;

        /**
         * Name of the runbook version
         *
         * @param runbookVersionName the value to set
         * @return this builder
         */
        public Builder runbookVersionName(String runbookVersionName) {
            this.runbookVersionName = runbookVersionName;
            this.__explicitlySet__.add("runbookVersionName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FleetBasedActionGroupDetails build() {
            FleetBasedActionGroupDetails model =
                    new FleetBasedActionGroupDetails(
                            this.displayName,
                            this.product,
                            this.lifecycleOperation,
                            this.activityId,
                            this.status,
                            this.timeStarted,
                            this.timeEnded,
                            this.fleetId,
                            this.sequence,
                            this.runbookId,
                            this.runbookVersionName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FleetBasedActionGroupDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("product")) {
                this.product(model.getProduct());
            }
            if (model.wasPropertyExplicitlySet("lifecycleOperation")) {
                this.lifecycleOperation(model.getLifecycleOperation());
            }
            if (model.wasPropertyExplicitlySet("activityId")) {
                this.activityId(model.getActivityId());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeEnded")) {
                this.timeEnded(model.getTimeEnded());
            }
            if (model.wasPropertyExplicitlySet("fleetId")) {
                this.fleetId(model.getFleetId());
            }
            if (model.wasPropertyExplicitlySet("sequence")) {
                this.sequence(model.getSequence());
            }
            if (model.wasPropertyExplicitlySet("runbookId")) {
                this.runbookId(model.getRunbookId());
            }
            if (model.wasPropertyExplicitlySet("runbookVersionName")) {
                this.runbookVersionName(model.getRunbookVersionName());
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
    public FleetBasedActionGroupDetails(
            String displayName,
            String product,
            String lifecycleOperation,
            String activityId,
            JobStatus status,
            java.util.Date timeStarted,
            java.util.Date timeEnded,
            String fleetId,
            Integer sequence,
            String runbookId,
            String runbookVersionName) {
        super(displayName, product, lifecycleOperation, activityId, status, timeStarted, timeEnded);
        this.fleetId = fleetId;
        this.sequence = sequence;
        this.runbookId = runbookId;
        this.runbookVersionName = runbookVersionName;
    }

    /** ID of the fleet */
    @com.fasterxml.jackson.annotation.JsonProperty("fleetId")
    private final String fleetId;

    /**
     * ID of the fleet
     *
     * @return the value
     */
    public String getFleetId() {
        return fleetId;
    }

    /** sequence of the Action Group */
    @com.fasterxml.jackson.annotation.JsonProperty("sequence")
    private final Integer sequence;

    /**
     * sequence of the Action Group
     *
     * @return the value
     */
    public Integer getSequence() {
        return sequence;
    }

    /** ID of the runbook */
    @com.fasterxml.jackson.annotation.JsonProperty("runbookId")
    private final String runbookId;

    /**
     * ID of the runbook
     *
     * @return the value
     */
    public String getRunbookId() {
        return runbookId;
    }

    /** Name of the runbook version */
    @com.fasterxml.jackson.annotation.JsonProperty("runbookVersionName")
    private final String runbookVersionName;

    /**
     * Name of the runbook version
     *
     * @return the value
     */
    public String getRunbookVersionName() {
        return runbookVersionName;
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
        sb.append("FleetBasedActionGroupDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", fleetId=").append(String.valueOf(this.fleetId));
        sb.append(", sequence=").append(String.valueOf(this.sequence));
        sb.append(", runbookId=").append(String.valueOf(this.runbookId));
        sb.append(", runbookVersionName=").append(String.valueOf(this.runbookVersionName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FleetBasedActionGroupDetails)) {
            return false;
        }

        FleetBasedActionGroupDetails other = (FleetBasedActionGroupDetails) o;
        return java.util.Objects.equals(this.fleetId, other.fleetId)
                && java.util.Objects.equals(this.sequence, other.sequence)
                && java.util.Objects.equals(this.runbookId, other.runbookId)
                && java.util.Objects.equals(this.runbookVersionName, other.runbookVersionName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.fleetId == null ? 43 : this.fleetId.hashCode());
        result = (result * PRIME) + (this.sequence == null ? 43 : this.sequence.hashCode());
        result = (result * PRIME) + (this.runbookId == null ? 43 : this.runbookId.hashCode());
        result =
                (result * PRIME)
                        + (this.runbookVersionName == null
                                ? 43
                                : this.runbookVersionName.hashCode());
        return result;
    }
}
