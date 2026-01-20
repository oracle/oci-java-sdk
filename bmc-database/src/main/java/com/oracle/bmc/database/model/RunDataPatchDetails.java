/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details for running datapatch operation on a database and its pluggable databases <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RunDataPatchDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RunDataPatchDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"pluggableDatabases", "dataPatchOptions", "action"})
    public RunDataPatchDetails(
            java.util.List<String> pluggableDatabases,
            DataPatchOptions dataPatchOptions,
            Action action) {
        super();
        this.pluggableDatabases = pluggableDatabases;
        this.dataPatchOptions = dataPatchOptions;
        this.action = action;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * List of Pluggable Database
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) to run
         * datapatch on. The datapatch would run on the database first and then the given pluggable
         * databases.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("pluggableDatabases")
        private java.util.List<String> pluggableDatabases;

        /**
         * List of Pluggable Database
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) to run
         * datapatch on. The datapatch would run on the database first and then the given pluggable
         * databases.
         *
         * @param pluggableDatabases the value to set
         * @return this builder
         */
        public Builder pluggableDatabases(java.util.List<String> pluggableDatabases) {
            this.pluggableDatabases = pluggableDatabases;
            this.__explicitlySet__.add("pluggableDatabases");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataPatchOptions")
        private DataPatchOptions dataPatchOptions;

        public Builder dataPatchOptions(DataPatchOptions dataPatchOptions) {
            this.dataPatchOptions = dataPatchOptions;
            this.__explicitlySet__.add("dataPatchOptions");
            return this;
        }
        /** The action to perform on run database dataPatch operation */
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private Action action;

        /**
         * The action to perform on run database dataPatch operation
         *
         * @param action the value to set
         * @return this builder
         */
        public Builder action(Action action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RunDataPatchDetails build() {
            RunDataPatchDetails model =
                    new RunDataPatchDetails(
                            this.pluggableDatabases, this.dataPatchOptions, this.action);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RunDataPatchDetails model) {
            if (model.wasPropertyExplicitlySet("pluggableDatabases")) {
                this.pluggableDatabases(model.getPluggableDatabases());
            }
            if (model.wasPropertyExplicitlySet("dataPatchOptions")) {
                this.dataPatchOptions(model.getDataPatchOptions());
            }
            if (model.wasPropertyExplicitlySet("action")) {
                this.action(model.getAction());
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
     * List of Pluggable Database
     * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) to run
     * datapatch on. The datapatch would run on the database first and then the given pluggable
     * databases.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pluggableDatabases")
    private final java.util.List<String> pluggableDatabases;

    /**
     * List of Pluggable Database
     * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) to run
     * datapatch on. The datapatch would run on the database first and then the given pluggable
     * databases.
     *
     * @return the value
     */
    public java.util.List<String> getPluggableDatabases() {
        return pluggableDatabases;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dataPatchOptions")
    private final DataPatchOptions dataPatchOptions;

    public DataPatchOptions getDataPatchOptions() {
        return dataPatchOptions;
    }

    /** The action to perform on run database dataPatch operation */
    public enum Action implements com.oracle.bmc.http.internal.BmcEnum {
        Apply("APPLY"),
        Precheck("PRECHECK"),
        ;

        private final String value;
        private static java.util.Map<String, Action> map;

        static {
            map = new java.util.HashMap<>();
            for (Action v : Action.values()) {
                map.put(v.getValue(), v);
            }
        }

        Action(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Action create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Action: " + key);
        }
    };
    /** The action to perform on run database dataPatch operation */
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final Action action;

    /**
     * The action to perform on run database dataPatch operation
     *
     * @return the value
     */
    public Action getAction() {
        return action;
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
        sb.append("RunDataPatchDetails(");
        sb.append("super=").append(super.toString());
        sb.append("pluggableDatabases=").append(String.valueOf(this.pluggableDatabases));
        sb.append(", dataPatchOptions=").append(String.valueOf(this.dataPatchOptions));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RunDataPatchDetails)) {
            return false;
        }

        RunDataPatchDetails other = (RunDataPatchDetails) o;
        return java.util.Objects.equals(this.pluggableDatabases, other.pluggableDatabases)
                && java.util.Objects.equals(this.dataPatchOptions, other.dataPatchOptions)
                && java.util.Objects.equals(this.action, other.action)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.pluggableDatabases == null
                                ? 43
                                : this.pluggableDatabases.hashCode());
        result =
                (result * PRIME)
                        + (this.dataPatchOptions == null ? 43 : this.dataPatchOptions.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
