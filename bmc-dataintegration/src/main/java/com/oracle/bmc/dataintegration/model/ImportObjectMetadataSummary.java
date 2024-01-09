/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Details of the objects to imported. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ImportObjectMetadataSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ImportObjectMetadataSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "oldKey",
        "newKey",
        "name",
        "identifier",
        "objectType",
        "objectVersion",
        "aggregatorKey",
        "namePath",
        "timeUpdatedInMillis",
        "resolutionAction"
    })
    public ImportObjectMetadataSummary(
            String oldKey,
            String newKey,
            String name,
            String identifier,
            String objectType,
            String objectVersion,
            String aggregatorKey,
            String namePath,
            Long timeUpdatedInMillis,
            ResolutionAction resolutionAction) {
        super();
        this.oldKey = oldKey;
        this.newKey = newKey;
        this.name = name;
        this.identifier = identifier;
        this.objectType = objectType;
        this.objectVersion = objectVersion;
        this.aggregatorKey = aggregatorKey;
        this.namePath = namePath;
        this.timeUpdatedInMillis = timeUpdatedInMillis;
        this.resolutionAction = resolutionAction;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Old key of the object */
        @com.fasterxml.jackson.annotation.JsonProperty("oldKey")
        private String oldKey;

        /**
         * Old key of the object
         *
         * @param oldKey the value to set
         * @return this builder
         */
        public Builder oldKey(String oldKey) {
            this.oldKey = oldKey;
            this.__explicitlySet__.add("oldKey");
            return this;
        }
        /** New key of the object */
        @com.fasterxml.jackson.annotation.JsonProperty("newKey")
        private String newKey;

        /**
         * New key of the object
         *
         * @param newKey the value to set
         * @return this builder
         */
        public Builder newKey(String newKey) {
            this.newKey = newKey;
            this.__explicitlySet__.add("newKey");
            return this;
        }
        /** Name of the object */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the object
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Object identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private String identifier;

        /**
         * Object identifier
         *
         * @param identifier the value to set
         * @return this builder
         */
        public Builder identifier(String identifier) {
            this.identifier = identifier;
            this.__explicitlySet__.add("identifier");
            return this;
        }
        /** Object type */
        @com.fasterxml.jackson.annotation.JsonProperty("objectType")
        private String objectType;

        /**
         * Object type
         *
         * @param objectType the value to set
         * @return this builder
         */
        public Builder objectType(String objectType) {
            this.objectType = objectType;
            this.__explicitlySet__.add("objectType");
            return this;
        }
        /** Object version */
        @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
        private String objectVersion;

        /**
         * Object version
         *
         * @param objectVersion the value to set
         * @return this builder
         */
        public Builder objectVersion(String objectVersion) {
            this.objectVersion = objectVersion;
            this.__explicitlySet__.add("objectVersion");
            return this;
        }
        /** Aggregator key */
        @com.fasterxml.jackson.annotation.JsonProperty("aggregatorKey")
        private String aggregatorKey;

        /**
         * Aggregator key
         *
         * @param aggregatorKey the value to set
         * @return this builder
         */
        public Builder aggregatorKey(String aggregatorKey) {
            this.aggregatorKey = aggregatorKey;
            this.__explicitlySet__.add("aggregatorKey");
            return this;
        }
        /** Object name path */
        @com.fasterxml.jackson.annotation.JsonProperty("namePath")
        private String namePath;

        /**
         * Object name path
         *
         * @param namePath the value to set
         * @return this builder
         */
        public Builder namePath(String namePath) {
            this.namePath = namePath;
            this.__explicitlySet__.add("namePath");
            return this;
        }
        /** time at which this object was last updated. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdatedInMillis")
        private Long timeUpdatedInMillis;

        /**
         * time at which this object was last updated.
         *
         * @param timeUpdatedInMillis the value to set
         * @return this builder
         */
        public Builder timeUpdatedInMillis(Long timeUpdatedInMillis) {
            this.timeUpdatedInMillis = timeUpdatedInMillis;
            this.__explicitlySet__.add("timeUpdatedInMillis");
            return this;
        }
        /** Object resolution action */
        @com.fasterxml.jackson.annotation.JsonProperty("resolutionAction")
        private ResolutionAction resolutionAction;

        /**
         * Object resolution action
         *
         * @param resolutionAction the value to set
         * @return this builder
         */
        public Builder resolutionAction(ResolutionAction resolutionAction) {
            this.resolutionAction = resolutionAction;
            this.__explicitlySet__.add("resolutionAction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ImportObjectMetadataSummary build() {
            ImportObjectMetadataSummary model =
                    new ImportObjectMetadataSummary(
                            this.oldKey,
                            this.newKey,
                            this.name,
                            this.identifier,
                            this.objectType,
                            this.objectVersion,
                            this.aggregatorKey,
                            this.namePath,
                            this.timeUpdatedInMillis,
                            this.resolutionAction);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ImportObjectMetadataSummary model) {
            if (model.wasPropertyExplicitlySet("oldKey")) {
                this.oldKey(model.getOldKey());
            }
            if (model.wasPropertyExplicitlySet("newKey")) {
                this.newKey(model.getNewKey());
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
            if (model.wasPropertyExplicitlySet("resolutionAction")) {
                this.resolutionAction(model.getResolutionAction());
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

    /** Old key of the object */
    @com.fasterxml.jackson.annotation.JsonProperty("oldKey")
    private final String oldKey;

    /**
     * Old key of the object
     *
     * @return the value
     */
    public String getOldKey() {
        return oldKey;
    }

    /** New key of the object */
    @com.fasterxml.jackson.annotation.JsonProperty("newKey")
    private final String newKey;

    /**
     * New key of the object
     *
     * @return the value
     */
    public String getNewKey() {
        return newKey;
    }

    /** Name of the object */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the object
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Object identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    private final String identifier;

    /**
     * Object identifier
     *
     * @return the value
     */
    public String getIdentifier() {
        return identifier;
    }

    /** Object type */
    @com.fasterxml.jackson.annotation.JsonProperty("objectType")
    private final String objectType;

    /**
     * Object type
     *
     * @return the value
     */
    public String getObjectType() {
        return objectType;
    }

    /** Object version */
    @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
    private final String objectVersion;

    /**
     * Object version
     *
     * @return the value
     */
    public String getObjectVersion() {
        return objectVersion;
    }

    /** Aggregator key */
    @com.fasterxml.jackson.annotation.JsonProperty("aggregatorKey")
    private final String aggregatorKey;

    /**
     * Aggregator key
     *
     * @return the value
     */
    public String getAggregatorKey() {
        return aggregatorKey;
    }

    /** Object name path */
    @com.fasterxml.jackson.annotation.JsonProperty("namePath")
    private final String namePath;

    /**
     * Object name path
     *
     * @return the value
     */
    public String getNamePath() {
        return namePath;
    }

    /** time at which this object was last updated. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdatedInMillis")
    private final Long timeUpdatedInMillis;

    /**
     * time at which this object was last updated.
     *
     * @return the value
     */
    public Long getTimeUpdatedInMillis() {
        return timeUpdatedInMillis;
    }

    /** Object resolution action */
    public enum ResolutionAction implements com.oracle.bmc.http.internal.BmcEnum {
        Created("CREATED"),
        Retained("RETAINED"),
        Duplicated("DUPLICATED"),
        Replaced("REPLACED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ResolutionAction.class);

        private final String value;
        private static java.util.Map<String, ResolutionAction> map;

        static {
            map = new java.util.HashMap<>();
            for (ResolutionAction v : ResolutionAction.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ResolutionAction(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ResolutionAction create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ResolutionAction', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Object resolution action */
    @com.fasterxml.jackson.annotation.JsonProperty("resolutionAction")
    private final ResolutionAction resolutionAction;

    /**
     * Object resolution action
     *
     * @return the value
     */
    public ResolutionAction getResolutionAction() {
        return resolutionAction;
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
        sb.append("ImportObjectMetadataSummary(");
        sb.append("super=").append(super.toString());
        sb.append("oldKey=").append(String.valueOf(this.oldKey));
        sb.append(", newKey=").append(String.valueOf(this.newKey));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", identifier=").append(String.valueOf(this.identifier));
        sb.append(", objectType=").append(String.valueOf(this.objectType));
        sb.append(", objectVersion=").append(String.valueOf(this.objectVersion));
        sb.append(", aggregatorKey=").append(String.valueOf(this.aggregatorKey));
        sb.append(", namePath=").append(String.valueOf(this.namePath));
        sb.append(", timeUpdatedInMillis=").append(String.valueOf(this.timeUpdatedInMillis));
        sb.append(", resolutionAction=").append(String.valueOf(this.resolutionAction));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ImportObjectMetadataSummary)) {
            return false;
        }

        ImportObjectMetadataSummary other = (ImportObjectMetadataSummary) o;
        return java.util.Objects.equals(this.oldKey, other.oldKey)
                && java.util.Objects.equals(this.newKey, other.newKey)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.identifier, other.identifier)
                && java.util.Objects.equals(this.objectType, other.objectType)
                && java.util.Objects.equals(this.objectVersion, other.objectVersion)
                && java.util.Objects.equals(this.aggregatorKey, other.aggregatorKey)
                && java.util.Objects.equals(this.namePath, other.namePath)
                && java.util.Objects.equals(this.timeUpdatedInMillis, other.timeUpdatedInMillis)
                && java.util.Objects.equals(this.resolutionAction, other.resolutionAction)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.oldKey == null ? 43 : this.oldKey.hashCode());
        result = (result * PRIME) + (this.newKey == null ? 43 : this.newKey.hashCode());
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
        result =
                (result * PRIME)
                        + (this.resolutionAction == null ? 43 : this.resolutionAction.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
