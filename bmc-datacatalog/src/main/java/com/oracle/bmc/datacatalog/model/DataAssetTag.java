/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Represents an association of a data asset to a term.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DataAssetTag.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DataAssetTag extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "dataAssetKey",
        "key",
        "name",
        "termKey",
        "termPath",
        "termDescription",
        "lifecycleState",
        "timeCreated",
        "createdById",
        "uri"
    })
    public DataAssetTag(
            String dataAssetKey,
            String key,
            String name,
            String termKey,
            String termPath,
            String termDescription,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            String createdById,
            String uri) {
        super();
        this.dataAssetKey = dataAssetKey;
        this.key = key;
        this.name = name;
        this.termKey = termKey;
        this.termPath = termPath;
        this.termDescription = termDescription;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.createdById = createdById;
        this.uri = uri;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique key of the parent data asset.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataAssetKey")
        private String dataAssetKey;

        /**
         * The unique key of the parent data asset.
         * @param dataAssetKey the value to set
         * @return this builder
         **/
        public Builder dataAssetKey(String dataAssetKey) {
            this.dataAssetKey = dataAssetKey;
            this.__explicitlySet__.add("dataAssetKey");
            return this;
        }
        /**
         * Unique tag key that is immutable.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Unique tag key that is immutable.
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * Name of the tag which matches the term name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the tag which matches the term name.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Unique key of the related term.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("termKey")
        private String termKey;

        /**
         * Unique key of the related term.
         * @param termKey the value to set
         * @return this builder
         **/
        public Builder termKey(String termKey) {
            this.termKey = termKey;
            this.__explicitlySet__.add("termKey");
            return this;
        }
        /**
         * Path of the related term.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("termPath")
        private String termPath;

        /**
         * Path of the related term.
         * @param termPath the value to set
         * @return this builder
         **/
        public Builder termPath(String termPath) {
            this.termPath = termPath;
            this.__explicitlySet__.add("termPath");
            return this;
        }
        /**
         * Description of the related term.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("termDescription")
        private String termDescription;

        /**
         * Description of the related term.
         * @param termDescription the value to set
         * @return this builder
         **/
        public Builder termDescription(String termDescription) {
            this.termDescription = termDescription;
            this.__explicitlySet__.add("termDescription");
            return this;
        }
        /**
         * The current state of the tag.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the tag.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The date and time the tag was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2019-03-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the tag was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2019-03-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * OCID of the user who created the tag.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("createdById")
        private String createdById;

        /**
         * OCID of the user who created the tag.
         * @param createdById the value to set
         * @return this builder
         **/
        public Builder createdById(String createdById) {
            this.createdById = createdById;
            this.__explicitlySet__.add("createdById");
            return this;
        }
        /**
         * URI to the tag instance in the API.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("uri")
        private String uri;

        /**
         * URI to the tag instance in the API.
         * @param uri the value to set
         * @return this builder
         **/
        public Builder uri(String uri) {
            this.uri = uri;
            this.__explicitlySet__.add("uri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataAssetTag build() {
            DataAssetTag model =
                    new DataAssetTag(
                            this.dataAssetKey,
                            this.key,
                            this.name,
                            this.termKey,
                            this.termPath,
                            this.termDescription,
                            this.lifecycleState,
                            this.timeCreated,
                            this.createdById,
                            this.uri);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataAssetTag model) {
            if (model.wasPropertyExplicitlySet("dataAssetKey")) {
                this.dataAssetKey(model.getDataAssetKey());
            }
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("termKey")) {
                this.termKey(model.getTermKey());
            }
            if (model.wasPropertyExplicitlySet("termPath")) {
                this.termPath(model.getTermPath());
            }
            if (model.wasPropertyExplicitlySet("termDescription")) {
                this.termDescription(model.getTermDescription());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("createdById")) {
                this.createdById(model.getCreatedById());
            }
            if (model.wasPropertyExplicitlySet("uri")) {
                this.uri(model.getUri());
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
     * The unique key of the parent data asset.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataAssetKey")
    private final String dataAssetKey;

    /**
     * The unique key of the parent data asset.
     * @return the value
     **/
    public String getDataAssetKey() {
        return dataAssetKey;
    }

    /**
     * Unique tag key that is immutable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Unique tag key that is immutable.
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * Name of the tag which matches the term name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the tag which matches the term name.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Unique key of the related term.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("termKey")
    private final String termKey;

    /**
     * Unique key of the related term.
     * @return the value
     **/
    public String getTermKey() {
        return termKey;
    }

    /**
     * Path of the related term.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("termPath")
    private final String termPath;

    /**
     * Path of the related term.
     * @return the value
     **/
    public String getTermPath() {
        return termPath;
    }

    /**
     * Description of the related term.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("termDescription")
    private final String termDescription;

    /**
     * Description of the related term.
     * @return the value
     **/
    public String getTermDescription() {
        return termDescription;
    }

    /**
     * The current state of the tag.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the tag.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The date and time the tag was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2019-03-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the tag was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2019-03-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * OCID of the user who created the tag.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdById")
    private final String createdById;

    /**
     * OCID of the user who created the tag.
     * @return the value
     **/
    public String getCreatedById() {
        return createdById;
    }

    /**
     * URI to the tag instance in the API.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    private final String uri;

    /**
     * URI to the tag instance in the API.
     * @return the value
     **/
    public String getUri() {
        return uri;
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
        sb.append("DataAssetTag(");
        sb.append("super=").append(super.toString());
        sb.append("dataAssetKey=").append(String.valueOf(this.dataAssetKey));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", termKey=").append(String.valueOf(this.termKey));
        sb.append(", termPath=").append(String.valueOf(this.termPath));
        sb.append(", termDescription=").append(String.valueOf(this.termDescription));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", createdById=").append(String.valueOf(this.createdById));
        sb.append(", uri=").append(String.valueOf(this.uri));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataAssetTag)) {
            return false;
        }

        DataAssetTag other = (DataAssetTag) o;
        return java.util.Objects.equals(this.dataAssetKey, other.dataAssetKey)
                && java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.termKey, other.termKey)
                && java.util.Objects.equals(this.termPath, other.termPath)
                && java.util.Objects.equals(this.termDescription, other.termDescription)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.createdById, other.createdById)
                && java.util.Objects.equals(this.uri, other.uri)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.dataAssetKey == null ? 43 : this.dataAssetKey.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.termKey == null ? 43 : this.termKey.hashCode());
        result = (result * PRIME) + (this.termPath == null ? 43 : this.termPath.hashCode());
        result =
                (result * PRIME)
                        + (this.termDescription == null ? 43 : this.termDescription.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.createdById == null ? 43 : this.createdById.hashCode());
        result = (result * PRIME) + (this.uri == null ? 43 : this.uri.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
