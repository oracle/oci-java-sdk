/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsMetaFunction <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = LogAnalyticsMetaFunction.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class LogAnalyticsMetaFunction
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "metaFunctionArgument",
        "component",
        "description",
        "editVersion",
        "metaFunctionId",
        "javaClassName",
        "name"
    })
    public LogAnalyticsMetaFunction(
            java.util.List<LogAnalyticsMetaFunctionArgument> metaFunctionArgument,
            String component,
            String description,
            Long editVersion,
            Long metaFunctionId,
            String javaClassName,
            String name) {
        super();
        this.metaFunctionArgument = metaFunctionArgument;
        this.component = component;
        this.description = description;
        this.editVersion = editVersion;
        this.metaFunctionId = metaFunctionId;
        this.javaClassName = javaClassName;
        this.name = name;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** An array of meta function arguments. */
        @com.fasterxml.jackson.annotation.JsonProperty("metaFunctionArgument")
        private java.util.List<LogAnalyticsMetaFunctionArgument> metaFunctionArgument;

        /**
         * An array of meta function arguments.
         *
         * @param metaFunctionArgument the value to set
         * @return this builder
         */
        public Builder metaFunctionArgument(
                java.util.List<LogAnalyticsMetaFunctionArgument> metaFunctionArgument) {
            this.metaFunctionArgument = metaFunctionArgument;
            this.__explicitlySet__.add("metaFunctionArgument");
            return this;
        }
        /** The component. */
        @com.fasterxml.jackson.annotation.JsonProperty("component")
        private String component;

        /**
         * The component.
         *
         * @param component the value to set
         * @return this builder
         */
        public Builder component(String component) {
            this.component = component;
            this.__explicitlySet__.add("component");
            return this;
        }
        /** The description. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The edit version. */
        @com.fasterxml.jackson.annotation.JsonProperty("editVersion")
        private Long editVersion;

        /**
         * The edit version.
         *
         * @param editVersion the value to set
         * @return this builder
         */
        public Builder editVersion(Long editVersion) {
            this.editVersion = editVersion;
            this.__explicitlySet__.add("editVersion");
            return this;
        }
        /** The meta function unique identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("metaFunctionId")
        private Long metaFunctionId;

        /**
         * The meta function unique identifier.
         *
         * @param metaFunctionId the value to set
         * @return this builder
         */
        public Builder metaFunctionId(Long metaFunctionId) {
            this.metaFunctionId = metaFunctionId;
            this.__explicitlySet__.add("metaFunctionId");
            return this;
        }
        /** The java class name. */
        @com.fasterxml.jackson.annotation.JsonProperty("javaClassName")
        private String javaClassName;

        /**
         * The java class name.
         *
         * @param javaClassName the value to set
         * @return this builder
         */
        public Builder javaClassName(String javaClassName) {
            this.javaClassName = javaClassName;
            this.__explicitlySet__.add("javaClassName");
            return this;
        }
        /** The meta function name. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The meta function name.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsMetaFunction build() {
            LogAnalyticsMetaFunction model =
                    new LogAnalyticsMetaFunction(
                            this.metaFunctionArgument,
                            this.component,
                            this.description,
                            this.editVersion,
                            this.metaFunctionId,
                            this.javaClassName,
                            this.name);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsMetaFunction model) {
            if (model.wasPropertyExplicitlySet("metaFunctionArgument")) {
                this.metaFunctionArgument(model.getMetaFunctionArgument());
            }
            if (model.wasPropertyExplicitlySet("component")) {
                this.component(model.getComponent());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("editVersion")) {
                this.editVersion(model.getEditVersion());
            }
            if (model.wasPropertyExplicitlySet("metaFunctionId")) {
                this.metaFunctionId(model.getMetaFunctionId());
            }
            if (model.wasPropertyExplicitlySet("javaClassName")) {
                this.javaClassName(model.getJavaClassName());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
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

    /** An array of meta function arguments. */
    @com.fasterxml.jackson.annotation.JsonProperty("metaFunctionArgument")
    private final java.util.List<LogAnalyticsMetaFunctionArgument> metaFunctionArgument;

    /**
     * An array of meta function arguments.
     *
     * @return the value
     */
    public java.util.List<LogAnalyticsMetaFunctionArgument> getMetaFunctionArgument() {
        return metaFunctionArgument;
    }

    /** The component. */
    @com.fasterxml.jackson.annotation.JsonProperty("component")
    private final String component;

    /**
     * The component.
     *
     * @return the value
     */
    public String getComponent() {
        return component;
    }

    /** The description. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The edit version. */
    @com.fasterxml.jackson.annotation.JsonProperty("editVersion")
    private final Long editVersion;

    /**
     * The edit version.
     *
     * @return the value
     */
    public Long getEditVersion() {
        return editVersion;
    }

    /** The meta function unique identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("metaFunctionId")
    private final Long metaFunctionId;

    /**
     * The meta function unique identifier.
     *
     * @return the value
     */
    public Long getMetaFunctionId() {
        return metaFunctionId;
    }

    /** The java class name. */
    @com.fasterxml.jackson.annotation.JsonProperty("javaClassName")
    private final String javaClassName;

    /**
     * The java class name.
     *
     * @return the value
     */
    public String getJavaClassName() {
        return javaClassName;
    }

    /** The meta function name. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The meta function name.
     *
     * @return the value
     */
    public String getName() {
        return name;
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
        sb.append("LogAnalyticsMetaFunction(");
        sb.append("super=").append(super.toString());
        sb.append("metaFunctionArgument=").append(String.valueOf(this.metaFunctionArgument));
        sb.append(", component=").append(String.valueOf(this.component));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", editVersion=").append(String.valueOf(this.editVersion));
        sb.append(", metaFunctionId=").append(String.valueOf(this.metaFunctionId));
        sb.append(", javaClassName=").append(String.valueOf(this.javaClassName));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogAnalyticsMetaFunction)) {
            return false;
        }

        LogAnalyticsMetaFunction other = (LogAnalyticsMetaFunction) o;
        return java.util.Objects.equals(this.metaFunctionArgument, other.metaFunctionArgument)
                && java.util.Objects.equals(this.component, other.component)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.editVersion, other.editVersion)
                && java.util.Objects.equals(this.metaFunctionId, other.metaFunctionId)
                && java.util.Objects.equals(this.javaClassName, other.javaClassName)
                && java.util.Objects.equals(this.name, other.name)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.metaFunctionArgument == null
                                ? 43
                                : this.metaFunctionArgument.hashCode());
        result = (result * PRIME) + (this.component == null ? 43 : this.component.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.editVersion == null ? 43 : this.editVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.metaFunctionId == null ? 43 : this.metaFunctionId.hashCode());
        result =
                (result * PRIME)
                        + (this.javaClassName == null ? 43 : this.javaClassName.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
