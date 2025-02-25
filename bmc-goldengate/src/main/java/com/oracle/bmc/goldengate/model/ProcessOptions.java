/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Required pipeline options to configure the replication process (Extract or Replicat).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ProcessOptions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ProcessOptions extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "initialDataLoad",
        "replicateSchemaChange",
        "shouldRestartOnFailure"
    })
    public ProcessOptions(
            InitialDataLoad initialDataLoad,
            ReplicateSchemaChange replicateSchemaChange,
            ShouldRestartOnFailure shouldRestartOnFailure) {
        super();
        this.initialDataLoad = initialDataLoad;
        this.replicateSchemaChange = replicateSchemaChange;
        this.shouldRestartOnFailure = shouldRestartOnFailure;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("initialDataLoad")
        private InitialDataLoad initialDataLoad;

        public Builder initialDataLoad(InitialDataLoad initialDataLoad) {
            this.initialDataLoad = initialDataLoad;
            this.__explicitlySet__.add("initialDataLoad");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("replicateSchemaChange")
        private ReplicateSchemaChange replicateSchemaChange;

        public Builder replicateSchemaChange(ReplicateSchemaChange replicateSchemaChange) {
            this.replicateSchemaChange = replicateSchemaChange;
            this.__explicitlySet__.add("replicateSchemaChange");
            return this;
        }
        /**
         * If ENABLED, then the replication process restarts itself upon failure. This option applies when creating or updating a pipeline.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shouldRestartOnFailure")
        private ShouldRestartOnFailure shouldRestartOnFailure;

        /**
         * If ENABLED, then the replication process restarts itself upon failure. This option applies when creating or updating a pipeline.
         *
         * @param shouldRestartOnFailure the value to set
         * @return this builder
         **/
        public Builder shouldRestartOnFailure(ShouldRestartOnFailure shouldRestartOnFailure) {
            this.shouldRestartOnFailure = shouldRestartOnFailure;
            this.__explicitlySet__.add("shouldRestartOnFailure");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProcessOptions build() {
            ProcessOptions model =
                    new ProcessOptions(
                            this.initialDataLoad,
                            this.replicateSchemaChange,
                            this.shouldRestartOnFailure);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProcessOptions model) {
            if (model.wasPropertyExplicitlySet("initialDataLoad")) {
                this.initialDataLoad(model.getInitialDataLoad());
            }
            if (model.wasPropertyExplicitlySet("replicateSchemaChange")) {
                this.replicateSchemaChange(model.getReplicateSchemaChange());
            }
            if (model.wasPropertyExplicitlySet("shouldRestartOnFailure")) {
                this.shouldRestartOnFailure(model.getShouldRestartOnFailure());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @com.fasterxml.jackson.annotation.JsonProperty("initialDataLoad")
    private final InitialDataLoad initialDataLoad;

    public InitialDataLoad getInitialDataLoad() {
        return initialDataLoad;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("replicateSchemaChange")
    private final ReplicateSchemaChange replicateSchemaChange;

    public ReplicateSchemaChange getReplicateSchemaChange() {
        return replicateSchemaChange;
    }

    /**
     * If ENABLED, then the replication process restarts itself upon failure. This option applies when creating or updating a pipeline.
     *
     **/
    public enum ShouldRestartOnFailure {
        Enabled("ENABLED"),
        Disabled("DISABLED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ShouldRestartOnFailure.class);

        private final String value;
        private static java.util.Map<String, ShouldRestartOnFailure> map;

        static {
            map = new java.util.HashMap<>();
            for (ShouldRestartOnFailure v : ShouldRestartOnFailure.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ShouldRestartOnFailure(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ShouldRestartOnFailure create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ShouldRestartOnFailure', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * If ENABLED, then the replication process restarts itself upon failure. This option applies when creating or updating a pipeline.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shouldRestartOnFailure")
    private final ShouldRestartOnFailure shouldRestartOnFailure;

    /**
     * If ENABLED, then the replication process restarts itself upon failure. This option applies when creating or updating a pipeline.
     *
     * @return the value
     **/
    public ShouldRestartOnFailure getShouldRestartOnFailure() {
        return shouldRestartOnFailure;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ProcessOptions(");
        sb.append("super=").append(super.toString());
        sb.append("initialDataLoad=").append(String.valueOf(this.initialDataLoad));
        sb.append(", replicateSchemaChange=").append(String.valueOf(this.replicateSchemaChange));
        sb.append(", shouldRestartOnFailure=").append(String.valueOf(this.shouldRestartOnFailure));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProcessOptions)) {
            return false;
        }

        ProcessOptions other = (ProcessOptions) o;
        return java.util.Objects.equals(this.initialDataLoad, other.initialDataLoad)
                && java.util.Objects.equals(this.replicateSchemaChange, other.replicateSchemaChange)
                && java.util.Objects.equals(
                        this.shouldRestartOnFailure, other.shouldRestartOnFailure)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.initialDataLoad == null ? 43 : this.initialDataLoad.hashCode());
        result =
                (result * PRIME)
                        + (this.replicateSchemaChange == null
                                ? 43
                                : this.replicateSchemaChange.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldRestartOnFailure == null
                                ? 43
                                : this.shouldRestartOnFailure.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
