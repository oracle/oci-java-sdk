/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/**
 * Details of a target member of a Exadata Fleet Update Collection. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TargetSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TargetSummary extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "target",
        "currentVersion",
        "status",
        "executingFsuJobId",
        "activeFsuCycleId",
        "progress"
    })
    public TargetSummary(
            TargetDetails target,
            String currentVersion,
            Status status,
            String executingFsuJobId,
            String activeFsuCycleId,
            TargetProgressSummary progress) {
        super();
        this.target = target;
        this.currentVersion = currentVersion;
        this.status = status;
        this.executingFsuJobId = executingFsuJobId;
        this.activeFsuCycleId = activeFsuCycleId;
        this.progress = progress;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("target")
        private TargetDetails target;

        public Builder target(TargetDetails target) {
            this.target = target;
            this.__explicitlySet__.add("target");
            return this;
        }
        /** Current version of the target */
        @com.fasterxml.jackson.annotation.JsonProperty("currentVersion")
        private String currentVersion;

        /**
         * Current version of the target
         *
         * @param currentVersion the value to set
         * @return this builder
         */
        public Builder currentVersion(String currentVersion) {
            this.currentVersion = currentVersion;
            this.__explicitlySet__.add("currentVersion");
            return this;
        }
        /** Status of the target in the Exadata Fleet Update Collection. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * Status of the target in the Exadata Fleet Update Collection.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * Exadata Fleet Update Job OCID executing an action in the target. Null if no job is being
         * executed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("executingFsuJobId")
        private String executingFsuJobId;

        /**
         * Exadata Fleet Update Job OCID executing an action in the target. Null if no job is being
         * executed.
         *
         * @param executingFsuJobId the value to set
         * @return this builder
         */
        public Builder executingFsuJobId(String executingFsuJobId) {
            this.executingFsuJobId = executingFsuJobId;
            this.__explicitlySet__.add("executingFsuJobId");
            return this;
        }
        /**
         * Active Exadata Fleet Update Cycle OCID. Null if no Cycle is active that has this target
         * as member.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("activeFsuCycleId")
        private String activeFsuCycleId;

        /**
         * Active Exadata Fleet Update Cycle OCID. Null if no Cycle is active that has this target
         * as member.
         *
         * @param activeFsuCycleId the value to set
         * @return this builder
         */
        public Builder activeFsuCycleId(String activeFsuCycleId) {
            this.activeFsuCycleId = activeFsuCycleId;
            this.__explicitlySet__.add("activeFsuCycleId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("progress")
        private TargetProgressSummary progress;

        public Builder progress(TargetProgressSummary progress) {
            this.progress = progress;
            this.__explicitlySet__.add("progress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TargetSummary build() {
            TargetSummary model =
                    new TargetSummary(
                            this.target,
                            this.currentVersion,
                            this.status,
                            this.executingFsuJobId,
                            this.activeFsuCycleId,
                            this.progress);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TargetSummary model) {
            if (model.wasPropertyExplicitlySet("target")) {
                this.target(model.getTarget());
            }
            if (model.wasPropertyExplicitlySet("currentVersion")) {
                this.currentVersion(model.getCurrentVersion());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("executingFsuJobId")) {
                this.executingFsuJobId(model.getExecutingFsuJobId());
            }
            if (model.wasPropertyExplicitlySet("activeFsuCycleId")) {
                this.activeFsuCycleId(model.getActiveFsuCycleId());
            }
            if (model.wasPropertyExplicitlySet("progress")) {
                this.progress(model.getProgress());
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

    @com.fasterxml.jackson.annotation.JsonProperty("target")
    private final TargetDetails target;

    public TargetDetails getTarget() {
        return target;
    }

    /** Current version of the target */
    @com.fasterxml.jackson.annotation.JsonProperty("currentVersion")
    private final String currentVersion;

    /**
     * Current version of the target
     *
     * @return the value
     */
    public String getCurrentVersion() {
        return currentVersion;
    }

    /** Status of the target in the Exadata Fleet Update Collection. */
    public enum Status implements com.oracle.bmc.http.internal.BmcEnum {
        Idle("IDLE"),
        ExecutingJob("EXECUTING_JOB"),
        JobFailed("JOB_FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Status of the target in the Exadata Fleet Update Collection. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * Status of the target in the Exadata Fleet Update Collection.
     *
     * @return the value
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Exadata Fleet Update Job OCID executing an action in the target. Null if no job is being
     * executed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("executingFsuJobId")
    private final String executingFsuJobId;

    /**
     * Exadata Fleet Update Job OCID executing an action in the target. Null if no job is being
     * executed.
     *
     * @return the value
     */
    public String getExecutingFsuJobId() {
        return executingFsuJobId;
    }

    /**
     * Active Exadata Fleet Update Cycle OCID. Null if no Cycle is active that has this target as
     * member.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("activeFsuCycleId")
    private final String activeFsuCycleId;

    /**
     * Active Exadata Fleet Update Cycle OCID. Null if no Cycle is active that has this target as
     * member.
     *
     * @return the value
     */
    public String getActiveFsuCycleId() {
        return activeFsuCycleId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("progress")
    private final TargetProgressSummary progress;

    public TargetProgressSummary getProgress() {
        return progress;
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
        sb.append("TargetSummary(");
        sb.append("super=").append(super.toString());
        sb.append("target=").append(String.valueOf(this.target));
        sb.append(", currentVersion=").append(String.valueOf(this.currentVersion));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", executingFsuJobId=").append(String.valueOf(this.executingFsuJobId));
        sb.append(", activeFsuCycleId=").append(String.valueOf(this.activeFsuCycleId));
        sb.append(", progress=").append(String.valueOf(this.progress));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TargetSummary)) {
            return false;
        }

        TargetSummary other = (TargetSummary) o;
        return java.util.Objects.equals(this.target, other.target)
                && java.util.Objects.equals(this.currentVersion, other.currentVersion)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.executingFsuJobId, other.executingFsuJobId)
                && java.util.Objects.equals(this.activeFsuCycleId, other.activeFsuCycleId)
                && java.util.Objects.equals(this.progress, other.progress)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.target == null ? 43 : this.target.hashCode());
        result =
                (result * PRIME)
                        + (this.currentVersion == null ? 43 : this.currentVersion.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.executingFsuJobId == null ? 43 : this.executingFsuJobId.hashCode());
        result =
                (result * PRIME)
                        + (this.activeFsuCycleId == null ? 43 : this.activeFsuCycleId.hashCode());
        result = (result * PRIME) + (this.progress == null ? 43 : this.progress.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
