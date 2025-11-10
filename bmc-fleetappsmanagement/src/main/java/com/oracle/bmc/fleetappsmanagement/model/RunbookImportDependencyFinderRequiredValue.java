/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Runbook import required value. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RunbookImportDependencyFinderRequiredValue.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RunbookImportDependencyFinderRequiredValue
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "renderingComponent",
        "label",
        "stepName",
        "placeholderAssignment",
        "expectedAssignment",
        "field"
    })
    public RunbookImportDependencyFinderRequiredValue(
            RenderingComponent renderingComponent,
            String label,
            String stepName,
            String placeholderAssignment,
            ExpectedAssignment expectedAssignment,
            String field) {
        super();
        this.renderingComponent = renderingComponent;
        this.label = label;
        this.stepName = stepName;
        this.placeholderAssignment = placeholderAssignment;
        this.expectedAssignment = expectedAssignment;
        this.field = field;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Rendering component value for required value. */
        @com.fasterxml.jackson.annotation.JsonProperty("renderingComponent")
        private RenderingComponent renderingComponent;

        /**
         * Rendering component value for required value.
         *
         * @param renderingComponent the value to set
         * @return this builder
         */
        public Builder renderingComponent(RenderingComponent renderingComponent) {
            this.renderingComponent = renderingComponent;
            this.__explicitlySet__.add("renderingComponent");
            return this;
        }
        /** Label for required value. */
        @com.fasterxml.jackson.annotation.JsonProperty("label")
        private String label;

        /**
         * Label for required value.
         *
         * @param label the value to set
         * @return this builder
         */
        public Builder label(String label) {
            this.label = label;
            this.__explicitlySet__.add("label");
            return this;
        }
        /** Step name for required value. */
        @com.fasterxml.jackson.annotation.JsonProperty("stepName")
        private String stepName;

        /**
         * Step name for required value.
         *
         * @param stepName the value to set
         * @return this builder
         */
        public Builder stepName(String stepName) {
            this.stepName = stepName;
            this.__explicitlySet__.add("stepName");
            return this;
        }
        /** Placeholder assignment for required value. */
        @com.fasterxml.jackson.annotation.JsonProperty("placeholderAssignment")
        private String placeholderAssignment;

        /**
         * Placeholder assignment for required value.
         *
         * @param placeholderAssignment the value to set
         * @return this builder
         */
        public Builder placeholderAssignment(String placeholderAssignment) {
            this.placeholderAssignment = placeholderAssignment;
            this.__explicitlySet__.add("placeholderAssignment");
            return this;
        }
        /** Expected assignment. */
        @com.fasterxml.jackson.annotation.JsonProperty("expectedAssignment")
        private ExpectedAssignment expectedAssignment;

        /**
         * Expected assignment.
         *
         * @param expectedAssignment the value to set
         * @return this builder
         */
        public Builder expectedAssignment(ExpectedAssignment expectedAssignment) {
            this.expectedAssignment = expectedAssignment;
            this.__explicitlySet__.add("expectedAssignment");
            return this;
        }
        /** Field for required value. */
        @com.fasterxml.jackson.annotation.JsonProperty("field")
        private String field;

        /**
         * Field for required value.
         *
         * @param field the value to set
         * @return this builder
         */
        public Builder field(String field) {
            this.field = field;
            this.__explicitlySet__.add("field");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RunbookImportDependencyFinderRequiredValue build() {
            RunbookImportDependencyFinderRequiredValue model =
                    new RunbookImportDependencyFinderRequiredValue(
                            this.renderingComponent,
                            this.label,
                            this.stepName,
                            this.placeholderAssignment,
                            this.expectedAssignment,
                            this.field);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RunbookImportDependencyFinderRequiredValue model) {
            if (model.wasPropertyExplicitlySet("renderingComponent")) {
                this.renderingComponent(model.getRenderingComponent());
            }
            if (model.wasPropertyExplicitlySet("label")) {
                this.label(model.getLabel());
            }
            if (model.wasPropertyExplicitlySet("stepName")) {
                this.stepName(model.getStepName());
            }
            if (model.wasPropertyExplicitlySet("placeholderAssignment")) {
                this.placeholderAssignment(model.getPlaceholderAssignment());
            }
            if (model.wasPropertyExplicitlySet("expectedAssignment")) {
                this.expectedAssignment(model.getExpectedAssignment());
            }
            if (model.wasPropertyExplicitlySet("field")) {
                this.field(model.getField());
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

    /** Rendering component value for required value. */
    public enum RenderingComponent implements com.oracle.bmc.http.internal.BmcEnum {
        SingleChoice("SINGLE_CHOICE"),
        MultiChoice("MULTI_CHOICE"),
        InputText("INPUT_TEXT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(RenderingComponent.class);

        private final String value;
        private static java.util.Map<String, RenderingComponent> map;

        static {
            map = new java.util.HashMap<>();
            for (RenderingComponent v : RenderingComponent.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RenderingComponent(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RenderingComponent create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RenderingComponent', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Rendering component value for required value. */
    @com.fasterxml.jackson.annotation.JsonProperty("renderingComponent")
    private final RenderingComponent renderingComponent;

    /**
     * Rendering component value for required value.
     *
     * @return the value
     */
    public RenderingComponent getRenderingComponent() {
        return renderingComponent;
    }

    /** Label for required value. */
    @com.fasterxml.jackson.annotation.JsonProperty("label")
    private final String label;

    /**
     * Label for required value.
     *
     * @return the value
     */
    public String getLabel() {
        return label;
    }

    /** Step name for required value. */
    @com.fasterxml.jackson.annotation.JsonProperty("stepName")
    private final String stepName;

    /**
     * Step name for required value.
     *
     * @return the value
     */
    public String getStepName() {
        return stepName;
    }

    /** Placeholder assignment for required value. */
    @com.fasterxml.jackson.annotation.JsonProperty("placeholderAssignment")
    private final String placeholderAssignment;

    /**
     * Placeholder assignment for required value.
     *
     * @return the value
     */
    public String getPlaceholderAssignment() {
        return placeholderAssignment;
    }

    /** Expected assignment. */
    public enum ExpectedAssignment implements com.oracle.bmc.http.internal.BmcEnum {
        TfPackage("TF_PACKAGE"),
        NonTfPackage("NON_TF_PACKAGE"),
        ConfigFile("CONFIG_FILE"),
        Null("NULL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ExpectedAssignment.class);

        private final String value;
        private static java.util.Map<String, ExpectedAssignment> map;

        static {
            map = new java.util.HashMap<>();
            for (ExpectedAssignment v : ExpectedAssignment.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ExpectedAssignment(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ExpectedAssignment create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ExpectedAssignment', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Expected assignment. */
    @com.fasterxml.jackson.annotation.JsonProperty("expectedAssignment")
    private final ExpectedAssignment expectedAssignment;

    /**
     * Expected assignment.
     *
     * @return the value
     */
    public ExpectedAssignment getExpectedAssignment() {
        return expectedAssignment;
    }

    /** Field for required value. */
    @com.fasterxml.jackson.annotation.JsonProperty("field")
    private final String field;

    /**
     * Field for required value.
     *
     * @return the value
     */
    public String getField() {
        return field;
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
        sb.append("RunbookImportDependencyFinderRequiredValue(");
        sb.append("super=").append(super.toString());
        sb.append("renderingComponent=").append(String.valueOf(this.renderingComponent));
        sb.append(", label=").append(String.valueOf(this.label));
        sb.append(", stepName=").append(String.valueOf(this.stepName));
        sb.append(", placeholderAssignment=").append(String.valueOf(this.placeholderAssignment));
        sb.append(", expectedAssignment=").append(String.valueOf(this.expectedAssignment));
        sb.append(", field=").append(String.valueOf(this.field));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RunbookImportDependencyFinderRequiredValue)) {
            return false;
        }

        RunbookImportDependencyFinderRequiredValue other =
                (RunbookImportDependencyFinderRequiredValue) o;
        return java.util.Objects.equals(this.renderingComponent, other.renderingComponent)
                && java.util.Objects.equals(this.label, other.label)
                && java.util.Objects.equals(this.stepName, other.stepName)
                && java.util.Objects.equals(this.placeholderAssignment, other.placeholderAssignment)
                && java.util.Objects.equals(this.expectedAssignment, other.expectedAssignment)
                && java.util.Objects.equals(this.field, other.field)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.renderingComponent == null
                                ? 43
                                : this.renderingComponent.hashCode());
        result = (result * PRIME) + (this.label == null ? 43 : this.label.hashCode());
        result = (result * PRIME) + (this.stepName == null ? 43 : this.stepName.hashCode());
        result =
                (result * PRIME)
                        + (this.placeholderAssignment == null
                                ? 43
                                : this.placeholderAssignment.hashCode());
        result =
                (result * PRIME)
                        + (this.expectedAssignment == null
                                ? 43
                                : this.expectedAssignment.hashCode());
        result = (result * PRIME) + (this.field == null ? 43 : this.field.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
