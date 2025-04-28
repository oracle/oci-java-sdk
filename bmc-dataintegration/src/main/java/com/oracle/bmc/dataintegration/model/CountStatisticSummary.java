/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Details of the count statistic summary object. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CountStatisticSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CountStatisticSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"objectType", "objectCount"})
    public CountStatisticSummary(ObjectType objectType, Long objectCount) {
        super();
        this.objectType = objectType;
        this.objectCount = objectCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The type of object for the count statistic object. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectType")
        private ObjectType objectType;

        /**
         * The type of object for the count statistic object.
         *
         * @param objectType the value to set
         * @return this builder
         */
        public Builder objectType(ObjectType objectType) {
            this.objectType = objectType;
            this.__explicitlySet__.add("objectType");
            return this;
        }
        /** The value for the count statistic object. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectCount")
        private Long objectCount;

        /**
         * The value for the count statistic object.
         *
         * @param objectCount the value to set
         * @return this builder
         */
        public Builder objectCount(Long objectCount) {
            this.objectCount = objectCount;
            this.__explicitlySet__.add("objectCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CountStatisticSummary build() {
            CountStatisticSummary model =
                    new CountStatisticSummary(this.objectType, this.objectCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CountStatisticSummary model) {
            if (model.wasPropertyExplicitlySet("objectType")) {
                this.objectType(model.getObjectType());
            }
            if (model.wasPropertyExplicitlySet("objectCount")) {
                this.objectCount(model.getObjectCount());
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

    /** The type of object for the count statistic object. */
    public enum ObjectType implements com.oracle.bmc.http.internal.BmcEnum {
        Project("PROJECT"),
        Folder("FOLDER"),
        DataFlow("DATA_FLOW"),
        DataAsset("DATA_ASSET"),
        Connection("CONNECTION"),
        Task("TASK"),
        Application("APPLICATION"),
        FunctionLibrary("FUNCTION_LIBRARY"),
        UserDefinedFunction("USER_DEFINED_FUNCTION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ObjectType.class);

        private final String value;
        private static java.util.Map<String, ObjectType> map;

        static {
            map = new java.util.HashMap<>();
            for (ObjectType v : ObjectType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ObjectType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ObjectType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ObjectType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The type of object for the count statistic object. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectType")
    private final ObjectType objectType;

    /**
     * The type of object for the count statistic object.
     *
     * @return the value
     */
    public ObjectType getObjectType() {
        return objectType;
    }

    /** The value for the count statistic object. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectCount")
    private final Long objectCount;

    /**
     * The value for the count statistic object.
     *
     * @return the value
     */
    public Long getObjectCount() {
        return objectCount;
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
        sb.append("CountStatisticSummary(");
        sb.append("super=").append(super.toString());
        sb.append("objectType=").append(String.valueOf(this.objectType));
        sb.append(", objectCount=").append(String.valueOf(this.objectCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CountStatisticSummary)) {
            return false;
        }

        CountStatisticSummary other = (CountStatisticSummary) o;
        return java.util.Objects.equals(this.objectType, other.objectType)
                && java.util.Objects.equals(this.objectCount, other.objectCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.objectType == null ? 43 : this.objectType.hashCode());
        result = (result * PRIME) + (this.objectCount == null ? 43 : this.objectCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
