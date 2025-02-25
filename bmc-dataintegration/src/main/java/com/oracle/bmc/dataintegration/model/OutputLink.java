/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Details about the outgoing data of an operator in a data flow design.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OutputLink.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OutputLink extends FlowPortLink {
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
        /**
         * The links from this output link to connect to other links in flow.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("toLinks")
        private java.util.List<String> toLinks;

        /**
         * The links from this output link to connect to other links in flow.
         * @param toLinks the value to set
         * @return this builder
         **/
        public Builder toLinks(java.util.List<String> toLinks) {
            this.toLinks = toLinks;
            this.__explicitlySet__.add("toLinks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OutputLink build() {
            OutputLink model =
                    new OutputLink(
                            this.key,
                            this.modelVersion,
                            this.parentRef,
                            this.objectStatus,
                            this.description,
                            this.port,
                            this.toLinks);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OutputLink model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("modelVersion")) {
                this.modelVersion(model.getModelVersion());
            }
            if (model.wasPropertyExplicitlySet("parentRef")) {
                this.parentRef(model.getParentRef());
            }
            if (model.wasPropertyExplicitlySet("objectStatus")) {
                this.objectStatus(model.getObjectStatus());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("port")) {
                this.port(model.getPort());
            }
            if (model.wasPropertyExplicitlySet("toLinks")) {
                this.toLinks(model.getToLinks());
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
    public OutputLink(
            String key,
            String modelVersion,
            ParentReference parentRef,
            Integer objectStatus,
            String description,
            String port,
            java.util.List<String> toLinks) {
        super(key, modelVersion, parentRef, objectStatus, description, port);
        this.toLinks = toLinks;
    }

    /**
     * The links from this output link to connect to other links in flow.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("toLinks")
    private final java.util.List<String> toLinks;

    /**
     * The links from this output link to connect to other links in flow.
     * @return the value
     **/
    public java.util.List<String> getToLinks() {
        return toLinks;
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
        sb.append("OutputLink(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", toLinks=").append(String.valueOf(this.toLinks));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OutputLink)) {
            return false;
        }

        OutputLink other = (OutputLink) o;
        return java.util.Objects.equals(this.toLinks, other.toLinks) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.toLinks == null ? 43 : this.toLinks.hashCode());
        return result;
    }
}
