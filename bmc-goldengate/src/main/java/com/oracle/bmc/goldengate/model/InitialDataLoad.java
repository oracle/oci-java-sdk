/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Options required for the pipeline Initial Data Load. If enabled, copies existing data from source
 * to target before replication. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = InitialDataLoad.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InitialDataLoad
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isInitialLoad", "actionOnExistingTable"})
    public InitialDataLoad(IsInitialLoad isInitialLoad, InitialLoadAction actionOnExistingTable) {
        super();
        this.isInitialLoad = isInitialLoad;
        this.actionOnExistingTable = actionOnExistingTable;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * If ENABLED, then existing source data is also synchronized to the target when creating or
         * updating the pipeline.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isInitialLoad")
        private IsInitialLoad isInitialLoad;

        /**
         * If ENABLED, then existing source data is also synchronized to the target when creating or
         * updating the pipeline.
         *
         * @param isInitialLoad the value to set
         * @return this builder
         */
        public Builder isInitialLoad(IsInitialLoad isInitialLoad) {
            this.isInitialLoad = isInitialLoad;
            this.__explicitlySet__.add("isInitialLoad");
            return this;
        }
        /**
         * Action upon existing tables in target when initial Data Load is set i.e.,
         * isInitialLoad=true.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("actionOnExistingTable")
        private InitialLoadAction actionOnExistingTable;

        /**
         * Action upon existing tables in target when initial Data Load is set i.e.,
         * isInitialLoad=true.
         *
         * @param actionOnExistingTable the value to set
         * @return this builder
         */
        public Builder actionOnExistingTable(InitialLoadAction actionOnExistingTable) {
            this.actionOnExistingTable = actionOnExistingTable;
            this.__explicitlySet__.add("actionOnExistingTable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InitialDataLoad build() {
            InitialDataLoad model =
                    new InitialDataLoad(this.isInitialLoad, this.actionOnExistingTable);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InitialDataLoad model) {
            if (model.wasPropertyExplicitlySet("isInitialLoad")) {
                this.isInitialLoad(model.getIsInitialLoad());
            }
            if (model.wasPropertyExplicitlySet("actionOnExistingTable")) {
                this.actionOnExistingTable(model.getActionOnExistingTable());
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
     * If ENABLED, then existing source data is also synchronized to the target when creating or
     * updating the pipeline.
     */
    public enum IsInitialLoad implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("ENABLED"),
        Disabled("DISABLED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(IsInitialLoad.class);

        private final String value;
        private static java.util.Map<String, IsInitialLoad> map;

        static {
            map = new java.util.HashMap<>();
            for (IsInitialLoad v : IsInitialLoad.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        IsInitialLoad(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static IsInitialLoad create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'IsInitialLoad', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * If ENABLED, then existing source data is also synchronized to the target when creating or
     * updating the pipeline.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isInitialLoad")
    private final IsInitialLoad isInitialLoad;

    /**
     * If ENABLED, then existing source data is also synchronized to the target when creating or
     * updating the pipeline.
     *
     * @return the value
     */
    public IsInitialLoad getIsInitialLoad() {
        return isInitialLoad;
    }

    /**
     * Action upon existing tables in target when initial Data Load is set i.e., isInitialLoad=true.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("actionOnExistingTable")
    private final InitialLoadAction actionOnExistingTable;

    /**
     * Action upon existing tables in target when initial Data Load is set i.e., isInitialLoad=true.
     *
     * @return the value
     */
    public InitialLoadAction getActionOnExistingTable() {
        return actionOnExistingTable;
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
        sb.append("InitialDataLoad(");
        sb.append("super=").append(super.toString());
        sb.append("isInitialLoad=").append(String.valueOf(this.isInitialLoad));
        sb.append(", actionOnExistingTable=").append(String.valueOf(this.actionOnExistingTable));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InitialDataLoad)) {
            return false;
        }

        InitialDataLoad other = (InitialDataLoad) o;
        return java.util.Objects.equals(this.isInitialLoad, other.isInitialLoad)
                && java.util.Objects.equals(this.actionOnExistingTable, other.actionOnExistingTable)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isInitialLoad == null ? 43 : this.isInitialLoad.hashCode());
        result =
                (result * PRIME)
                        + (this.actionOnExistingTable == null
                                ? 43
                                : this.actionOnExistingTable.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
