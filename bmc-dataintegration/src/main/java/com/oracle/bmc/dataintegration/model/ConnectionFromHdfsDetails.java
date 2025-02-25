/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The connection details for the HDFS data asset.
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
    builder = ConnectionFromHdfsDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ConnectionFromHdfsDetails extends ConnectionDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
        private Integer objectVersion;

        public Builder objectVersion(Integer objectVersion) {
            this.objectVersion = objectVersion;
            this.__explicitlySet__.add("objectVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private String identifier;

        public Builder identifier(String identifier) {
            this.identifier = identifier;
            this.__explicitlySet__.add("identifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("primarySchema")
        private Schema primarySchema;

        public Builder primarySchema(Schema primarySchema) {
            this.primarySchema = primarySchema;
            this.__explicitlySet__.add("primarySchema");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectionProperties")
        private java.util.List<ConnectionProperty> connectionProperties;

        public Builder connectionProperties(
                java.util.List<ConnectionProperty> connectionProperties) {
            this.connectionProperties = connectionProperties;
            this.__explicitlySet__.add("connectionProperties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
        private Boolean isDefault;

        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            this.__explicitlySet__.add("isDefault");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private ObjectMetadata metadata;

        public Builder metadata(ObjectMetadata metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }
        /**
         * The HDFS principal.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hdfsPrincipal")
        private String hdfsPrincipal;

        /**
         * The HDFS principal.
         * @param hdfsPrincipal the value to set
         * @return this builder
         **/
        public Builder hdfsPrincipal(String hdfsPrincipal) {
            this.hdfsPrincipal = hdfsPrincipal;
            this.__explicitlySet__.add("hdfsPrincipal");
            return this;
        }
        /**
         * The HDFS Data Node principal.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataNodePrincipal")
        private String dataNodePrincipal;

        /**
         * The HDFS Data Node principal.
         * @param dataNodePrincipal the value to set
         * @return this builder
         **/
        public Builder dataNodePrincipal(String dataNodePrincipal) {
            this.dataNodePrincipal = dataNodePrincipal;
            this.__explicitlySet__.add("dataNodePrincipal");
            return this;
        }
        /**
         * The HDFS Name Node principal.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nameNodePrincipal")
        private String nameNodePrincipal;

        /**
         * The HDFS Name Node principal.
         * @param nameNodePrincipal the value to set
         * @return this builder
         **/
        public Builder nameNodePrincipal(String nameNodePrincipal) {
            this.nameNodePrincipal = nameNodePrincipal;
            this.__explicitlySet__.add("nameNodePrincipal");
            return this;
        }
        /**
         * HDFS Realm name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("realm")
        private String realm;

        /**
         * HDFS Realm name.
         * @param realm the value to set
         * @return this builder
         **/
        public Builder realm(String realm) {
            this.realm = realm;
            this.__explicitlySet__.add("realm");
            return this;
        }
        /**
         * The HDFS Key Distribution Center.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("keyDistributionCenter")
        private String keyDistributionCenter;

        /**
         * The HDFS Key Distribution Center.
         * @param keyDistributionCenter the value to set
         * @return this builder
         **/
        public Builder keyDistributionCenter(String keyDistributionCenter) {
            this.keyDistributionCenter = keyDistributionCenter;
            this.__explicitlySet__.add("keyDistributionCenter");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keyTabContent")
        private SensitiveAttribute keyTabContent;

        public Builder keyTabContent(SensitiveAttribute keyTabContent) {
            this.keyTabContent = keyTabContent;
            this.__explicitlySet__.add("keyTabContent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConnectionFromHdfsDetails build() {
            ConnectionFromHdfsDetails model =
                    new ConnectionFromHdfsDetails(
                            this.key,
                            this.modelVersion,
                            this.parentRef,
                            this.name,
                            this.description,
                            this.objectVersion,
                            this.objectStatus,
                            this.identifier,
                            this.primarySchema,
                            this.connectionProperties,
                            this.isDefault,
                            this.metadata,
                            this.hdfsPrincipal,
                            this.dataNodePrincipal,
                            this.nameNodePrincipal,
                            this.realm,
                            this.keyDistributionCenter,
                            this.keyTabContent);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConnectionFromHdfsDetails model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("modelVersion")) {
                this.modelVersion(model.getModelVersion());
            }
            if (model.wasPropertyExplicitlySet("parentRef")) {
                this.parentRef(model.getParentRef());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("objectVersion")) {
                this.objectVersion(model.getObjectVersion());
            }
            if (model.wasPropertyExplicitlySet("objectStatus")) {
                this.objectStatus(model.getObjectStatus());
            }
            if (model.wasPropertyExplicitlySet("identifier")) {
                this.identifier(model.getIdentifier());
            }
            if (model.wasPropertyExplicitlySet("primarySchema")) {
                this.primarySchema(model.getPrimarySchema());
            }
            if (model.wasPropertyExplicitlySet("connectionProperties")) {
                this.connectionProperties(model.getConnectionProperties());
            }
            if (model.wasPropertyExplicitlySet("isDefault")) {
                this.isDefault(model.getIsDefault());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
            }
            if (model.wasPropertyExplicitlySet("hdfsPrincipal")) {
                this.hdfsPrincipal(model.getHdfsPrincipal());
            }
            if (model.wasPropertyExplicitlySet("dataNodePrincipal")) {
                this.dataNodePrincipal(model.getDataNodePrincipal());
            }
            if (model.wasPropertyExplicitlySet("nameNodePrincipal")) {
                this.nameNodePrincipal(model.getNameNodePrincipal());
            }
            if (model.wasPropertyExplicitlySet("realm")) {
                this.realm(model.getRealm());
            }
            if (model.wasPropertyExplicitlySet("keyDistributionCenter")) {
                this.keyDistributionCenter(model.getKeyDistributionCenter());
            }
            if (model.wasPropertyExplicitlySet("keyTabContent")) {
                this.keyTabContent(model.getKeyTabContent());
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
    public ConnectionFromHdfsDetails(
            String key,
            String modelVersion,
            ParentReference parentRef,
            String name,
            String description,
            Integer objectVersion,
            Integer objectStatus,
            String identifier,
            Schema primarySchema,
            java.util.List<ConnectionProperty> connectionProperties,
            Boolean isDefault,
            ObjectMetadata metadata,
            String hdfsPrincipal,
            String dataNodePrincipal,
            String nameNodePrincipal,
            String realm,
            String keyDistributionCenter,
            SensitiveAttribute keyTabContent) {
        super(
                key,
                modelVersion,
                parentRef,
                name,
                description,
                objectVersion,
                objectStatus,
                identifier,
                primarySchema,
                connectionProperties,
                isDefault,
                metadata);
        this.hdfsPrincipal = hdfsPrincipal;
        this.dataNodePrincipal = dataNodePrincipal;
        this.nameNodePrincipal = nameNodePrincipal;
        this.realm = realm;
        this.keyDistributionCenter = keyDistributionCenter;
        this.keyTabContent = keyTabContent;
    }

    /**
     * The HDFS principal.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hdfsPrincipal")
    private final String hdfsPrincipal;

    /**
     * The HDFS principal.
     * @return the value
     **/
    public String getHdfsPrincipal() {
        return hdfsPrincipal;
    }

    /**
     * The HDFS Data Node principal.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataNodePrincipal")
    private final String dataNodePrincipal;

    /**
     * The HDFS Data Node principal.
     * @return the value
     **/
    public String getDataNodePrincipal() {
        return dataNodePrincipal;
    }

    /**
     * The HDFS Name Node principal.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nameNodePrincipal")
    private final String nameNodePrincipal;

    /**
     * The HDFS Name Node principal.
     * @return the value
     **/
    public String getNameNodePrincipal() {
        return nameNodePrincipal;
    }

    /**
     * HDFS Realm name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("realm")
    private final String realm;

    /**
     * HDFS Realm name.
     * @return the value
     **/
    public String getRealm() {
        return realm;
    }

    /**
     * The HDFS Key Distribution Center.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyDistributionCenter")
    private final String keyDistributionCenter;

    /**
     * The HDFS Key Distribution Center.
     * @return the value
     **/
    public String getKeyDistributionCenter() {
        return keyDistributionCenter;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("keyTabContent")
    private final SensitiveAttribute keyTabContent;

    public SensitiveAttribute getKeyTabContent() {
        return keyTabContent;
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
        sb.append("ConnectionFromHdfsDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", hdfsPrincipal=").append(String.valueOf(this.hdfsPrincipal));
        sb.append(", dataNodePrincipal=").append(String.valueOf(this.dataNodePrincipal));
        sb.append(", nameNodePrincipal=").append(String.valueOf(this.nameNodePrincipal));
        sb.append(", realm=").append(String.valueOf(this.realm));
        sb.append(", keyDistributionCenter=").append(String.valueOf(this.keyDistributionCenter));
        sb.append(", keyTabContent=").append(String.valueOf(this.keyTabContent));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConnectionFromHdfsDetails)) {
            return false;
        }

        ConnectionFromHdfsDetails other = (ConnectionFromHdfsDetails) o;
        return java.util.Objects.equals(this.hdfsPrincipal, other.hdfsPrincipal)
                && java.util.Objects.equals(this.dataNodePrincipal, other.dataNodePrincipal)
                && java.util.Objects.equals(this.nameNodePrincipal, other.nameNodePrincipal)
                && java.util.Objects.equals(this.realm, other.realm)
                && java.util.Objects.equals(this.keyDistributionCenter, other.keyDistributionCenter)
                && java.util.Objects.equals(this.keyTabContent, other.keyTabContent)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.hdfsPrincipal == null ? 43 : this.hdfsPrincipal.hashCode());
        result =
                (result * PRIME)
                        + (this.dataNodePrincipal == null ? 43 : this.dataNodePrincipal.hashCode());
        result =
                (result * PRIME)
                        + (this.nameNodePrincipal == null ? 43 : this.nameNodePrincipal.hashCode());
        result = (result * PRIME) + (this.realm == null ? 43 : this.realm.hashCode());
        result =
                (result * PRIME)
                        + (this.keyDistributionCenter == null
                                ? 43
                                : this.keyDistributionCenter.hashCode());
        result =
                (result * PRIME)
                        + (this.keyTabContent == null ? 43 : this.keyTabContent.hashCode());
        return result;
    }
}
