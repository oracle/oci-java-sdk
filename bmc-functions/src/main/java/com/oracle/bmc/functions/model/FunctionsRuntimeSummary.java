/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.functions.model;

/**
 * Summary of the FunctionsRuntime.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = FunctionsRuntimeSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FunctionsRuntimeSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "name",
        "os",
        "language",
        "timeDeprecated",
        "timeDecommissioned",
        "metadata",
        "lifecycleState",
        "currentFunctionsRuntimeVersionId",
        "timeCreated",
        "timeUpdated",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public FunctionsRuntimeSummary(
            String id,
            String name,
            String os,
            String language,
            java.util.Date timeDeprecated,
            java.util.Date timeDecommissioned,
            String metadata,
            FunctionsRuntime.LifecycleState lifecycleState,
            String currentFunctionsRuntimeVersionId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.name = name;
        this.os = os;
        this.language = language;
        this.timeDeprecated = timeDeprecated;
        this.timeDecommissioned = timeDecommissioned;
        this.metadata = metadata;
        this.lifecycleState = lifecycleState;
        this.currentFunctionsRuntimeVersionId = currentFunctionsRuntimeVersionId;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the FunctionsRuntime that is immutable on creation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the FunctionsRuntime that is immutable on creation.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * A brief descriptive name for the FunctionsRuntime. The FunctionsRuntime name must be unique, and not match any existing
         *   FunctionsRuntime.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * A brief descriptive name for the FunctionsRuntime. The FunctionsRuntime name must be unique, and not match any existing
         *   FunctionsRuntime.
         *
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The operating system of the FunctionsRuntime. This is the OS that the FunctionsRuntime provides for execution of customer payloads.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("os")
        private String os;

        /**
         * The operating system of the FunctionsRuntime. This is the OS that the FunctionsRuntime provides for execution of customer payloads.
         *
         * @param os the value to set
         * @return this builder
         **/
        public Builder os(String os) {
            this.os = os;
            this.__explicitlySet__.add("os");
            return this;
        }
        /**
         * The programming language of the FunctionsRuntime. This is the language that the FunctionsRuntime provides for execution of customer payloads.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("language")
        private String language;

        /**
         * The programming language of the FunctionsRuntime. This is the language that the FunctionsRuntime provides for execution of customer payloads.
         *
         * @param language the value to set
         * @return this builder
         **/
        public Builder language(String language) {
            this.language = language;
            this.__explicitlySet__.add("language");
            return this;
        }
        /**
         * The time when the FunctionsRuntime will be deprecated. An RFC3339 formatted datetime string.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeDeprecated")
        private java.util.Date timeDeprecated;

        /**
         * The time when the FunctionsRuntime will be deprecated. An RFC3339 formatted datetime string.
         *
         * @param timeDeprecated the value to set
         * @return this builder
         **/
        public Builder timeDeprecated(java.util.Date timeDeprecated) {
            this.timeDeprecated = timeDeprecated;
            this.__explicitlySet__.add("timeDeprecated");
            return this;
        }
        /**
         * The time when the FunctionsRuntime will be decommissioned. An RFC3339 formatted datetime string.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeDecommissioned")
        private java.util.Date timeDecommissioned;

        /**
         * The time when the FunctionsRuntime will be decommissioned. An RFC3339 formatted datetime string.
         *
         * @param timeDecommissioned the value to set
         * @return this builder
         **/
        public Builder timeDecommissioned(java.util.Date timeDecommissioned) {
            this.timeDecommissioned = timeDecommissioned;
            this.__explicitlySet__.add("timeDecommissioned");
            return this;
        }
        /**
         * Metadata for the FunctionsRuntime Resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private String metadata;

        /**
         * Metadata for the FunctionsRuntime Resource.
         * @param metadata the value to set
         * @return this builder
         **/
        public Builder metadata(String metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }
        /**
         * The current state of the FunctionsRuntime resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private FunctionsRuntime.LifecycleState lifecycleState;

        /**
         * The current state of the FunctionsRuntime resource.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(FunctionsRuntime.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The OCID of the current FunctionsRuntimeVersion for this FunctionsRuntime.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("currentFunctionsRuntimeVersionId")
        private String currentFunctionsRuntimeVersionId;

        /**
         * The OCID of the current FunctionsRuntimeVersion for this FunctionsRuntime.
         * @param currentFunctionsRuntimeVersionId the value to set
         * @return this builder
         **/
        public Builder currentFunctionsRuntimeVersionId(String currentFunctionsRuntimeVersionId) {
            this.currentFunctionsRuntimeVersionId = currentFunctionsRuntimeVersionId;
            this.__explicitlySet__.add("currentFunctionsRuntimeVersionId");
            return this;
        }
        /**
         * The time when the FunctionsRuntime was created. An RFC3339 formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time when the FunctionsRuntime was created. An RFC3339 formatted datetime string.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time when the FunctionsRuntime was updated. An RFC3339 formatted datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time when the FunctionsRuntime was updated. An RFC3339 formatted datetime string.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FunctionsRuntimeSummary build() {
            FunctionsRuntimeSummary model =
                    new FunctionsRuntimeSummary(
                            this.id,
                            this.name,
                            this.os,
                            this.language,
                            this.timeDeprecated,
                            this.timeDecommissioned,
                            this.metadata,
                            this.lifecycleState,
                            this.currentFunctionsRuntimeVersionId,
                            this.timeCreated,
                            this.timeUpdated,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FunctionsRuntimeSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("os")) {
                this.os(model.getOs());
            }
            if (model.wasPropertyExplicitlySet("language")) {
                this.language(model.getLanguage());
            }
            if (model.wasPropertyExplicitlySet("timeDeprecated")) {
                this.timeDeprecated(model.getTimeDeprecated());
            }
            if (model.wasPropertyExplicitlySet("timeDecommissioned")) {
                this.timeDecommissioned(model.getTimeDecommissioned());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("currentFunctionsRuntimeVersionId")) {
                this.currentFunctionsRuntimeVersionId(model.getCurrentFunctionsRuntimeVersionId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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
     * The OCID of the FunctionsRuntime that is immutable on creation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the FunctionsRuntime that is immutable on creation.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * A brief descriptive name for the FunctionsRuntime. The FunctionsRuntime name must be unique, and not match any existing
     *   FunctionsRuntime.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * A brief descriptive name for the FunctionsRuntime. The FunctionsRuntime name must be unique, and not match any existing
     *   FunctionsRuntime.
     *
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The operating system of the FunctionsRuntime. This is the OS that the FunctionsRuntime provides for execution of customer payloads.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("os")
    private final String os;

    /**
     * The operating system of the FunctionsRuntime. This is the OS that the FunctionsRuntime provides for execution of customer payloads.
     *
     * @return the value
     **/
    public String getOs() {
        return os;
    }

    /**
     * The programming language of the FunctionsRuntime. This is the language that the FunctionsRuntime provides for execution of customer payloads.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    private final String language;

    /**
     * The programming language of the FunctionsRuntime. This is the language that the FunctionsRuntime provides for execution of customer payloads.
     *
     * @return the value
     **/
    public String getLanguage() {
        return language;
    }

    /**
     * The time when the FunctionsRuntime will be deprecated. An RFC3339 formatted datetime string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeDeprecated")
    private final java.util.Date timeDeprecated;

    /**
     * The time when the FunctionsRuntime will be deprecated. An RFC3339 formatted datetime string.
     *
     * @return the value
     **/
    public java.util.Date getTimeDeprecated() {
        return timeDeprecated;
    }

    /**
     * The time when the FunctionsRuntime will be decommissioned. An RFC3339 formatted datetime string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeDecommissioned")
    private final java.util.Date timeDecommissioned;

    /**
     * The time when the FunctionsRuntime will be decommissioned. An RFC3339 formatted datetime string.
     *
     * @return the value
     **/
    public java.util.Date getTimeDecommissioned() {
        return timeDecommissioned;
    }

    /**
     * Metadata for the FunctionsRuntime Resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final String metadata;

    /**
     * Metadata for the FunctionsRuntime Resource.
     * @return the value
     **/
    public String getMetadata() {
        return metadata;
    }

    /**
     * The current state of the FunctionsRuntime resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final FunctionsRuntime.LifecycleState lifecycleState;

    /**
     * The current state of the FunctionsRuntime resource.
     * @return the value
     **/
    public FunctionsRuntime.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The OCID of the current FunctionsRuntimeVersion for this FunctionsRuntime.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currentFunctionsRuntimeVersionId")
    private final String currentFunctionsRuntimeVersionId;

    /**
     * The OCID of the current FunctionsRuntimeVersion for this FunctionsRuntime.
     * @return the value
     **/
    public String getCurrentFunctionsRuntimeVersionId() {
        return currentFunctionsRuntimeVersionId;
    }

    /**
     * The time when the FunctionsRuntime was created. An RFC3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time when the FunctionsRuntime was created. An RFC3339 formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time when the FunctionsRuntime was updated. An RFC3339 formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time when the FunctionsRuntime was updated. An RFC3339 formatted datetime string.
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("FunctionsRuntimeSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", os=").append(String.valueOf(this.os));
        sb.append(", language=").append(String.valueOf(this.language));
        sb.append(", timeDeprecated=").append(String.valueOf(this.timeDeprecated));
        sb.append(", timeDecommissioned=").append(String.valueOf(this.timeDecommissioned));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", currentFunctionsRuntimeVersionId=")
                .append(String.valueOf(this.currentFunctionsRuntimeVersionId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FunctionsRuntimeSummary)) {
            return false;
        }

        FunctionsRuntimeSummary other = (FunctionsRuntimeSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.os, other.os)
                && java.util.Objects.equals(this.language, other.language)
                && java.util.Objects.equals(this.timeDeprecated, other.timeDeprecated)
                && java.util.Objects.equals(this.timeDecommissioned, other.timeDecommissioned)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(
                        this.currentFunctionsRuntimeVersionId,
                        other.currentFunctionsRuntimeVersionId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.os == null ? 43 : this.os.hashCode());
        result = (result * PRIME) + (this.language == null ? 43 : this.language.hashCode());
        result =
                (result * PRIME)
                        + (this.timeDeprecated == null ? 43 : this.timeDeprecated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeDecommissioned == null
                                ? 43
                                : this.timeDecommissioned.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.currentFunctionsRuntimeVersionId == null
                                ? 43
                                : this.currentFunctionsRuntimeVersionId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
