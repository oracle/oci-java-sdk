/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The information about the lookup operator. The lookup operator has two input links, a primary input, and a lookup source input. It has an output link, fields of the lookup input are appended to the primary input and projected as the output fields.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Lookup.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Lookup extends Operator {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        public Builder modelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
            this.__explicitlySet__.add("modelVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
        private ParentReference parentRef;

        public Builder parentRef(ParentReference parentRef) {
            this.parentRef = parentRef;
            this.__explicitlySet__.add("parentRef");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
        private Integer objectVersion;

        public Builder objectVersion(Integer objectVersion) {
            this.objectVersion = objectVersion;
            this.__explicitlySet__.add("objectVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("inputPorts")
        private java.util.List<InputPort> inputPorts;

        public Builder inputPorts(java.util.List<InputPort> inputPorts) {
            this.inputPorts = inputPorts;
            this.__explicitlySet__.add("inputPorts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("outputPorts")
        private java.util.List<TypedObject> outputPorts;

        public Builder outputPorts(java.util.List<TypedObject> outputPorts) {
            this.outputPorts = outputPorts;
            this.__explicitlySet__.add("outputPorts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private String identifier;

        public Builder identifier(String identifier) {
            this.identifier = identifier;
            this.__explicitlySet__.add("identifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parameters")
        private java.util.List<Parameter> parameters;

        public Builder parameters(java.util.List<Parameter> parameters) {
            this.parameters = parameters;
            this.__explicitlySet__.add("parameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("opConfigValues")
        private ConfigValues opConfigValues;

        public Builder opConfigValues(ConfigValues opConfigValues) {
            this.opConfigValues = opConfigValues;
            this.__explicitlySet__.add("opConfigValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lookupCondition")
        private Expression lookupCondition;

        public Builder lookupCondition(Expression lookupCondition) {
            this.lookupCondition = lookupCondition;
            this.__explicitlySet__.add("lookupCondition");
            return this;
        }
        /**
         * For the rows for which lookup condition does not satisfy, if set to true - do not return those rows of primary Input source and if set to false - create a row with primary input fields values and lookup field values as NULL.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isSkipNoMatch")
        private Boolean isSkipNoMatch;

        /**
         * For the rows for which lookup condition does not satisfy, if set to true - do not return those rows of primary Input source and if set to false - create a row with primary input fields values and lookup field values as NULL.
         * @param isSkipNoMatch the value to set
         * @return this builder
         **/
        public Builder isSkipNoMatch(Boolean isSkipNoMatch) {
            this.isSkipNoMatch = isSkipNoMatch;
            this.__explicitlySet__.add("isSkipNoMatch");
            return this;
        }
        /**
         * if there are multiple records found in the lookup input what action should be performed. The default value for this field is RETURN_ANY.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("multiMatchStrategy")
        private MultiMatchStrategy multiMatchStrategy;

        /**
         * if there are multiple records found in the lookup input what action should be performed. The default value for this field is RETURN_ANY.
         * @param multiMatchStrategy the value to set
         * @return this builder
         **/
        public Builder multiMatchStrategy(MultiMatchStrategy multiMatchStrategy) {
            this.multiMatchStrategy = multiMatchStrategy;
            this.__explicitlySet__.add("multiMatchStrategy");
            return this;
        }
        /**
         * this map is used for replacing NULL values in the record. Key is the column name and value is the NULL replacement.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nullFillValues")
        private java.util.Map<String, Object> nullFillValues;

        /**
         * this map is used for replacing NULL values in the record. Key is the column name and value is the NULL replacement.
         * @param nullFillValues the value to set
         * @return this builder
         **/
        public Builder nullFillValues(java.util.Map<String, Object> nullFillValues) {
            this.nullFillValues = nullFillValues;
            this.__explicitlySet__.add("nullFillValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Lookup build() {
            Lookup model =
                    new Lookup(
                            this.key,
                            this.modelVersion,
                            this.parentRef,
                            this.name,
                            this.description,
                            this.objectVersion,
                            this.inputPorts,
                            this.outputPorts,
                            this.objectStatus,
                            this.identifier,
                            this.parameters,
                            this.opConfigValues,
                            this.lookupCondition,
                            this.isSkipNoMatch,
                            this.multiMatchStrategy,
                            this.nullFillValues);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Lookup model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("modelVersion")) {
                this.modelVersion(model.getModelVersion());
            }
            if (model.wasPropertyExplicitlySet("parentRef")) {
                this.parentRef(model.getParentRef());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("objectVersion")) {
                this.objectVersion(model.getObjectVersion());
            }
            if (model.wasPropertyExplicitlySet("inputPorts")) {
                this.inputPorts(model.getInputPorts());
            }
            if (model.wasPropertyExplicitlySet("outputPorts")) {
                this.outputPorts(model.getOutputPorts());
            }
            if (model.wasPropertyExplicitlySet("objectStatus")) {
                this.objectStatus(model.getObjectStatus());
            }
            if (model.wasPropertyExplicitlySet("identifier")) {
                this.identifier(model.getIdentifier());
            }
            if (model.wasPropertyExplicitlySet("parameters")) {
                this.parameters(model.getParameters());
            }
            if (model.wasPropertyExplicitlySet("opConfigValues")) {
                this.opConfigValues(model.getOpConfigValues());
            }
            if (model.wasPropertyExplicitlySet("lookupCondition")) {
                this.lookupCondition(model.getLookupCondition());
            }
            if (model.wasPropertyExplicitlySet("isSkipNoMatch")) {
                this.isSkipNoMatch(model.getIsSkipNoMatch());
            }
            if (model.wasPropertyExplicitlySet("multiMatchStrategy")) {
                this.multiMatchStrategy(model.getMultiMatchStrategy());
            }
            if (model.wasPropertyExplicitlySet("nullFillValues")) {
                this.nullFillValues(model.getNullFillValues());
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

    @Deprecated
    public Lookup(
            String key,
            String modelVersion,
            ParentReference parentRef,
            String name,
            String description,
            Integer objectVersion,
            java.util.List<InputPort> inputPorts,
            java.util.List<TypedObject> outputPorts,
            Integer objectStatus,
            String identifier,
            java.util.List<Parameter> parameters,
            ConfigValues opConfigValues,
            Expression lookupCondition,
            Boolean isSkipNoMatch,
            MultiMatchStrategy multiMatchStrategy,
            java.util.Map<String, Object> nullFillValues) {
        super(
                key,
                modelVersion,
                parentRef,
                name,
                description,
                objectVersion,
                inputPorts,
                outputPorts,
                objectStatus,
                identifier,
                parameters,
                opConfigValues);
        this.lookupCondition = lookupCondition;
        this.isSkipNoMatch = isSkipNoMatch;
        this.multiMatchStrategy = multiMatchStrategy;
        this.nullFillValues = nullFillValues;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("lookupCondition")
    private final Expression lookupCondition;

    public Expression getLookupCondition() {
        return lookupCondition;
    }

    /**
     * For the rows for which lookup condition does not satisfy, if set to true - do not return those rows of primary Input source and if set to false - create a row with primary input fields values and lookup field values as NULL.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSkipNoMatch")
    private final Boolean isSkipNoMatch;

    /**
     * For the rows for which lookup condition does not satisfy, if set to true - do not return those rows of primary Input source and if set to false - create a row with primary input fields values and lookup field values as NULL.
     * @return the value
     **/
    public Boolean getIsSkipNoMatch() {
        return isSkipNoMatch;
    }

    /**
     * if there are multiple records found in the lookup input what action should be performed. The default value for this field is RETURN_ANY.
     **/
    public enum MultiMatchStrategy {
        ReturnAny("RETURN_ANY"),
        ReturnFirst("RETURN_FIRST"),
        ReturnLast("RETURN_LAST"),
        ReturnAll("RETURN_ALL"),
        ReturnError("RETURN_ERROR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(MultiMatchStrategy.class);

        private final String value;
        private static java.util.Map<String, MultiMatchStrategy> map;

        static {
            map = new java.util.HashMap<>();
            for (MultiMatchStrategy v : MultiMatchStrategy.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        MultiMatchStrategy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MultiMatchStrategy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'MultiMatchStrategy', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * if there are multiple records found in the lookup input what action should be performed. The default value for this field is RETURN_ANY.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("multiMatchStrategy")
    private final MultiMatchStrategy multiMatchStrategy;

    /**
     * if there are multiple records found in the lookup input what action should be performed. The default value for this field is RETURN_ANY.
     * @return the value
     **/
    public MultiMatchStrategy getMultiMatchStrategy() {
        return multiMatchStrategy;
    }

    /**
     * this map is used for replacing NULL values in the record. Key is the column name and value is the NULL replacement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nullFillValues")
    private final java.util.Map<String, Object> nullFillValues;

    /**
     * this map is used for replacing NULL values in the record. Key is the column name and value is the NULL replacement.
     * @return the value
     **/
    public java.util.Map<String, Object> getNullFillValues() {
        return nullFillValues;
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
        sb.append("Lookup(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", lookupCondition=").append(String.valueOf(this.lookupCondition));
        sb.append(", isSkipNoMatch=").append(String.valueOf(this.isSkipNoMatch));
        sb.append(", multiMatchStrategy=").append(String.valueOf(this.multiMatchStrategy));
        sb.append(", nullFillValues=").append(String.valueOf(this.nullFillValues));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Lookup)) {
            return false;
        }

        Lookup other = (Lookup) o;
        return java.util.Objects.equals(this.lookupCondition, other.lookupCondition)
                && java.util.Objects.equals(this.isSkipNoMatch, other.isSkipNoMatch)
                && java.util.Objects.equals(this.multiMatchStrategy, other.multiMatchStrategy)
                && java.util.Objects.equals(this.nullFillValues, other.nullFillValues)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.lookupCondition == null ? 43 : this.lookupCondition.hashCode());
        result =
                (result * PRIME)
                        + (this.isSkipNoMatch == null ? 43 : this.isSkipNoMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.multiMatchStrategy == null
                                ? 43
                                : this.multiMatchStrategy.hashCode());
        result =
                (result * PRIME)
                        + (this.nullFillValues == null ? 43 : this.nullFillValues.hashCode());
        return result;
    }
}
