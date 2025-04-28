/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The type representing the derived field concept. Derived fields have an expression to define how
 * to derive the field. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DerivedField.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "modelType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DerivedField extends TypedObject {
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

        @com.fasterxml.jackson.annotation.JsonProperty("configValues")
        private ConfigValues configValues;

        public Builder configValues(ConfigValues configValues) {
            this.configValues = configValues;
            this.__explicitlySet__.add("configValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
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

        @com.fasterxml.jackson.annotation.JsonProperty("expr")
        private Expression expr;

        public Builder expr(Expression expr) {
            this.expr = expr;
            this.__explicitlySet__.add("expr");
            return this;
        }
        /** The type of the field. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * The type of the field.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * Specifies whether to use inferred expression output type as output type of the derived
         * field. Default value of this flag is false.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isUseInferredType")
        private Boolean isUseInferredType;

        /**
         * Specifies whether to use inferred expression output type as output type of the derived
         * field. Default value of this flag is false.
         *
         * @param isUseInferredType the value to set
         * @return this builder
         */
        public Builder isUseInferredType(Boolean isUseInferredType) {
            this.isUseInferredType = isUseInferredType;
            this.__explicitlySet__.add("isUseInferredType");
            return this;
        }
        /**
         * Labels are keywords or labels that you can add to data assets, dataflows and so on. You
         * can define your own labels and use them to categorize content.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("labels")
        private java.util.List<String> labels;

        /**
         * Labels are keywords or labels that you can add to data assets, dataflows and so on. You
         * can define your own labels and use them to categorize content.
         *
         * @param labels the value to set
         * @return this builder
         */
        public Builder labels(java.util.List<String> labels) {
            this.labels = labels;
            this.__explicitlySet__.add("labels");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DerivedField build() {
            DerivedField model =
                    new DerivedField(
                            this.key,
                            this.modelVersion,
                            this.parentRef,
                            this.configValues,
                            this.objectStatus,
                            this.name,
                            this.description,
                            this.expr,
                            this.type,
                            this.isUseInferredType,
                            this.labels);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DerivedField model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("modelVersion")) {
                this.modelVersion(model.getModelVersion());
            }
            if (model.wasPropertyExplicitlySet("parentRef")) {
                this.parentRef(model.getParentRef());
            }
            if (model.wasPropertyExplicitlySet("configValues")) {
                this.configValues(model.getConfigValues());
            }
            if (model.wasPropertyExplicitlySet("objectStatus")) {
                this.objectStatus(model.getObjectStatus());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("expr")) {
                this.expr(model.getExpr());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("isUseInferredType")) {
                this.isUseInferredType(model.getIsUseInferredType());
            }
            if (model.wasPropertyExplicitlySet("labels")) {
                this.labels(model.getLabels());
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

    @Deprecated
    public DerivedField(
            String key,
            String modelVersion,
            ParentReference parentRef,
            ConfigValues configValues,
            Integer objectStatus,
            String name,
            String description,
            Expression expr,
            String type,
            Boolean isUseInferredType,
            java.util.List<String> labels) {
        super(key, modelVersion, parentRef, configValues, objectStatus, name, description);
        this.expr = expr;
        this.type = type;
        this.isUseInferredType = isUseInferredType;
        this.labels = labels;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("expr")
    private final Expression expr;

    public Expression getExpr() {
        return expr;
    }

    /** The type of the field. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * The type of the field.
     *
     * @return the value
     */
    public String getType() {
        return type;
    }

    /**
     * Specifies whether to use inferred expression output type as output type of the derived field.
     * Default value of this flag is false.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isUseInferredType")
    private final Boolean isUseInferredType;

    /**
     * Specifies whether to use inferred expression output type as output type of the derived field.
     * Default value of this flag is false.
     *
     * @return the value
     */
    public Boolean getIsUseInferredType() {
        return isUseInferredType;
    }

    /**
     * Labels are keywords or labels that you can add to data assets, dataflows and so on. You can
     * define your own labels and use them to categorize content.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("labels")
    private final java.util.List<String> labels;

    /**
     * Labels are keywords or labels that you can add to data assets, dataflows and so on. You can
     * define your own labels and use them to categorize content.
     *
     * @return the value
     */
    public java.util.List<String> getLabels() {
        return labels;
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
        sb.append("DerivedField(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", expr=").append(String.valueOf(this.expr));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", isUseInferredType=").append(String.valueOf(this.isUseInferredType));
        sb.append(", labels=").append(String.valueOf(this.labels));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DerivedField)) {
            return false;
        }

        DerivedField other = (DerivedField) o;
        return java.util.Objects.equals(this.expr, other.expr)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.isUseInferredType, other.isUseInferredType)
                && java.util.Objects.equals(this.labels, other.labels)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.expr == null ? 43 : this.expr.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.isUseInferredType == null ? 43 : this.isUseInferredType.hashCode());
        result = (result * PRIME) + (this.labels == null ? 43 : this.labels.hashCode());
        return result;
    }
}
