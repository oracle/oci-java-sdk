/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Attributes to update a Fleet.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateFleetDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateFleetDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "description",
        "inventoryLog",
        "operationLog",
        "definedTags",
        "freeformTags"
    })
    public UpdateFleetDetails(
            String displayName,
            String description,
            CustomLog inventoryLog,
            CustomLog operationLog,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, String> freeformTags) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.inventoryLog = inventoryLog;
        this.operationLog = operationLog;
        this.definedTags = definedTags;
        this.freeformTags = freeformTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the Fleet. The displayName must be unique for Fleets in the same compartment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name of the Fleet. The displayName must be unique for Fleets in the same compartment.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The Fleet's description.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The Fleet's description.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("inventoryLog")
        private CustomLog inventoryLog;

        public Builder inventoryLog(CustomLog inventoryLog) {
            this.inventoryLog = inventoryLog;
            this.__explicitlySet__.add("inventoryLog");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operationLog")
        private CustomLog operationLog;

        public Builder operationLog(CustomLog operationLog) {
            this.operationLog = operationLog;
            this.__explicitlySet__.add("operationLog");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}. (See [Understanding Free-form Tags](https://docs.cloud.oracle.com/Content/Tagging/Tasks/managingtagsandtagnamespaces.htm)).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}. (See [Understanding Free-form Tags](https://docs.cloud.oracle.com/Content/Tagging/Tasks/managingtagsandtagnamespaces.htm)).
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
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}. (See [Managing Tags and Tag Namespaces](https://docs.cloud.oracle.com/Content/Tagging/Concepts/understandingfreeformtags.htm).)
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}. (See [Managing Tags and Tag Namespaces](https://docs.cloud.oracle.com/Content/Tagging/Concepts/understandingfreeformtags.htm).)
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateFleetDetails build() {
            UpdateFleetDetails __instance__ =
                    new UpdateFleetDetails(
                            displayName,
                            description,
                            inventoryLog,
                            operationLog,
                            definedTags,
                            freeformTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateFleetDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .inventoryLog(o.getInventoryLog())
                            .operationLog(o.getOperationLog())
                            .definedTags(o.getDefinedTags())
                            .freeformTags(o.getFreeformTags());

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

    /**
     * The name of the Fleet. The displayName must be unique for Fleets in the same compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name of the Fleet. The displayName must be unique for Fleets in the same compartment.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The Fleet's description.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The Fleet's description.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("inventoryLog")
    private final CustomLog inventoryLog;

    public CustomLog getInventoryLog() {
        return inventoryLog;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("operationLog")
    private final CustomLog operationLog;

    public CustomLog getOperationLog() {
        return operationLog;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}. (See [Understanding Free-form Tags](https://docs.cloud.oracle.com/Content/Tagging/Tasks/managingtagsandtagnamespaces.htm)).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}. (See [Understanding Free-form Tags](https://docs.cloud.oracle.com/Content/Tagging/Tasks/managingtagsandtagnamespaces.htm)).
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}. (See [Managing Tags and Tag Namespaces](https://docs.cloud.oracle.com/Content/Tagging/Concepts/understandingfreeformtags.htm).)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}. (See [Managing Tags and Tag Namespaces](https://docs.cloud.oracle.com/Content/Tagging/Concepts/understandingfreeformtags.htm).)
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
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
        sb.append("UpdateFleetDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", inventoryLog=").append(String.valueOf(this.inventoryLog));
        sb.append(", operationLog=").append(String.valueOf(this.operationLog));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateFleetDetails)) {
            return false;
        }

        UpdateFleetDetails other = (UpdateFleetDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.inventoryLog, other.inventoryLog)
                && java.util.Objects.equals(this.operationLog, other.operationLog)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.inventoryLog == null ? 43 : this.inventoryLog.hashCode());
        result = (result * PRIME) + (this.operationLog == null ? 43 : this.operationLog.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
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
