/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * Information about the object and its parent. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RegistryMetadata.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class RegistryMetadata
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "aggregatorKey",
        "labels",
        "registryVersion",
        "key",
        "isFavorite",
        "createdByUserId",
        "createdByUserName",
        "updatedByUserId",
        "updatedByUserName",
        "timeCreated",
        "timeUpdated"
    })
    public RegistryMetadata(
            String aggregatorKey,
            java.util.List<String> labels,
            Integer registryVersion,
            String key,
            Boolean isFavorite,
            String createdByUserId,
            String createdByUserName,
            String updatedByUserId,
            String updatedByUserName,
            java.util.Date timeCreated,
            java.util.Date timeUpdated) {
        super();
        this.aggregatorKey = aggregatorKey;
        this.labels = labels;
        this.registryVersion = registryVersion;
        this.key = key;
        this.isFavorite = isFavorite;
        this.createdByUserId = createdByUserId;
        this.createdByUserName = createdByUserName;
        this.updatedByUserId = updatedByUserId;
        this.updatedByUserName = updatedByUserName;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
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
         * Labels are keywords or labels that you can add to data assets, dataflows, and so on. You
         * can define your own labels and use them to categorize content.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("labels")
        private java.util.List<String> labels;

        /**
         * Labels are keywords or labels that you can add to data assets, dataflows, and so on. You
         * can define your own labels and use them to categorize content.
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
        /** Specifies whether the object is a favorite. */
        @com.fasterxml.jackson.annotation.JsonProperty("isFavorite")
        private Boolean isFavorite;

        /**
         * Specifies whether the object is a favorite.
         *
         * @param isFavorite the value to set
         * @return this builder
         */
        public Builder isFavorite(Boolean isFavorite) {
            this.isFavorite = isFavorite;
            this.__explicitlySet__.add("isFavorite");
            return this;
        }
        /** The ID of the user who created the object. */
        @com.fasterxml.jackson.annotation.JsonProperty("createdByUserId")
        private String createdByUserId;

        /**
         * The ID of the user who created the object.
         *
         * @param createdByUserId the value to set
         * @return this builder
         */
        public Builder createdByUserId(String createdByUserId) {
            this.createdByUserId = createdByUserId;
            this.__explicitlySet__.add("createdByUserId");
            return this;
        }
        /** The name of the user who created the object. */
        @com.fasterxml.jackson.annotation.JsonProperty("createdByUserName")
        private String createdByUserName;

        /**
         * The name of the user who created the object.
         *
         * @param createdByUserName the value to set
         * @return this builder
         */
        public Builder createdByUserName(String createdByUserName) {
            this.createdByUserName = createdByUserName;
            this.__explicitlySet__.add("createdByUserName");
            return this;
        }
        /** The ID of the user who updated the object. */
        @com.fasterxml.jackson.annotation.JsonProperty("updatedByUserId")
        private String updatedByUserId;

        /**
         * The ID of the user who updated the object.
         *
         * @param updatedByUserId the value to set
         * @return this builder
         */
        public Builder updatedByUserId(String updatedByUserId) {
            this.updatedByUserId = updatedByUserId;
            this.__explicitlySet__.add("updatedByUserId");
            return this;
        }
        /** The name of the user who updated the object. */
        @com.fasterxml.jackson.annotation.JsonProperty("updatedByUserName")
        private String updatedByUserName;

        /**
         * The name of the user who updated the object.
         *
         * @param updatedByUserName the value to set
         * @return this builder
         */
        public Builder updatedByUserName(String updatedByUserName) {
            this.updatedByUserName = updatedByUserName;
            this.__explicitlySet__.add("updatedByUserName");
            return this;
        }
        /** The date and time that the object was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time that the object was created.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The date and time that the object was updated. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time that the object was updated.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
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
                            this.isFavorite,
                            this.createdByUserId,
                            this.createdByUserName,
                            this.updatedByUserId,
                            this.updatedByUserName,
                            this.timeCreated,
                            this.timeUpdated);
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
            if (model.wasPropertyExplicitlySet("createdByUserId")) {
                this.createdByUserId(model.getCreatedByUserId());
            }
            if (model.wasPropertyExplicitlySet("createdByUserName")) {
                this.createdByUserName(model.getCreatedByUserName());
            }
            if (model.wasPropertyExplicitlySet("updatedByUserId")) {
                this.updatedByUserId(model.getUpdatedByUserId());
            }
            if (model.wasPropertyExplicitlySet("updatedByUserName")) {
                this.updatedByUserName(model.getUpdatedByUserName());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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
     * Labels are keywords or labels that you can add to data assets, dataflows, and so on. You can
     * define your own labels and use them to categorize content.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("labels")
    private final java.util.List<String> labels;

    /**
     * Labels are keywords or labels that you can add to data assets, dataflows, and so on. You can
     * define your own labels and use them to categorize content.
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

    /** Specifies whether the object is a favorite. */
    @com.fasterxml.jackson.annotation.JsonProperty("isFavorite")
    private final Boolean isFavorite;

    /**
     * Specifies whether the object is a favorite.
     *
     * @return the value
     */
    public Boolean getIsFavorite() {
        return isFavorite;
    }

    /** The ID of the user who created the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("createdByUserId")
    private final String createdByUserId;

    /**
     * The ID of the user who created the object.
     *
     * @return the value
     */
    public String getCreatedByUserId() {
        return createdByUserId;
    }

    /** The name of the user who created the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("createdByUserName")
    private final String createdByUserName;

    /**
     * The name of the user who created the object.
     *
     * @return the value
     */
    public String getCreatedByUserName() {
        return createdByUserName;
    }

    /** The ID of the user who updated the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("updatedByUserId")
    private final String updatedByUserId;

    /**
     * The ID of the user who updated the object.
     *
     * @return the value
     */
    public String getUpdatedByUserId() {
        return updatedByUserId;
    }

    /** The name of the user who updated the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("updatedByUserName")
    private final String updatedByUserName;

    /**
     * The name of the user who updated the object.
     *
     * @return the value
     */
    public String getUpdatedByUserName() {
        return updatedByUserName;
    }

    /** The date and time that the object was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time that the object was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The date and time that the object was updated. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time that the object was updated.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
        sb.append(", createdByUserId=").append(String.valueOf(this.createdByUserId));
        sb.append(", createdByUserName=").append(String.valueOf(this.createdByUserName));
        sb.append(", updatedByUserId=").append(String.valueOf(this.updatedByUserId));
        sb.append(", updatedByUserName=").append(String.valueOf(this.updatedByUserName));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
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
                && java.util.Objects.equals(this.createdByUserId, other.createdByUserId)
                && java.util.Objects.equals(this.createdByUserName, other.createdByUserName)
                && java.util.Objects.equals(this.updatedByUserId, other.updatedByUserId)
                && java.util.Objects.equals(this.updatedByUserName, other.updatedByUserName)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
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
        result =
                (result * PRIME)
                        + (this.createdByUserId == null ? 43 : this.createdByUserId.hashCode());
        result =
                (result * PRIME)
                        + (this.createdByUserName == null ? 43 : this.createdByUserName.hashCode());
        result =
                (result * PRIME)
                        + (this.updatedByUserId == null ? 43 : this.updatedByUserId.hashCode());
        result =
                (result * PRIME)
                        + (this.updatedByUserName == null ? 43 : this.updatedByUserName.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
