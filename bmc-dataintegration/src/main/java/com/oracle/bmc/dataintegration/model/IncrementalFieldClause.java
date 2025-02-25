/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Field clause for incremental read operation.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = IncrementalFieldClause.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class IncrementalFieldClause
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "incrementalFieldName",
        "incrementalFieldValue",
        "incrementalComparator"
    })
    public IncrementalFieldClause(
            String incrementalFieldName,
            java.util.Map<String, String> incrementalFieldValue,
            IncrementalComparator incrementalComparator) {
        super();
        this.incrementalFieldName = incrementalFieldName;
        this.incrementalFieldValue = incrementalFieldValue;
        this.incrementalComparator = incrementalComparator;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Name of incremental field filter.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("incrementalFieldName")
        private String incrementalFieldName;

        /**
         * Name of incremental field filter.
         * @param incrementalFieldName the value to set
         * @return this builder
         **/
        public Builder incrementalFieldName(String incrementalFieldName) {
            this.incrementalFieldName = incrementalFieldName;
            this.__explicitlySet__.add("incrementalFieldName");
            return this;
        }
        /**
         * Value of incremental field filter.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("incrementalFieldValue")
        private java.util.Map<String, String> incrementalFieldValue;

        /**
         * Value of incremental field filter.
         * @param incrementalFieldValue the value to set
         * @return this builder
         **/
        public Builder incrementalFieldValue(java.util.Map<String, String> incrementalFieldValue) {
            this.incrementalFieldValue = incrementalFieldValue;
            this.__explicitlySet__.add("incrementalFieldValue");
            return this;
        }
        /**
         * Incremental comparator symbol.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("incrementalComparator")
        private IncrementalComparator incrementalComparator;

        /**
         * Incremental comparator symbol.
         * @param incrementalComparator the value to set
         * @return this builder
         **/
        public Builder incrementalComparator(IncrementalComparator incrementalComparator) {
            this.incrementalComparator = incrementalComparator;
            this.__explicitlySet__.add("incrementalComparator");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IncrementalFieldClause build() {
            IncrementalFieldClause model =
                    new IncrementalFieldClause(
                            this.incrementalFieldName,
                            this.incrementalFieldValue,
                            this.incrementalComparator);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IncrementalFieldClause model) {
            if (model.wasPropertyExplicitlySet("incrementalFieldName")) {
                this.incrementalFieldName(model.getIncrementalFieldName());
            }
            if (model.wasPropertyExplicitlySet("incrementalFieldValue")) {
                this.incrementalFieldValue(model.getIncrementalFieldValue());
            }
            if (model.wasPropertyExplicitlySet("incrementalComparator")) {
                this.incrementalComparator(model.getIncrementalComparator());
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
     * Name of incremental field filter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("incrementalFieldName")
    private final String incrementalFieldName;

    /**
     * Name of incremental field filter.
     * @return the value
     **/
    public String getIncrementalFieldName() {
        return incrementalFieldName;
    }

    /**
     * Value of incremental field filter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("incrementalFieldValue")
    private final java.util.Map<String, String> incrementalFieldValue;

    /**
     * Value of incremental field filter.
     * @return the value
     **/
    public java.util.Map<String, String> getIncrementalFieldValue() {
        return incrementalFieldValue;
    }

    /**
     * Incremental comparator symbol.
     **/
    public enum IncrementalComparator {
        Lessthan("LESSTHAN"),
        Greaterthan("GREATERTHAN"),
        Equals("EQUALS"),
        Lessthanequals("LESSTHANEQUALS"),
        Greaterthanequals("GREATERTHANEQUALS"),
        Startswith("STARTSWITH"),
        Contains("CONTAINS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(IncrementalComparator.class);

        private final String value;
        private static java.util.Map<String, IncrementalComparator> map;

        static {
            map = new java.util.HashMap<>();
            for (IncrementalComparator v : IncrementalComparator.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        IncrementalComparator(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static IncrementalComparator create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'IncrementalComparator', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Incremental comparator symbol.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("incrementalComparator")
    private final IncrementalComparator incrementalComparator;

    /**
     * Incremental comparator symbol.
     * @return the value
     **/
    public IncrementalComparator getIncrementalComparator() {
        return incrementalComparator;
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
        sb.append("IncrementalFieldClause(");
        sb.append("super=").append(super.toString());
        sb.append("incrementalFieldName=").append(String.valueOf(this.incrementalFieldName));
        sb.append(", incrementalFieldValue=").append(String.valueOf(this.incrementalFieldValue));
        sb.append(", incrementalComparator=").append(String.valueOf(this.incrementalComparator));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IncrementalFieldClause)) {
            return false;
        }

        IncrementalFieldClause other = (IncrementalFieldClause) o;
        return java.util.Objects.equals(this.incrementalFieldName, other.incrementalFieldName)
                && java.util.Objects.equals(this.incrementalFieldValue, other.incrementalFieldValue)
                && java.util.Objects.equals(this.incrementalComparator, other.incrementalComparator)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.incrementalFieldName == null
                                ? 43
                                : this.incrementalFieldName.hashCode());
        result =
                (result * PRIME)
                        + (this.incrementalFieldValue == null
                                ? 43
                                : this.incrementalFieldValue.hashCode());
        result =
                (result * PRIME)
                        + (this.incrementalComparator == null
                                ? 43
                                : this.incrementalComparator.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
