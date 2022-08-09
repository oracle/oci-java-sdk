/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * A proxy field.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ProxyField.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ProxyField extends TypedObject {
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
        /**
         * Deprecated - Reference to a typed object. This can be either a key value to an object within the document, a shall referenced to a {@code TypedObject}, or a full {@code TypedObject} definition.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scope")
        private Object scope;

        /**
         * Deprecated - Reference to a typed object. This can be either a key value to an object within the document, a shall referenced to a {@code TypedObject}, or a full {@code TypedObject} definition.
         * @param scope the value to set
         * @return this builder
         **/
        public Builder scope(Object scope) {
            this.scope = scope;
            this.__explicitlySet__.add("scope");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scopeReference")
        private ScopeReference scopeReference;

        public Builder scopeReference(ScopeReference scopeReference) {
            this.scopeReference = scopeReference;
            this.__explicitlySet__.add("scopeReference");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private BaseType type;

        public Builder type(BaseType type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * Labels are keywords or labels that you can add to data assets, dataflows and so on. You can define your own labels and use them to categorize content.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("labels")
        private java.util.List<String> labels;

        /**
         * Labels are keywords or labels that you can add to data assets, dataflows and so on. You can define your own labels and use them to categorize content.
         * @param labels the value to set
         * @return this builder
         **/
        public Builder labels(java.util.List<String> labels) {
            this.labels = labels;
            this.__explicitlySet__.add("labels");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProxyField build() {
            ProxyField model =
                    new ProxyField(
                            this.key,
                            this.modelVersion,
                            this.parentRef,
                            this.configValues,
                            this.objectStatus,
                            this.name,
                            this.description,
                            this.scope,
                            this.scopeReference,
                            this.type,
                            this.labels);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProxyField model) {
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
            if (model.wasPropertyExplicitlySet("scope")) {
                this.scope(model.getScope());
            }
            if (model.wasPropertyExplicitlySet("scopeReference")) {
                this.scopeReference(model.getScopeReference());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("labels")) {
                this.labels(model.getLabels());
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
    public ProxyField(
            String key,
            String modelVersion,
            ParentReference parentRef,
            ConfigValues configValues,
            Integer objectStatus,
            String name,
            String description,
            Object scope,
            ScopeReference scopeReference,
            BaseType type,
            java.util.List<String> labels) {
        super(key, modelVersion, parentRef, configValues, objectStatus, name, description);
        this.scope = scope;
        this.scopeReference = scopeReference;
        this.type = type;
        this.labels = labels;
    }

    /**
     * Deprecated - Reference to a typed object. This can be either a key value to an object within the document, a shall referenced to a {@code TypedObject}, or a full {@code TypedObject} definition.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scope")
    private final Object scope;

    /**
     * Deprecated - Reference to a typed object. This can be either a key value to an object within the document, a shall referenced to a {@code TypedObject}, or a full {@code TypedObject} definition.
     * @return the value
     **/
    public Object getScope() {
        return scope;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("scopeReference")
    private final ScopeReference scopeReference;

    public ScopeReference getScopeReference() {
        return scopeReference;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final BaseType type;

    public BaseType getType() {
        return type;
    }

    /**
     * Labels are keywords or labels that you can add to data assets, dataflows and so on. You can define your own labels and use them to categorize content.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("labels")
    private final java.util.List<String> labels;

    /**
     * Labels are keywords or labels that you can add to data assets, dataflows and so on. You can define your own labels and use them to categorize content.
     * @return the value
     **/
    public java.util.List<String> getLabels() {
        return labels;
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
        sb.append("ProxyField(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", scope=").append(String.valueOf(this.scope));
        sb.append(", scopeReference=").append(String.valueOf(this.scopeReference));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", labels=").append(String.valueOf(this.labels));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProxyField)) {
            return false;
        }

        ProxyField other = (ProxyField) o;
        return java.util.Objects.equals(this.scope, other.scope)
                && java.util.Objects.equals(this.scopeReference, other.scopeReference)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.labels, other.labels)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.scope == null ? 43 : this.scope.hashCode());
        result =
                (result * PRIME)
                        + (this.scopeReference == null ? 43 : this.scopeReference.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.labels == null ? 43 : this.labels.hashCode());
        return result;
    }
}
