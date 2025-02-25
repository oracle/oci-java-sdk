/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The rule type config.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RuleTypeConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RuleTypeConfig extends DynamicTypeHandler {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The key of the object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The key of the object.
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * The model version of an object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        /**
         * The model version of an object.
         * @param modelVersion the value to set
         * @return this builder
         **/
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
        /**
         * Deprecated - Reference to a typed object, this can be either a key value to an object within the document, a shall referenced to a {@code TypedObject} or a full {@code TypedObject} definition.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scope")
        private Object scope;

        /**
         * Deprecated - Reference to a typed object, this can be either a key value to an object within the document, a shall referenced to a {@code TypedObject} or a full {@code TypedObject} definition.
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
        /**
         * Specifies whether it is ordered by rule.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isOrderByRule")
        private Boolean isOrderByRule;

        /**
         * Specifies whether it is ordered by rule.
         * @param isOrderByRule the value to set
         * @return this builder
         **/
        public Builder isOrderByRule(Boolean isOrderByRule) {
            this.isOrderByRule = isOrderByRule;
            this.__explicitlySet__.add("isOrderByRule");
            return this;
        }
        /**
         * The projection rules.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("projectionRules")
        private java.util.List<ProjectionRule> projectionRules;

        /**
         * The projection rules.
         * @param projectionRules the value to set
         * @return this builder
         **/
        public Builder projectionRules(java.util.List<ProjectionRule> projectionRules) {
            this.projectionRules = projectionRules;
            this.__explicitlySet__.add("projectionRules");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("configValues")
        private ConfigValues configValues;

        public Builder configValues(ConfigValues configValues) {
            this.configValues = configValues;
            this.__explicitlySet__.add("configValues");
            return this;
        }
        /**
         * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        /**
         * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
         * @param objectStatus the value to set
         * @return this builder
         **/
        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RuleTypeConfig build() {
            RuleTypeConfig model =
                    new RuleTypeConfig(
                            this.key,
                            this.modelVersion,
                            this.parentRef,
                            this.scope,
                            this.scopeReference,
                            this.isOrderByRule,
                            this.projectionRules,
                            this.configValues,
                            this.objectStatus);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RuleTypeConfig model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("modelVersion")) {
                this.modelVersion(model.getModelVersion());
            }
            if (model.wasPropertyExplicitlySet("parentRef")) {
                this.parentRef(model.getParentRef());
            }
            if (model.wasPropertyExplicitlySet("scope")) {
                this.scope(model.getScope());
            }
            if (model.wasPropertyExplicitlySet("scopeReference")) {
                this.scopeReference(model.getScopeReference());
            }
            if (model.wasPropertyExplicitlySet("isOrderByRule")) {
                this.isOrderByRule(model.getIsOrderByRule());
            }
            if (model.wasPropertyExplicitlySet("projectionRules")) {
                this.projectionRules(model.getProjectionRules());
            }
            if (model.wasPropertyExplicitlySet("configValues")) {
                this.configValues(model.getConfigValues());
            }
            if (model.wasPropertyExplicitlySet("objectStatus")) {
                this.objectStatus(model.getObjectStatus());
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
    public RuleTypeConfig(
            String key,
            String modelVersion,
            ParentReference parentRef,
            Object scope,
            ScopeReference scopeReference,
            Boolean isOrderByRule,
            java.util.List<ProjectionRule> projectionRules,
            ConfigValues configValues,
            Integer objectStatus) {
        super();
        this.key = key;
        this.modelVersion = modelVersion;
        this.parentRef = parentRef;
        this.scope = scope;
        this.scopeReference = scopeReference;
        this.isOrderByRule = isOrderByRule;
        this.projectionRules = projectionRules;
        this.configValues = configValues;
        this.objectStatus = objectStatus;
    }

    /**
     * The key of the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The key of the object.
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * The model version of an object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    private final String modelVersion;

    /**
     * The model version of an object.
     * @return the value
     **/
    public String getModelVersion() {
        return modelVersion;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
    private final ParentReference parentRef;

    public ParentReference getParentRef() {
        return parentRef;
    }

    /**
     * Deprecated - Reference to a typed object, this can be either a key value to an object within the document, a shall referenced to a {@code TypedObject} or a full {@code TypedObject} definition.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scope")
    private final Object scope;

    /**
     * Deprecated - Reference to a typed object, this can be either a key value to an object within the document, a shall referenced to a {@code TypedObject} or a full {@code TypedObject} definition.
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

    /**
     * Specifies whether it is ordered by rule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isOrderByRule")
    private final Boolean isOrderByRule;

    /**
     * Specifies whether it is ordered by rule.
     * @return the value
     **/
    public Boolean getIsOrderByRule() {
        return isOrderByRule;
    }

    /**
     * The projection rules.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("projectionRules")
    private final java.util.List<ProjectionRule> projectionRules;

    /**
     * The projection rules.
     * @return the value
     **/
    public java.util.List<ProjectionRule> getProjectionRules() {
        return projectionRules;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("configValues")
    private final ConfigValues configValues;

    public ConfigValues getConfigValues() {
        return configValues;
    }

    /**
     * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
    private final Integer objectStatus;

    /**
     * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
     * @return the value
     **/
    public Integer getObjectStatus() {
        return objectStatus;
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
        sb.append("RuleTypeConfig(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", parentRef=").append(String.valueOf(this.parentRef));
        sb.append(", scope=").append(String.valueOf(this.scope));
        sb.append(", scopeReference=").append(String.valueOf(this.scopeReference));
        sb.append(", isOrderByRule=").append(String.valueOf(this.isOrderByRule));
        sb.append(", projectionRules=").append(String.valueOf(this.projectionRules));
        sb.append(", configValues=").append(String.valueOf(this.configValues));
        sb.append(", objectStatus=").append(String.valueOf(this.objectStatus));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RuleTypeConfig)) {
            return false;
        }

        RuleTypeConfig other = (RuleTypeConfig) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.modelVersion, other.modelVersion)
                && java.util.Objects.equals(this.parentRef, other.parentRef)
                && java.util.Objects.equals(this.scope, other.scope)
                && java.util.Objects.equals(this.scopeReference, other.scopeReference)
                && java.util.Objects.equals(this.isOrderByRule, other.isOrderByRule)
                && java.util.Objects.equals(this.projectionRules, other.projectionRules)
                && java.util.Objects.equals(this.configValues, other.configValues)
                && java.util.Objects.equals(this.objectStatus, other.objectStatus)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.modelVersion == null ? 43 : this.modelVersion.hashCode());
        result = (result * PRIME) + (this.parentRef == null ? 43 : this.parentRef.hashCode());
        result = (result * PRIME) + (this.scope == null ? 43 : this.scope.hashCode());
        result =
                (result * PRIME)
                        + (this.scopeReference == null ? 43 : this.scopeReference.hashCode());
        result =
                (result * PRIME)
                        + (this.isOrderByRule == null ? 43 : this.isOrderByRule.hashCode());
        result =
                (result * PRIME)
                        + (this.projectionRules == null ? 43 : this.projectionRules.hashCode());
        result = (result * PRIME) + (this.configValues == null ? 43 : this.configValues.hashCode());
        result = (result * PRIME) + (this.objectStatus == null ? 43 : this.objectStatus.hashCode());
        return result;
    }
}
