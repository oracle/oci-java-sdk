/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Information about the object and its parent. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RegistryMetadata.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RegistryMetadata
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "aggregatorKey",
        "labels",
        "registryVersion",
        "key",
        "isFavorite"
    })
    public RegistryMetadata(
            String aggregatorKey,
            java.util.List<String> labels,
            Integer registryVersion,
            String key,
            Boolean isFavorite) {
        super();
        this.aggregatorKey = aggregatorKey;
        this.labels = labels;
        this.registryVersion = registryVersion;
        this.key = key;
        this.isFavorite = isFavorite;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The owning object's key for this object. */
        @com.fasterxml.jackson.annotation.JsonProperty("aggregatorKey")
        private String aggregatorKey;

        /**
         * The owning object's key for this object.
         *
         * @param aggregatorKey the value to set
         * @return this builder
         */
        public Builder aggregatorKey(String aggregatorKey) {
            this.aggregatorKey = aggregatorKey;
            this.__explicitlySet__.add("aggregatorKey");
            return this;
        }
        /**
         * Labels are keywords or labels that you can add to data assets, dataflows etc. You can
         * define your own labels and use them to categorize content.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("labels")
        private java.util.List<String> labels;

        /**
         * Labels are keywords or labels that you can add to data assets, dataflows etc. You can
         * define your own labels and use them to categorize content.
         *
         * @param labels the value to set
         * @return this builder
         */
        public Builder labels(java.util.List<String> labels) {
            this.labels = labels;
            this.__explicitlySet__.add("labels");
            return this;
        }
        /** The registry version. */
        @com.fasterxml.jackson.annotation.JsonProperty("registryVersion")
        private Integer registryVersion;

        /**
         * The registry version.
         *
         * @param registryVersion the value to set
         * @return this builder
         */
        public Builder registryVersion(Integer registryVersion) {
            this.registryVersion = registryVersion;
            this.__explicitlySet__.add("registryVersion");
            return this;
        }
        /** The identifying key for the object. */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The identifying key for the object.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /** Specifies whether this object is a favorite or not. */
        @com.fasterxml.jackson.annotation.JsonProperty("isFavorite")
        private Boolean isFavorite;

        /**
         * Specifies whether this object is a favorite or not.
         *
         * @param isFavorite the value to set
         * @return this builder
         */
        public Builder isFavorite(Boolean isFavorite) {
            this.isFavorite = isFavorite;
            this.__explicitlySet__.add("isFavorite");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RegistryMetadata build() {
            RegistryMetadata model =
                    new RegistryMetadata(
                            this.aggregatorKey,
                            this.labels,
                            this.registryVersion,
                            this.key,
                            this.isFavorite);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RegistryMetadata model) {
            if (model.wasPropertyExplicitlySet("aggregatorKey")) {
                this.aggregatorKey(model.getAggregatorKey());
            }
            if (model.wasPropertyExplicitlySet("labels")) {
                this.labels(model.getLabels());
            }
            if (model.wasPropertyExplicitlySet("registryVersion")) {
                this.registryVersion(model.getRegistryVersion());
            }
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("isFavorite")) {
                this.isFavorite(model.getIsFavorite());
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

    /** The owning object's key for this object. */
    @com.fasterxml.jackson.annotation.JsonProperty("aggregatorKey")
    private final String aggregatorKey;

    /**
     * The owning object's key for this object.
     *
     * @return the value
     */
    public String getAggregatorKey() {
        return aggregatorKey;
    }

    /**
     * Labels are keywords or labels that you can add to data assets, dataflows etc. You can define
     * your own labels and use them to categorize content.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("labels")
    private final java.util.List<String> labels;

    /**
     * Labels are keywords or labels that you can add to data assets, dataflows etc. You can define
     * your own labels and use them to categorize content.
     *
     * @return the value
     */
    public java.util.List<String> getLabels() {
        return labels;
    }

    /** The registry version. */
    @com.fasterxml.jackson.annotation.JsonProperty("registryVersion")
    private final Integer registryVersion;

    /**
     * The registry version.
     *
     * @return the value
     */
    public Integer getRegistryVersion() {
        return registryVersion;
    }

    /** The identifying key for the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The identifying key for the object.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** Specifies whether this object is a favorite or not. */
    @com.fasterxml.jackson.annotation.JsonProperty("isFavorite")
    private final Boolean isFavorite;

    /**
     * Specifies whether this object is a favorite or not.
     *
     * @return the value
     */
    public Boolean getIsFavorite() {
        return isFavorite;
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
        sb.append("RegistryMetadata(");
        sb.append("super=").append(super.toString());
        sb.append("aggregatorKey=").append(String.valueOf(this.aggregatorKey));
        sb.append(", labels=").append(String.valueOf(this.labels));
        sb.append(", registryVersion=").append(String.valueOf(this.registryVersion));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(", isFavorite=").append(String.valueOf(this.isFavorite));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RegistryMetadata)) {
            return false;
        }

        RegistryMetadata other = (RegistryMetadata) o;
        return java.util.Objects.equals(this.aggregatorKey, other.aggregatorKey)
                && java.util.Objects.equals(this.labels, other.labels)
                && java.util.Objects.equals(this.registryVersion, other.registryVersion)
                && java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.isFavorite, other.isFavorite)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.aggregatorKey == null ? 43 : this.aggregatorKey.hashCode());
        result = (result * PRIME) + (this.labels == null ? 43 : this.labels.hashCode());
        result =
                (result * PRIME)
                        + (this.registryVersion == null ? 43 : this.registryVersion.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.isFavorite == null ? 43 : this.isFavorite.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
