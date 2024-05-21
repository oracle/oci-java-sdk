/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Details of the exported object
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
    builder = ExportObjectMetadataSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExportObjectMetadataSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "name",
        "identifier",
        "objectType",
        "objectVersion",
        "aggregatorKey",
        "namePath",
        "timeUpdatedInMillis"
    })
    public ExportObjectMetadataSummary(
            String key,
            String name,
            String identifier,
            String objectType,
            String objectVersion,
            String aggregatorKey,
            String namePath,
            Long timeUpdatedInMillis) {
        super();
        this.key = key;
        this.name = name;
        this.identifier = identifier;
        this.objectType = objectType;
        this.objectVersion = objectVersion;
        this.aggregatorKey = aggregatorKey;
        this.namePath = namePath;
        this.timeUpdatedInMillis = timeUpdatedInMillis;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Key of the object
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Key of the object
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * Name of the object
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the object
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Object identifier
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private String identifier;

        /**
         * Object identifier
         * @param identifier the value to set
         * @return this builder
         **/
        public Builder identifier(String identifier) {
            this.identifier = identifier;
            this.__explicitlySet__.add("identifier");
            return this;
        }
        /**
         * Object type
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectType")
        private String objectType;

        /**
         * Object type
         * @param objectType the value to set
         * @return this builder
         **/
        public Builder objectType(String objectType) {
            this.objectType = objectType;
            this.__explicitlySet__.add("objectType");
            return this;
        }
        /**
         * Object version
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
        private String objectVersion;

        /**
         * Object version
         * @param objectVersion the value to set
         * @return this builder
         **/
        public Builder objectVersion(String objectVersion) {
            this.objectVersion = objectVersion;
            this.__explicitlySet__.add("objectVersion");
            return this;
        }
        /**
         * Aggregator key
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("aggregatorKey")
        private String aggregatorKey;

        /**
         * Aggregator key
         * @param aggregatorKey the value to set
         * @return this builder
         **/
        public Builder aggregatorKey(String aggregatorKey) {
            this.aggregatorKey = aggregatorKey;
            this.__explicitlySet__.add("aggregatorKey");
            return this;
        }
        /**
         * Object name path
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("namePath")
        private String namePath;

        /**
         * Object name path
         * @param namePath the value to set
         * @return this builder
         **/
        public Builder namePath(String namePath) {
            this.namePath = namePath;
            this.__explicitlySet__.add("namePath");
            return this;
        }
        /**
         * time at which this object was last updated.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdatedInMillis")
        private Long timeUpdatedInMillis;

        /**
         * time at which this object was last updated.
         * @param timeUpdatedInMillis the value to set
         * @return this builder
         **/
        public Builder timeUpdatedInMillis(Long timeUpdatedInMillis) {
            this.timeUpdatedInMillis = timeUpdatedInMillis;
            this.__explicitlySet__.add("timeUpdatedInMillis");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExportObjectMetadataSummary build() {
            ExportObjectMetadataSummary model =
                    new ExportObjectMetadataSummary(
                            this.key,
                            this.name,
                            this.identifier,
                            this.objectType,
                            this.objectVersion,
                            this.aggregatorKey,
                            this.namePath,
                            this.timeUpdatedInMillis);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExportObjectMetadataSummary model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("identifier")) {
                this.identifier(model.getIdentifier());
            }
            if (model.wasPropertyExplicitlySet("objectType")) {
                this.objectType(model.getObjectType());
            }
            if (model.wasPropertyExplicitlySet("objectVersion")) {
                this.objectVersion(model.getObjectVersion());
            }
            if (model.wasPropertyExplicitlySet("aggregatorKey")) {
                this.aggregatorKey(model.getAggregatorKey());
            }
            if (model.wasPropertyExplicitlySet("namePath")) {
                this.namePath(model.getNamePath());
            }
            if (model.wasPropertyExplicitlySet("timeUpdatedInMillis")) {
                this.timeUpdatedInMillis(model.getTimeUpdatedInMillis());
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
     * Key of the object
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Key of the object
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * Name of the object
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the object
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Object identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    private final String identifier;

    /**
     * Object identifier
     * @return the value
     **/
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Object type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectType")
    private final String objectType;

    /**
     * Object type
     * @return the value
     **/
    public String getObjectType() {
        return objectType;
    }

    /**
     * Object version
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
    private final String objectVersion;

    /**
     * Object version
     * @return the value
     **/
    public String getObjectVersion() {
        return objectVersion;
    }

    /**
     * Aggregator key
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("aggregatorKey")
    private final String aggregatorKey;

    /**
     * Aggregator key
     * @return the value
     **/
    public String getAggregatorKey() {
        return aggregatorKey;
    }

    /**
     * Object name path
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namePath")
    private final String namePath;

    /**
     * Object name path
     * @return the value
     **/
    public String getNamePath() {
        return namePath;
    }

    /**
     * time at which this object was last updated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdatedInMillis")
    private final Long timeUpdatedInMillis;

    /**
     * time at which this object was last updated.
     * @return the value
     **/
    public Long getTimeUpdatedInMillis() {
        return timeUpdatedInMillis;
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
        sb.append("ExportObjectMetadataSummary(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", identifier=").append(String.valueOf(this.identifier));
        sb.append(", objectType=").append(String.valueOf(this.objectType));
        sb.append(", objectVersion=").append(String.valueOf(this.objectVersion));
        sb.append(", aggregatorKey=").append(String.valueOf(this.aggregatorKey));
        sb.append(", namePath=").append(String.valueOf(this.namePath));
        sb.append(", timeUpdatedInMillis=").append(String.valueOf(this.timeUpdatedInMillis));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExportObjectMetadataSummary)) {
            return false;
        }

        ExportObjectMetadataSummary other = (ExportObjectMetadataSummary) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.identifier, other.identifier)
                && java.util.Objects.equals(this.objectType, other.objectType)
                && java.util.Objects.equals(this.objectVersion, other.objectVersion)
                && java.util.Objects.equals(this.aggregatorKey, other.aggregatorKey)
                && java.util.Objects.equals(this.namePath, other.namePath)
                && java.util.Objects.equals(this.timeUpdatedInMillis, other.timeUpdatedInMillis)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.identifier == null ? 43 : this.identifier.hashCode());
        result = (result * PRIME) + (this.objectType == null ? 43 : this.objectType.hashCode());
        result =
                (result * PRIME)
                        + (this.objectVersion == null ? 43 : this.objectVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.aggregatorKey == null ? 43 : this.aggregatorKey.hashCode());
        result = (result * PRIME) + (this.namePath == null ? 43 : this.namePath.hashCode());
        result =
                (result * PRIME)
                        + (this.timeUpdatedInMillis == null
                                ? 43
                                : this.timeUpdatedInMillis.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
