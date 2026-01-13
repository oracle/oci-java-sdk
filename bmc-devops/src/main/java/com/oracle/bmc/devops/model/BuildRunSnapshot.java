/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Snapshot of a build run. Contains information including pipelineId, commitId. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = BuildRunSnapshot.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BuildRunSnapshot
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "buildPipelineId",
        "displayName",
        "commitId",
        "buildRunId",
        "lifecycleState",
        "lifecycleDetails",
        "timeCreated",
        "timeUpdated"
    })
    public BuildRunSnapshot(
            String buildPipelineId,
            String displayName,
            String commitId,
            String buildRunId,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Date timeCreated,
            java.util.Date timeUpdated) {
        super();
        this.buildPipelineId = buildPipelineId;
        this.displayName = displayName;
        this.commitId = commitId;
        this.buildRunId = buildRunId;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the build pipeline where the build was triggered. */
        @com.fasterxml.jackson.annotation.JsonProperty("buildPipelineId")
        private String buildPipelineId;

        /**
         * The OCID of the build pipeline where the build was triggered.
         *
         * @param buildPipelineId the value to set
         * @return this builder
         */
        public Builder buildPipelineId(String buildPipelineId) {
            this.buildPipelineId = buildPipelineId;
            this.__explicitlySet__.add("buildPipelineId");
            return this;
        }
        /** The display name of the build run. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the build run.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The commit id which the build was triggered from. */
        @com.fasterxml.jackson.annotation.JsonProperty("commitId")
        private String commitId;

        /**
         * The commit id which the build was triggered from.
         *
         * @param commitId the value to set
         * @return this builder
         */
        public Builder commitId(String commitId) {
            this.commitId = commitId;
            this.__explicitlySet__.add("commitId");
            return this;
        }
        /** The OCID of the build run. */
        @com.fasterxml.jackson.annotation.JsonProperty("buildRunId")
        private String buildRunId;

        /**
         * The OCID of the build run.
         *
         * @param buildRunId the value to set
         * @return this builder
         */
        public Builder buildRunId(String buildRunId) {
            this.buildRunId = buildRunId;
            this.__explicitlySet__.add("buildRunId");
            return this;
        }
        /** The current status of the build run. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current status of the build run.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** A message describing the current state in more detail. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The time the build run was created. Format defined by
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the build run was created. Format defined by
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time the build run was updated. Format defined by
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the build run was updated. Format defined by
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BuildRunSnapshot build() {
            BuildRunSnapshot model =
                    new BuildRunSnapshot(
                            this.buildPipelineId,
                            this.displayName,
                            this.commitId,
                            this.buildRunId,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.timeCreated,
                            this.timeUpdated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BuildRunSnapshot model) {
            if (model.wasPropertyExplicitlySet("buildPipelineId")) {
                this.buildPipelineId(model.getBuildPipelineId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("commitId")) {
                this.commitId(model.getCommitId());
            }
            if (model.wasPropertyExplicitlySet("buildRunId")) {
                this.buildRunId(model.getBuildRunId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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

    /** The OCID of the build pipeline where the build was triggered. */
    @com.fasterxml.jackson.annotation.JsonProperty("buildPipelineId")
    private final String buildPipelineId;

    /**
     * The OCID of the build pipeline where the build was triggered.
     *
     * @return the value
     */
    public String getBuildPipelineId() {
        return buildPipelineId;
    }

    /** The display name of the build run. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the build run.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The commit id which the build was triggered from. */
    @com.fasterxml.jackson.annotation.JsonProperty("commitId")
    private final String commitId;

    /**
     * The commit id which the build was triggered from.
     *
     * @return the value
     */
    public String getCommitId() {
        return commitId;
    }

    /** The OCID of the build run. */
    @com.fasterxml.jackson.annotation.JsonProperty("buildRunId")
    private final String buildRunId;

    /**
     * The OCID of the build run.
     *
     * @return the value
     */
    public String getBuildRunId() {
        return buildRunId;
    }

    /** The current status of the build run. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Accepted("ACCEPTED"),
        InProgress("IN_PROGRESS"),
        Failed("FAILED"),
        Succeeded("SUCCEEDED"),
        Canceling("CANCELING"),
        Canceled("CANCELED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current status of the build run. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current status of the build run.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** A message describing the current state in more detail. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The time the build run was created. Format defined by
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the build run was created. Format defined by
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the build run was updated. Format defined by
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the build run was updated. Format defined by
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
        sb.append("BuildRunSnapshot(");
        sb.append("super=").append(super.toString());
        sb.append("buildPipelineId=").append(String.valueOf(this.buildPipelineId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", commitId=").append(String.valueOf(this.commitId));
        sb.append(", buildRunId=").append(String.valueOf(this.buildRunId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BuildRunSnapshot)) {
            return false;
        }

        BuildRunSnapshot other = (BuildRunSnapshot) o;
        return java.util.Objects.equals(this.buildPipelineId, other.buildPipelineId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.commitId, other.commitId)
                && java.util.Objects.equals(this.buildRunId, other.buildRunId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.buildPipelineId == null ? 43 : this.buildPipelineId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.commitId == null ? 43 : this.commitId.hashCode());
        result = (result * PRIME) + (this.buildRunId == null ? 43 : this.buildRunId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
