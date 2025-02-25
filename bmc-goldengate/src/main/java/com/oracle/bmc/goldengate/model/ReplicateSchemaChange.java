/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Options required for pipeline Initial Data Load. If enabled, copies existing data from source to target before replication.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ReplicateSchemaChange.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ReplicateSchemaChange
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "canReplicateSchemaChange",
        "actionOnDdlError",
        "actionOnDmlError"
    })
    public ReplicateSchemaChange(
            CanReplicateSchemaChange canReplicateSchemaChange,
            ReplicateDdlErrorAction actionOnDdlError,
            ReplicateDmlErrorAction actionOnDmlError) {
        super();
        this.canReplicateSchemaChange = canReplicateSchemaChange;
        this.actionOnDdlError = actionOnDdlError;
        this.actionOnDmlError = actionOnDmlError;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * If ENABLED, then addition or removal of schema is also replicated, apart from individual tables and records when creating or updating the pipeline.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("canReplicateSchemaChange")
        private CanReplicateSchemaChange canReplicateSchemaChange;

        /**
         * If ENABLED, then addition or removal of schema is also replicated, apart from individual tables and records when creating or updating the pipeline.
         *
         * @param canReplicateSchemaChange the value to set
         * @return this builder
         **/
        public Builder canReplicateSchemaChange(CanReplicateSchemaChange canReplicateSchemaChange) {
            this.canReplicateSchemaChange = canReplicateSchemaChange;
            this.__explicitlySet__.add("canReplicateSchemaChange");
            return this;
        }
        /**
         * Action upon DDL Error (active only if 'Replicate schema changes (DDL)' is selected) i.e canReplicateSchemaChange=true
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("actionOnDdlError")
        private ReplicateDdlErrorAction actionOnDdlError;

        /**
         * Action upon DDL Error (active only if 'Replicate schema changes (DDL)' is selected) i.e canReplicateSchemaChange=true
         *
         * @param actionOnDdlError the value to set
         * @return this builder
         **/
        public Builder actionOnDdlError(ReplicateDdlErrorAction actionOnDdlError) {
            this.actionOnDdlError = actionOnDdlError;
            this.__explicitlySet__.add("actionOnDdlError");
            return this;
        }
        /**
         * Action upon DML Error (active only if 'Replicate schema changes (DDL)' is selected) i.e canReplicateSchemaChange=true
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("actionOnDmlError")
        private ReplicateDmlErrorAction actionOnDmlError;

        /**
         * Action upon DML Error (active only if 'Replicate schema changes (DDL)' is selected) i.e canReplicateSchemaChange=true
         *
         * @param actionOnDmlError the value to set
         * @return this builder
         **/
        public Builder actionOnDmlError(ReplicateDmlErrorAction actionOnDmlError) {
            this.actionOnDmlError = actionOnDmlError;
            this.__explicitlySet__.add("actionOnDmlError");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ReplicateSchemaChange build() {
            ReplicateSchemaChange model =
                    new ReplicateSchemaChange(
                            this.canReplicateSchemaChange,
                            this.actionOnDdlError,
                            this.actionOnDmlError);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ReplicateSchemaChange model) {
            if (model.wasPropertyExplicitlySet("canReplicateSchemaChange")) {
                this.canReplicateSchemaChange(model.getCanReplicateSchemaChange());
            }
            if (model.wasPropertyExplicitlySet("actionOnDdlError")) {
                this.actionOnDdlError(model.getActionOnDdlError());
            }
            if (model.wasPropertyExplicitlySet("actionOnDmlError")) {
                this.actionOnDmlError(model.getActionOnDmlError());
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

    /**
     * If ENABLED, then addition or removal of schema is also replicated, apart from individual tables and records when creating or updating the pipeline.
     *
     **/
    public enum CanReplicateSchemaChange {
        Enabled("ENABLED"),
        Disabled("DISABLED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(CanReplicateSchemaChange.class);

        private final String value;
        private static java.util.Map<String, CanReplicateSchemaChange> map;

        static {
            map = new java.util.HashMap<>();
            for (CanReplicateSchemaChange v : CanReplicateSchemaChange.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        CanReplicateSchemaChange(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CanReplicateSchemaChange create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'CanReplicateSchemaChange', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * If ENABLED, then addition or removal of schema is also replicated, apart from individual tables and records when creating or updating the pipeline.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("canReplicateSchemaChange")
    private final CanReplicateSchemaChange canReplicateSchemaChange;

    /**
     * If ENABLED, then addition or removal of schema is also replicated, apart from individual tables and records when creating or updating the pipeline.
     *
     * @return the value
     **/
    public CanReplicateSchemaChange getCanReplicateSchemaChange() {
        return canReplicateSchemaChange;
    }

    /**
     * Action upon DDL Error (active only if 'Replicate schema changes (DDL)' is selected) i.e canReplicateSchemaChange=true
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actionOnDdlError")
    private final ReplicateDdlErrorAction actionOnDdlError;

    /**
     * Action upon DDL Error (active only if 'Replicate schema changes (DDL)' is selected) i.e canReplicateSchemaChange=true
     *
     * @return the value
     **/
    public ReplicateDdlErrorAction getActionOnDdlError() {
        return actionOnDdlError;
    }

    /**
     * Action upon DML Error (active only if 'Replicate schema changes (DDL)' is selected) i.e canReplicateSchemaChange=true
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actionOnDmlError")
    private final ReplicateDmlErrorAction actionOnDmlError;

    /**
     * Action upon DML Error (active only if 'Replicate schema changes (DDL)' is selected) i.e canReplicateSchemaChange=true
     *
     * @return the value
     **/
    public ReplicateDmlErrorAction getActionOnDmlError() {
        return actionOnDmlError;
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
        sb.append("ReplicateSchemaChange(");
        sb.append("super=").append(super.toString());
        sb.append("canReplicateSchemaChange=")
                .append(String.valueOf(this.canReplicateSchemaChange));
        sb.append(", actionOnDdlError=").append(String.valueOf(this.actionOnDdlError));
        sb.append(", actionOnDmlError=").append(String.valueOf(this.actionOnDmlError));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ReplicateSchemaChange)) {
            return false;
        }

        ReplicateSchemaChange other = (ReplicateSchemaChange) o;
        return java.util.Objects.equals(
                        this.canReplicateSchemaChange, other.canReplicateSchemaChange)
                && java.util.Objects.equals(this.actionOnDdlError, other.actionOnDdlError)
                && java.util.Objects.equals(this.actionOnDmlError, other.actionOnDmlError)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.canReplicateSchemaChange == null
                                ? 43
                                : this.canReplicateSchemaChange.hashCode());
        result =
                (result * PRIME)
                        + (this.actionOnDdlError == null ? 43 : this.actionOnDdlError.hashCode());
        result =
                (result * PRIME)
                        + (this.actionOnDmlError == null ? 43 : this.actionOnDmlError.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
