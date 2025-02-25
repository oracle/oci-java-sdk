/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * These are the criteria for selecting an image. This is required if imageId is not specified.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = InstanceConfigurationInstanceSourceImageFilterDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class InstanceConfigurationInstanceSourceImageFilterDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "definedTagsFilter",
        "operatingSystem",
        "operatingSystemVersion"
    })
    public InstanceConfigurationInstanceSourceImageFilterDetails(
            String compartmentId,
            java.util.Map<String, java.util.Map<String, Object>> definedTagsFilter,
            String operatingSystem,
            String operatingSystemVersion) {
        super();
        this.compartmentId = compartmentId;
        this.definedTagsFilter = definedTagsFilter;
        this.operatingSystem = operatingSystem;
        this.operatingSystemVersion = operatingSystemVersion;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the compartment containing images to search
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment containing images to search
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Filter based on these defined tags. Each key is predefined and scoped to a
         * namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTagsFilter")
        private java.util.Map<String, java.util.Map<String, Object>> definedTagsFilter;

        /**
         * Filter based on these defined tags. Each key is predefined and scoped to a
         * namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * @param definedTagsFilter the value to set
         * @return this builder
         **/
        public Builder definedTagsFilter(
                java.util.Map<String, java.util.Map<String, Object>> definedTagsFilter) {
            this.definedTagsFilter = definedTagsFilter;
            this.__explicitlySet__.add("definedTagsFilter");
            return this;
        }
        /**
         * The image's operating system.
         * <p>
         * Example: {@code Oracle Linux}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operatingSystem")
        private String operatingSystem;

        /**
         * The image's operating system.
         * <p>
         * Example: {@code Oracle Linux}
         *
         * @param operatingSystem the value to set
         * @return this builder
         **/
        public Builder operatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            this.__explicitlySet__.add("operatingSystem");
            return this;
        }
        /**
         * The image's operating system version.
         * <p>
         * Example: {@code 7.2}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operatingSystemVersion")
        private String operatingSystemVersion;

        /**
         * The image's operating system version.
         * <p>
         * Example: {@code 7.2}
         *
         * @param operatingSystemVersion the value to set
         * @return this builder
         **/
        public Builder operatingSystemVersion(String operatingSystemVersion) {
            this.operatingSystemVersion = operatingSystemVersion;
            this.__explicitlySet__.add("operatingSystemVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstanceConfigurationInstanceSourceImageFilterDetails build() {
            InstanceConfigurationInstanceSourceImageFilterDetails model =
                    new InstanceConfigurationInstanceSourceImageFilterDetails(
                            this.compartmentId,
                            this.definedTagsFilter,
                            this.operatingSystem,
                            this.operatingSystemVersion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstanceConfigurationInstanceSourceImageFilterDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("definedTagsFilter")) {
                this.definedTagsFilter(model.getDefinedTagsFilter());
            }
            if (model.wasPropertyExplicitlySet("operatingSystem")) {
                this.operatingSystem(model.getOperatingSystem());
            }
            if (model.wasPropertyExplicitlySet("operatingSystemVersion")) {
                this.operatingSystemVersion(model.getOperatingSystemVersion());
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
     * The OCID of the compartment containing images to search
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment containing images to search
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Filter based on these defined tags. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTagsFilter")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTagsFilter;

    /**
     * Filter based on these defined tags. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTagsFilter() {
        return definedTagsFilter;
    }

    /**
     * The image's operating system.
     * <p>
     * Example: {@code Oracle Linux}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operatingSystem")
    private final String operatingSystem;

    /**
     * The image's operating system.
     * <p>
     * Example: {@code Oracle Linux}
     *
     * @return the value
     **/
    public String getOperatingSystem() {
        return operatingSystem;
    }

    /**
     * The image's operating system version.
     * <p>
     * Example: {@code 7.2}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operatingSystemVersion")
    private final String operatingSystemVersion;

    /**
     * The image's operating system version.
     * <p>
     * Example: {@code 7.2}
     *
     * @return the value
     **/
    public String getOperatingSystemVersion() {
        return operatingSystemVersion;
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
        sb.append("InstanceConfigurationInstanceSourceImageFilterDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", definedTagsFilter=").append(String.valueOf(this.definedTagsFilter));
        sb.append(", operatingSystem=").append(String.valueOf(this.operatingSystem));
        sb.append(", operatingSystemVersion=").append(String.valueOf(this.operatingSystemVersion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstanceConfigurationInstanceSourceImageFilterDetails)) {
            return false;
        }

        InstanceConfigurationInstanceSourceImageFilterDetails other =
                (InstanceConfigurationInstanceSourceImageFilterDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.definedTagsFilter, other.definedTagsFilter)
                && java.util.Objects.equals(this.operatingSystem, other.operatingSystem)
                && java.util.Objects.equals(
                        this.operatingSystemVersion, other.operatingSystemVersion)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.definedTagsFilter == null ? 43 : this.definedTagsFilter.hashCode());
        result =
                (result * PRIME)
                        + (this.operatingSystem == null ? 43 : this.operatingSystem.hashCode());
        result =
                (result * PRIME)
                        + (this.operatingSystemVersion == null
                                ? 43
                                : this.operatingSystemVersion.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
