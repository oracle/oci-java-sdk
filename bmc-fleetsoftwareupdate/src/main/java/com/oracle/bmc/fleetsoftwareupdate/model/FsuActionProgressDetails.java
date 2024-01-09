/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/**
 * Progress of the Action in execution. If the Exadata Fleet Update Action has not started yet, this
 * will be omitted. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220528")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = FsuActionProgressDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class FsuActionProgressDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "inProgressTargets",
        "completedTargets",
        "failedTargets",
        "waitingTargets",
        "totalTargets"
    })
    public FsuActionProgressDetails(
            Integer inProgressTargets,
            Integer completedTargets,
            Integer failedTargets,
            Integer waitingTargets,
            Integer totalTargets) {
        super();
        this.inProgressTargets = inProgressTargets;
        this.completedTargets = completedTargets;
        this.failedTargets = failedTargets;
        this.waitingTargets = waitingTargets;
        this.totalTargets = totalTargets;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Number of targets with jobs in progress. */
        @com.fasterxml.jackson.annotation.JsonProperty("inProgressTargets")
        private Integer inProgressTargets;

        /**
         * Number of targets with jobs in progress.
         *
         * @param inProgressTargets the value to set
         * @return this builder
         */
        public Builder inProgressTargets(Integer inProgressTargets) {
            this.inProgressTargets = inProgressTargets;
            this.__explicitlySet__.add("inProgressTargets");
            return this;
        }
        /** Number of targets with completed jobs. */
        @com.fasterxml.jackson.annotation.JsonProperty("completedTargets")
        private Integer completedTargets;

        /**
         * Number of targets with completed jobs.
         *
         * @param completedTargets the value to set
         * @return this builder
         */
        public Builder completedTargets(Integer completedTargets) {
            this.completedTargets = completedTargets;
            this.__explicitlySet__.add("completedTargets");
            return this;
        }
        /** Number of targets with failed jobs. */
        @com.fasterxml.jackson.annotation.JsonProperty("failedTargets")
        private Integer failedTargets;

        /**
         * Number of targets with failed jobs.
         *
         * @param failedTargets the value to set
         * @return this builder
         */
        public Builder failedTargets(Integer failedTargets) {
            this.failedTargets = failedTargets;
            this.__explicitlySet__.add("failedTargets");
            return this;
        }
        /** Number of targets with jobs waiting for batch to execute or for user to resume. */
        @com.fasterxml.jackson.annotation.JsonProperty("waitingTargets")
        private Integer waitingTargets;

        /**
         * Number of targets with jobs waiting for batch to execute or for user to resume.
         *
         * @param waitingTargets the value to set
         * @return this builder
         */
        public Builder waitingTargets(Integer waitingTargets) {
            this.waitingTargets = waitingTargets;
            this.__explicitlySet__.add("waitingTargets");
            return this;
        }
        /** Total number of targets impacted by Exadata Fleet Update Action. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalTargets")
        private Integer totalTargets;

        /**
         * Total number of targets impacted by Exadata Fleet Update Action.
         *
         * @param totalTargets the value to set
         * @return this builder
         */
        public Builder totalTargets(Integer totalTargets) {
            this.totalTargets = totalTargets;
            this.__explicitlySet__.add("totalTargets");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FsuActionProgressDetails build() {
            FsuActionProgressDetails model =
                    new FsuActionProgressDetails(
                            this.inProgressTargets,
                            this.completedTargets,
                            this.failedTargets,
                            this.waitingTargets,
                            this.totalTargets);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FsuActionProgressDetails model) {
            if (model.wasPropertyExplicitlySet("inProgressTargets")) {
                this.inProgressTargets(model.getInProgressTargets());
            }
            if (model.wasPropertyExplicitlySet("completedTargets")) {
                this.completedTargets(model.getCompletedTargets());
            }
            if (model.wasPropertyExplicitlySet("failedTargets")) {
                this.failedTargets(model.getFailedTargets());
            }
            if (model.wasPropertyExplicitlySet("waitingTargets")) {
                this.waitingTargets(model.getWaitingTargets());
            }
            if (model.wasPropertyExplicitlySet("totalTargets")) {
                this.totalTargets(model.getTotalTargets());
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

    /** Number of targets with jobs in progress. */
    @com.fasterxml.jackson.annotation.JsonProperty("inProgressTargets")
    private final Integer inProgressTargets;

    /**
     * Number of targets with jobs in progress.
     *
     * @return the value
     */
    public Integer getInProgressTargets() {
        return inProgressTargets;
    }

    /** Number of targets with completed jobs. */
    @com.fasterxml.jackson.annotation.JsonProperty("completedTargets")
    private final Integer completedTargets;

    /**
     * Number of targets with completed jobs.
     *
     * @return the value
     */
    public Integer getCompletedTargets() {
        return completedTargets;
    }

    /** Number of targets with failed jobs. */
    @com.fasterxml.jackson.annotation.JsonProperty("failedTargets")
    private final Integer failedTargets;

    /**
     * Number of targets with failed jobs.
     *
     * @return the value
     */
    public Integer getFailedTargets() {
        return failedTargets;
    }

    /** Number of targets with jobs waiting for batch to execute or for user to resume. */
    @com.fasterxml.jackson.annotation.JsonProperty("waitingTargets")
    private final Integer waitingTargets;

    /**
     * Number of targets with jobs waiting for batch to execute or for user to resume.
     *
     * @return the value
     */
    public Integer getWaitingTargets() {
        return waitingTargets;
    }

    /** Total number of targets impacted by Exadata Fleet Update Action. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalTargets")
    private final Integer totalTargets;

    /**
     * Total number of targets impacted by Exadata Fleet Update Action.
     *
     * @return the value
     */
    public Integer getTotalTargets() {
        return totalTargets;
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
        sb.append("FsuActionProgressDetails(");
        sb.append("super=").append(super.toString());
        sb.append("inProgressTargets=").append(String.valueOf(this.inProgressTargets));
        sb.append(", completedTargets=").append(String.valueOf(this.completedTargets));
        sb.append(", failedTargets=").append(String.valueOf(this.failedTargets));
        sb.append(", waitingTargets=").append(String.valueOf(this.waitingTargets));
        sb.append(", totalTargets=").append(String.valueOf(this.totalTargets));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FsuActionProgressDetails)) {
            return false;
        }

        FsuActionProgressDetails other = (FsuActionProgressDetails) o;
        return java.util.Objects.equals(this.inProgressTargets, other.inProgressTargets)
                && java.util.Objects.equals(this.completedTargets, other.completedTargets)
                && java.util.Objects.equals(this.failedTargets, other.failedTargets)
                && java.util.Objects.equals(this.waitingTargets, other.waitingTargets)
                && java.util.Objects.equals(this.totalTargets, other.totalTargets)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.inProgressTargets == null ? 43 : this.inProgressTargets.hashCode());
        result =
                (result * PRIME)
                        + (this.completedTargets == null ? 43 : this.completedTargets.hashCode());
        result =
                (result * PRIME)
                        + (this.failedTargets == null ? 43 : this.failedTargets.hashCode());
        result =
                (result * PRIME)
                        + (this.waitingTargets == null ? 43 : this.waitingTargets.hashCode());
        result = (result * PRIME) + (this.totalTargets == null ? 43 : this.totalTargets.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
