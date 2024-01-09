/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * The information about current refresh. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateRefreshActivityDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateRefreshActivityDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"sourceFusionEnvironmentId", "timeScheduledStart"})
    public CreateRefreshActivityDetails(
            String sourceFusionEnvironmentId, java.util.Date timeScheduledStart) {
        super();
        this.sourceFusionEnvironmentId = sourceFusionEnvironmentId;
        this.timeScheduledStart = timeScheduledStart;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the source environment
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceFusionEnvironmentId")
        private String sourceFusionEnvironmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the source environment
         *
         * @param sourceFusionEnvironmentId the value to set
         * @return this builder
         */
        public Builder sourceFusionEnvironmentId(String sourceFusionEnvironmentId) {
            this.sourceFusionEnvironmentId = sourceFusionEnvironmentId;
            this.__explicitlySet__.add("sourceFusionEnvironmentId");
            return this;
        }
        /**
         * Current time the refresh activity is scheduled to start. An RFC3339 formatted datetime
         * string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeScheduledStart")
        private java.util.Date timeScheduledStart;

        /**
         * Current time the refresh activity is scheduled to start. An RFC3339 formatted datetime
         * string.
         *
         * @param timeScheduledStart the value to set
         * @return this builder
         */
        public Builder timeScheduledStart(java.util.Date timeScheduledStart) {
            this.timeScheduledStart = timeScheduledStart;
            this.__explicitlySet__.add("timeScheduledStart");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateRefreshActivityDetails build() {
            CreateRefreshActivityDetails model =
                    new CreateRefreshActivityDetails(
                            this.sourceFusionEnvironmentId, this.timeScheduledStart);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateRefreshActivityDetails model) {
            if (model.wasPropertyExplicitlySet("sourceFusionEnvironmentId")) {
                this.sourceFusionEnvironmentId(model.getSourceFusionEnvironmentId());
            }
            if (model.wasPropertyExplicitlySet("timeScheduledStart")) {
                this.timeScheduledStart(model.getTimeScheduledStart());
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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the source environment
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceFusionEnvironmentId")
    private final String sourceFusionEnvironmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the source environment
     *
     * @return the value
     */
    public String getSourceFusionEnvironmentId() {
        return sourceFusionEnvironmentId;
    }

    /**
     * Current time the refresh activity is scheduled to start. An RFC3339 formatted datetime
     * string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeScheduledStart")
    private final java.util.Date timeScheduledStart;

    /**
     * Current time the refresh activity is scheduled to start. An RFC3339 formatted datetime
     * string.
     *
     * @return the value
     */
    public java.util.Date getTimeScheduledStart() {
        return timeScheduledStart;
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
        sb.append("CreateRefreshActivityDetails(");
        sb.append("super=").append(super.toString());
        sb.append("sourceFusionEnvironmentId=")
                .append(String.valueOf(this.sourceFusionEnvironmentId));
        sb.append(", timeScheduledStart=").append(String.valueOf(this.timeScheduledStart));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateRefreshActivityDetails)) {
            return false;
        }

        CreateRefreshActivityDetails other = (CreateRefreshActivityDetails) o;
        return java.util.Objects.equals(
                        this.sourceFusionEnvironmentId, other.sourceFusionEnvironmentId)
                && java.util.Objects.equals(this.timeScheduledStart, other.timeScheduledStart)
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
        result =
                (result * PRIME)
                        + (this.timeScheduledStart == null
                                ? 43
                                : this.timeScheduledStart.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
