/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The information about the conditional input link.
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
    builder = ConditionalInputLink.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ConditionalInputLink extends FlowPortLink {
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

        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private String port;

        public Builder port(String port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fromLink")
        private OutputLink fromLink;

        public Builder fromLink(OutputLink fromLink) {
            this.fromLink = fromLink;
            this.__explicitlySet__.add("fromLink");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fieldMap")
        private FieldMap fieldMap;

        public Builder fieldMap(FieldMap fieldMap) {
            this.fieldMap = fieldMap;
            this.__explicitlySet__.add("fieldMap");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("condition")
        private Expression condition;

        public Builder condition(Expression condition) {
            this.condition = condition;
            this.__explicitlySet__.add("condition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConditionalInputLink build() {
            ConditionalInputLink __instance__ =
                    new ConditionalInputLink(
                            key,
                            modelVersion,
                            parentRef,
                            objectStatus,
                            description,
                            port,
                            fromLink,
                            fieldMap,
                            condition);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConditionalInputLink o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .modelVersion(o.getModelVersion())
                            .parentRef(o.getParentRef())
                            .objectStatus(o.getObjectStatus())
                            .description(o.getDescription())
                            .port(o.getPort())
                            .fromLink(o.getFromLink())
                            .fieldMap(o.getFieldMap())
                            .condition(o.getCondition());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
    public ConditionalInputLink(
            String key,
            String modelVersion,
            ParentReference parentRef,
            Integer objectStatus,
            String description,
            String port,
            OutputLink fromLink,
            FieldMap fieldMap,
            Expression condition) {
        super(key, modelVersion, parentRef, objectStatus, description, port);
        this.fromLink = fromLink;
        this.fieldMap = fieldMap;
        this.condition = condition;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("fromLink")
    private final OutputLink fromLink;

    public OutputLink getFromLink() {
        return fromLink;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("fieldMap")
    private final FieldMap fieldMap;

    public FieldMap getFieldMap() {
        return fieldMap;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("condition")
    private final Expression condition;

    public Expression getCondition() {
        return condition;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ConditionalInputLink(");
        sb.append("super=").append(super.toString());
        sb.append(", fromLink=").append(String.valueOf(this.fromLink));
        sb.append(", fieldMap=").append(String.valueOf(this.fieldMap));
        sb.append(", condition=").append(String.valueOf(this.condition));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConditionalInputLink)) {
            return false;
        }

        ConditionalInputLink other = (ConditionalInputLink) o;
        return java.util.Objects.equals(this.fromLink, other.fromLink)
                && java.util.Objects.equals(this.fieldMap, other.fieldMap)
                && java.util.Objects.equals(this.condition, other.condition)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.fromLink == null ? 43 : this.fromLink.hashCode());
        result = (result * PRIME) + (this.fieldMap == null ? 43 : this.fieldMap.hashCode());
        result = (result * PRIME) + (this.condition == null ? 43 : this.condition.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
