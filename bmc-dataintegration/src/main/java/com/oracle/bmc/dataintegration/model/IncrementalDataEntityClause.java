/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Data Entity clause for Incremental Read operation.
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
    builder = IncrementalDataEntityClause.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class IncrementalDataEntityClause
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "incrementalDataEntityName",
        "incrementalDataEntityValue",
        "incrementalComparator"
    })
    public IncrementalDataEntityClause(
            String incrementalDataEntityName,
            java.util.Map<String, String> incrementalDataEntityValue,
            IncrementalComparator incrementalComparator) {
        super();
        this.incrementalDataEntityName = incrementalDataEntityName;
        this.incrementalDataEntityValue = incrementalDataEntityValue;
        this.incrementalComparator = incrementalComparator;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Name of incremental data entity filter.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("incrementalDataEntityName")
        private String incrementalDataEntityName;

        /**
         * Name of incremental data entity filter.
         * @param incrementalDataEntityName the value to set
         * @return this builder
         **/
        public Builder incrementalDataEntityName(String incrementalDataEntityName) {
            this.incrementalDataEntityName = incrementalDataEntityName;
            this.__explicitlySet__.add("incrementalDataEntityName");
            return this;
        }
        /**
         * Value of incremental data entity filter.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("incrementalDataEntityValue")
        private java.util.Map<String, String> incrementalDataEntityValue;

        /**
         * Value of incremental data entity filter.
         * @param incrementalDataEntityValue the value to set
         * @return this builder
         **/
        public Builder incrementalDataEntityValue(
                java.util.Map<String, String> incrementalDataEntityValue) {
            this.incrementalDataEntityValue = incrementalDataEntityValue;
            this.__explicitlySet__.add("incrementalDataEntityValue");
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

        public IncrementalDataEntityClause build() {
            IncrementalDataEntityClause model =
                    new IncrementalDataEntityClause(
                            this.incrementalDataEntityName,
                            this.incrementalDataEntityValue,
                            this.incrementalComparator);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IncrementalDataEntityClause model) {
            if (model.wasPropertyExplicitlySet("incrementalDataEntityName")) {
                this.incrementalDataEntityName(model.getIncrementalDataEntityName());
            }
            if (model.wasPropertyExplicitlySet("incrementalDataEntityValue")) {
                this.incrementalDataEntityValue(model.getIncrementalDataEntityValue());
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
     * Name of incremental data entity filter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("incrementalDataEntityName")
    private final String incrementalDataEntityName;

    /**
     * Name of incremental data entity filter.
     * @return the value
     **/
    public String getIncrementalDataEntityName() {
        return incrementalDataEntityName;
    }

    /**
     * Value of incremental data entity filter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("incrementalDataEntityValue")
    private final java.util.Map<String, String> incrementalDataEntityValue;

    /**
     * Value of incremental data entity filter.
     * @return the value
     **/
    public java.util.Map<String, String> getIncrementalDataEntityValue() {
        return incrementalDataEntityValue;
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
        sb.append("IncrementalDataEntityClause(");
        sb.append("super=").append(super.toString());
        sb.append("incrementalDataEntityName=")
                .append(String.valueOf(this.incrementalDataEntityName));
        sb.append(", incrementalDataEntityValue=")
                .append(String.valueOf(this.incrementalDataEntityValue));
        sb.append(", incrementalComparator=").append(String.valueOf(this.incrementalComparator));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IncrementalDataEntityClause)) {
            return false;
        }

        IncrementalDataEntityClause other = (IncrementalDataEntityClause) o;
        return java.util.Objects.equals(
                        this.incrementalDataEntityName, other.incrementalDataEntityName)
                && java.util.Objects.equals(
                        this.incrementalDataEntityValue, other.incrementalDataEntityValue)
                && java.util.Objects.equals(this.incrementalComparator, other.incrementalComparator)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.incrementalDataEntityName == null
                                ? 43
                                : this.incrementalDataEntityName.hashCode());
        result =
                (result * PRIME)
                        + (this.incrementalDataEntityValue == null
                                ? 43
                                : this.incrementalDataEntityValue.hashCode());
        result =
                (result * PRIME)
                        + (this.incrementalComparator == null
                                ? 43
                                : this.incrementalComparator.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
