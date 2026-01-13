/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * Describes a refresh of a fusion environment <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RefreshDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RefreshDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sourceFusionEnvironmentId",
        "timeFinished",
        "timeOfRestorationPoint"
    })
    public RefreshDetails(
            String sourceFusionEnvironmentId,
            java.util.Date timeFinished,
            java.util.Date timeOfRestorationPoint) {
        super();
        this.sourceFusionEnvironmentId = sourceFusionEnvironmentId;
        this.timeFinished = timeFinished;
        this.timeOfRestorationPoint = timeOfRestorationPoint;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The source environment id for the last refresh */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceFusionEnvironmentId")
        private String sourceFusionEnvironmentId;

        /**
         * The source environment id for the last refresh
         *
         * @param sourceFusionEnvironmentId the value to set
         * @return this builder
         */
        public Builder sourceFusionEnvironmentId(String sourceFusionEnvironmentId) {
            this.sourceFusionEnvironmentId = sourceFusionEnvironmentId;
            this.__explicitlySet__.add("sourceFusionEnvironmentId");
            return this;
        }
        /** The time of when the last refresh finish */
        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        /**
         * The time of when the last refresh finish
         *
         * @param timeFinished the value to set
         * @return this builder
         */
        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }
        /** The point of time of the latest DB backup for the last refresh */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfRestorationPoint")
        private java.util.Date timeOfRestorationPoint;

        /**
         * The point of time of the latest DB backup for the last refresh
         *
         * @param timeOfRestorationPoint the value to set
         * @return this builder
         */
        public Builder timeOfRestorationPoint(java.util.Date timeOfRestorationPoint) {
            this.timeOfRestorationPoint = timeOfRestorationPoint;
            this.__explicitlySet__.add("timeOfRestorationPoint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RefreshDetails build() {
            RefreshDetails model =
                    new RefreshDetails(
                            this.sourceFusionEnvironmentId,
                            this.timeFinished,
                            this.timeOfRestorationPoint);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RefreshDetails model) {
            if (model.wasPropertyExplicitlySet("sourceFusionEnvironmentId")) {
                this.sourceFusionEnvironmentId(model.getSourceFusionEnvironmentId());
            }
            if (model.wasPropertyExplicitlySet("timeFinished")) {
                this.timeFinished(model.getTimeFinished());
            }
            if (model.wasPropertyExplicitlySet("timeOfRestorationPoint")) {
                this.timeOfRestorationPoint(model.getTimeOfRestorationPoint());
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

    /** The source environment id for the last refresh */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceFusionEnvironmentId")
    private final String sourceFusionEnvironmentId;

    /**
     * The source environment id for the last refresh
     *
     * @return the value
     */
    public String getSourceFusionEnvironmentId() {
        return sourceFusionEnvironmentId;
    }

    /** The time of when the last refresh finish */
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    private final java.util.Date timeFinished;

    /**
     * The time of when the last refresh finish
     *
     * @return the value
     */
    public java.util.Date getTimeFinished() {
        return timeFinished;
    }

    /** The point of time of the latest DB backup for the last refresh */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfRestorationPoint")
    private final java.util.Date timeOfRestorationPoint;

    /**
     * The point of time of the latest DB backup for the last refresh
     *
     * @return the value
     */
    public java.util.Date getTimeOfRestorationPoint() {
        return timeOfRestorationPoint;
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
        sb.append("RefreshDetails(");
        sb.append("super=").append(super.toString());
        sb.append("sourceFusionEnvironmentId=")
                .append(String.valueOf(this.sourceFusionEnvironmentId));
        sb.append(", timeFinished=").append(String.valueOf(this.timeFinished));
        sb.append(", timeOfRestorationPoint=").append(String.valueOf(this.timeOfRestorationPoint));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RefreshDetails)) {
            return false;
        }

        RefreshDetails other = (RefreshDetails) o;
        return java.util.Objects.equals(
                        this.sourceFusionEnvironmentId, other.sourceFusionEnvironmentId)
                && java.util.Objects.equals(this.timeFinished, other.timeFinished)
                && java.util.Objects.equals(
                        this.timeOfRestorationPoint, other.timeOfRestorationPoint)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.sourceFusionEnvironmentId == null
                                ? 43
                                : this.sourceFusionEnvironmentId.hashCode());
        result = (result * PRIME) + (this.timeFinished == null ? 43 : this.timeFinished.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfRestorationPoint == null
                                ? 43
                                : this.timeOfRestorationPoint.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
