/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Child reference contains application configuration information. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ChildReference.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ChildReference
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "name",
        "identifier",
        "identifierPath",
        "description",
        "type",
        "targetObject",
        "aggregatorKey",
        "usedBy"
    })
    public ChildReference(
            String key,
            String name,
            String identifier,
            String identifierPath,
            String description,
            Type type,
            Object targetObject,
            String aggregatorKey,
            java.util.List<ReferenceUsedBy> usedBy) {
        super();
        this.key = key;
        this.name = name;
        this.identifier = identifier;
        this.identifierPath = identifierPath;
        this.description = description;
        this.type = type;
        this.targetObject = targetObject;
        this.aggregatorKey = aggregatorKey;
        this.usedBy = usedBy;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The reference's key, key of the object that is being used by a published object or its
         * dependents.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The reference's key, key of the object that is being used by a published object or its
         * dependents.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /** The name of reference object. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of reference object.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The identifier of reference object. */
        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private String identifier;

        /**
         * The identifier of reference object.
         *
         * @param identifier the value to set
         * @return this builder
         */
        public Builder identifier(String identifier) {
            this.identifier = identifier;
            this.__explicitlySet__.add("identifier");
            return this;
        }
        /** The identifier path of reference object. */
        @com.fasterxml.jackson.annotation.JsonProperty("identifierPath")
        private String identifierPath;

        /**
         * The identifier path of reference object.
         *
         * @param identifierPath the value to set
         * @return this builder
         */
        public Builder identifierPath(String identifierPath) {
            this.identifierPath = identifierPath;
            this.__explicitlySet__.add("identifierPath");
            return this;
        }
        /** The description of reference object. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of reference object.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The type of the reference object. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * The type of the reference object.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * The new reference object to use instead of the original reference. For example, this can
         * be a data asset reference.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetObject")
        private Object targetObject;

        /**
         * The new reference object to use instead of the original reference. For example, this can
         * be a data asset reference.
         *
         * @param targetObject the value to set
         * @return this builder
         */
        public Builder targetObject(Object targetObject) {
            this.targetObject = targetObject;
            this.__explicitlySet__.add("targetObject");
            return this;
        }
        /**
         * The aggregator key of the child reference object. For example, this can be a data asset
         * key.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("aggregatorKey")
        private String aggregatorKey;

        /**
         * The aggregator key of the child reference object. For example, this can be a data asset
         * key.
         *
         * @param aggregatorKey the value to set
         * @return this builder
         */
        public Builder aggregatorKey(String aggregatorKey) {
            this.aggregatorKey = aggregatorKey;
            this.__explicitlySet__.add("aggregatorKey");
            return this;
        }
        /** List of published objects where this is used. */
        @com.fasterxml.jackson.annotation.JsonProperty("usedBy")
        private java.util.List<ReferenceUsedBy> usedBy;

        /**
         * List of published objects where this is used.
         *
         * @param usedBy the value to set
         * @return this builder
         */
        public Builder usedBy(java.util.List<ReferenceUsedBy> usedBy) {
            this.usedBy = usedBy;
            this.__explicitlySet__.add("usedBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ChildReference build() {
            ChildReference model =
                    new ChildReference(
                            this.key,
                            this.name,
                            this.identifier,
                            this.identifierPath,
                            this.description,
                            this.type,
                            this.targetObject,
                            this.aggregatorKey,
                            this.usedBy);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ChildReference model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("identifier")) {
                this.identifier(model.getIdentifier());
            }
            if (model.wasPropertyExplicitlySet("identifierPath")) {
                this.identifierPath(model.getIdentifierPath());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("targetObject")) {
                this.targetObject(model.getTargetObject());
            }
            if (model.wasPropertyExplicitlySet("aggregatorKey")) {
                this.aggregatorKey(model.getAggregatorKey());
            }
            if (model.wasPropertyExplicitlySet("usedBy")) {
                this.usedBy(model.getUsedBy());
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

    /**
     * The reference's key, key of the object that is being used by a published object or its
     * dependents.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The reference's key, key of the object that is being used by a published object or its
     * dependents.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** The name of reference object. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of reference object.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The identifier of reference object. */
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    private final String identifier;

    /**
     * The identifier of reference object.
     *
     * @return the value
     */
    public String getIdentifier() {
        return identifier;
    }

    /** The identifier path of reference object. */
    @com.fasterxml.jackson.annotation.JsonProperty("identifierPath")
    private final String identifierPath;

    /**
     * The identifier path of reference object.
     *
     * @return the value
     */
    public String getIdentifierPath() {
        return identifierPath;
    }

    /** The description of reference object. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of reference object.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The type of the reference object. */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        OracledbConnection("ORACLEDB_CONNECTION"),
        OracleObjectStorageConnection("ORACLE_OBJECT_STORAGE_CONNECTION"),
        OracleAtpConnection("ORACLE_ATP_CONNECTION"),
        OracleAdwcConnection("ORACLE_ADWC_CONNECTION"),
        MysqlConnection("MYSQL_CONNECTION"),
        GenericJdbcConnection("GENERIC_JDBC_CONNECTION"),
        BipConnection("BIP_CONNECTION"),
        BiccConnection("BICC_CONNECTION"),
        AmazonS3Connection("AMAZON_S3_CONNECTION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /** The type of the reference object. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * The type of the reference object.
     *
     * @return the value
     */
    public Type getType() {
        return type;
    }

    /**
     * The new reference object to use instead of the original reference. For example, this can be a
     * data asset reference.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetObject")
    private final Object targetObject;

    /**
     * The new reference object to use instead of the original reference. For example, this can be a
     * data asset reference.
     *
     * @return the value
     */
    public Object getTargetObject() {
        return targetObject;
    }

    /**
     * The aggregator key of the child reference object. For example, this can be a data asset key.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("aggregatorKey")
    private final String aggregatorKey;

    /**
     * The aggregator key of the child reference object. For example, this can be a data asset key.
     *
     * @return the value
     */
    public String getAggregatorKey() {
        return aggregatorKey;
    }

    /** List of published objects where this is used. */
    @com.fasterxml.jackson.annotation.JsonProperty("usedBy")
    private final java.util.List<ReferenceUsedBy> usedBy;

    /**
     * List of published objects where this is used.
     *
     * @return the value
     */
    public java.util.List<ReferenceUsedBy> getUsedBy() {
        return usedBy;
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
        sb.append("ChildReference(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", identifier=").append(String.valueOf(this.identifier));
        sb.append(", identifierPath=").append(String.valueOf(this.identifierPath));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", targetObject=").append(String.valueOf(this.targetObject));
        sb.append(", aggregatorKey=").append(String.valueOf(this.aggregatorKey));
        sb.append(", usedBy=").append(String.valueOf(this.usedBy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChildReference)) {
            return false;
        }

        ChildReference other = (ChildReference) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.identifier, other.identifier)
                && java.util.Objects.equals(this.identifierPath, other.identifierPath)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.targetObject, other.targetObject)
                && java.util.Objects.equals(this.aggregatorKey, other.aggregatorKey)
                && java.util.Objects.equals(this.usedBy, other.usedBy)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.identifier == null ? 43 : this.identifier.hashCode());
        result =
                (result * PRIME)
                        + (this.identifierPath == null ? 43 : this.identifierPath.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.targetObject == null ? 43 : this.targetObject.hashCode());
        result =
                (result * PRIME)
                        + (this.aggregatorKey == null ? 43 : this.aggregatorKey.hashCode());
        result = (result * PRIME) + (this.usedBy == null ? 43 : this.usedBy.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
